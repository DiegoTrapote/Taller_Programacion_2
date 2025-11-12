package Modelo;

/**
 * Clase de entidad (Modelo) que representa la relación (contrato) entre un
 * Piloto y una Escudería.
 * <p>
 * Esta es una clase de asociación que gestiona la relación "muchos a muchos"
 * entre {@link Piloto} y {@link Escuderia}. Almacena el historial de cuándo un
 * piloto se unió a una escudería ({@code desdeFecha}) y cuándo la dejó
 * ({@code hastaFecha}).
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class PilotoEscuderia {

    private String desdeFecha;
    private String hastaFecha;
    private Escuderia escuderia;
    private Piloto piloto;

    /**
     * Constructor por defecto. Inicializa una relación vacía con fechas en
     * blanco y objetos nulos.
     */
    public PilotoEscuderia() {
        this.desdeFecha = "";
        this.hastaFecha = "";
        this.escuderia = null;
        this.piloto = null;

    }

    /**
     * Constructor parametrizado. Crea una nueva relación histórica entre un
     * piloto y una escudería.
     *
     * @param desdeFecha La fecha (String) en que comenzó la relación.
     * @param hastaFecha La fecha (String) en que terminó la relación (vacío si
     * está activa).
     * @param escuderia La {@link Escuderia} involucrada.
     * @param piloto El {@link Piloto} involucrado.
     */
    public PilotoEscuderia(String desdeFecha, String hastaFecha, Escuderia escuderia, Piloto piloto) {
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
        this.escuderia = escuderia;
        this.piloto = piloto;
    }

    /**
     * Obtiene la fecha de inicio de la relación.
     *
     * @return la fecha "desde".
     */
    public String getDesdeFecha() {
        return desdeFecha;
    }

    /**
     * Establece la fecha de inicio de la relación.
     *
     * @param desdeFecha la nueva fecha "desde".
     */
    public void setDesdeFecha(String desdeFecha) {
        this.desdeFecha = desdeFecha;
    }

    /**
     * Obtiene la fecha de fin de la relación.
     *
     * @return la fecha "hasta" (puede ser vacía si la relación está activa).
     */
    public String getHastaFecha() {
        return hastaFecha;
    }

    /**
     * Establece la fecha de fin de la relación.
     *
     * @param hastaFecha la nueva fecha "hasta".
     */
    public void setHastaFecha(String hastaFecha) {
        this.hastaFecha = hastaFecha;
    }

    /**
     * Obtiene la escudería asociada a esta relación.
     *
     * @return el objeto {@link Escuderia}.
     */
    public Escuderia getEscuderia() {
        return escuderia;
    }

    /**
     * Establece la escudería asociada a esta relación.
     *
     * @param escuderia la nueva {@link Escuderia}.
     */
    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    /**
     * Obtiene el piloto asociado a esta relación.
     *
     * @return el objeto {@link Piloto}.
     */
    public Piloto getPiloto() {
        return piloto;
    }

    /**
     * Establece el piloto asociado a esta relación.
     *
     * @param piloto el nuevo {@link Piloto}.
     */
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    /**
     * Sobrescribe el método toString para definir la representación en String
     * del objeto.
     * <p>
     * Se utiliza principalmente para depuración.
     *
     * @return Una representación en String de los atributos de la relación.
     */
    @Override
    public String toString() {
        return "PilotoEscuderia{" + "desdeFecha=" + desdeFecha + ", hastaFecha=" + hastaFecha + ", Escuderia=" + escuderia + ", Piloto=" + piloto + '}';
    }
}
