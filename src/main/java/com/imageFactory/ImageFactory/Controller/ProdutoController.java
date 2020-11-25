package com.imageFactory.ImageFactory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imageFactory.ImageFactory.Domain.DTO.ProdutoDTO;
import com.imageFactory.ImageFactory.Domain.Entity.Produto;
import com.imageFactory.ImageFactory.Manager.ProdutoManager;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoManager manager;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getProdutos () {
		return ResponseEntity.ok(manager.getProdutos());
	}
	
	@PostMapping
	public ResponseEntity<Produto> saveProduto (@RequestBody ProdutoDTO produto) {
		return ResponseEntity.ok(manager.saveProduto(produto));
	}

}
