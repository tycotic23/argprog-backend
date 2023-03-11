/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Usuario;
import java.util.List;
public interface IUsuarioService {
      public Usuario crear(Usuario usuario);
    public List<Usuario> verTodos();
    public String eliminar(String usuario);
    public Usuario buscar(String usuario);
    public Usuario editar(String usuario,Usuario actualizacion);
}
