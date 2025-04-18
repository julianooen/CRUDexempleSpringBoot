package org.example.domain.produto;

import lombok.AllArgsConstructor;
import org.example.infra.produto.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveProdutoUseCase {

    private ProdutoRepository repository;
    private ProdutoConverter converter;

    public Produto save(Produto cliente) {

        return converter.toDomain(repository.save(converter.toEntity(cliente)));
    }

}
