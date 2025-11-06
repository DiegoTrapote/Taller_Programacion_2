
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Circuito {
    private String nombre;
    private int longitud;
    private List<Carrera> listaCarreras;
    private Pais pais;
    private int valor;
    
    public Circuito() {
        this.nombre = "";
        this.longitud = 0;
        this.listaCarreras = new ArrayList<>();
        this.pais = null;
        this.valor = 0;
    }

    public Circuito(String nombre, int longitud, List<Carrera> listaCarreras, Pais pais) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.listaCarreras = listaCarreras;
        this.pais = pais;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
