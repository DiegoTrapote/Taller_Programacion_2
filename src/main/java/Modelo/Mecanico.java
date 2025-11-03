package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Mecanico extends Persona{
    private int aniosExperiencia;
    private Especialidad especialidad;
    private List<Escuderia> listaEscuderia;
    public Mecanico() {
        super();
        this.aniosExperiencia = 0;
        this.especialidad = null;
        this.listaEscuderia = new ArrayList<>();
      
    }

    public Mecanico(int aniosExperiencia, Especialidad especialidad, List<Escuderia> listaEscuderia, String dni, String nombre, String apellido, Pais pais) {
        super(dni, nombre, apellido, pais);
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = especialidad;
        this.listaEscuderia = listaEscuderia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<Escuderia> getListaEscuderia() {
        return listaEscuderia;
    }

    public void setListaEscuderia(List<Escuderia> listaEscuderia) {
        this.listaEscuderia = listaEscuderia;
    }
    

    @Override
    public String toString() {
        return "Mecanico{" + "aniosExperiencia=" + aniosExperiencia + ", especialidad=" + especialidad + ", listaEscuderia=" + listaEscuderia + '}';
    }
}
