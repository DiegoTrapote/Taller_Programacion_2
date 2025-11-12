package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de entidad (Modelo) que representa un Auto de Fórmula 1.
 * <p>
 * Almacena información clave como el modelo, el motor y su ID único ('valor').
 * Mantiene una relación obligatoria con una {@link Escuderia} (el equipo al que
 * pertenece) y una lista de {@link AutoPiloto} que representa el historial de
 * todas las carreras en las que este auto ha participado.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Auto {

    private String modelo;
    private String motor;
    private Escuderia escuderia;
    private List<AutoPiloto> listaAutoPilotos;
    private int valor;

    /**
     * Constructor por defecto. Inicializa un auto vacío con valores
     * predeterminados (String vacíos, escudería nula, una lista de AutoPiloto
     * vacía y valor 0).
     */
    public Auto() {
        this.modelo = "";
        this.motor = "";
        this.escuderia = null;
        this.listaAutoPilotos = new ArrayList<>();
        this.valor = 0;

    }

    /**
     * Constructor parcial que inicializa un auto solo con su modelo y motor.
     * (Nota: La escudería, el valor y la lista de AutoPiloto deben asignarse
     * por separado usando setters).
     *
     * @param modelo El nombre del modelo (ej: "RB20").
     * @param motor El fabricante del motor (ej: "Honda RBPT").
     */
    public Auto(String modelo, String motor) {
        this.modelo = modelo;
        this.motor = motor;

    }

    /**
     * Obtiene el nombre del modelo del auto.
     *
     * @return el modelo del auto.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el nombre del modelo del auto.
     *
     * @param modelo el nuevo modelo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el nombre del fabricante del motor.
     *
     * @return el motor del auto.
     */
    public String getMotor() {
        return motor;
    }

    /**
     * Establece el nombre del fabricante del motor.
     *
     * @param motor el nuevo motor.
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * Obtiene la escudería a la que pertenece este auto.
     *
     * @return el objeto {@link Escuderia} asociado.
     */
    public Escuderia getEscuderia() {
        return escuderia;
    }

    /**
     * Asigna el auto a una escudería.
     *
     * @param escuderia la {@link Escuderia} propietaria.
     */
    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    /**
     * Obtiene la lista de todas las inscripciones (resultados) en las que este
     * auto ha participado.
     *
     * @return una lista de {@link AutoPiloto}.
     */
    public List<AutoPiloto> getListaAutoPilotos() {
        return listaAutoPilotos;
    }

    /**
     * Establece la lista de inscripciones (historial) de este auto.
     *
     * @param listaAutoPilotos la nueva lista de {@link AutoPiloto}.
     */
    public void setListaAutoPilotos(List<AutoPiloto> listaAutoPilotos) {
        this.listaAutoPilotos = listaAutoPilotos;
    }

    /**
     * Obtiene el identificador numérico único (ID) del auto.
     *
     * @return el valor (ID) del auto.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Establece el identificador numérico único (ID) del auto.
     *
     * @param valor el nuevo valor (ID).
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Sobrescribe el método equals para definir la igualdad entre dos objetos
     * Auto.
     * <p>
     * Dos autos se consideran iguales si su 'valor' (ID) es idéntico. Esto es
     * crucial para el funcionamiento de ComboBoxes y búsquedas en Listas (como
     * List.contains() o .equals()).
     *
     * @param obj El objeto a comparar.
     * @return {@code true} si los autos tienen el mismo 'valor', {@code false}
     * en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Auto that = (Auto) obj;

        return this.getValor() == that.getValor();
    }

    /**
     * Sobrescribe el método hashCode para que sea consistente con
     * {@link #equals(Object)}.
     * <p>
     * El hashCode se genera basándose únicamente en el 'valor' (ID) del auto.
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
     * Se utiliza para mostrar el auto en componentes de la GUI como JComboBoxes
     * y JTables.
     *
     * @return El 'modelo' del auto (ej: "RB20").
     */
    @Override
    public String toString() {
        return getModelo();
    }
}
