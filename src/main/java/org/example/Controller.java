package org.example;

import lombok.AllArgsConstructor;
import org.example.entrypoint.ClienteConverter;
import org.example.entrypoint.ClienteRequest;
import org.example.infra.ClienteEntity;
import org.example.infra.ClienteRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/teste")
public class Controller {

    private ClienteRepository clienteRepository;
    private ClienteConverter converter;


    @PostMapping("/novo/{nome}")
    public void salvar(@PathVariable String nome) {
        ClienteEntity entity = new ClienteEntity();
        entity.setNome(nome);
        clienteRepository.save(entity);
    }

    @GetMapping("/novo/{id}")
    public ClienteRequest getNome(@PathVariable Long id) {
        return converter.toEntity(clienteRepository.getReferenceById(id));
    }

    @PostMapping("/cadastrar")
    public void salvarNovo(@RequestBody ClienteRequest clienteRequest) {
        clienteRepository.save(converter.toEntity(clienteRequest));
    }

    @PostMapping("/x/{palavra}")
    public String palavra(@PathVariable String  palavra) {


        return palavra + " fraco d+++++++";
    }


}
