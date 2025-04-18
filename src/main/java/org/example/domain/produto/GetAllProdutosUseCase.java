package org.example.domain.produto;

import lombok.AllArgsConstructor;
import org.example.domain.cliente.Cliente;
import org.example.domain.cliente.ClienteConverter;
import org.example.infra.cliente.ClienteRepository;
import org.example.infra.produto.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GetAllProdutosUseCase {

    private ProdutoRepository repository;
    private ProdutoConverter converter;

    public List<Produto> getAll() {
        return repository.findAll().stream()
                .map(clienteEntity -> converter.toDomain(clienteEntity))
                .collect(Collectors.toList());
    }
}
