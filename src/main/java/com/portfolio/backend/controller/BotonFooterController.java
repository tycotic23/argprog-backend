/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Botonfooter;
import com.portfolio.backend.service.BotonFooterService;
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
@RequestMapping("/botonesfooter")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class BotonFooterController {
    @Autowired
    BotonFooterService botonFooters;
    
    @PostMapping("/crear")
    public Botonfooter crear(@RequestBody Botonfooter botonFooter) {
        return botonFooters.crear(botonFooter);
    }

    @GetMapping("/traer")
    public List<Botonfooter> verTodos() {
        return botonFooters.verTodos();
    }

    @DeleteMapping("/eliminar/{logo}")
    public String eliminar(@PathVariable String logo) {
        return botonFooters.eliminar(logo);
    }
    
    @PutMapping("/editar/{anterior}")
    public Botonfooter editar(@PathVariable String anterior, @RequestBody Botonfooter nuevo) {
        return botonFooters.reemplazar(anterior, nuevo);
    }

    @GetMapping("/traer/{logo}")
    public Botonfooter buscar(@PathVariable String logo) {
        return botonFooters.buscar(logo);
    }
    
    @GetMapping("/restore")
    public void restaurar(){
        //borrar los botonFooters actuales
        //crear objetos por defecto
        //guardar todos los nuevos botonFooters
    }
}
