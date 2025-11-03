
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Pais {
   private int  idPais;
   private String descripcion;
   private List<Escuderia> listaEscuderias;
   private List<Circuito> listaCircuitos;
   private List<Carrera> listaCarreras;
   private List<Persona> listaPersonas;
   private int valor;
    public Pais() {
        this.idPais = 0;
        this.descripcion = "";
        this.listaEscuderias = new ArrayList<>();
        this.listaCircuitos = new ArrayList<>();
        this.listaCarreras = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.valor = 0;
    }
    public Pais(int idPais, String descripcion){
        this.idPais = idPais;
        this.descripcion = descripcion;
    }
    public Pais(int idPais, String descripcion, List<Escuderia> listaEscuderias, List<Circuito> listaCircuitos, List<Carrera> listaCarreras, List<Persona> listaPersonas) {
        this.idPais = idPais;
        this.descripcion = descripcion;
        this.listaEscuderias = listaEscuderias;
        this.listaCircuitos = listaCircuitos;
        this.listaCarreras = listaCarreras;
        this.listaPersonas = listaPersonas;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Escuderia> getListaEscuderias() {
        return listaEscuderias;
    }

    public void setListaEscuderias(List<Escuderia> listaEscuderias) {
        this.listaEscuderias = listaEscuderias;
    }

    public List<Circuito> getListaCircuitos() {
        return listaCircuitos;
    }

    public void setListaCircuitos(List<Circuito> listaCircuitos) {
        this.listaCircuitos = listaCircuitos;
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "Pais{" + "idPais=" + idPais + ", descripcion=" + descripcion + ", listaEscuderias=" + listaEscuderias + ", listaCircuitos=" + listaCircuitos + ", listaCarreras=" + listaCarreras + ", listaPersonas=" + listaPersonas + '}';
    }
  
   
}
