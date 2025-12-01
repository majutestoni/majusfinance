package com.estudo.finance.domain.banco;

import com.estudo.finance.domain.BaseEntity;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bancos")
@AttributeOverride(name = "id", column = @Column(name = "id_banco"))
@Getter
@Setter
public class BancoEntity extends BaseEntity {

    @Column(name = "ds_nome", nullable = false)
    private String nome;

    @Column(name = "cd_banco", nullable = false, unique = true)
    private Long codigo;
}
