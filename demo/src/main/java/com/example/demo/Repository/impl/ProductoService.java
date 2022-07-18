/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository.impl;

import com.example.demo.CrudRepository.ProductoRepository;
import com.example.demo.Repository.IProductoService;
import com.example.demo.model.Productomodelo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class ProductoService implements IProductoService{
    
    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Productomodelo> getTodos() {
         List<Productomodelo> todos = new ArrayList<>();
        productoRepository.findAll().forEach(todos::add);
        return todos;
    }

    @Override
    public Productomodelo getTodoById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Productomodelo insert(Productomodelo todo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTodo(Long id, Productomodelo todo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTodo(Long todoId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
