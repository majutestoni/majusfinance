package com.estudo.finance.domain;

import java.time.LocalDateTime;

public abstract class BaseEntity {

    private Long id;
    // referencia a data de entrada
    private LocalDateTime data;
}
