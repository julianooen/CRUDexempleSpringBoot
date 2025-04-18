package org.example.domain.venda;

import org.example.domain.cliente.Cliente;
import org.example.domain.produto.Produto;

import java.time.LocalDate;
import java.util.UUID;

public record Venda(UUID id,
                    UUID clienteId,
                    UUID produtoId,
                    Long qty,
                    Double valor,
                    LocalDate data,
                    Cliente cliente,
                    Produto produto) {
}
