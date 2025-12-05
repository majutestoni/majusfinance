package com.estudo.finance.repositories.conta;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.estudo.finance.domain.conta.ContaEntity;

/**
 * @author Majú Testoni
 */
@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Long> {

	@Query("select c from ContaEntity c where c.numero = :numero AND c.banco.codigo = :codigoBanco")
	Optional<ContaEntity> getContaByNumeroAndBanco(Long numero, Long codigoBanco);

    List<ContaEntity> findAllByUsuarioId(Long idUsuario);
}
