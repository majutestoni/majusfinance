package com.estudo.finance.repositories.movimento.saida;

import org.springframework.stereotype.Repository;

import com.estudo.finance.domain.movimento.saida.SaidaEntity;
import com.estudo.finance.repositories.movimento.DinheiroMovimentoRepository;

/**
 */
@Repository
public interface SaidaRepository extends DinheiroMovimentoRepository<SaidaEntity> {
}
