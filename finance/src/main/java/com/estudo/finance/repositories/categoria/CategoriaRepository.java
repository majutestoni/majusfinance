package com.estudo.finance.repositories.categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.finance.domain.categoria.CategoriaMovimentoEntity;

/**
 * @author Majú Testoni
 */
@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaMovimentoEntity, Long> {

	CategoriaMovimentoEntity findByCodigo(Long codigo);
}
