package org.example.entrypoint.cliente;

import lombok.AllArgsConstructor;
import org.example.domain.cliente.GetAllClientesUseCase;
import org.example.domain.cliente.SaveClienteUseCase;
import org.example.entrypoint.cliente.request.ClienteRequest;
import org.example.entrypoint.cliente.response.ClienteResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private SaveClienteUseCase saveClienteUseCase;
    private GetAllClientesUseCase getAllClientesUseCase;
    private ClienteMapper mapper;

    @PostMapping("/cadastrar")
    public ClienteResponse salvarNovo(@RequestBody ClienteRequest clienteRequest) {
        return mapper.toResponse(saveClienteUseCase.save(mapper.toDomain(clienteRequest)));
    }

    @GetMapping("/listar")
    public List<ClienteResponse> salvarNovo() {
        return getAllClientesUseCase.getAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}
