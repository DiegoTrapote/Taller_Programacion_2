package Modelo;

import java.util.ArrayList;
import java.util.List;

public class AutoPiloto {
    private String fechaAsignacion;
    private List<Auto> listaAutos;
    private Piloto piloto;
    private Carrera carrera;
    private static int id = 0;
    public AutoPiloto() {
        this.fechaAsignacion = "";
        this.listaAutos = new ArrayList<>();
        this.piloto = null;
        this.piloto = null;
        id++;
    }

    public AutoPiloto(String fechaAsignacion, List<Auto> listaAutos, Piloto piloto, Carrera carrera) {
        this.fechaAsignacion = fechaAsignacion;
        this.listaAutos = listaAutos;
        this.piloto = piloto;
        this.carrera = carrera;
    }

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public List<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(List<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setListaPilotos(Piloto piloto) {
        this.piloto = piloto;
    }

    public Carrera getListaCarreras() {
        return carrera;
    }

    public void setListaCarreras(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "AutoPiloto{" + "fechaAsignacion=" + fechaAsignacion + ", listaAutos=" + listaAutos + ", Piloto=" + piloto + ", Carrera=" + carrera + '}';
    }
    public int getID(){
        return id;
    }
}
