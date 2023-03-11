/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Botonfooter;
import com.portfolio.backend.repository.BotonFooterRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BotonFooterService implements IBotonFooterService {
     @Autowired
    BotonFooterRepository BotonFooters;

    @Override
    public Botonfooter crear(Botonfooter botonFooter) {
        return BotonFooters.save(botonFooter); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Botonfooter> verTodos() {
        return BotonFooters.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(String logo) {
        BotonFooters.deleteById(logo); 
        return "Borrado";
    }

    @Override
    public Botonfooter buscar(String botonFooter) {
        return BotonFooters.findById(botonFooter).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Botonfooter reemplazar(String anterior, Botonfooter nuevo) {
        eliminar(anterior);
        return crear(nuevo);
    }

    
}
