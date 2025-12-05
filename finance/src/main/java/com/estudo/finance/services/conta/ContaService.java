package com.estudo.finance.services.conta;

import com.estudo.finance.domain.conta.ContaEntity;
import com.estudo.finance.dtos.conta.ContaDTO;

import java.util.List;

public interface ContaService {

    ContaEntity novaConta(ContaDTO dto);
    ContaEntity getConta(Long id);
    List<ContaEntity> getContasByUsuario(Long idUsuario);
}
