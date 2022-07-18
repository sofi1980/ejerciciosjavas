/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.Repository.IProductoService;
import com.example.demo.model.Productomodelo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author user
 */
@RestController
public class Productos {
    
    @Autowired
    IProductoService iProductoService;
    
@GetMapping("/")
    public List<Productomodelo> hello(){
        List<Productomodelo> producto =  iProductoService.getTodos();
        producto.get(0).getCantidad();
        return producto;
    }
    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "ejecutando");
        return "message";
    }
}
