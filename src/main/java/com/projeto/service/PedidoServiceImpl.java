package com.projeto.service;

import com.projeto.dao.ProdutoDAO;
import com.projeto.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
    private final ProdutoDAO produtoDAO;

    @Autowired
    public PedidoServiceImpl(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    @Override
    public void processarPedido(Pedido pedido) {
        // Lógica para processar o pedido
    }
}
