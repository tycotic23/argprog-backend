/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Usuario;
import com.portfolio.backend.service.UsuarioService;
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
@RequestMapping("/usuarios")
@CrossOrigin(origins="http://localhost:4200/")
//@CrossOrigin(origins="https://probando-firebase-tools.web.app/")
public class UsuarioController {
    @Autowired
    UsuarioService usuarios;
    
    @PostMapping("/crear")
    public Usuario crear(@RequestBody Usuario Usuario) {
        return usuarios.crear(Usuario);
    }

    @GetMapping("/traer")
    public List<Usuario> verTodos() {
        return usuarios.verTodos();
    }

    @DeleteMapping("/eliminar/{usuario}")
    public String eliminar(@PathVariable String usuario) {
        return usuarios.eliminar(usuario);
    }
    
    @PutMapping("/editar/{usuario}")
    public Usuario editar(@PathVariable String usuario, @RequestBody Usuario actualizacion) {
        return usuarios.editar(usuario, actualizacion);
    }

    @GetMapping("/traer/{usuario}")
    public Usuario buscar(@PathVariable String usuario) {
        return usuarios.buscar(usuario);
    }
}
