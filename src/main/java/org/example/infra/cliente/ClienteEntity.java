package org.example.infra.cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.infra.venda.VendaEntity;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "\"CLIENTE\"")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "\"ID\"")
    private UUID id;

    @Column(name = "\"NOME\"")
    private String nome;

    @Column(name = "\"TELEFONE\"")
    private String telefone;

    @OneToMany(mappedBy = "cliente")
    private List<VendaEntity> venda;
}
