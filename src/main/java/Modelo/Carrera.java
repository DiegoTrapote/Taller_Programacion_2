package Modelo;

public class Carrera {
    private String fechaRealizacion;
    private int numeroVueltas;
    private String horaRealizacion;
    private Pais pais;
    private Circuito circuito;
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    public Carrera() {
        this.fechaRealizacion = "";
        this.numeroVueltas = 0;
        this.horaRealizacion = "";
        this.pais = null;
        this.circuito = null;
        this.valor = 0;
    }

    public Carrera(String fechaRealizacion, int numeroVueltas, String horaRealizacion, Pais pais, Circuito circuito) {
        this.fechaRealizacion = fechaRealizacion;
        this.numeroVueltas = numeroVueltas;
        this.horaRealizacion = horaRealizacion;
        this.pais = pais;
        this.circuito = circuito;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }

    public String getHoraRealizacion() {
        return horaRealizacion;
    }

    public void setHoraRealizacion(String horaRealizacion) {
        this.horaRealizacion = horaRealizacion;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    @Override
    public String toString() {
        return "Carrera{" + "fechaRealizacion=" + fechaRealizacion + ", numeroVueltas=" + numeroVueltas + ", horaRealizacion=" + horaRealizacion + ", pais=" + pais + ", circuito=" + circuito + '}';
    }
}
