/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Contacto;
import com.portfolio.backend.service.ContactoService;
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
@RequestMapping("/contactos")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class ContactoController {
    @Autowired
    ContactoService contactos;
    
    @PostMapping("/crear")
    public Contacto crear(@RequestBody Contacto contacto) {
        return contactos.crear(contacto);
    }

    @GetMapping("/traer")
    public List<Contacto> verTodos() {
        return contactos.verTodos();
    }

    @DeleteMapping("/eliminar/{nombre}")
    public String eliminar(@PathVariable String nombre) {
        return contactos.eliminar(nombre);
    }
    
    @PutMapping("/editar/{nombre}")
    public Contacto editar(@PathVariable String nombre, @RequestBody Contacto contacto) {
        return contactos.editar(nombre, contacto);
    }

    @GetMapping("/traer/{nombre}")
    public Contacto buscar(@PathVariable String nombre) {
        return contactos.buscar(nombre);
    }
    
    @GetMapping("/restore")
    public void restaurar(){
        //borrar los contactos actuales
        //crear objetos por defecto
        //guardar todos los nuevos contactos
    }
}
