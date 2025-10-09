package com.mycompany.taller_programacion_2.Modelo;

public class Mecanico extends Persona{
    private int aniosExperiencia;

    public Mecanico() {
        super();
    }

    public Mecanico(int aniosExperiencia, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Mecanico{" + "aniosExperiencia=" + aniosExperiencia + '}';
    }
    
    
}
