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
    private static int id = 0;
    public Piloto() {
        super();
        this.numeroCompetencia = 0;
        this.victorias = 0;
        this.polePosition = 0;
        this.vueltasRapidas = 0;
        this.podios = 0;
        this.listaPilotoEscuderia = new ArrayList<>();
        this.listaAutoPilotos = new ArrayList<>();
        id++;
    }
    public Piloto(String dni, String nombre, String apellido, Pais pais, int numCompetencia) {
        
        // 1. Llama al constructor de la clase padre (Persona)
        // (Asegúrate que tu clase Persona tenga este constructor)
        super(dni, nombre, apellido, pais); 
        
        // 2. Establece los campos propios de Piloto
        this.numeroCompetencia = numCompetencia;
        
        // 3. INICIALIZA EL RESTO de campos a valores por defecto
        // Esto es VITAL para evitar futuros NullPointerExceptions
        this.victorias = 0;
        this.polePosition = 0;
        this.vueltasRapidas = 0;
        this.podios = 0;
        
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
    public int getID(){
        return id;
    }
}
