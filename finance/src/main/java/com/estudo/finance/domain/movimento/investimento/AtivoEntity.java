package com.estudo.finance.domain.movimento.investimento;

import com.estudo.finance.domain.BaseEntity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "ativos")
@AttributeOverride(name = "id", column = @Column(name = "id_ativo"))
public class AtivoEntity extends BaseEntity {

    @Column(name = "ds_codigo", nullable = false, unique = true)
    private String codigo;
    @Column(name = "ds_nome", nullable = false)
    private String nome;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tp_ativo", nullable = false)
    private TipoAtivo tipo;
}
