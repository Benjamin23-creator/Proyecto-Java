package org.example.excepciones;

public class PedidoInvalidoException extends RuntimeException {
    public PedidoInvalidoException(String message) {
        super(message);
    }
}