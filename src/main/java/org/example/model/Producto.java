package org.example.model;

import org.example.excepciones.ProductoInvalidoException;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;


    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public static Producto crearProducto(String nombre, double precio, int stock) {
        if (precio <= 0) {
            throw new ProductoInvalidoException("El precio debe ser mayor que cero");
        }
        if (stock < 0) {
            throw new ProductoInvalidoException("El stock no puede ser negativo");
        }
        return new Producto(nombre, precio, stock);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
}