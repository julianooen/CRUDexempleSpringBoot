package org.example.entrypoint;

import org.example.infra.ClienteEntity;
import org.springframework.stereotype.Component;

@Component
public class ClienteConverter {

    public ClienteEntity toEntity(ClienteRequest clienteRequest) {
        ClienteEntity entity = new ClienteEntity();
        entity.setNome(clienteRequest.getNome());
        entity.setTelefone(clienteRequest.getTelefone());
        return entity;

    }

    public ClienteRequest toEntity(ClienteEntity clienteRequest) {
        ClienteRequest entity = new ClienteRequest();
        entity.setNome(clienteRequest.getNome());
        entity.setTelefone(clienteRequest.getTelefone());
        return entity;

    }
}
