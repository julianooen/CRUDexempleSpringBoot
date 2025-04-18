package org.example.entrypoint.cliente;

import org.example.domain.cliente.Cliente;
import org.example.entrypoint.cliente.request.ClienteRequest;
import org.example.entrypoint.cliente.response.ClienteResponse;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente toDomain(ClienteRequest request) {

        return new Cliente(request.id(), request.nome(), request.telefone());

    }

    public ClienteResponse toResponse(Cliente cliente) {

        return new ClienteResponse(cliente.id(), cliente.nome(), cliente.telefone());

    }
}
