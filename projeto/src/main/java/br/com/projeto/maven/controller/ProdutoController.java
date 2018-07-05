package br.com.projeto.maven.controller;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.projeto.maven.model.Produto;

public class ProdutoController implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Produto> produtos = new LinkedList<Produto>();
	private int size = 0;

	// adiciona produto no final lista
	public void put(Produto produto) {
		produtos.add(size, produto);
		produto.setId(size);
		size++;
	}

	// metodo usado para editar o produto apartir do indice
	// adiciona produto no id
	// primeiro remove o produto que existe no id
	// define o id do novo produto
	// adiciona o novo produto no id
	public void edit(int id, Produto produto) {
		produtos.remove(id);
		produto.setId(id);
		produtos.add(id, produto);
	}

	// remove produto pelo id e depois atualiza para ocupar o indice removido
	public void invalidate(int id) {
		produtos.remove(id);

		atualizaIndice(id);

		// apos remover diminui o tamanho
		size--;
	}

	// atualiza o indice da classe Produto
	private void atualizaIndice(int id) {
		int i = 0;
		try {
			for (i = id; i < size; i++) {
				produtos.get(i).setId((i));
			}

			// remove o ultimo produto
			produtos.remove(i);

		} catch (IndexOutOfBoundsException e) {

		}
	}

	public Produto get(int id) {
		return produtos.get(id);
	}

	// lista de produtos para o JSTL
	public List<Produto> getProdutos() {
		return Collections.unmodifiableList(produtos);
	}

	public int getSize() {
		return size;
	}

}
