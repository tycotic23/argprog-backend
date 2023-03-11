/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/educacion")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class EducacionController {
     @Autowired
    EducacionService educacions;
    
    @PostMapping("/crear")
    public Educacion crear(@RequestBody Educacion educacion) {
        return educacions.crear(educacion);
    }

    @GetMapping("/traer")
    public List<Educacion> verTodos() {
        return educacions.verTodos();
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable long id) {
        return educacions.eliminar(id);
    }
    
    @PutMapping("/editar/{id}")
    public Educacion editar(@PathVariable long id, @RequestBody Educacion educacion) {
        return educacions.editar(id, educacion);
    }

    @GetMapping("/traer/{id}")
    public Educacion buscar(@PathVariable long id) {
        return educacions.buscar(id);
    }
    
    @GetMapping("/restore")
    public void restaurar(){
        //borrar los educacions actuales
        //crear objetos por defecto
        //guardar todos los nuevos educacions
    }
}
