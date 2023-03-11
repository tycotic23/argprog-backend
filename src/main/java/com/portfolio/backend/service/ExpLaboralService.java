/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Explaboral;
import com.portfolio.backend.repository.ExpLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExpLaboralService implements IExpLaboralService{
    @Autowired
    ExpLaboralRepository ExpLaborals;

    @Override
    public Explaboral crear(Explaboral expLaboral) {
        return ExpLaborals.save(expLaboral); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Explaboral> verTodos() {
        return ExpLaborals.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(long id) {
        ExpLaborals.deleteById(id); 
        return "Borrado";
    }

    @Override
    public Explaboral buscar(long id) {
        return ExpLaborals.findById(id).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Explaboral editar(long id, Explaboral expLaboral) {
        expLaboral.setId(id);
        return ExpLaborals.save(expLaboral);
    }
}
