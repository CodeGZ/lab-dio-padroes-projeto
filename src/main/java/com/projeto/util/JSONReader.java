package com.projeto.util;

import com.projeto.model.Pedido;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
@Component
public class JSONReader {

    public List<Pedido> lerPedidosDoJSON() throws IOException, JSONException {
        List<Pedido> pedidos = new ArrayList<>();

        // Obtendo o arquivo JSON como um recurso usando ClassLoader
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("pedidos.json");

        if (inputStream != null) {
            String conteudoArquivo = new String(inputStream.readAllBytes());
            JSONObject json = new JSONObject(conteudoArquivo);
            JSONArray pedidosJson = json.getJSONArray("pedidos");

            for (int i = 0; i < pedidosJson.length(); i++) {
                JSONObject pedidoJson = pedidosJson.getJSONObject(i);
                String produto = pedidoJson.getString("produto");
                int quantidade = pedidoJson.getInt("quantidade");
                String endereco = pedidoJson.getString("endereco");
                pedidos.add(new Pedido(produto, quantidade, endereco));
            }
        } else {
            throw new IOException("Arquivo pedidos.json não encontrado.");
        }

        return pedidos;
    }
}
