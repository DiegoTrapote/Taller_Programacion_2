package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de entidad (Modelo) que representa una Escudería de Fórmula 1.
 * <p>
 * Almacena información clave como el nombre, el {@link Pais} de origen,
 * y su ID único ('valor').
 * Mantiene listas de los {@link Auto}s que posee, los {@link Mecanico}s que
 * emplea, y el historial de pilotos ({@link PilotoEscuderia}) que han estado
 * asociados a ella.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Escuderia {

    private String nombre;
    private List<Auto> listaAutos;
    private List<PilotoEscuderia> listaPilotoEscuderia;
    private Pais pais;
    private List<Mecanico> listaMecanicos;
    private int valor;

    /**
     * Constructor por defecto.
     * Inicializa una escudería vacía con valores predeterminados (String vacío,
     * país nulo, listas vacías y valor 0).
     */
    public Escuderia() {
        this.nombre = "";
        this.listaAutos = new ArrayList<>();
        this.listaPilotoEscuderia = new ArrayList<>();
        this.pais = null;
        this.listaMecanicos = new ArrayList<>();
        this.valor = 0;
    }

    /**
     * Establece el identificador numérico único (ID) de la escudería.
     * @param valor el nuevo valor (ID).
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el identificador numérico único (ID) de la escudería.
     * @return el valor (ID) de la escudería.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Constructor parcial que inicializa una escudería solo con su nombre.
     * (Nota: Los demás atributos deben asignarse por separado usando setters).
     *
     * @param nombre El nombre de la escudería (ej: "Red Bull Racing").
     */
    public Escuderia(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la escudería.
     * @return el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la escudería.
     * @param nombre el nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la lista de autos que pertenecen a esta escudería.
     * @return una lista de {@link Auto}.
     */
    public List<Auto> getListaAutos() {
        return listaAutos;
    }

    /**
     * Establece la lista de autos de esta escudería.
     * @param listaAutos la nueva lista de {@link Auto}.
     */
    public void setListaAutos(List<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    /**
     * Obtiene el historial de relaciones piloto-escudería (contratos).
     * @return una lista de {@link PilotoEscuderia}.
     */
    public List<PilotoEscuderia> getListaPilotoEscuderia() {
        return listaPilotoEscuderia;
    }

    /**
     * Establece el historial de relaciones piloto-escudería.
     * @param listaPilotoEscuderia la nueva lista de {@link PilotoEscuderia}.
     */
    public void setListaPilotoEscuderia(List<PilotoEscuderia> listaPilotoEscuderia) {
        this.listaPilotoEscuderia = listaPilotoEscuderia;
    }

    /**
     * Obtiene el país de origen de la escudería.
     * @return el objeto {@link Pais} asociado.
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Establece el país de origen de la escudería.
     * @param pais el nuevo {@link Pais}.
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Obtiene la lista de mecánicos que trabajan para esta escudería.
     * @return una lista de {@link Mecanico}.
     */
    public List<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }

    /**
     * Establece la lista de mecánicos de esta escudería.
     * @param listaMecanicos la nueva lista de {@link Mecanico}.
     */
    public void setListaMecanicos(List<Mecanico> listaMecanicos) {
        this.listaMecanicos = listaMecanicos;
    }

    /**
     * Sobrescribe el método toString para definir la representación en String
     * del objeto.
     * <p>
     * Se utiliza para mostrar la escudería en componentes de la GUI como
     * JComboBoxes y JTables.
     *
     * @return El 'nombre' de la escudería (ej: "Red Bull Racing").
     */
    @Override
    public String toString() {
        
        return getNombre(); 
    }

    /**
     * Sobrescribe el método equals para definir la igualdad entre dos objetos
     * Escuderia.
     * <p>
     * Dos escuderías se consideran iguales si su 'valor' (ID) es idéntico.
     * Esto es crucial para el funcionamiento de ComboBoxes y búsquedas
     * en Listas (como List.contains() o .equals()).
     *
     * @param obj El objeto a comparar.
     * @return {@code true} si las escuderías tienen el mismo 'valor',
     * {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Escuderia that = (Escuderia) obj;
     
        return getValor() == that.getValor();
    }

    /**
     * Sobrescribe el método hashCode para que sea consistente con
     * {@link #equals(Object)}.
     * <p>
     * El hashCode se genera basándose únicamente en el 'valor' (ID) de la
     * escudería.
     *
     * @return El código hash del objeto.
     */
    @Override
    public int hashCode() {
        
        return java.util.Objects.hash(getValor());
    }
}

