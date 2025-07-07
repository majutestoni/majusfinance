package com.estudo.finance.domain.usuario;

import com.estudo.finance.domain.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class UsuarioEntity extends BaseEntity {

    private String nome;
    private String cpf;

    public double getSaldoTotal() {
        return 0;
    }
}
