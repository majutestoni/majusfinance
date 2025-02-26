package com.estudo.finance.domain.movimento.entrada;

import com.estudo.finance.domain.movimento.DinheiroMovimentoEntity;
import com.estudo.finance.domain.movimento.investimento.AtivoEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class EntradaEntity extends DinheiroMovimentoEntity {

    @Column(nullable = true)
    private AtivoEntity ativo;
}
