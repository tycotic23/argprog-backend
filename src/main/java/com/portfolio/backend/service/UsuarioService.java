/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Usuario;
import com.portfolio.backend.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    UsuarioRepository Usuarios;

    @Override
    public Usuario crear(Usuario usuario) {
        return Usuarios.save(usuario); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> verTodos() {
        return Usuarios.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(String usuario) {
        Usuarios.deleteById(usuario); 
        return "Borrado";
    }

    @Override
    public Usuario buscar(String usuario) {
        return Usuarios.findById(usuario).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario editar(String usuario, Usuario actualizacion) {
        actualizacion.setUsuario(usuario);
        return Usuarios.save(actualizacion);
    }
}
