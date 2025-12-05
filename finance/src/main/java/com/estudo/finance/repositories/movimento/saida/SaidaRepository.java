package com.estudo.finance.repositories.movimento.saida;

import com.estudo.finance.domain.movimento.saida.SaidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 */
@Repository
public interface SaidaRepository extends JpaRepository<SaidaEntity, Long> {
}
