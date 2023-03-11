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
public class Botonfooter {
    @Id
    private String logo;
    private String url;
    
    public Botonfooter(){
        
    }
    
    public Botonfooter(String logo, String url){
        this.logo=logo;
        this.url=url;
    }
}
