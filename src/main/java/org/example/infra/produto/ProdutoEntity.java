package org.example.infra.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.infra.venda.VendaEntity;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "\"PRODUTO\"")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "\"ID\"")
    private UUID id;

    @Column(name = "\"NOME\"")
    private String nome;

    @Column(name = "\"QTY\"")
    private Long qty;

    @OneToMany(mappedBy = "produto")
    private List<VendaEntity> venda;

}
