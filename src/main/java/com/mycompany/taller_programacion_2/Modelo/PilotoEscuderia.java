
package com.mycompany.taller_programacion_2.Modelo;

public class PilotoEscuderia {
    private String desdeFecha;
    private String hastaFecha;

    public PilotoEscuderia(String desdeFecha, String hastaFecha) {
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
    }

    public String getDesdeFecha() {
        return desdeFecha;
    }

    public void setDesdeFecha(String desdeFecha) {
        this.desdeFecha = desdeFecha;
    }

    public String getHastaFecha() {
        return hastaFecha;
    }

    public void setHastaFecha(String hastaFecha) {
        this.hastaFecha = hastaFecha;
    }

    public PilotoEscuderia() {
    }

    @Override
    public String toString() {
        return "PilotoEscuderia{" + "desdeFecha=" + desdeFecha + ", hastaFecha=" + hastaFecha + '}';
    }
    
}
