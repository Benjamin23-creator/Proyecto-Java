//crearexepcion personalizada para cliente invalido
package org.example.excepciones;

public class ClienteInvalidoException extends IllegalArgumentException {
    public ClienteInvalidoException(String message) {
        super(message);
    }
}