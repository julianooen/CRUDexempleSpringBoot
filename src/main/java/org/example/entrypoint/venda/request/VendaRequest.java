package org.example.entrypoint.venda.request;

import java.util.UUID;

public record VendaRequest(UUID id, UUID clienteId, UUID produtoId, Long qty, Double valor) {
}
