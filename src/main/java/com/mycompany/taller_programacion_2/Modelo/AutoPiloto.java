package com.mycompany.taller_programacion_2.Modelo;

public class AutoPiloto {
    private String fechaAsignacion;

    public AutoPiloto() {
    }

    public AutoPiloto(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Override
    public String toString() {
        return "AutoPiloto{" + "fechaAsignacion=" + fechaAsignacion + '}';
    }
    
    
}
