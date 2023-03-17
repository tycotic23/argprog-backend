/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Categoria;
import com.portfolio.backend.model.Conocimiento;
import com.portfolio.backend.service.ConocimientoService;
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
    
    @PostMapping("/crearcategoria")
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return conocimientos.crearCategoria(categoria);
    }

    @GetMapping("/traer")
    public List<Conocimiento> verTodos() {
        return conocimientos.verTodos();
    }
    
    @GetMapping("/traercategorias")
    public List<Categoria> verCategorias() {
        return conocimientos.verCategorias();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<HashMap<String,Boolean>> eliminar(@PathVariable long id) {
        HashMap<String,Boolean> estadoEliminado= new HashMap<>();
        estadoEliminado.put(conocimientos.eliminar(id), true);
        return ResponseEntity.ok(estadoEliminado);
    }
    
    @DeleteMapping("/eliminarcategoria/{id}")
    public ResponseEntity<HashMap<String,Boolean>> eliminarCategoria(@PathVariable long id) {
        HashMap<String,Boolean> estadoEliminado= new HashMap<>();
        estadoEliminado.put(conocimientos.eliminarCategoria(id), true);
        return ResponseEntity.ok(estadoEliminado);
    }
    
    @PutMapping("/editar/{id}")
    public Conocimiento editar(@PathVariable long id, @RequestBody Conocimiento conocimiento) {
        return conocimientos.editar(id, conocimiento);
    }
    
      @PutMapping("/editarcategoria/{id}")
    public Categoria editarCategoria(@PathVariable long id, @RequestBody Categoria categoria) {
        return conocimientos.editarCategoria(id, categoria);
    }

    @GetMapping("/traer/{id}")
    public Conocimiento buscar(@PathVariable long id) {
        return conocimientos.buscar(id);
    }
    
     @GetMapping("/traercategoria/{id}")
    public Categoria buscarCategoria(@PathVariable long id) {
        return conocimientos.buscarCategoria(id);
    }
    
    @GetMapping("/traercategoriabynombre/{nombre}")
    public Categoria buscarCategoriabyNombre(@PathVariable String nombre) {
        return conocimientos.buscarCategoriabyNombre(nombre);
    }
    
    @GetMapping("/restore")
    public ResponseEntity<HashMap<String,Boolean>> restaurar(){
        //borrar los conocimientos actuales
        //crear objetos por defecto
        //guardar todos los nuevos conocimientos
         HashMap<String,Boolean> estadoConocimientoEliminado= new HashMap<>();
        estadoConocimientoEliminado.put(conocimientos.restaurar(), true);
        return ResponseEntity.ok(estadoConocimientoEliminado);
    }
}
