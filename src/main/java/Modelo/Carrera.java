package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de entidad (Modelo) que representa una Carrera de Fórmula 1.
 * <p>
 * Almacena información clave como la fecha, hora, número de vueltas,
 * el {@link Pais} y {@link Circuito} donde se realiza, y su ID único ('valor').
 * También contiene una lista de {@link AutoPiloto}, que representa a todos
 * los participantes (y sus resultados) en esta carrera.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Carrera {

    private String fechaRealizacion;
    private int numeroVueltas;
    private String horaRealizacion;
    private Pais pais;
    private Circuito circuito;
    private List<AutoPiloto> autoPiloto;
    private int valor;
    

    /**
     * Establece el identificador numérico único (ID) de la carrera.
     * @param valor el nuevo valor (ID).
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el identificador numérico único (ID) de la carrera.
     * @return el valor (ID) de la carrera.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Constructor por defecto.
     * Inicializa una carrera con valor 0 y una lista de participantes
     * (AutoPiloto) vacía.
     */
    public Carrera() {
        this.valor = 0;
        this.autoPiloto = new ArrayList<>();
    }

    /**
     * Constructor parcial que inicializa los atributos principales de la
     * carrera.
     * (Nota: El 'valor' (ID) y la lista de AutoPiloto deben asignarse por
     * separado).
     *
     * @param fechaRealizacion La fecha en formato "yyyyMMdd".
     * @param numeroVueltas El número total de vueltas.
     * @param horaRealizacion La hora en formato "HH:mm".
     * @param pais El objeto {@link Pais} donde se corre.
     * @param circuito El objeto {@link Circuito} donde se corre.
     */
    public Carrera(String fechaRealizacion, int numeroVueltas, String horaRealizacion, Pais pais, Circuito circuito) {
        this.fechaRealizacion = fechaRealizacion;
        this.numeroVueltas = numeroVueltas;
        this.horaRealizacion = horaRealizacion;
        this.pais = pais;
        this.circuito = circuito;
    }

    /**
     * Obtiene la lista de inscripciones (participantes y resultados) de esta
     * carrera.
     * @return una lista de {@link AutoPiloto}.
     */
    public List<AutoPiloto> getAutoPiloto() {
        return autoPiloto;
    }

    /**
     * Establece la lista de inscripciones (participantes y resultados) de esta
     * carrera.
     * @param autoPiloto la nueva lista de {@link AutoPiloto}.
     */
    public void setAutoPiloto(List<AutoPiloto> autoPiloto) {
        this.autoPiloto = autoPiloto;
    }

    /**
     * Obtiene la fecha de realización en formato String "yyyyMMdd".
     * @return la fecha de la carrera.
     */
    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    /**
     * Establece la fecha de realización en formato String "yyyyMMdd".
     * @param fechaRealizacion la nueva fecha.
     */
    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    /**
     * Obtiene el número de vueltas de la carrera.
     * @return el número de vueltas.
     */
    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    /**
     * Establece el número de vueltas de la carrera.
     * @param numeroVueltas el nuevo número de vueltas.
     */
    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }

    /**
     * Obtiene la hora de realización en formato String "HH:mm".
     * @return la hora de la carrera.
     */
    public String getHoraRealizacion() {
        return horaRealizacion;
    }

    /**
     * Establece la hora de realización en formato String "HH:mm".
     * @param horaRealizacion la nueva hora.
     */
    public void setHoraRealizacion(String horaRealizacion) {
        this.horaRealizacion = horaRealizacion;
    }

    /**
     * Obtiene el país donde se realiza la carrera.
     * @return el objeto {@link Pais} asociado.
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Establece el país donde se realiza la carrera.
     * @param pais el nuevo {@link Pais}.
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Obtiene el circuito donde se realiza la carrera.
     * @return el objeto {@link Circuito} asociado.
     */
    public Circuito getCircuito() {
        return circuito;
    }

    /**
     * Establece el circuito donde se realiza la carrera.
     * @param circuito el nuevo {@link Circuito}.
     */
    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    /**
     * Sobrescribe el método equals para definir la igualdad entre dos objetos
     * Carrera.
     * <p>
     * Dos carreras se consideran iguales si su 'valor' (ID) es idéntico.
     * Esto es crucial para el funcionamiento de ComboBoxes y búsquedas
     * en Listas (como List.contains() o .equals()).
     *
     * @param obj El objeto a comparar.
     * @return {@code true} si las carreras tienen el mismo 'valor',
     * {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Carrera that = (Carrera) obj;

        return this.getValor() == that.getValor();
    }

    /**
     * Sobrescribe el método hashCode para que sea consistente con
     * {@link #equals(Object)}.
     * <p>
     * El hashCode se genera basándose únicamente en el 'valor' (ID) de la
     * carrera.
     *
     * @return El código hash del objeto.
     */
    @Override
    public int hashCode() {
        return java.util.Objects.hash(getValor());
    }

    /**
     * Sobrescribe el método toString para definir la representación en String
     * del objeto.
     * <p>
     * Se utiliza para mostrar la carrera en componentes de la GUI como
     * JComboBoxes y JTables.
     *
     * @return El nombre del circuito y la fecha (ej: "Circuito de Monza
     * (20241020)").
     */
    @Override
    public String toString() {
        if (getCircuito() != null) {
            return getCircuito().getNombre() + " (" + getFechaRealizacion() + ")";
        }
        return "Carrera sin datos";
    }
}
