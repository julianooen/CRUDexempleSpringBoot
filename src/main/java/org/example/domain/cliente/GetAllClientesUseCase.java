package org.example.domain.cliente;

import lombok.AllArgsConstructor;
import org.example.infra.cliente.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GetAllClientesUseCase {

    private ClienteRepository clienteRepository;
    private ClienteConverter converter;

    public List<Cliente> getAll() {
        return clienteRepository.findAll().stream()
                .map(clienteEntity -> converter.toDomain(clienteEntity))
                .collect(Collectors.toList());
    }
}
