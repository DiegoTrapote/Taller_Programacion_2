package com.mycompany.taller_programacion_2.Modelo;

public class Carrera {
    private String fechaRealizacion;
    private int numeroVueltas;
    private String horaRealizacion;

    public Carrera() {
    }

    public Carrera(String fechaRealizacion, int numeroVueltas, String horaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
        this.numeroVueltas = numeroVueltas;
        this.horaRealizacion = horaRealizacion;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }

    public String getHoraRealizacion() {
        return horaRealizacion;
    }

    public void setHoraRealizacion(String horaRealizacion) {
        this.horaRealizacion = horaRealizacion;
    }

    @Override
    public String toString() {
        return "Carrera{" + "fechaRealizacion=" + fechaRealizacion + ", numeroVueltas=" + numeroVueltas + ", horaRealizacion=" + horaRealizacion + '}';
    }
    
    
}
