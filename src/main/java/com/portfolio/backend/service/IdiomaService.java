/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Idioma;
import com.portfolio.backend.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IdiomaService implements IIdiomaService{
    @Autowired
    IdiomaRepository Idiomas;

    @Override
    public Idioma crear(Idioma idioma) {
        return Idiomas.save(idioma); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Idioma> verTodos() {
        return Idiomas.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(String idioma) {
        Idiomas.deleteById(idioma); 
        return "Borrado";
    }

    @Override
    public Idioma buscar(String idioma) {
        return Idiomas.findById(idioma).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Idioma editar(String idioma, Idioma modificacion) {
        modificacion.setIdioma(idioma);
        return Idiomas.save(modificacion);
    }
}
