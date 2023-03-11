/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.BotonFooter;
import java.util.List;
public interface IBotonFooterService {
      public BotonFooter crear(BotonFooter botonFooter);
    public List<BotonFooter> verTodos();
    public String eliminar(String logo);
    public BotonFooter buscar(String logo);
    public BotonFooter editar(String logo,BotonFooter botonFooter);
}
