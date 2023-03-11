/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillService implements ISkillService {
    @Autowired
    SkillRepository skills;

    @Override
    public Skill crear(Skill skill) {
        return skills.save(skill); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Skill> verTodos() {
        return skills.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(String skill) {
        skills.deleteById(skill); 
        return "Borrado";
    }

    @Override
    public Skill buscar(String skill) {
        return skills.findById(skill).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Skill reemplazar(String anterior, Skill nueva) {
        eliminar(anterior);
        return crear(nueva);
    }

    
    
}
