/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.ExpLaboral;
import java.util.List;
public interface IExpLaboralService {
      public ExpLaboral crear(ExpLaboral expLaboral);
    public List<ExpLaboral> verTodos();
    public String eliminar(long id);
    public ExpLaboral buscar(long id);
    public ExpLaboral editar(long id,ExpLaboral expLaboral);
}
