package org.example.infra.venda;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.infra.cliente.ClienteEntity;
import org.example.infra.produto.ProdutoEntity;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "\"VENDA\"")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "\"ID\"")
    private UUID id;

    @Column(name = "\"CLIENTE_ID\"")
    private UUID clienteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CLIENTE_ID\"", referencedColumnName = "\"ID\"", updatable = false, insertable = false)
    private ClienteEntity cliente;

    @Column(name = "\"PRODUTO_ID\"")
    private UUID produtoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"PRODUTO_ID\"", referencedColumnName = "\"ID\"", updatable = false, insertable = false)
    private ProdutoEntity produto;

    @Column(name = "\"VALOR\"")
    private Double valor;

    @Column(name = "\"DATA_VENDA\"")
    private LocalDate data;

    @Column(name = "\"QTY\"")
    private Long qty;
}
