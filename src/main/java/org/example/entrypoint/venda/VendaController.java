package org.example.entrypoint.venda;

import lombok.AllArgsConstructor;
import org.example.domain.venda.GetVendasByClienteIdUseCase;
import org.example.domain.venda.SaveVendaUseCase;
import org.example.entrypoint.venda.request.VendaRequest;
import org.example.entrypoint.venda.response.VendaResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/venda")
public class VendaController {

    private SaveVendaUseCase saveVendaUseCase;
    private GetVendasByClienteIdUseCase getVendasByClienteIdUseCase;
    private VendaMapper mapper;

    @PostMapping("/vender")
    public VendaResponse salvarNovo(@RequestBody VendaRequest vendaRequest) {
        return mapper.toResponse(saveVendaUseCase.save(mapper.toDomain(vendaRequest)));
    }

    @GetMapping("/listar/{clienteId}")
    public List<VendaResponse> salvarNovo(@PathVariable("clienteId") UUID clienteId) {
        return getVendasByClienteIdUseCase.getByClienteId(clienteId)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}
