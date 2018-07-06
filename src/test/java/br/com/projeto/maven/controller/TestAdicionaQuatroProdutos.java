package br.com.projeto.maven.controller;

import java.util.List;

import br.com.projeto.maven.model.Produto;

public class TestAdicionaQuatroProdutos {

	public static void main(String[] args) {

		ProdutoController prodContrl = new ProdutoController();

		Produto produto1 = new Produto("Café", 10.0, 2, "10-07-2018");
		prodContrl.put(produto1);
		
		Produto produ2 = new Produto("Sorvete", 19.0, 1, "01-09-2017");
		prodContrl.put(produ2);
		
		Produto produ3 = new Produto("Televisão", 900.50, 1, "30-04-2017");
		prodContrl.put(produ3);
		
		Produto produ4 = new Produto("Celular", 700.99, 2, "20-01-2018");
		prodContrl.put(produ4);

		List<Produto> produtos = prodContrl.getProdutos();

		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
	}

}
