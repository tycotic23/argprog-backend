/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    ProyectoRepository Proyectos;

    @Override
    public Proyecto crear(Proyecto proyecto) {
        return Proyectos.save(proyecto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Proyecto> verTodos() {
        return Proyectos.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(long id) {
        Proyectos.deleteById(id); 
        return "Borrado";
    }

    @Override
    public Proyecto buscar(long id) {
        return Proyectos.findById(id).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Proyecto editar(long id, Proyecto proyecto) {
        proyecto.setId(id);
        return Proyectos.save(proyecto);
    }
}
