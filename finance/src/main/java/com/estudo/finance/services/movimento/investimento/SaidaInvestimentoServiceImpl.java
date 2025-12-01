package com.estudo.finance.services.movimento.investimento;

import com.estudo.finance.repositories.categoria.CategoriaRepository;
import com.estudo.finance.repositories.categoria.SubCategoriaRepository;
import com.estudo.finance.repositories.conta.ContaRepository;
import com.estudo.finance.services.movimento.DinheiroMovimentoServiceImpl;

/**
 * Implementação de {@link SaidaInvestimentoService}
 *
 * @author Majú Testoni
 */
public class SaidaInvestimentoServiceImpl
		extends DinheiroMovimentoServiceImpl
		implements SaidaInvestimentoService {
    public SaidaInvestimentoServiceImpl(ContaRepository contaRepository, CategoriaRepository categoriaRepository, SubCategoriaRepository subCategoriaRepository) {
        super(contaRepository, categoriaRepository, subCategoriaRepository);
    }
}
