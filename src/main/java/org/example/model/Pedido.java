package org.example.model;

public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private int cantidad;

    private Pedido(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public static Pedido crearPedido(Cliente cliente, Producto producto, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }
        if (cantidad > producto.getStock()) {
            throw new IllegalArgumentException("La cantidad no puede ser mayor que el stock disponible");
        }
        return new Pedido(cliente, producto, cantidad);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}