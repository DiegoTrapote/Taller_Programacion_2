package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de entidad (Modelo) que representa un Circuito de carreras.
 * <p>
 * Almacena información clave como el nombre, la longitud (en metros),
 * el {@link Pais} donde se ubica, y su ID único ('valor').
 * También mantiene una lista de las {@link Carrera}s que se han disputado en él.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Circuito {

    private String nombre;
    private int longitud;
    private List<Carrera> listaCarreras;
    private Pais pais;
    private int valor;

    /**
     * Constructor por defecto.
     * Inicializa un circuito vacío con valores predeterminados (String vacío,
     * longitud 0, país nulo, una lista de Carreras vacía y valor 0).
     */
    public Circuito() {
        this.nombre = "";
        this.longitud = 0;
        this.listaCarreras = new ArrayList<>();
        this.pais = null;
        this.valor = 0;
    }

    /**
     * Constructor parcial que inicializa un circuito solo con su nombre y
     * longitud.
     * (Nota: El país, valor y lista de carreras deben asignarse por separado
     * usando setters).
     *
     * @param nombre El nombre del circuito (ej: "Circuito de Monza").
     * @param longitud La longitud del circuito en metros (ej: 5793).
     */
    public Circuito(String nombre, int longitud) {
        this.nombre = nombre;
        this.longitud = longitud;

    }

    /**
     * Obtiene el identificador numérico único (ID) del circuito.
     * @return el valor (ID) del circuito.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Establece el identificador numérico único (ID) del circuito.
     * @param valor el nuevo valor (ID).
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el nombre del circuito.
     * @return el nombre del circuito.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del circuito.
     * @param nombre el nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la longitud del circuito (en metros).
     * @return la longitud en metros.
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Establece la longitud del circuito (en metros).
     * @param longitud la nueva longitud.
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Obtiene la lista de todas las carreras que se han disputado en este
     * circuito.
     * @return una lista de {@link Carrera}.
     */
    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    /**
     * Establece la lista de carreras disputadas en este circuito.
     * @param listaCarreras la nueva lista de {@link Carrera}.
     */
    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    /**
     * Obtiene el país donde se ubica el circuito.
     * @return el objeto {@link Pais} asociado.
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Establece el país donde se ubica el circuito.
     * @param pais el nuevo {@link Pais}.
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Sobrescribe el método toString para definir la representación en String
     * del objeto.
     * <p>
     * Se utiliza para mostrar el circuito en componentes de la GUI como
     * JComboBoxes y JTables.
     *
     * @return El 'nombre' del circuito (ej: "Circuito de Monza").
     */
    @Override
    public String toString() {
        return nombre;
    }

}
