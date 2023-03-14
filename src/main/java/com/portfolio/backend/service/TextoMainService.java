/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Textomain;
import com.portfolio.backend.repository.TextoMainRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TextoMainService implements ITextoMainService{
    @Autowired
    TextoMainRepository TextoMains;

    @Override
    public Textomain crear(Textomain textoMain) {
        return TextoMains.save(textoMain); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Textomain> verTodos() {
        return TextoMains.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(String nombre) {
        TextoMains.deleteById(nombre); 
        return "Borrado";
    }

    @Override
    public Textomain buscar(String nombre) {
        return TextoMains.findById(nombre).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Textomain reemplazar(String anterior, Textomain textoMain) {
        textoMain.setNombre(anterior);
        return TextoMains.save(textoMain);
    }
    
    @Override
    public String restaurar() {
        TextoMains.deleteAll();
        List<Textomain> original=new ArrayList<>();
        original.add(new Textomain("Tomas Stevan Balanda Wagner", "Me llamo Tomas Stevan Balanda Wagner. Freelancer desde finales de 2022. Pasé por varias carreras, siempre cercanas, de alguna manera, al desarrollo de videojuegos. Ya sea desde el área informática o artística. Durante 2022 comencé a formarme en desarrollo fullstack a partir del programa \"Argentina Programa\" con la intención de entrar a la industria de desarrollo de software. Aunque sin perder de vista el verdadero objetivo a alcanzar algún día: los videojuegos.","assets/foto-perfil.png"));
        TextoMains.saveAll(original);
        return "Restaurado con éxito";
    }
}
