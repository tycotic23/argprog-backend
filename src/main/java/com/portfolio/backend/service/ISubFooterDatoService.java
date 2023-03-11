/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.SubFooterDato;
import java.util.List;
public interface ISubFooterDatoService {
      public SubFooterDato crear(SubFooterDato subFooterDato);
    public List<SubFooterDato> verTodos();
    public String eliminar(long id);
    public SubFooterDato buscar(long id);
    public SubFooterDato editar(long id,SubFooterDato subFooterDato);
}
