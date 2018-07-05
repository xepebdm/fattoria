package br.com.projeto.maven.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 5L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="preco")
	private double preco;
	
	@Column(name="quantidade")
	private int quantidade;
	
	@Column(name="data")
	private String dataDeCadastro;
	
	//Construtor padrao para o hibernate
	public Produto() {}
	
	//Construtor para o ProdutoController
	public Produto(String nome, double preco, int quantidade, String dataDeCadastro) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.dataDeCadastro = dataDeCadastro;
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
