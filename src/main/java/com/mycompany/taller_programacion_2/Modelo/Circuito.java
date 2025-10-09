
package com.mycompany.taller_programacion_2.Modelo;

public class Circuito {
    private String nombre;
    private int longitud;

    public Circuito(String nombre, int longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
    }

    public Circuito() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Circuito{" + "nombre=" + nombre + ", longitud=" + longitud + '}';
    }
    
}
