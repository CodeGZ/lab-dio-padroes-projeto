package com.projeto.config;

import com.projeto.controller.PedidoController;
import com.projeto.dao.ProdutoDAO;
import com.projeto.dao.ProdutoDAOImpl;
import com.projeto.service.PedidoService;
import com.projeto.service.PedidoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ProdutoDAO produtoDAO() {
        return new ProdutoDAOImpl();
    }

    @Bean
    public PedidoService pedidoService(ProdutoDAO produtoDAO) {
        return new PedidoServiceImpl(produtoDAO);
    }
}
