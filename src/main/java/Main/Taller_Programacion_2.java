package Main;

import GUI.Inicio;
/**
 * Clase principal que inicia la aplicación del Taller de Programación 2.
 * <p>
 * El único propósito de esta clase es ejecutar el método `main` para
 * instanciar y mostrar la ventana principal de la GUI ({@link GUI.Inicio}).
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Taller_Programacion_2 {
    /**
     * Punto de entrada principal de la aplicación.
     * Crea una nueva instancia de la ventana {@link GUI.Inicio} y la hace
     * visible.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Inicio ventanaPrincipal = new Inicio();
                ventanaPrincipal.setVisible(true);
    }
}
