package Modelo;

/**
 * Clase base (superclase) que representa a una Persona dentro del sistema.
 * <p>
 * Contiene los atributos comunes para cualquier individuo, como DNI, nombre,
 * apellido y país de origen. Esta clase está diseñada para ser extendida por
 * clases más específicas como {@link Piloto} y {@link Mecanico}.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private Pais pais;

    /**
     * Constructor por defecto. Inicializa una Persona con valores
     * predeterminados (Strings vacíos y país nulo).
     */
    public Persona() {
        this.dni = "";
        this.nombre = "";
        this.apellido = "";
        this.pais = null;

    }

    /**
     * Constructor parametrizado. Crea una Persona con todos sus atributos
     * básicos.
     *
     * @param dni El DNI (identificador) de la persona.
     * @param nombre El nombre de la persona.
     * @param apellido El apellido de la persona.
     * @param pais El {@link Pais} de origen de la persona.
     */
    public Persona(String dni, String nombre, String apellido, Pais pais) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
    }

    /**
     * Obtiene el DNI de la persona.
     *
     * @return el DNI.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI de la persona.
     *
     * @param dni el nuevo DNI.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre el nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return el apellido.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido el nuevo apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el país de origen de la persona.
     *
     * @return el objeto {@link Pais} asociado.
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Establece el país de origen de la persona.
     *
     * @param pais el nuevo {@link Pais}.
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Sobrescribe el método toString para definir la representación en String
     * del objeto.
     * <p>
     * Se utiliza principalmente para depuración.
     *
     * @return Una representación en String de los atributos de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais + '}';
    }

}
