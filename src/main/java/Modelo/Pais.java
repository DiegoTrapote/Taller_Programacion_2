package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de entidad (Modelo) que representa un País.
 * <p>
 * Almacena información clave como su nombre ({@code descripcion}), un ID
 * ({@code idPais}), y un ID de valor ({@code valor}).
 * Mantiene listas de las {@link Escuderia}s, {@link Circuito}s,
 * {@link Carrera}s y {@link Persona}s asociadas a este país.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Pais {

    private int idPais;
    private String descripcion;
    private List<Escuderia> listaEscuderias;
    private List<Circuito> listaCircuitos;
    private List<Carrera> listaCarreras;
    private List<Persona> listaPersonas;
    private int valor; 

    /**
     * Constructor por defecto.
     * Inicializa un país vacío con valores predeterminados (IDs en 0,
     * descripción vacía, y listas vacías).
     */
    public Pais() {
        this.idPais = 0;
        this.descripcion = "";
        this.listaEscuderias = new ArrayList<>();
        this.listaCircuitos = new ArrayList<>();
        this.listaCarreras = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.valor = 0;
    }

    /**
     * Establece el identificador numérico secundario (ID) del país.
     * @param valor el nuevo valor.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el identificador numérico secundario (ID) del país.
     * @return el valor (ID) del país.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Constructor parametrizado para crear un País con su ID principal y
     * descripción.
     *
     * @param idPais El ID principal del país.
     * @param descripcion El nombre (descripción) del país.
     */
    public Pais(int idPais, String descripcion) {
        this.idPais = idPais;
        this.descripcion = descripcion;
    }

    /**
     * Constructor completo con todos los atributos.
     *
     * @param idPais El ID principal del país.
     * @param descripcion El nombre (descripción) del país.
     * @param listaEscuderias Lista de escuderías asociadas.
     * @param listaCircuitos Lista de circuitos asociados.
     * @param listaCarreras Lista de carreras asociadas.
     * @param listaPersonas Lista de personas asociadas.
     */
    public Pais(int idPais, String descripcion, List<Escuderia> listaEscuderias, List<Circuito> listaCircuitos, List<Carrera> listaCarreras, List<Persona> listaPersonas) {
        this.idPais = idPais;
        this.descripcion = descripcion;
        this.listaEscuderias = listaEscuderias;
        this.listaCircuitos = listaCircuitos;
        this.listaCarreras = listaCarreras;
        this.listaPersonas = listaPersonas;
    }

    /**
     * Obtiene el ID principal del país.
     * @return el idPais.
     */
    public int getIdPais() {
        return idPais;
    }

    /**
     * Establece el ID principal del país.
     * @param idPais el nuevo ID principal.
     */
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    /**
     * Obtiene el nombre (descripción) del país.
     * @return la descripción del país.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece el nombre (descripción) del país.
     * @param descripcion la nueva descripción.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la lista de escuderías asociadas a este país.
     * @return una lista de {@link Escuderia}.
     */
    public List<Escuderia> getListaEscuderias() {
        return listaEscuderias;
    }

    /**
     * Establece la lista de escuderías asociadas a este país.
     * @param listaEscuderias la nueva lista de {@link Escuderia}.
     */
    public void setListaEscuderias(List<Escuderia> listaEscuderias) {
        this.listaEscuderias = listaEscuderias;
    }

    /**
     * Obtiene la lista de circuitos ubicados en este país.
     * @return una lista de {@link Circuito}.
     */
    public List<Circuito> getListaCircuitos() {
        return listaCircuitos;
    }

    /**
     * Establece la lista de circuitos ubicados en este país.
     * @param listaCircuitos la nueva lista de {@link Circuito}.
     */
    public void setListaCircuitos(List<Circuito> listaCircuitos) {
        this.listaCircuitos = listaCircuitos;
    }

    /**
     * Obtiene la lista de carreras realizadas en este país.
     * @return una lista de {@link Carrera}.
     */
    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    /**
     * Establece la lista de carreras realizadas en este país.
     * @param listaCarreras la nueva lista de {@link Carrera}.
     */
    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    /**
     * Obtiene la lista de personas (pilotos, mecánicos) de este país.
     * @return una lista de {@link Persona}.
     */
    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    /**
     * Establece la lista de personas (pilotos, mecánicos) de este país.
     * @param listaPersonas la nueva lista de {@link Persona}.
     */
    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    /**
     * Sobrescribe el método toString para definir la representación en String
     * del objeto.
     * <p>
     * Se utiliza para mostrar el país en componentes de la GUI como
     * JComboBoxes y JTables.
     *
     * @return La 'descripcion' (nombre) del país.
     */
    @Override
    public String toString() {
        return descripcion;
    }

}
