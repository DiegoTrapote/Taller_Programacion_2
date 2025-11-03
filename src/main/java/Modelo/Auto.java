package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Auto {
    private String modelo;
    private String motor;
    private Escuderia escuderia;
    private List<AutoPiloto> listaAutoPilotos;
    private int valor;
    public Auto() {
        this.modelo = "";
        this.motor = "";
        this.escuderia = null;
        this.listaAutoPilotos = new ArrayList<>();
        this.valor = 0;
        
    }
    
    public Auto(String modelo, String motor, Escuderia escuderia, List<AutoPiloto> listaAutoPilotos) {
        this.modelo = modelo;
        this.motor = motor;
        this.escuderia = escuderia;
        this.listaAutoPilotos = listaAutoPilotos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public List<AutoPiloto> getListaAutoPilotos() {
        return listaAutoPilotos;
    }

    public void setListaAutoPilotos(List<AutoPiloto> listaAutoPilotos) {
        this.listaAutoPilotos = listaAutoPilotos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + ", motor=" + motor + ", escuderia=" + escuderia + ", listaAutoPilotos=" + listaAutoPilotos + '}';
    }
}
