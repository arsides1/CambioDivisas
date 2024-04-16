package com.divisas.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("usuario_rol")
public class UserRole {


    @Column("idUsuario")
    private Long idUser;


    @Column("idRol")
    private Long idRole;
}