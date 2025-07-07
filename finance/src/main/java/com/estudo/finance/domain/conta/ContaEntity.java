package com.estudo.finance.domain.conta;

import com.estudo.finance.domain.BaseEntity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contas")
@AttributeOverride(name = "id", column = @Column(name = "id_conta"))
@Getter
@Setter
public class ContaEntity extends BaseEntity {

    @Column(name = "ds_nome")
    private String nome;

    private double saldo;

    private TipoConta tipoConta;

}
