package com.estudo.finance.repositories.movimento.entrada;



import com.estudo.finance.domain.movimento.entrada.EntradaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface EntradaRepository extends JpaRepository<EntradaEntity, Long> {
}
