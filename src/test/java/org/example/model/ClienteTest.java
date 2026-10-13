package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void crearClienteConDatosValidos_retornaClienteConValoresEsperados() {
        Cliente cliente = Cliente.crearCliente("Ana", "García", "12345678A");

        assertNotNull(cliente);
        assertEquals("Ana", cliente.getNombre());
        assertEquals("García", cliente.getApellido());
        assertEquals("12345678A", cliente.getDni());
    }

    @Test
    void crearClienteConNombreVacio_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Cliente.crearCliente("", "García", "12345678A"));
    }

    @Test
    void crearClienteConApellidoVacio_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Cliente.crearCliente("Ana", "", "12345678A"));
    }


    @Test
    void crearClienteConDniNulo_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Cliente.crearCliente("Ana", "García", null));
    }
}