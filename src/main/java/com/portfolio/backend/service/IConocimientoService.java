/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Conocimiento;
import java.util.List;
import java.util.Map;
public interface IConocimientoService {
      public Conocimiento crear(Conocimiento conocimiento);
    public List<Conocimiento> verTodos();
    public Map<String,List<Conocimiento>> agruparPorCategoria();
    public String eliminar(String nombre);
    public Conocimiento buscar(String nombre);
    public Conocimiento editar(String nombre,Conocimiento conocimiento);
    public String restaurar();
}
