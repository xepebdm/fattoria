package br.com.projeto.maven.controller;

import java.util.List;

import br.com.projeto.maven.model.Produto;

public class TestAdicionaUmProduto {

	public static void main(String[] args) {

		ProdutoController prodContrl = new ProdutoController();
		
		Produto produto1 = new Produto("Café", 10.0, 2, "10-07-2018");
		prodContrl.edit(produto1.getId(), produto1);
		
		List<Produto> produtos = prodContrl.getProdutos();
		
		for(Produto produto : produtos) {
			System.out.println(produto.toString());
		}
	}

}
