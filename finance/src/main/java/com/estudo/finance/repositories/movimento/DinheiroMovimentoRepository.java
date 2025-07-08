package com.estudo.finance.repositories.movimento;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.finance.domain.movimento.DinheiroMovimentoEntity;

/**
 */
public interface DinheiroMovimentoRepository<T extends DinheiroMovimentoEntity> extends JpaRepository<T, Long> {
}
