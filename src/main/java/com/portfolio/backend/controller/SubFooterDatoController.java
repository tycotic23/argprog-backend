/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Subfooterdato;
import com.portfolio.backend.service.SubFooterDatoService;
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
@RequestMapping("/subfooterdatos")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class SubFooterDatoController {
    @Autowired
    SubFooterDatoService subFooterDatos;
    
    @PostMapping("/crear")
    public Subfooterdato crear(@RequestBody Subfooterdato subFooterDato) {
        return subFooterDatos.crear(subFooterDato);
    }

    @GetMapping("/traer")
    public List<Subfooterdato> verTodos() {
        return subFooterDatos.verTodos();
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable long id) {
        return subFooterDatos.eliminar(id);
    }
    
    @PutMapping("/editar/{id}")
    public Subfooterdato editar(@PathVariable long id, @RequestBody Subfooterdato subFooterDato) {
        return subFooterDatos.editar(id, subFooterDato);
    }

    @GetMapping("/traer/{id}")
    public Subfooterdato buscar(@PathVariable long id) {
        return subFooterDatos.buscar(id);
    }
    
    @GetMapping("/restore")
    public void restaurar(){
        //borrar los subFooterDatos actuales
        //crear objetos por defecto
        //guardar todos los nuevos subFooterDatos
    }
}
