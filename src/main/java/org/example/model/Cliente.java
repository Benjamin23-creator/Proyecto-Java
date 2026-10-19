package org.example.model;

import org.example.excepciones.ClienteInvalidoException;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    private Cliente(String nombre, String apellido, String dni) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new ClienteInvalidoException("El nombre no puede estar vacío");
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new ClienteInvalidoException("El apellido no puede estar vacío");
        }
        if (dni == null || dni.trim().isEmpty()) {
            throw new ClienteInvalidoException("El DNI no puede estar vacío");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public static Cliente crearCliente(String nombre, String apellido, String dni) {
        return new Cliente(nombre, apellido, dni);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
}