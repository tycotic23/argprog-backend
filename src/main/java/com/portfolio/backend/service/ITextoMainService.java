/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Textomain;
import java.util.List;
public interface ITextoMainService {
      public Textomain crear(Textomain textoMain);
    public List<Textomain> verTodos();
    public String eliminar(String nombre);
    public Textomain buscar(String nombre);
    public Textomain reemplazar(String anterior,Textomain textoMain);
}
