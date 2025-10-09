
package com.mycompany.taller_programacion_2.Modelo;


public class Escuderia {
    private String nombre;

    public Escuderia(String nombre) {
        this.nombre = nombre;
    }

    public Escuderia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Escuderia{" + "nombre=" + nombre + '}';
    }
    
}
