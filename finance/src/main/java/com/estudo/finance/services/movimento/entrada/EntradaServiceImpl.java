package com.estudo.finance.services.movimento.entrada;

import com.estudo.finance.domain.conta.ContaEntity;
import com.estudo.finance.domain.movimento.entrada.EntradaEntity;
import com.estudo.finance.dtos.movimento.entrada.EntradaDTO;
import com.estudo.finance.repositories.movimento.entrada.EntradaRepository;
import com.estudo.finance.repositories.movimento.investimento.AtivoRepository;
import com.estudo.finance.services.movimento.DinheiroMovimentoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Implementação de {@link  EntradaService}
 *
 * @author Majú Testoni
 */
@Service
@RequiredArgsConstructor
public class EntradaServiceImpl
		extends DinheiroMovimentoServiceImpl
		implements EntradaService {

	private AtivoRepository ativoRepository;
	private EntradaRepository entradaRepository;

	@Override
	public EntradaEntity deposito(EntradaDTO dto) {
		return getEntity(dto);
	}

	private EntradaEntity getEntity(EntradaDTO dto) {
		EntradaEntity entity = dto.toEntity();

        setDadosById(entity, dto);

		entity = entradaRepository.save(entity);
        modificaSaldo(entity);

		return entity;
	}

    private void setDadosById(EntradaEntity entity, EntradaDTO dto) {
        var ativo = ativoRepository.findById(dto.idAtivo())
                .orElseThrow(() -> new IllegalArgumentException("Ativo não encontrado"));

        var categoria = categoriaRepository.findById(dto.idAtivo())
                .orElseThrow(() -> new IllegalArgumentException("categoria não encontrado"));

        var subCategoria = subCategoriaRepository.findById(dto.idAtivo())
                .orElseThrow(() -> new IllegalArgumentException("subCategoria não encontrado"));

        var conta = contaRepository.findById(dto.idAtivo())
                .orElseThrow(() -> new IllegalArgumentException("conta não encontrado"));

        entity.setAtivo(ativo);
        entity.setCategoria(subCategoria);
        entity.setCategoriaMovimento(categoria);
        entity.setConta(conta);
    }

    private void modificaSaldo(EntradaEntity entradaEntity) {
        ContaEntity contaEntity = entradaEntity.getConta();

        BigDecimal saldoAtual = contaEntity.getSaldo().add(entradaEntity.getValor());
        contaEntity.setSaldo(saldoAtual);

        contaRepository.save(contaEntity);
    }
}
