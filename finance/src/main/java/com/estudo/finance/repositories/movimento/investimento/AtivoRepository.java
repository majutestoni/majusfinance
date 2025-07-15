package com.estudo.finance.repositories.movimento.investimento;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.finance.domain.movimento.investimento.AtivoEntity;

/**
 * @author Majú Testoni
 */
public interface AtivoRepository extends JpaRepository<AtivoEntity, Long> {

	AtivoEntity findByCodigo(String codigo);

}
