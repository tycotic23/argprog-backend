/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Categoria;
import java.util.List;

/**
 *
 * @author soltommy
 */
public interface ICategoriaService {
    public Categoria crear(Categoria categoria);
    public List<Categoria> verTodos();
    public Categoria buscar(long id);
    public Categoria editar(long id,Categoria categoria);
    public String restaurar();
    public List<Categoria> sortByOrden();
    public String eliminar(long id);
}
