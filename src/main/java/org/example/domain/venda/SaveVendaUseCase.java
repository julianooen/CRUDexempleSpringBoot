package org.example.domain.venda;

import lombok.AllArgsConstructor;
import org.example.domain.produto.Produto;
import org.example.domain.produto.ProdutoConverter;
import org.example.infra.produto.ProdutoRepository;
import org.example.infra.venda.VendaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveVendaUseCase {

    private VendaRepository repository;
    private VendaConverter converter;

    public Venda save(Venda venda) {

        return converter.toDomain(repository.save(converter.toEntity(venda)));
    }

}
