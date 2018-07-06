package br.com.projeto.maven.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.projeto.maven.model.Produto;

public class ProdutoControllerTest {
	ProdutoController prodContrl = new ProdutoController();

	@Before
	public void setUp() throws Exception {

		Produto produto0 = new Produto("Café", 10.0, 2, "10-07-2018");
		prodContrl.adiciona(produto0);
		
		Produto produto1 = new Produto("Sorvete", 19.0, 1, "01-09-2017");
		prodContrl.adiciona(produto1);
		
		Produto produto2 = new Produto("Televisão", 900.50, 1, "30-04-2017");
		prodContrl.adiciona(produto2);
		
		Produto produto3 = new Produto("Celular", 700.99, 2, "20-01-2018");
		prodContrl.adiciona(produto3);
	}

	@Test
	public void testAddQuatoProdutos() {
		assertEquals(4, prodContrl.getProdutos().size());
	}

	@Test
	public void testEditaUmProduto() {
		Produto produto = new Produto("Arroz", 3.0, 5, "15-12-2009");
		
		prodContrl.edita(1, produto);
		
		assertEquals("Arroz", prodContrl.get(1).getNome());
	}
	
	@Test
	public void testEditaTresProdutos() {
		Produto produto1 = new Produto("Arroz", 3.0, 5, "15-12-2009");
		Produto produto2 = new Produto("Máquina", 1000.00, 1, "10-01-2008");
		Produto produto3 = new Produto("Roupa", 100.0, 4, "01-01-2006");
		
		prodContrl.edita(0, produto1);
		prodContrl.edita(2, produto2);
		prodContrl.edita(3, produto3);
		
		assertEquals("Máquina", prodContrl.get(2).getNome());
		assertEquals("Roupa", prodContrl.get(3).getNome());
		assertEquals("Arroz", prodContrl.get(0).getNome());
	}

	@Test
	public void testRemoveUmProduto() {
		prodContrl.deleta(2);
		
		assertEquals("Celular", prodContrl.get(2).getNome());
		assertEquals(3, prodContrl.getProdutos().size());
		assertEquals(3, prodContrl.getSize());
		
	}

	@Test
	public void testRemoveDoisProdutos() {
		prodContrl.deleta(0); //remove o indice produto0 = Cafe
		prodContrl.deleta(2); //remove o indice produto3 = Celular
		
		assertEquals(0, prodContrl.get(0).getId());
		assertEquals(1, prodContrl.get(1).getId());
		assertEquals(2, prodContrl.getSize());
	}

}
