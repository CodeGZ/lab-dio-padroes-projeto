package com.projeto.controller;

import com.projeto.model.Pedido;
import com.projeto.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {
    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("/pedido")
    public void fazerPedido(@RequestBody Pedido pedido) {
        pedidoService.processarPedido(pedido);
    }
}
