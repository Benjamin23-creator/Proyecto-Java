package org.example.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PedidoTest {
    @Test
    void crearPedidoConDatosValidos_retornaPedidoConValoresEsperados() {

        Cliente cliente = Cliente.crearCliente("Ana", "García", "12345678A");
        Producto producto = Producto.crearProducto("Camiseta", 19.99, 10);
        Pedido pedido = Pedido.crearPedido(cliente, producto, 2);

        assertNotNull(pedido);
        assertEquals(cliente, pedido.getCliente());
        assertEquals(producto, pedido.getProducto());
        assertEquals(2, pedido.getCantidad());
    }

    @Test
    void crearPedidoConCantidadNegativa_lanzaExcepcion() {
        Cliente cliente = Cliente.crearCliente("Ana", "García", "12345678A");
        Producto producto = Producto.crearProducto("Camiseta", 19.99, 10);

        try {
            Pedido.crearPedido(cliente, producto, -1);
        } catch (IllegalArgumentException e) {
            assertEquals("La cantidad debe ser mayor que cero", e.getMessage());
        }
    }
    @Test
    void crearPedidoConCantidadMayorAlStock_lanzaExcepcion() {
        Cliente cliente = Cliente.crearCliente("Ana", "García", "12345678A");
        Producto producto = Producto.crearProducto("Camiseta", 19.99, 10);

        try {
            Pedido.crearPedido(cliente, producto, 11);
        } catch (IllegalArgumentException e) {
            assertEquals("La cantidad no puede ser mayor que el stock disponible", e.getMessage());
        }
    }
}