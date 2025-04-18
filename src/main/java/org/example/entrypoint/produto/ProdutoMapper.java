package org.example.entrypoint.produto;

import org.example.domain.produto.Produto;
import org.example.entrypoint.produto.request.ProdutoRequest;
import org.example.entrypoint.produto.response.ProdutoResponse;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {
    public Produto toDomain(ProdutoRequest request) {
        return new Produto(request.id(), request.nome(), request.qty());
    }

    public ProdutoResponse toResponse(Produto produto) {
        return new ProdutoResponse(produto.id(), produto.nome(), produto.qty());
    }
}
