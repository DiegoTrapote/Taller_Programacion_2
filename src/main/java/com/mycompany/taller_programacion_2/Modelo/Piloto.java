package com.mycompany.taller_programacion_2.Modelo;

public class Piloto extends Persona{
    private int numeroCompetencia;
    private int victorias;
    private int polePosition;
    private int vueltasRapidas;
    private int podios;

    public Piloto() {
        super();
    }

    public Piloto(int numeroCompetencia, int victorias, int polePosition, int vueltasRapidas, int podios, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.numeroCompetencia = numeroCompetencia;
        this.victorias = victorias;
        this.polePosition = polePosition;
        this.vueltasRapidas = vueltasRapidas;
        this.podios = podios;
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

    @Override
    public String toString() {
        return "Piloto{" + "numeroCompetencia=" + numeroCompetencia + ", victorias=" + victorias + ", polePosition=" + polePosition + ", vueltasRapidas=" + vueltasRapidas + ", podios=" + podios + '}';
    }
    
    
    
}
