package org.example.domain.produto;

import org.example.domain.cliente.Cliente;
import org.example.infra.cliente.ClienteEntity;
import org.example.infra.produto.ProdutoEntity;
import org.springframework.stereotype.Component;

@Component
public class ProdutoConverter {

    public ProdutoEntity toEntity(Produto produto) {
        ProdutoEntity entity = new ProdutoEntity();
        entity.setNome(produto.nome());
        entity.setQty(produto.qty());
        return entity;

    }

    public Produto toDomain(ProdutoEntity entity) {

        return new Produto(entity.getId(), entity.getNome(), entity.getQty());

    }
}
