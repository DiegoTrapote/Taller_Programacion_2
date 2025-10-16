
package com.mycompany.taller_programacion_2.Modelo;

import java.util.ArrayList;
import java.util.List;

public class PilotoEscuderia {
    private String desdeFecha;
    private String hastaFecha;
    private List<Escuderia> listaEscuderia;
    private List<Piloto> listaPilotos;
    
    public PilotoEscuderia() {
        this.desdeFecha = "";
        this.hastaFecha = "";
        this.listaEscuderia = new ArrayList<>();
        this.listaPilotos = new ArrayList<>();
    }

    public PilotoEscuderia(String desdeFecha, String hastaFecha, List<Escuderia> listaEscuderia, List<Piloto> listaPilotos) {
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
        this.listaEscuderia = listaEscuderia;
        this.listaPilotos = listaPilotos;
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

    public List<Escuderia> getListaEscuderia() {
        return listaEscuderia;
    }

    public void setListaEscuderia(List<Escuderia> listaEscuderia) {
        this.listaEscuderia = listaEscuderia;
    }

    public List<Piloto> getListaPilotos() {
        return listaPilotos;
    }

    public void setListaPilotos(List<Piloto> listaPilotos) {
        this.listaPilotos = listaPilotos;
    }

    @Override
    public String toString() {
        return "PilotoEscuderia{" + "desdeFecha=" + desdeFecha + ", hastaFecha=" + hastaFecha + ", listaEscuderia=" + listaEscuderia + ", listaPilotos=" + listaPilotos + '}';
    }

}
