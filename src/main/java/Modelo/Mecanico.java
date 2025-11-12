package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de entidad (Modelo) que representa a un Mecánico.
 * <p>
 * Esta clase hereda de {@link Persona} y añade atributos específicos como
 * los años de experiencia y una {@link Especialidad} (definida en el Enum).
 * Mantiene una lista de {@link Escuderia}s para registrar el historial
 * de equipos en los que ha trabajado.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Mecanico extends Persona {

    private int aniosExperiencia;
    private Especialidad especialidad;
    private List<Escuderia> listaEscuderia;

    /**
     * Constructor por defecto.
     * Inicializa un mecánico llamando al constructor de {@link Persona} y
     * estableciendo valores predeterminados (0 años de experiencia,
     * especialidad nula y una lista de escuderías vacía).
     */
    public Mecanico() {
        super();
        this.aniosExperiencia = 0;
        this.especialidad = null;
        this.listaEscuderia = new ArrayList<>();

    }

    /**
     * Constructor parametrizado.
     * Crea un mecánico con todos sus atributos, incluyendo los de la
     * superclase {@link Persona}.
     *
     * @param aniosExperiencia Los años de experiencia del mecánico.
     * @param especialidad La {@link Especialidad} del mecánico (MOTOR,
     * CHASIS, etc.).
     * @param listaEscuderia La lista de escuderías asociadas.
     * @param dni El DNI del mecánico (heredado de Persona).
     * @param nombre El nombre del mecánico (heredado de Persona).
     * @param apellido El apellido del mecánico (heredado de Persona).
     * @param pais El {@link Pais} de origen del mecánico (heredado de Persona).
     */
    public Mecanico(int aniosExperiencia, Especialidad especialidad, List<Escuderia> listaEscuderia, String dni, String nombre, String apellido, Pais pais) {
        super(dni, nombre, apellido, pais);
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = especialidad;
        this.listaEscuderia = listaEscuderia;
    }

    /**
     * Obtiene los años de experiencia del mecánico.
     * @return los años de experiencia.
     */
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    /**
     * Establece los años de experiencia del mecánico.
     * @param aniosExperiencia los nuevos años de experiencia.
     */
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    /**
     * Obtiene la especialidad del mecánico.
     * @return la {@link Especialidad} (Enum).
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del mecánico.
     * @param especialidad la nueva {@link Especialidad}.
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la lista de escuderías (historial) asociadas a este mecánico.
     * @return una lista de {@link Escuderia}.
     */
    public List<Escuderia> getListaEscuderia() {
        return listaEscuderia;
    }

    /**
     * Establece la lista de escuderías (historial) asociadas a este mecánico.
     * @param listaEscuderia la nueva lista de {@link Escuderia}.
     */
    public void setListaEscuderia(List<Escuderia> listaEscuderia) {
        this.listaEscuderia = listaEscuderia;
    }

    /**
     * Sobrescribe el método toString para definir la representación en String
     * del objeto.
     * <p>
     * Se utiliza principalmente para depuración, mostrando el estado interno
     * del objeto Mecanico.
     *
     * @return Una representación en String de los atributos del mecánico.
     */
    @Override
    public String toString() {
        return "Mecanico{" + "aniosExperiencia=" + aniosExperiencia + ", especialidad=" + especialidad + ", listaEscuderia=" + listaEscuderia + '}';
    }
}
