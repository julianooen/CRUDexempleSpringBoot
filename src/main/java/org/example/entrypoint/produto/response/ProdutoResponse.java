package org.example.entrypoint.produto.response;

import java.time.LocalDate;
import java.util.UUID;

public record ProdutoResponse(UUID id, String nome, Long qty) {
}