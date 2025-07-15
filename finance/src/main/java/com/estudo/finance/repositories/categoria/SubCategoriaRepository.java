package com.estudo.finance.repositories.categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.finance.domain.categoria.SubCategoriaMovimentoEntity;

/**
 * @author Majú Testoni
 */
@Repository
public interface SubCategoriaRepository extends JpaRepository<SubCategoriaMovimentoEntity, Long> {

	SubCategoriaMovimentoEntity findByCodigo(Long codigo);
}
