package com.imageFactory.ImageFactory.Manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imageFactory.ImageFactory.Domain.DTO.ProdutoDTO;
import com.imageFactory.ImageFactory.Domain.Entity.Produto;
import com.imageFactory.ImageFactory.Repository.ProdutoRepository;

@Component
public class ProdutoManager {
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> getProdutos () {
		return this.repository.findAll();
	}
	
	public Produto saveProduto (ProdutoDTO dto) {
		ObjectMapper mapper = new ObjectMapper();
		Produto novoProduto = mapper.convertValue(dto, Produto.class);
		
		return this.repository.save(novoProduto);
	}

}
