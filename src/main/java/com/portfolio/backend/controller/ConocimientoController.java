/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Conocimiento;
import com.portfolio.backend.service.ConocimientoService;
import java.util.List;
import java.util.Map;
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
@RequestMapping("/conocimientos")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class ConocimientoController {
    @Autowired
    ConocimientoService conocimientos;
    
    @PostMapping("/crear")
    public Conocimiento crear(@RequestBody Conocimiento conocimiento) {
        return conocimientos.crear(conocimiento);
    }

    @GetMapping("/traer")
    public Map<String,List<Conocimiento>> verTodos() {
        return conocimientos.agruparPorCategoria();
    }

    @DeleteMapping("/eliminar/{nombre}")
    public String eliminar(@PathVariable String nombre) {
        return conocimientos.eliminar(nombre);
    }
    
    @PutMapping("/editar/{nombre}")
    public Conocimiento editar(@PathVariable String nombre, @RequestBody Conocimiento conocimiento) {
        return conocimientos.editar(nombre, conocimiento);
    }

    @GetMapping("/traer/{nombre}")
    public Conocimiento buscar(@PathVariable String nombre) {
        return conocimientos.buscar(nombre);
    }
    
    @GetMapping("/restore")
    public void restaurar(){
        //borrar los conocimientos actuales
        //crear objetos por defecto
        //guardar todos los nuevos conocimientos
    }
}
