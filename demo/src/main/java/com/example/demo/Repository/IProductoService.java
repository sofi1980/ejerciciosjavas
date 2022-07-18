/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository;

import com.example.demo.model.Productomodelo;
import java.util.List;

/**
 *
 * @author user
 */
public interface IProductoService {
    
    List<Productomodelo> getTodos();

    Productomodelo getTodoById(Long id);

    Productomodelo insert(Productomodelo todo);

    void updateTodo(Long id, Productomodelo todo);

    void deleteTodo(Long todoId);
    
}
