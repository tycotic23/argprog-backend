/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Textomain;
import com.portfolio.backend.service.TextoMainService;
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
@RequestMapping("/textosmain")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class TextoMainController {
     @Autowired
    TextoMainService textoMains;
    
    @PostMapping("/crear")
    public Textomain crear(@RequestBody Textomain textoMain) {
        return textoMains.crear(textoMain);
    }

    @GetMapping("/traer")
    public List<Textomain> verTodos() {
        return textoMains.verTodos();
    }

    @DeleteMapping("/eliminar/{nombre}")
    public ResponseEntity<HashMap<String,Boolean>> eliminar(@PathVariable String nombre) {
        HashMap<String,Boolean> estadoEliminado= new HashMap<>();
        estadoEliminado.put(textoMains.eliminar(nombre), true);
        return ResponseEntity.ok(estadoEliminado);
    }
    
    @PutMapping("/editar/{anterior}")
    public Textomain editar(@PathVariable String anterior, @RequestBody Textomain textoMain) {
        return textoMains.reemplazar(anterior, textoMain);
    }

    @GetMapping("/traer/{nombre}")
    public Textomain buscar(@PathVariable String nombre) {
        return textoMains.buscar(nombre);
    }
    
    @GetMapping("/restore")
    public ResponseEntity<HashMap<String,Boolean>> restaurar(){
        //borrar los contactos actuales
        //crear objetos por defecto
        //guardar todos los nuevos contactos
         HashMap<String,Boolean> estadoContactoRestaurado= new HashMap<>();
        estadoContactoRestaurado.put(textoMains.restaurar(), true);
        return ResponseEntity.ok(estadoContactoRestaurado);
    }
}
