package org.example.entrypoint.cliente.request;

import java.util.UUID;

public record ClienteRequest(UUID id, String nome, String telefone) {


}
