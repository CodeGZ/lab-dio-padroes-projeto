package com.projeto.dao;

import com.projeto.model.Produto;

public interface ProdutoDAO {
    Produto obterProdutoPorNome(String nome);
}
