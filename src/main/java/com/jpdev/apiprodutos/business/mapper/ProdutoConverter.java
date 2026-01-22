package com.jpdev.apiprodutos.business.mapper;

import com.jpdev.apiprodutos.business.dto.ProdutoDTO;
import com.jpdev.apiprodutos.infrastructure.entity.Produto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoConverter {

    Produto paraProduto(ProdutoDTO produtoDTO);

    ProdutoDTO paraProdutoDTO(Produto produto);


}
