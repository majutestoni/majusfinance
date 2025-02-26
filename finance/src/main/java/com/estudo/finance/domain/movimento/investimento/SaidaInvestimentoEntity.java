package com.estudo.finance.domain.movimento.investimento;

import com.estudo.finance.domain.movimento.DinheiroMovimentoEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class SaidaInvestimentoEntity extends DinheiroMovimentoEntity {

    @Column(nullable = false)
    private AtivoEntity ativo;
}
