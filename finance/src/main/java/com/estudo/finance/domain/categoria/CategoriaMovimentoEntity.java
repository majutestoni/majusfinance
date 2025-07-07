package com.estudo.finance.domain.categoria;

import com.estudo.finance.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria_movimento")
@Getter
@Setter
@NoArgsConstructor
public class CategoriaMovimentoEntity extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_categoria_movimento", unique = true)
    private Long codigo;
    @Column(name = "ds_categoria_movimento", nullable = false)
    private String denominacao;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ds_categoria_movimento", nullable = false)
    private TipoMovimento tipo;
}
