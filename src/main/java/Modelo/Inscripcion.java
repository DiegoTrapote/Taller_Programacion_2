
package Modelo;

public class Inscripcion {
    private Piloto piloto;
    private Auto auto;
    private String fecha;

    public Inscripcion(Piloto piloto, Auto auto, String fecha) {
        this.piloto = piloto;
        this.auto = auto;
        this.fecha = fecha;
    }
    public Inscripcion(){}

    public Piloto getPiloto() {
        return piloto;
    }

    public Auto getAuto() {
        return auto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "piloto=" + piloto + ", auto=" + auto + ", fecha=" + fecha + '}';
    }
    
    
}
