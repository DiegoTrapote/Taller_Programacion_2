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

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public Escuderia(String nombre) {
        this.nombre = nombre;
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
        // Asumo que tienes getNombre()
        return getNombre(); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Escuderia that = (Escuderia) obj;
        
        // Compara por nombre O por valor (lo que sea tu ID único)
        // Usaré 'valor' si lo tienes, es más seguro que el nombre.
        // (Asumo que tienes un getValor())
        return getValor() == that.getValor();
    }

    @Override
    public int hashCode() {
        // Usa el mismo campo que usaste en equals()
        return java.util.Objects.hash(getValor());
    }
    
    // ... (el resto de tu clase) ...
}


