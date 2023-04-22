package com.example.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;


public class AscensorTest {

    @Test
    public void testCrearPersona() {
        Ascensor ascensor = new Ascensor();
        ascensor.crearPersona();
        int pisoActual = ascensor.getPisoActual();
        int pisoDestino = ascensor.getPisoDestino();
        ArrayList<Integer> pisos = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertTrue(pisos.contains(pisoActual));

        assertNotEquals(pisoActual, pisoDestino);
    }

    @Test
    public void testPresionarBoton() {
        Ascensor ascensor = new Ascensor();
        ascensor.presionarBoton(2);
        assertEquals(2, ascensor.getPisoDestino());
        ascensor.presionarBoton(3);
        assertEquals(3, ascensor.getPisoDestino());
    }

    @Test
    public void testMoverAscensor() {
        Ascensor ascensor = new Ascensor();
        ascensor.presionarBoton(3);
        ascensor.moverAscensor(3);

        assertEquals(0, ascensor.getPisoDestino());
        ascensor.moverAscensor(3);
        assertEquals(3, ascensor.getPisoActual());
        assertEquals(0, ascensor.getPisoDestino());

    }

    @Test
    public void testAbrirPuerta() {
        Ascensor ascensor = new Ascensor();
        ascensor.presionarBoton(2);
        ascensor.subirPersonas(1);

        assertEquals(1, ascensor.getPersonasEnAscensor().size());

        ascensor.abrirPuerta();

        assertEquals(1, ascensor.getPersonasEnAscensor().size());
    }

    @Test
    public void testSubirPersonas() {
        Ascensor ascensor = new Ascensor();
        ascensor.presionarBoton(3);
        ascensor.subirPersonas(1);
        assertEquals(1, ascensor.getPersonasEnAscensor().size());

        ascensor.presionarBoton(1);
        ascensor.subirPersonas(2);
        assertEquals(2, ascensor.getPersonasEnAscensor().size());

    }
}
