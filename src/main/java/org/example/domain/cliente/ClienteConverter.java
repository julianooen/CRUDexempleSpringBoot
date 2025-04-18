package org.example.domain.cliente;

import org.example.infra.cliente.ClienteEntity;
import org.springframework.stereotype.Component;

@Component
public class ClienteConverter {

    public ClienteEntity toEntity(Cliente cliente) {
        ClienteEntity entity = new ClienteEntity();
        entity.setNome(cliente.nome());
        entity.setTelefone(cliente.telefone());
        return entity;

    }

    public Cliente toDomain(ClienteEntity entity) {

        return new Cliente(entity.getId(), entity.getNome(), entity.getTelefone());

    }
}
