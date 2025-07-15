package com.estudo.finance.services.movimento.entrada;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.estudo.finance.configuration.exceptions.RequisicaoInvalidaException;
import com.estudo.finance.domain.movimento.entrada.EntradaEntity;
import com.estudo.finance.domain.movimento.investimento.AtivoEntity;
import com.estudo.finance.dtos.movimento.entrada.EntradaDTO;
import com.estudo.finance.repositories.categoria.CategoriaRepository;
import com.estudo.finance.repositories.categoria.SubCategoriaRepository;
import com.estudo.finance.repositories.conta.ContaRepository;
import com.estudo.finance.repositories.movimento.entrada.EntradaRepository;
import com.estudo.finance.repositories.movimento.investimento.AtivoRepository;
import com.estudo.finance.services.movimento.DinheiroMovimentoServiceImpl;

/**
 * Implementação de {@link  EntradaService}
 *
 * @author Majú Testoni
 */
@Service
public class EntradaServiceImpl
		extends DinheiroMovimentoServiceImpl<EntradaDTO>
		implements EntradaService {

	private AtivoRepository ativoRepository;
	private EntradaRepository entradaRepository;

	public EntradaServiceImpl(ContaRepository contaRepository, AtivoRepository ativoRepository, EntradaRepository entradaRepository,
	                          CategoriaRepository categoriaRepository, SubCategoriaRepository subCategoriaRepository) {
		super(contaRepository, categoriaRepository, subCategoriaRepository);
		this.ativoRepository = ativoRepository;
		this.entradaRepository = entradaRepository;
	}

	@Override
	public EntradaEntity deposito(EntradaDTO dto) {
		return getEntity(dto);
	}

	private EntradaEntity getEntity(EntradaDTO dto) {
		EntradaEntity entity = new EntradaEntity();

		entity.setData(dto.getData() != null ? dto.getData() : LocalDateTime.now());
		entity.setValor(dto.getValor());
		entity.setDescricao(dto.getDescricao());


		entity.setAtivo(getAtivoByCodigo(dto.getCodigoAtivo()));
		entity.setConta(getConta(dto));

		entity = entradaRepository.save(entity);
		return entity;
	}

	private AtivoEntity getAtivoByCodigo(String codigoAtivo) {
		if (codigoAtivo == null || codigoAtivo.isBlank()) {
			throw new RequisicaoInvalidaException("Deve ser informado um código de ativo.");
		}

		AtivoEntity ativo = ativoRepository.findByCodigo(codigoAtivo);

		if (ativo == null) {
			throw new RequisicaoInvalidaException("Ativo com o código: " + codigoAtivo + " não foi encontrado!");
		}

		return ativo;
	}
}
