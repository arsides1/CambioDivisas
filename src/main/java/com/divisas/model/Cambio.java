package com.divisas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("cambio")
public class Cambio {
    @Id
    @Column("id")
    private Long id;


    @Column("monto")
    private BigDecimal monto;


    @Column("monedaOrigen")
    private String monedaOrigen;


    @Column("monedaDestino")
    private String monedaDestino;


    @Column("username")
    private String username;


    @Column("montoConvertido")
    private BigDecimal montoConvertido;


    @Column("tasaCambio")
    private BigDecimal tasaCambio;

}
