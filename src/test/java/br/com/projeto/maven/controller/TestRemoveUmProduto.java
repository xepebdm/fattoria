package br.com.projeto.maven.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.projeto.maven.model.Produto;

public class TestRemoveUmProduto {

	@Inject
	private static ProdutoController prodContrl;

	public static void main(String[] args) {

		prodContrl = new ProdutoController();

		Produto produto1 = new Produto("Café", 10.0, 2, "10-07-2018");
		prodContrl.edit(produto1.getId(), produto1);
		
		Produto produ2 = new Produto("Sorvete", 19.0, 1, "01-09-2017");
		prodContrl.edit(produ2.getId(), produ2);
		
		Produto produ3 = new Produto("Televisão", 900.50, 1, "30-04-2017");
		prodContrl.edit(produ3.getId(), produ3);
		
		Produto produ4 = new Produto("Celular", 700.99, 2, "20-01-2018");
		prodContrl.edit(produ4.getId(), produ4);

		List<Produto> produtos = prodContrl.getProdutos();

		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
		
		prodContrl.invalidate(produ2.getId());
		System.out.println();
		
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
	}

}
