package org.example.domain.cliente;

import java.util.UUID;

public record Cliente(UUID id, String nome, String telefone) {

    public Cliente() {
        this(null, null, null);

    }
}
