package com.estudo.finance.domain.categoria;

import com.estudo.finance.domain.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class SubCategoriaMovimentoEntity extends BaseEntity {

    private Long codigo;
    private String denomincao;
    private CategoriaMovimentoEntity categoriaMovimento;

}
