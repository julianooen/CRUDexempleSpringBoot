package org.example.entrypoint.produto.request;

import java.util.UUID;

public record ProdutoRequest(UUID id, String nome, Long qty) {
}
