package org.example.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductoTest {

    @Test
    void crearProductoConDatosValidos_retornaProductoConValoresEsperados() {
        Producto producto = Producto.crearProducto("Camiseta", 19.99, 10);

        assertNotNull(producto);
        assertEquals("Camiseta", producto.getNombre());
        assertEquals(19.99, producto.getPrecio());
        assertEquals(10, producto.getStock());
    }

    @Test
    void crearProductoConPrecioNegativo_lanzaExcepcion() {
        try {
            Producto.crearProducto("Camiseta", -10.0, 10);
        } catch (IllegalArgumentException e) {
            assertEquals("El precio debe ser mayor que cero", e.getMessage());
        }
    }

    @Test
    void crearProductoConStockNegativo_lanzaExcepcion() {
        try {
            Producto.crearProducto("Camiseta", 19.99, -5);
        } catch (IllegalArgumentException e) {
            assertEquals("El stock no puede ser negativo", e.getMessage());
        }
    }
}