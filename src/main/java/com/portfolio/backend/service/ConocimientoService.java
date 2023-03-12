/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Conocimiento;
import com.portfolio.backend.repository.ConocimientoRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConocimientoService implements IConocimientoService{
      @Autowired
    ConocimientoRepository Conocimientos;

    @Override
    public Conocimiento crear(Conocimiento Conocimiento) {
        return Conocimientos.save(Conocimiento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Conocimiento> verTodos() {
        return Conocimientos.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(String nombre) {
        Conocimientos.deleteById(nombre); 
        return "Borrado";
    }

    @Override
    public Conocimiento buscar(String nombre) {
        return Conocimientos.findById(nombre).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Conocimiento editar(String nombre, Conocimiento conocimiento) {
        conocimiento.setNombre(nombre);
        return Conocimientos.save(conocimiento);
    }

    @Override
    public Map<String,List<Conocimiento>> agruparPorCategoria() {
        Map<String,List<Conocimiento>> conocimientosAgrupados=new HashMap<>();
        for (String category:Conocimientos.getCategoryList()){
            conocimientosAgrupados.put(category,Conocimientos.getConocimientoListByCategory(category));
        }
        return conocimientosAgrupados;
    }

}
