package org.example.domain.cliente;

import lombok.AllArgsConstructor;
import org.example.infra.cliente.ClienteEntity;
import org.example.infra.cliente.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveClienteUseCase {

    private ClienteRepository clienteRepository;
    private ClienteConverter converter;

    public Cliente save(Cliente cliente) {

        ClienteEntity clienteEntity = clienteRepository.save(converter.toEntity(cliente));
        return converter.toDomain(clienteEntity);
    }




}
