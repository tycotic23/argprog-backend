/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.service.SkillService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/skills")
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
    public ResponseEntity<HashMap<String,Boolean>> eliminar(@PathVariable String skill) {
        HashMap<String,Boolean> estadoEliminado= new HashMap<>();
        estadoEliminado.put(skills.eliminar(skill), true);
        return ResponseEntity.ok(estadoEliminado);
    }
    
    @PutMapping("/editar/{anterior}")
    public Skill editar(@PathVariable String anterior, @RequestBody Skill nueva) {
        return skills.reemplazar(anterior, nueva);
    }

    @GetMapping("/traer/{skill}")
    public Skill buscar(@PathVariable String skill) {
        return skills.buscar(skill);
    }
    
    @GetMapping("/restore")
    public ResponseEntity<HashMap<String,Boolean>> restaurar(){
        //borrar los contactos actuales
        //crear objetos por defecto
        //guardar todos los nuevos contactos
         HashMap<String,Boolean> estadoContactoRestaurado= new HashMap<>();
        estadoContactoRestaurado.put(skills.restaurar(), true);
        return ResponseEntity.ok(estadoContactoRestaurado);
    }
}
