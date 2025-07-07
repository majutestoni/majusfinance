package com.estudo.finance.domain;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    private Long id;
    // referencia a data de entrada
    private LocalDateTime data;
}
