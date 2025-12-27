package com.estudo.finance.domain.movimento.investimento;

import com.estudo.finance.domain.movimento.DinheiroMovimentoEntity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "saidas_investimeto")
@AttributeOverride(name = "id", column = @Column(name = "id_saida_investimento"))
@Getter
@Setter
public class SaidaInvestimentoEntity extends DinheiroMovimentoEntity {

    @ManyToOne
    @JoinColumn(name = "ativo_id_ativo", nullable = false)
    private AtivoEntity ativo;
}
