package com.projeto.pedidosonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.projeto")
public class PedidosOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosOnlineApplication.class, args);
	}

}
