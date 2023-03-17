/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.repository;

import com.portfolio.backend.model.Conocimiento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ConocimientoRepository extends JpaRepository<Conocimiento, Long>  {
    @Query(value = "select * from conocimiento c where c.categoria_categoria=:category", nativeQuery=true)
    List<Conocimiento> getConocimientoListByCategory(String category);
    
    @Query(value = "SELECT categoria_categoria FROM conocimiento c GROUP BY c.categoria_categoria", nativeQuery=true)
    List<String> getCategoryList();
    
    Long deleteByCategoria_id(long id);
}
