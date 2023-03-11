/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Idioma;
import java.util.List;
public interface IIdiomaService {
      public Idioma crear(Idioma idioma);
    public List<Idioma> verTodos();
    public String eliminar(String idioma);
    public Idioma buscar(String idioma);
    public Idioma editar(String idioma,Idioma modicacion);
}
