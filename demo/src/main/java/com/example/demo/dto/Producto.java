
package com.example.demo.dto;

public class Producto {
    private int id;
    private String nombre;
    private int cantidad;

    public int getId_product() {
        return id;
    }

    public void setId_product(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    private int valor;       
}
