package org.example.entrypoint.venda.response;

import org.example.entrypoint.cliente.response.ClienteResponse;
import org.example.entrypoint.produto.response.ProdutoResponse;

import java.time.LocalDate;
import java.util.UUID;

public record VendaResponse(UUID id,
                            UUID clienteId,
                            UUID produtoId,
                            Long qty,
                            Double valor,
                            LocalDate data,
                            ClienteResponse clienteResponse,
                            ProdutoResponse produtoResponse) {
}
