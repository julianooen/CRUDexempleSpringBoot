package org.example.entrypoint.produto;

import lombok.AllArgsConstructor;
import org.example.domain.produto.GetAllProdutosUseCase;
import org.example.domain.produto.SaveProdutoUseCase;
import org.example.entrypoint.produto.request.ProdutoRequest;
import org.example.entrypoint.produto.response.ProdutoResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/produto")
public class ProdutoController {

     private SaveProdutoUseCase saveProdutoUseCase;
     private GetAllProdutosUseCase getAllProdutosUseCase;
     private ProdutoMapper mapper;

     @PostMapping("/cadastrar")
     public ProdutoResponse salvarNovo(@RequestBody ProdutoRequest produtoRequest) {
         return mapper.toResponse(saveProdutoUseCase.save(mapper.toDomain(produtoRequest)));
     }

     @GetMapping("/listar")
     public List<ProdutoResponse> salvarNovo() {
         return getAllProdutosUseCase.getAll()
                 .stream()
                 .map(mapper::toResponse)
                 .toList();
     }
}
