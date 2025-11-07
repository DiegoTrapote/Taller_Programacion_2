package Modelo;

/**
 * Esta clase representa el RESULTADO de un Piloto en una Carrera,
 * usando un Auto específico.
 * Es la clase de asociación ("tabla intermedia") entre Piloto, Auto y Carrera.
 */
public class AutoPiloto {

    // Atributos de la Asignación
    private String fechaAsignacion; // Ej: "20241025" (El día que se asignó)
    private Auto auto;
    private Piloto piloto;
    private Carrera carrera;
    
    // Atributos del Resultado de la Carrera
    private int posicionFinal;      // Ej: 1, 2, 3... (0 si no terminó o no puntuó)
    private boolean hizoVueltaRapida; // true o false

    // --- Constructores ---

    /**
     * Constructor por defecto.
     * Inicializa valores predeterminados.
     */
    public AutoPiloto() {
        this.fechaAsignacion = "";
        this.auto = null;
        this.piloto = null;
        this.carrera = null;
        this.posicionFinal = 0;
        this.hizoVueltaRapida = false;
    }

    /**
     * Constructor completo con todos los datos.
     * Útil para crear un objeto de resultado de una vez.
     */
    public AutoPiloto(String fechaAsignacion, Auto auto, Piloto piloto, Carrera carrera, int posicionFinal, boolean hizoVueltaRapida) {
        this.fechaAsignacion = fechaAsignacion;
        this.auto = auto;
        this.piloto = piloto;
        this.carrera = carrera;
        this.posicionFinal = posicionFinal;
        this.hizoVueltaRapida = hizoVueltaRapida;
    }

    // --- Getters y Setters (Existentes) ---

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
    
    // --- Getters y Setters NUEVOS (para los resultados) ---

    public int getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(int posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    /**
     * Para getters de booleanos, por convención de Java se usa "is"
     * en lugar de "get".
     */
    public boolean isHizoVueltaRapida() {
        return hizoVueltaRapida;
    }

    public void setHizoVueltaRapida(boolean hizoVueltaRapida) {
        this.hizoVueltaRapida = hizoVueltaRapida;
    }

    // --- toString (Actualizado) ---

    /**
     * Método toString actualizado para incluir todos los campos,
     * útil para depurar (ver en consola).
     */
    @Override
    public String toString() {
        return "AutoPiloto{" +
                "fechaAsignacion='" + fechaAsignacion + '\'' +
                ", auto=" + auto +
                ", piloto=" + piloto +
                ", carrera=" + carrera +
                ", posicionFinal=" + posicionFinal +
                ", hizoVueltaRapida=" + hizoVueltaRapida +
                '}';
    }
    
}
