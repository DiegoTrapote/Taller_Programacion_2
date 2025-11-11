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

    public Auto(String modelo, String motor) {
        this.modelo = modelo;
        this.motor = motor;

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
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    
    // Convertimos el objeto para comparar
    Auto that = (Auto) obj;
    
    // Comparamos por 'valor' (el ID único del auto)
    // (Asumo que tienes un getValor() que devuelve un int)
    return this.getValor() == that.getValor(); 
}

@Override
public int hashCode() {
    // Usa el mismo campo (valor) que usaste en equals()
    return java.util.Objects.hash(getValor());
}

// (Ya tienes el toString(), pero asegúrate de que esté)
@Override
public String toString() {
    return getModelo(); 
}
}
