package com.jpdev.apiprodutos.business.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProdutoDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private List<CategoriaDTO> categorias;
}
