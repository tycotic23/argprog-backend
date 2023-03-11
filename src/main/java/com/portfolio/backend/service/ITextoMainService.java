/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.TextoMain;
import java.util.List;
public interface ITextoMainService {
      public TextoMain crear(TextoMain textoMain);
    public List<TextoMain> verTodos();
    public String eliminar(String nombre);
    public TextoMain buscar(String nombre);
    public TextoMain editar(String nombre,TextoMain textoMain);
}
