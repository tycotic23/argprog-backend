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
public class Textomain {
    @Id
    private String nombre;
    private String texto;
    private String fotourl;
    
    public Textomain(String nombre, String texto, String fotourl){
        this.nombre=nombre;
        this.texto=texto;
        this.fotourl=fotourl;
    }
    
    public Textomain(){
    
    }
}
