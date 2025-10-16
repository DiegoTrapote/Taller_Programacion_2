package Modelo;

import java.util.ArrayList;
import java.util.List;

public class AutoPiloto {
    private String fechaAsignacion;
    private List<Auto> listaAutos;
    private List<Piloto> listaPilotos;
    private List<Carrera> listaCarreras;
    public AutoPiloto() {
        this.fechaAsignacion = "";
        this.listaAutos = new ArrayList<>();
        this.listaPilotos = new ArrayList<>();
        this.listaCarreras = new ArrayList<>();
    }

    public AutoPiloto(String fechaAsignacion, List<Auto> listaAutos, List<Piloto> listaPilotos, List<Carrera> listaCarreras) {
        this.fechaAsignacion = fechaAsignacion;
        this.listaAutos = listaAutos;
        this.listaPilotos = listaPilotos;
        this.listaCarreras = listaCarreras;
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

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    @Override
    public String toString() {
        return "AutoPiloto{" + "fechaAsignacion=" + fechaAsignacion + ", listaAutos=" + listaAutos + ", listaPilotos=" + listaPilotos + ", listaCarreras=" + listaCarreras + '}';
    }
    
}
