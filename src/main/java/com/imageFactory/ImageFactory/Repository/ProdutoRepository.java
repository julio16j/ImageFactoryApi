package com.imageFactory.ImageFactory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imageFactory.ImageFactory.Domain.Entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
