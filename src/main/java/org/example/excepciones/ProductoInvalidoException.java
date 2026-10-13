//expeciones personalizadas
package org.example.excepciones;

public class ProductoInvalidoException extends RuntimeException {
    public ProductoInvalidoException(String message) {
        super(message);
    }
}