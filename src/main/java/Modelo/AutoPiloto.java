package Modelo;

public class AutoPiloto {
    private String fechaAsignacion;
    private Auto auto;
    private Piloto piloto;
    private Carrera carrera;
    
    public AutoPiloto() {
        this.fechaAsignacion = "";
        
    }

    public AutoPiloto(String fechaAsignacion, Auto auto, Piloto piloto, Carrera carrera) {
        this.fechaAsignacion = fechaAsignacion;
        this.auto = auto;
        this.piloto = piloto;
        this.carrera = carrera;
    }

    

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
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
        return "AutoPiloto{" + "fechaAsignacion=" + fechaAsignacion + ", auto=" + auto + ", Piloto=" + piloto + ", Carrera=" + carrera + '}';
    }
}
