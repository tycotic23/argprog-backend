/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Calendar;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class ExpLaboral {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String logoUrl;
    private String puesto;
    private String referencias;
    private String empresa;
    private String descripcion;
    @Temporal(TemporalType.DATE)
    private Calendar fechaIni;
    @Temporal(TemporalType.DATE)
    private Calendar fechaFin;
    
    public ExpLaboral(){
        
    }
}
