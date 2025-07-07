package com.estudo.finance.domain.usuario;

import com.estudo.finance.domain.BaseEntity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@AttributeOverride(name = "id", column = @Column(name = "id_usuario"))
@Getter
@Setter
public class UsuarioEntity extends BaseEntity {

    @Column(name = "ds_nome", nullable = false, length = 200)
    private String nome;
    @Column(name = "ds_cpf", nullable = false, unique = true, length = 11)
    private String cpf;

}
