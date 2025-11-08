package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String fechaRealizacion;
    private int numeroVueltas;
    private String horaRealizacion;
    private Pais pais;
    private Circuito circuito;
    private List<AutoPiloto> autoPiloto;
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    public Carrera() {
        this.valor = 0;
        this.autoPiloto = new ArrayList<>();
    }

    public Carrera(String fechaRealizacion, int numeroVueltas, String horaRealizacion, Pais pais, Circuito circuito) {
        this.fechaRealizacion = fechaRealizacion;
        this.numeroVueltas = numeroVueltas;
        this.horaRealizacion = horaRealizacion;
        this.pais = pais;
        this.circuito = circuito;
    }

    public List<AutoPiloto> getAutoPiloto() {
        return autoPiloto;
    }

    public void setAutoPiloto(List<AutoPiloto> autoPiloto) {
        this.autoPiloto = autoPiloto;
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    @Override
public String toString() {
    // Muestra el circuito y la fecha
    // Asumo que tienes getCircuito() y getFechaRealizacion()
    // y que Circuito tiene un getNombre()
    return getCircuito().getNombre() + " (" + getFechaRealizacion() + ")";
}
}
