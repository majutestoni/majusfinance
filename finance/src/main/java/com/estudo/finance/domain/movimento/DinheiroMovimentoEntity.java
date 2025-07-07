package com.estudo.finance.domain.movimento;

import java.time.LocalDateTime;

import com.estudo.finance.domain.BaseEntity;
import com.estudo.finance.domain.categoria.SubCategoriaMovimentoEntity;
import com.estudo.finance.domain.conta.ContaEntity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DinheiroMovimentoEntity extends BaseEntity {

    @Column(name = "nr_valor", nullable = false)
    private double valor;
    @Column(name = "dt_movimento", nullable = false)
    private LocalDateTime data;
    @Column(name = "ds_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "categoria_id_categoria")
    private SubCategoriaMovimentoEntity categoria;

    @ManyToOne
    @JoinColumn(name = "conta_id_conta")
    private ContaEntity conta;

}
