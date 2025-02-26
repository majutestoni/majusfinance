package com.estudo.finance.domain.categoria;

import com.estudo.finance.domain.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class CategoriaMovimentoEntity extends BaseEntity {

    private Long codigo;
    private String denominacao;
    private TipoMovimento tipo;
}
