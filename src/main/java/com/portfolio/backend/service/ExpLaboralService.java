/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.ExpLaboral;
import com.portfolio.backend.repository.ExpLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExpLaboralService implements IExpLaboralService{
    @Autowired
    ExpLaboralRepository ExpLaborals;

    @Override
    public ExpLaboral crear(ExpLaboral expLaboral) {
        return ExpLaborals.save(expLaboral); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ExpLaboral> verTodos() {
        return ExpLaborals.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(long id) {
        ExpLaborals.deleteById(id); 
        return "Borrado";
    }

    @Override
    public ExpLaboral buscar(long id) {
        return ExpLaborals.findById(id).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ExpLaboral editar(long id, ExpLaboral expLaboral) {
        expLaboral.setId(id);
        return ExpLaborals.save(expLaboral);
    }
}
