/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.service.ProyectoService;
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
@RequestMapping("/proyectos")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class ProyectoController {
    @Autowired
    ProyectoService proyectos;
    
    @PostMapping("/crear")
    public Proyecto crear(@RequestBody Proyecto proyecto) {
        return proyectos.crear(proyecto);
    }

    @GetMapping("/traer")
    public List<Proyecto> verTodos() {
        return proyectos.verTodos();
    }

    @DeleteMapping("/eliminar/{Proyecto}")
    public String eliminar(@PathVariable long id) {
        return proyectos.eliminar(id);
    }
    
    @PutMapping("/editar/{anterior}")
    public Proyecto editar(@PathVariable long id, @RequestBody Proyecto proyecto) {
        return proyectos.editar(id, proyecto);
    }

    @GetMapping("/traer/{Proyecto}")
    public Proyecto buscar(@PathVariable long id) {
        return proyectos.buscar(id);
    }
    
    @GetMapping("/restore")
    public void restaurar(){
        //borrar los proyectos actuales
        //crear objetos por defecto
        //guardar todos los nuevos proyectos
    }
}
