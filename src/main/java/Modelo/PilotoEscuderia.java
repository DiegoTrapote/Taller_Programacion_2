
package Modelo;




public class PilotoEscuderia {
    private String desdeFecha;
    private String hastaFecha;
    private Escuderia escuderia;
    private Piloto piloto;
    
    public PilotoEscuderia() {
        this.desdeFecha = "";
        this.hastaFecha = "";
        this.escuderia = null;
        this.piloto = null;
    }

    public PilotoEscuderia(String desdeFecha, String hastaFecha, Escuderia escuderia, Piloto piloto) {
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
        this.escuderia = escuderia;
        this.piloto = piloto;
    }

    public String getDesdeFecha() {
        return desdeFecha;
    }

    public void setDesdeFecha(String desdeFecha) {
        this.desdeFecha = desdeFecha;
    }

    public String getHastaFecha() {
        return hastaFecha;
    }

    public void setHastaFecha(String hastaFecha) {
        this.hastaFecha = hastaFecha;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "PilotoEscuderia{" + "desdeFecha=" + desdeFecha + ", hastaFecha=" + hastaFecha + ", Escuderia=" + escuderia + ", Piloto=" + piloto + '}';
    }

}
