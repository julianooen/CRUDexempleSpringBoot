package org.example.domain.venda;

import lombok.AllArgsConstructor;
import org.example.infra.venda.VendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class GetVendasByClienteIdUseCase {

    private VendaRepository repository;
    private VendaConverter converter;

    public List<Venda> getByClienteId(UUID clienteId) {
        return repository.findByClienteId(clienteId).stream()
                .map(vendaEntity -> converter.toDomain(vendaEntity))
                .toList();
    }
}
