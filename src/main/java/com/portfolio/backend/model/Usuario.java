/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Usuario {
    @Id
    private String usuario;
    private String contraseña;
    //los permisos van del mas bajo 0 (solo ver) al 1 (editor/admin), de agregar mas niveles se suman
    private int permisos;
    
    public Usuario(){
        
    }
}
