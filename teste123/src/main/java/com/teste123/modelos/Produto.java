package com.teste123.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_produto;
	private String nome_produto;
	private String tamanho_produto;

	public long getId_produto() {
		return id_produto;
	}

	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getTamanho_produto() {
		return tamanho_produto;
	}

	public void setTamanho_produto(String tamanho_produto) {
		this.tamanho_produto = tamanho_produto;
	}

}
