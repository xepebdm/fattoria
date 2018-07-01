package br.com.projeto.maven.controller;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import br.com.projeto.maven.model.Produto;

@WebServlet(urlPatterns = "/lista")
public class ProdutoController implements Serializable {

	private static final long serialVersionUID = 1L;

	// private Map<Integer,Produto> produtos = new HashMap<Integer, Produto>();
	private final List<Produto> produtos = new LinkedList<Produto>();

	// adiciona produto na lista
	public void put(Produto produto) {
		produtos.add(produto);
	}
	
	public void put(int id, Produto produto) {
		produtos.remove(id);
		produto.setId(id);
		produtos.add(id, produto);
	}

	public void invalidate(int id) {
		produtos.remove(id);
		atualizaIndice(id);
	}

	private void atualizaIndice(int id) {
		try {
			for (int i = id; i < produtos.size(); i++) {
				if (produtos.get(i + 1) != null) {
					Produto produto = produtos.get(i + 1);
					produto.setId(i);
					produtos.add(i, produto);
				}
			}
			Produto.contador = produtos.size();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		

	}

	public Produto get(int id) {
		return produtos.get(id);
	}

	// lista de produtos para o JSTL
	public List<Produto> getProdutos() {
		return produtos;
	}

}
