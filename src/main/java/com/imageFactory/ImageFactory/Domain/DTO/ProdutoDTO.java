package com.imageFactory.ImageFactory.Domain.DTO;

import com.sun.istack.NotNull;

public class ProdutoDTO {
	
	@NotNull
	private String nome;
	
	@NotNull
	private String categoria;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
