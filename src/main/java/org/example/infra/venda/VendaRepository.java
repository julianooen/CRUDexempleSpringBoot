package org.example.infra.venda;

import org.example.infra.produto.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface VendaRepository extends JpaRepository<VendaEntity, Long> {

    List<VendaEntity> findByClienteId(UUID clienteId);
}
