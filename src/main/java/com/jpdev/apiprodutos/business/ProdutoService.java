package com.jpdev.apiprodutos.business;

import com.jpdev.apiprodutos.business.dto.ProdutoDTO;
import com.jpdev.apiprodutos.business.mapper.ProdutoConverter;
import com.jpdev.apiprodutos.infrastructure.entity.Produto;
import com.jpdev.apiprodutos.infrastructure.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ProdutoConverter produtoConverter;

    public ProdutoDTO salvarProduto(ProdutoDTO produtoDTO) {
        Produto entity = produtoConverter.paraProduto(produtoDTO);
        return produtoConverter.paraProdutoDTO(produtoRepository.save(entity));
    }


}
