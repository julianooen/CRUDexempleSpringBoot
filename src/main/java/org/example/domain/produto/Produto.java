package org.example.domain.produto;

import lombok.NoArgsConstructor;

import java.util.UUID;


public record Produto(UUID id, String nome, Long qty) {
    //adicione constructor


    public Produto() {
this(null, null, null);
    }
}
