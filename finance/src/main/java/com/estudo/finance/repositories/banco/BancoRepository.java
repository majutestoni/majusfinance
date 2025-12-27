package com.estudo.finance.repositories.banco;

import com.estudo.finance.domain.banco.BancoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoRepository extends JpaRepository<BancoEntity, Long> {
}
