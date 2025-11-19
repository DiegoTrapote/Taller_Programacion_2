package Modelo;

import java.util.List;

/**
 * Clase de entidad (Modelo) que representa a un Piloto de carreras.
 * <p>
 * Esta clase hereda de {@link Persona} y añade atributos específicos de
 * competición (número, victorias, poles, podios, puntos, etc.). Mantiene listas
 * que representan su historial:
 * <ul>
 * <li>{@code listaPilotoEscuderia}: Su historial de "contratos" o pertenencia a
 * escuderías.</li>
 * <li>{@code listaAutoPilotos}: Su historial de participaciones y resultados en
 * carreras.</li>
 * </ul>
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Piloto extends Persona implements Comparable<Piloto>{

    private int numeroCompetencia;
    private int victorias;
    private int polePosition;
    private int vueltasRapidas;
    private int podios;
    private List<PilotoEscuderia> listaPilotoEscuderia;
    private List<AutoPiloto> listaAutoPilotos;
    private int puntos; // Puntos acumulados en el campeonato

    /**
     * Constructor por defecto. Llama al constructor de la superclase
     * {@link Persona}. (Los atributos de Piloto se inicializan a sus valores
     * por defecto, ej: 0, null).
     */
    public Piloto() {
        super();

    }

    /**
     * Constructor parametrizado completo. Inicializa un Piloto con todos sus
     * atributos, incluyendo los de la superclase {@link Persona}.
     *
     * @param numeroCompetencia El número de dorsal fijo del piloto.
     * @param victorias Contador de victorias (dato histórico).
     * @param polePosition Contador de pole positions (dato histórico).
     * @param vueltasRapidas Contador de vueltas rápidas (dato histórico).
     * @param podios Contador de podios (dato histórico).
     * @param listaPilotoEscuderia La lista de relaciones con escuderías.
     * @param listaAutoPilotos La lista de resultados en carreras.
     * @param dni El DNI del piloto (de Persona).
     * @param nombre El nombre del piloto (de Persona).
     * @param apellido El apellido del piloto (de Persona).
     * @param pais El {@link Pais} de origen del piloto (de Persona).
     */
    public Piloto(int numeroCompetencia, int victorias, int polePosition, int vueltasRapidas, int podios, List<PilotoEscuderia> listaPilotoEscuderia, List<AutoPiloto> listaAutoPilotos, String dni, String nombre, String apellido, Pais pais) {
        super(dni, nombre, apellido, pais);
        this.numeroCompetencia = numeroCompetencia;
        this.victorias = victorias;
        this.polePosition = polePosition;
        this.vueltasRapidas = vueltasRapidas;
        this.podios = podios;
        this.listaPilotoEscuderia = listaPilotoEscuderia;
        this.listaAutoPilotos = listaAutoPilotos;

    }

    /**
     * Añade una cantidad de puntos al total actual del piloto. Utilizado por el
     * servicio de Ranking.
     *
     * @param cantidad Los puntos a sumar (ej: 25 por una victoria).
     */
    public void sumarPuntos(int cantidad) {
        this.puntos += cantidad;
    }

    /**
     * Establece el total de puntos del piloto. (Usado para reiniciar a 0 antes
     * de un recálculo de ranking).
     *
     * @param puntos El nuevo total de puntos.
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * Obtiene el total de puntos acumulados por el piloto.
     *
     * @return el total de puntos.
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * Obtiene el número de competencia (dorsal) del piloto.
     *
     * @return el número de competencia.
     */
    public int getNumeroCompetencia() {
        return numeroCompetencia;
    }

    /**
     * Establece el número de competencia (dorsal) del piloto.
     *
     * @param numeroCompetencia el nuevo número.
     */
    public void setNumeroCompetencia(int numeroCompetencia) {
        this.numeroCompetencia = numeroCompetencia;
    }

    /**
     * Obtiene el contador de victorias (dato histórico).
     *
     * @return el total de victorias.
     */
    public int getVictorias() {
        return victorias;
    }

    /**
     * Establece el contador de victorias (dato histórico).
     *
     * @param victorias el nuevo total.
     */
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    /**
     * Obtiene el contador de pole positions (dato histórico).
     *
     * @return el total de pole positions.
     */
    public int getPolePosition() {
        return polePosition;
    }

    /**
     * Establece el contador de pole positions (dato histórico).
     *
     * @param polePosition el nuevo total.
     */
    public void setPolePosition(int polePosition) {
        this.polePosition = polePosition;
    }

    /**
     * Obtiene el contador de vueltas rápidas (dato histórico).
     *
     * @return el total de vueltas rápidas.
     */
    public int getVueltasRapidas() {
        return vueltasRapidas;
    }

    /**
     * Establece el contador de vueltas rápidas (dato histórico).
     *
     * @param vueltasRapidas el nuevo total.
     */
    public void setVueltasRapidas(int vueltasRapidas) {
        this.vueltasRapidas = vueltasRapidas;
    }

    /**
     * Obtiene el contador de podios (dato histórico).
     *
     * @return el total de podios.
     */
    public int getPodios() {
        return podios;
    }

    /**
     * Establece el contador de podios (dato histórico).
     *
     * @param podios el nuevo total.
     */
    public void setPodios(int podios) {
        this.podios = podios;
    }

    /**
     * Obtiene el historial de relaciones piloto-escudería (contratos).
     *
     * @return una lista de {@link PilotoEscuderia}.
     */
    public List<PilotoEscuderia> getListaPilotoEscuderia() {
        return listaPilotoEscuderia;
    }

    /**
     * Establece el historial de relaciones piloto-escudería.
     *
     * @param listaPilotoEscuderia la nueva lista de {@link PilotoEscuderia}.
     */
    public void setListaPilotoEscuderia(List<PilotoEscuderia> listaPilotoEscuderia) {
        this.listaPilotoEscuderia = listaPilotoEscuderia;
    }

    /**
     * Obtiene el historial de participaciones y resultados en carreras.
     *
     * @return una lista de {@link AutoPiloto}.
     */
    public List<AutoPiloto> getListaAutoPilotos() {
        return listaAutoPilotos;
    }

    /**
     * Establece el historial de participaciones y resultados en carreras.
     *
     * @param listaAutoPilotos la nueva lista de {@link AutoPiloto}.
     */
    public void setListaAutoPilotos(List<AutoPiloto> listaAutoPilotos) {
        this.listaAutoPilotos = listaAutoPilotos;
    }

    /**
     * Sobrescribe el método equals para definir la igualdad entre dos objetos
     * Piloto.
     * <p>
     * Dos pilotos se consideran iguales si su DNI es idéntico. Es crucial para
     * búsquedas en Listas (como List.contains()) y para el funcionamiento de
     * ComboBoxes.
     *
     * @param obj El objeto a comparar.
     * @return {@code true} si los pilotos tienen el mismo DNI, {@code false} en
     * caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final Piloto other = (Piloto) obj;

        return java.util.Objects.equals(this.getDni(), other.getDni());
    }

    /**
     * Sobrescribe el método hashCode para que sea consistente con
     * {@link #equals(Object)}.
     * <p>
     * El hashCode se genera basándose únicamente en el DNI del piloto.
     *
     * @return El código hash del objeto.
     */
    @Override
    public int hashCode() {
        return java.util.Objects.hash(getDni());
    }

    /**
     * Sobrescribe el método toString para definir la representación en String
     * del objeto.
     * <p>
     * Se utiliza para mostrar el piloto en componentes de la GUI (ComboBoxes,
     * JTables).
     *
     * @return El nombre completo del piloto (ej: "Max Verstappen").
     */
    @Override
    public String toString() {
        return getNombre() + " " + getApellido();
    }
    /**
     * Define el orden natural de los objetos {@code Piloto} para fines de
     * clasificación (ranking).
     * <p>
     * Compara este piloto con otro basándose en la cantidad de puntos
     * acumulados. El orden establecido es <b>descendente</b> (de mayor a
     * menor puntaje), lo cual es ideal para generar tablas de posiciones.
     *
     * @param o El otro piloto con el que se va a comparar.
     * @return Un valor negativo si el otro piloto tiene menos puntos que este,
     * cero si tienen los mismos puntos, o un valor positivo si el otro
     * piloto tiene más puntos.
     * (Nota: La lógica {@code o.getPuntos() - this.getPuntos()} invierte
     * el orden natural ascendente).
     */
    @Override
    public int compareTo(Piloto o) {
        // Compara los puntos del "otro" (o) contra "este" (this) para lograr un orden descendente.
        return Integer.compare(o.getPuntos(), this.getPuntos());
    }
}
