package br.com.projeto.maven.model;

import java.io.Serializable;

public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;

	private int id;
	public static int contador = 0;
	private String nome;
	private double preco;
	private int quantidade;
	private String dataDeCadastro;

	public Produto(String nome, double preco, int quantidade, String dataDeCadastro) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.dataDeCadastro = dataDeCadastro;
		id = contador;
		contador++;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getData() {
		return dataDeCadastro;
	}

}
