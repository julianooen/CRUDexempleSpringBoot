package org.example.entrypoint.venda;

import org.example.domain.cliente.Cliente;
import org.example.domain.produto.Produto;
import org.example.domain.venda.Venda;
import org.example.entrypoint.cliente.ClienteMapper;
import org.example.entrypoint.cliente.response.ClienteResponse;
import org.example.entrypoint.produto.ProdutoMapper;
import org.example.entrypoint.produto.response.ProdutoResponse;
import org.example.entrypoint.venda.request.VendaRequest;
import org.example.entrypoint.venda.response.VendaResponse;
import org.springframework.stereotype.Component;

@Component
public class VendaMapper {


    public Venda toDomain(VendaRequest request) {
        return new Venda(request.id(),
                request.clienteId(),
                request.produtoId(),
                request.qty(),
                request.valor(),
                null,
                null,
                null);
    }

    public VendaResponse toResponse(Venda venda) {
        return new VendaResponse(venda.id(),
                venda.clienteId(),
                venda.produtoId(),
                venda.qty(),
                venda.valor(),
                venda.data(),
                toResponse(venda.cliente()),
                toResponse(venda.produto())
        );
    }

    public ProdutoResponse toResponse(Produto produto) {
        return new ProdutoResponse(produto.id(), produto.nome(), produto.qty());
    }

    public ClienteResponse toResponse(Cliente cliente) {

        return new ClienteResponse(cliente.id(), cliente.nome(), cliente.telefone());

    }
}
