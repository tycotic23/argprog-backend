/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Botonfooter;
import java.util.List;
public interface IBotonFooterService {
      public Botonfooter crear(Botonfooter botonFooter);
        public List<Botonfooter> verTodos();
    public String eliminar(String logo);
    public Botonfooter buscar(String logo);
    public Botonfooter reemplazar(String anterior,Botonfooter nuevo);
    public String restaurar();
}
