package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Piloto extends Persona{
    private int numeroCompetencia;
    private int victorias;
    private int polePosition;
    private int vueltasRapidas;
    private int podios;
    private List<PilotoEscuderia> listaPilotoEscuderia;
    private List<AutoPiloto> listaAutoPilotos;
    private int puntos;
    
    
    public Piloto() {
        super();
          
    }
    
    public Piloto(int numeroCompetencia, int victorias, int polePosition, int vueltasRapidas, int podios, List<PilotoEscuderia> listaPilotoEscuderia, List<AutoPiloto> listaAutoPilotos, String dni, String nombre, String apellido, Pais pais) {
        super(dni, nombre, apellido, pais);
        this.numeroCompetencia = numeroCompetencia;
        this.victorias = victorias;
        this.polePosition = polePosition;
        this.vueltasRapidas = vueltasRapidas;
        this.podios = podios;
        this.listaPilotoEscuderia = listaPilotoEscuderia;
        this.listaAutoPilotos = listaAutoPilotos;
        
    }
    public void sumarPuntos(int cantidad) { this.puntos += cantidad; }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    
    public int getNumeroCompetencia() {
        return numeroCompetencia;
    }

    public void setNumeroCompetencia(int numeroCompetencia) {
        this.numeroCompetencia = numeroCompetencia;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getPolePosition() {
        return polePosition;
    }

    public void setPolePosition(int polePosition) {
        this.polePosition = polePosition;
    }

    public int getVueltasRapidas() {
        return vueltasRapidas;
    }

    public void setVueltasRapidas(int vueltasRapidas) {
        this.vueltasRapidas = vueltasRapidas;
    }

    public int getPodios() {
        return podios;
    }

    public void setPodios(int podios) {
        this.podios = podios;
    }

    public List<PilotoEscuderia> getListaPilotoEscuderia() {
        return listaPilotoEscuderia;
    }

    public void setListaPilotoEscuderia(List<PilotoEscuderia> listaPilotoEscuderia) {
        this.listaPilotoEscuderia = listaPilotoEscuderia;
    }

    public List<AutoPiloto> getListaAutoPilotos() {
        return listaAutoPilotos;
    }

    public void setListaAutoPilotos(List<AutoPiloto> listaAutoPilotos) {
        this.listaAutoPilotos = listaAutoPilotos;
    }
    @Override
public boolean equals(Object obj) {
    // 1. Comprueba si es el mismo objeto en memoria
    if (this == obj) {
        return true;
    }
    // 2. Comprueba si el otro objeto es nulo o de una clase diferente
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    // 3. Convierte el objeto y compara por el DNI
    final Piloto other = (Piloto) obj;
    
    // (Asumiendo que tu atributo DNI se llama 'dni' y tienes un getDni())
    return java.util.Objects.equals(this.getDni(), other.getDni());
}

// También es buena práctica agregar hashCode() cuando sobrescribes equals()
@Override
public int hashCode() {
    // (Asumiendo que tu atributo DNI se llama 'dni' y tienes un getDni())
    return java.util.Objects.hash(getDni());
}
    @Override
    
    public String toString() {
        return getNombre()+" "+ getApellido();
    }
    
}
