/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Contacto;
import com.portfolio.backend.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactoService implements IContactoService{
    @Autowired
    ContactoRepository Contactos;

    @Override
    public Contacto crear(Contacto contacto) {
        return Contactos.save(contacto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Contacto> verTodos() {
        return Contactos.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(String redSocial) {
        Contactos.deleteById(redSocial); 
        return "Borrado";
    }

    @Override
    public Contacto buscar(String redSocial) {
        return Contactos.findById(redSocial).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Contacto editar(String redSocial, Contacto contacto) {
        contacto.setRedSocial(redSocial);
        return Contactos.save(contacto);
    }
}
