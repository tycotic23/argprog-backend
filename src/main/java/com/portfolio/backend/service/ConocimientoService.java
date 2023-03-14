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
    
    @Override
    public String restaurar() {
        Conocimientos.deleteAll();
        List<Conocimiento> original=new ArrayList<>();
        original.add(new Conocimiento("C/C++", "assets/lenguajes-01.png", "Panel1"));
        original.add(new Conocimiento("Java", "assets/lenguajes-02.png", "Panel1"));
        original.add(new Conocimiento("SQL", "assets/lenguajes-06.png", "Panel1"));
        original.add(new Conocimiento("HTML", "assets/lenguajes-04.png", "Panel2"));
        original.add(new Conocimiento("Javascript", "assets/lenguajes-05.png", "Panel2"));
        original.add(new Conocimiento("CSS", "assets/lenguajes-07.png", "Panel2"));
        original.add(new Conocimiento("Spring Boot", "assets/lenguajes-03.png", "Panel3"));
        original.add(new Conocimiento("Angular", "assets/lenguajes-08.png", "Panel3"));
        original.add(new Conocimiento("Photoshop", "assets/lenguajes-09.png", "Panel4"));
        original.add(new Conocimiento("Illustrator", "assets/lenguajes-10.png", "Panel4"));
        original.add(new Conocimiento("Blender", "assets/lenguajes-11.png", "Panel4"));
        original.add(new Conocimiento("After Effects", "assets/lenguajes-12.png", "Panel4"));
        Conocimientos.saveAll(original);
        return "Restaurado con éxito";
    }

}
