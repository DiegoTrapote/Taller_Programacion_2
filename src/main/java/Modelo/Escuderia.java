package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Escuderia {
    private String nombre;
    private List<Auto> listaAutos;
    private List<PilotoEscuderia> listaPilotoEscuderia;
    private Pais pais;
    private List<Mecanico> listaMecanicos;
    private int valor;

    
    public Escuderia() {
        this.nombre = "";
        this.listaAutos = new ArrayList<>();
        this.listaPilotoEscuderia = new ArrayList<>();
        this.pais = null;
        this.listaMecanicos = new ArrayList<>();
        this.valor = 0;
    }

    public Escuderia(String nombre, List<Auto> listaAutos, List<PilotoEscuderia> listaPilotoEscuderia, Pais pais, List<Mecanico> listaMecanicos) {
        this.nombre = nombre;
        this.listaAutos = listaAutos;
        this.listaPilotoEscuderia = listaPilotoEscuderia;
        this.pais = pais;
        this.listaMecanicos = listaMecanicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(List<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public List<PilotoEscuderia> getListaPilotoEscuderia() {
        return listaPilotoEscuderia;
    }

    public void setListaPilotoEscuderia(List<PilotoEscuderia> listaPilotoEscuderia) {
        this.listaPilotoEscuderia = listaPilotoEscuderia;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }

    public void setListaMecanicos(List<Mecanico> listaMecanicos) {
        this.listaMecanicos = listaMecanicos;
    }

    @Override
    public String toString() {
        return "Escuderia{" + "nombre=" + nombre + ", listaAutos=" + listaAutos + ", listaPilotoEscuderia=" + listaPilotoEscuderia + ", pais=" + pais + ", listaMecanicos=" + listaMecanicos + '}';
    }
  
    
}
