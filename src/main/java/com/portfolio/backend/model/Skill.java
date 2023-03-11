/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author soltommy
 */
@Getter @Setter
@Entity
public class Skill {
    @Id
    String skill;
    
    public Skill(String skill){
        this.skill=skill;
    }
    
    public Skill(){
        
    }
    
}
