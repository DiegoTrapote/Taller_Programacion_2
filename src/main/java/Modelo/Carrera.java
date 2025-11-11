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
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    
    // Convertimos el objeto para comparar
    Carrera that = (Carrera) obj;
    
    // Comparamos por 'valor' (el ID único de la carrera)
    // (Asumo que tienes un getValor() que devuelve un int)
    return this.getValor() == that.getValor(); 
}

@Override
public int hashCode() {
    // Usa el mismo campo (valor) que usaste en equals()
    return java.util.Objects.hash(getValor());
}

// (Y el toString() que usamos en otros informes, por si acaso)
@Override
public String toString() {
    // Asumo que tienes getCircuito() y getFechaRealizacion()
    // y que Circuito tiene un getNombre()
    if (getCircuito() != null) {
        return getCircuito().getNombre() + " (" + getFechaRealizacion() + ")";
    }
    return "Carrera sin datos";
}
}
