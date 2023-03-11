/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Idioma;
import com.portfolio.backend.service.IdiomaService;
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
@RequestMapping("/idiomas")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class IdiomaController {
    @Autowired
    IdiomaService idiomas;
    
    @PostMapping("/crear")
    public Idioma crear(@RequestBody Idioma idioma) {
        return idiomas.crear(idioma);
    }

    @GetMapping("/traer")
    public List<Idioma> verTodos() {
        return idiomas.verTodos();
    }

    @DeleteMapping("/eliminar/{Idioma}")
    public String eliminar(@PathVariable String idioma) {
        return idiomas.eliminar(idioma);
    }
    
    @PutMapping("/editar/{anterior}")
    public Idioma editar(@PathVariable String idioma, @RequestBody Idioma modificacion) {
        return idiomas.editar(idioma, modificacion);
    }

    @GetMapping("/traer/{Idioma}")
    public Idioma buscar(@PathVariable String idioma) {
        return idiomas.buscar(idioma);
    }
    
    @GetMapping("/restore")
    public void restaurar(){
        //borrar los idiomas actuales
        //crear objetos por defecto
        //guardar todos los nuevos idiomas
    }
}
