package org.example.domain.venda;

import org.example.domain.cliente.Cliente;
import org.example.domain.cliente.ClienteConverter;
import org.example.domain.produto.Produto;
import org.example.domain.produto.ProdutoConverter;
import org.example.infra.cliente.ClienteEntity;
import org.example.infra.produto.ProdutoEntity;
import org.example.infra.venda.VendaEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

@Component
public class VendaConverter {


    public VendaEntity toEntity(Venda venda) {
        VendaEntity entity = new VendaEntity();
        entity.setClienteId(venda.clienteId());
        entity.setProdutoId(venda.produtoId());
        entity.setQty(venda.qty());
        entity.setValor(venda.valor());
        entity.setData(LocalDate.now());
        return entity;
    }

    public Venda toDomain(VendaEntity entity) {

        return new Venda(entity.getId(),
                entity.getClienteId(),
                entity.getProdutoId(),
                entity.getQty(),
                entity.getValor(),
                entity.getData(),
                toDomain(entity.getCliente()),
                toDomain(entity.getProduto())
                );
    }



    public Cliente toDomain(ClienteEntity entity) {
        if(Objects.isNull(entity)) {
            return new Cliente();
        }
        return new Cliente(entity.getId(), entity.getNome(), entity.getTelefone());

    }

    private Produto toDomain(ProdutoEntity entity) {

        if(Objects.isNull(entity)) {
            return  new Produto();
        }
        return new Produto(entity.getId(), entity.getNome(), entity.getQty());

    }
}
