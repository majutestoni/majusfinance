package com.estudo.finance.repositories.movimento.entrada;

import org.springframework.stereotype.Repository;

import com.estudo.finance.domain.movimento.entrada.EntradaEntity;
import com.estudo.finance.repositories.movimento.DinheiroMovimentoRepository;

/**
 */
@Repository
public interface EntradaRepository extends DinheiroMovimentoRepository<EntradaEntity> {
}
