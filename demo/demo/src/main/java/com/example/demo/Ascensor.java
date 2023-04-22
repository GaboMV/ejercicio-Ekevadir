package com.example.demo;

import java.util.ArrayList;
import java.util.Random;

public class Ascensor {
    private int pisoActual;
    private int pisoDestino;
    private boolean subiendo;
    private ArrayList<Integer> personasEnAscensor;


    public boolean isSubiendo() {
        return subiendo;
    }

    public void setSubiendo(boolean subiendo) {
        this.subiendo = subiendo;
    }

    public ArrayList<Integer> getPersonasEnAscensor() {
        return personasEnAscensor;
    }

    public void setPersonasEnAscensor(ArrayList<Integer> personasEnAscensor) {
        this.personasEnAscensor = personasEnAscensor;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    public Ascensor() {
        this.pisoActual = 1;
        this.pisoDestino = 1;
        this.subiendo = true;
        this.personasEnAscensor = new ArrayList<Integer>();
    }

    public void crearPersona() {
        Random rand = new Random();
        int pisoPersona = rand.nextInt(3) + 1;
        if (pisoPersona == pisoActual) {
            System.out.println("Persona creada en el mismo piso que el ascensor.");
            abrirPuerta();
        } else {
            System.out.println("Persona creada en el piso " + pisoPersona + ".");
            moverAscensor(pisoPersona);
        }
    }

    public void presionarBoton(int pisoDestino) {
        System.out.println("Persona presionó el botón del piso " + pisoDestino + ".");
        this.pisoDestino = pisoDestino;
        if (!personasEnAscensor.isEmpty()) {
            moverAscensor(pisoDestino);
        }
    }

    void moverAscensor(int pisoDestino) {
        if (pisoActual < pisoDestino) {
            subiendo = true;
            System.out.println("Ascensor subiendo...");
        } else {
            subiendo = false;
            System.out.println("Ascensor bajando...");
        }

        while (pisoActual != pisoDestino) {
            if (subiendo) {
                pisoActual++;
            } else {
                pisoActual--;
            }
            System.out.println("Ascensor en el piso " + pisoActual + ".");
            if (pisoActual == pisoDestino) {
                abrirPuerta();
            }
        }
    }

    void abrirPuerta() {
        System.out.println("Puerta del ascensor abierta.");
        if (personasEnAscensor.isEmpty()) {
            System.out.println("El ascensor está vacío.");
        } else {
            System.out.println("Personas en el ascensor: " + personasEnAscensor.toString());
        }
        if (pisoActual == pisoDestino) {
            System.out.println("Persona ha llegado a su destino.");
            personasEnAscensor.remove(Integer.valueOf(pisoActual));
            pisoDestino = 0;
            if (personasEnAscensor.isEmpty()) {
                System.out.println("El ascensor está vacío.");
            }
        }
    }

    public void subirPersonas(int... pisos) {
        for (int piso : pisos) {
            personasEnAscensor.add(piso);
        }
        System.out.println("Personas en el ascensor: " + personasEnAscensor.toString());
    }


}
