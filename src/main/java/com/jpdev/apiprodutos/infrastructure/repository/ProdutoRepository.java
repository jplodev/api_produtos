package com.jpdev.apiprodutos.infrastructure.repository;

import com.jpdev.apiprodutos.infrastructure.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
