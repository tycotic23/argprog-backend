/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.service.SkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author soltommy
 */
@RestController
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class SkillController {
    @Autowired
    SkillService skills;
    
    @PostMapping("/crear")
    public Skill crear(@RequestBody Skill skill) {
        return skills.crear(skill);
    }

    @GetMapping("/traer")
    public List<Skill> verTodos() {
        return skills.verTodos();
    }

    @DeleteMapping("/eliminar/{skill}")
    public String eliminarProducto(@PathVariable String skill) {
        return skills.eliminar(skill);
    }
    
    @PutMapping("/editar/{anterior}")
    public Skill editar(@PathVariable String anterior, @RequestBody Skill nueva) {
        return skills.reemplazar(anterior, nueva);
    }

    @GetMapping("/traer/{skill}")
    public Skill buscar(@PathVariable String skill) {
        return skills.buscar(skill);
    }
}
