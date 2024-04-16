package com.divisas.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("usuario")
public class User {

    @Id
    @Column("idUsuario")
    private Long idUser;


    @Column("usuario")
    private String username;


    @Column("clave")
    private String password;

    @Column("estado")
    private boolean status;
}
