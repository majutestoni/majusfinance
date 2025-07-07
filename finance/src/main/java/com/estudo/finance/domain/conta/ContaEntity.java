package com.estudo.finance.domain.conta;

import com.estudo.finance.domain.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class ContaEntity extends BaseEntity {

    private String nome;

    private double saldo;

    private TipoConta tipoConta;

}
