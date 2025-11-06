package Modelo;

import java.util.ArrayList;
import java.util.List;

public class AutoPiloto {
    private String fechaAsignacion;
    private List<Auto> listaAutos;
    private List<Piloto> listaPilotos;
    private Carrera carrera;
    public AutoPiloto() {
        this.fechaAsignacion = "";
        this.listaAutos = new ArrayList<>();
        this.listaPilotos = new ArrayList<>();
        
    }

    public AutoPiloto(String fechaAsignacion, List<Auto> listaAutos, List<Piloto> listaPilotos, Carrera carrera) {
        this.fechaAsignacion = fechaAsignacion;
        this.listaAutos = listaAutos;
        this.listaPilotos = listaPilotos;
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

    public List<Piloto> getListaPilotos() {
        return listaPilotos;
    }

    public void setListaPilotos(List<Piloto> listaPilotos) {
        this.listaPilotos = listaPilotos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
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
}
