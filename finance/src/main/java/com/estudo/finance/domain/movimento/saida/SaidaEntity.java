package com.estudo.finance.domain.movimento.saida;

import com.estudo.finance.domain.movimento.DinheiroMovimentoEntity;
import jakarta.persistence.Entity;

@Entity
public class SaidaEntity extends DinheiroMovimentoEntity {

    private FormPagamento tipoMeioSaida;

}
