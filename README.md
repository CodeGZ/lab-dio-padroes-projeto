# Sistema Online de Pedidos

Este é um projeto de exemplo para um Sistema Online de Pedidos desenvolvido em Java com o auxílio do Maven. O sistema implementa padrões de projeto como Singleton, Facade e Strategy para uma arquitetura mais robusta e flexível.

## Funcionalidades

- **Cadastrar Produto:** Adicione produtos ao sistema com nome e preço.
- **Fazer Pedido:** Crie pedidos associados a um produto e uma quantidade, especificando também o endereço de entrega.

## Tecnologias Utilizadas

- Java
- Maven

### Diagrama de classe
```mermaid
classDiagram
    class Produto {
        nome: String
        preco: Double
    }

    class Pedido {
        quantidade: Int
        endereco: String
    }

    class ProdutoService {
        + obterProdutoPorNome(nome: String): Produto
    }

    class PedidoService {
        + processarPedido(pedido: Pedido): void
    }

    class ProdutoServiceImpl {
        - instancia: ProdutoServiceImpl
        - ProdutoServiceImpl()
        + getInstance(): ProdutoServiceImpl
        + obterProdutoPorNome(nome: String): Produto
    }

    class PedidoServiceImpl {
        - produtoService: ProdutoService
        + PedidoServiceImpl(produtoService: ProdutoService)
        + processarPedido(pedido: Pedido): void
    }

    class PedidoController {
        - pedidoService: PedidoService
        + fazerPedido(pedido: Pedido): void
    }

    class ProdutoController {
        - produtoService: ProdutoService
        + obterProduto(nome: String): Produto
    }

    Produto "1" --> "1..n" Pedido: Contém
    ProdutoService "1" --> "1" ProdutoServiceImpl: Usa
    PedidoService "1" --> "1" PedidoServiceImpl: Usa
    PedidoController "1" --> "1" PedidoService: Usa
    ProdutoController "1" --> "1" ProdutoService: Usa
```