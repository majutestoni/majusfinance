package com.estudo.finance.domain.movimento.investimento;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;

@Entity
public class AtivoEntity extends Serializers.Base {

    private String codigo;
    private String nome;
    private TipoAtivo tipo;
}
