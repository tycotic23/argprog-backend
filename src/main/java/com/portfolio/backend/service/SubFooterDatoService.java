/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Subfooterdato;
import com.portfolio.backend.repository.SubFooterDatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubFooterDatoService implements ISubFooterDatoService{
    @Autowired
    SubFooterDatoRepository SubFooterDatos;

    @Override
    public Subfooterdato crear(Subfooterdato subFooterDato) {
        return SubFooterDatos.save(subFooterDato); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Subfooterdato> verTodos() {
        return SubFooterDatos.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(long id) {
        SubFooterDatos.deleteById(id); 
        return "Borrado";
    }

    @Override
    public Subfooterdato buscar(long id) {
        return SubFooterDatos.findById(id).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Subfooterdato editar(long id, Subfooterdato subFooterDato) {
        subFooterDato.setId(id);
        return SubFooterDatos.save(subFooterDato);
    }
}
