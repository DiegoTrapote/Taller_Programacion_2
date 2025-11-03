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
    public String toString() {
        return "Piloto{" + "numeroCompetencia=" + numeroCompetencia + ", victorias=" + victorias + ", polePosition=" + polePosition + ", vueltasRapidas=" + vueltasRapidas + ", podios=" + podios + ", listaPilotoEscuderia=" + listaPilotoEscuderia + ", listaAutoPilotos=" + listaAutoPilotos + '}';
    }
    
}
