package com.estudo.finance.repositories.movimento.investimento;

import org.springframework.stereotype.Repository;

import com.estudo.finance.domain.movimento.investimento.SaidaInvestimentoEntity;
import com.estudo.finance.repositories.movimento.DinheiroMovimentoRepository;

/**
 */
@Repository
public interface SaidaInvestimentoRepository extends DinheiroMovimentoRepository<SaidaInvestimentoEntity> {
}
