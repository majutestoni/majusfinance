package com.estudo.finance.repositories.movimento.investimento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.finance.domain.movimento.investimento.SaidaInvestimentoEntity;

/**
 */
@Repository
public interface SaidaInvestimentoRepository extends JpaRepository<SaidaInvestimentoEntity, Long> {
}
