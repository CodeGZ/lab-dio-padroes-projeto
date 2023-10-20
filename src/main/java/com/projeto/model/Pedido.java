package com.projeto.model;

public class Pedido {
    private Produto produto;
    private int quantidade;
    private String endereco;

    public Pedido(String produto, int quantidade, String endereco) {}

    public Pedido(Produto produto, int quantidade, String endereco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.endereco = endereco;
    }

    // Getters e Setters
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
