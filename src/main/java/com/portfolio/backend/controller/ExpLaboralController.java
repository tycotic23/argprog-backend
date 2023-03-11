/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.ExpLaboral;
import com.portfolio.backend.service.ExpLaboralService;
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
@RequestMapping("/expLaborales")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class ExpLaboralController {
    @Autowired
    ExpLaboralService expLaborals;
    
    @PostMapping("/crear")
    public ExpLaboral crear(@RequestBody ExpLaboral expLaboral) {
        return expLaborals.crear(expLaboral);
    }

    @GetMapping("/traer")
    public List<ExpLaboral> verTodos() {
        return expLaborals.verTodos();
    }

    @DeleteMapping("/eliminar/{ExpLaboral}")
    public String eliminar(@PathVariable long id) {
        return expLaborals.eliminar(id);
    }
    
    @PutMapping("/editar/{anterior}")
    public ExpLaboral editar(@PathVariable long id, @RequestBody ExpLaboral expLaboral) {
        return expLaborals.editar(id, expLaboral);
    }

    @GetMapping("/traer/{ExpLaboral}")
    public ExpLaboral buscar(@PathVariable long id) {
        return expLaborals.buscar(id);
    }
    
    @GetMapping("/restore")
    public void restaurar(){
        //borrar los expLaborals actuales
        //crear objetos por defecto
        //guardar todos los nuevos expLaborals
    }
}
