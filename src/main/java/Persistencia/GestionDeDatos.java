package Persistencia;

import Modelo.Auto;
import Modelo.AutoPiloto;
import Modelo.Carrera;
import Modelo.Circuito;
import Modelo.Escuderia;
import Modelo.Mecanico;
import Modelo.Pais;
import Modelo.Piloto;
import Modelo.PilotoEscuderia;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de Persistencia que actúa como la "base de datos en memoria" del
 * sistema.
 * <p>
 * Esta clase es la única fuente de verdad para todos los datos. Contiene
 * {@link List}as para cada entidad del modelo (Pilotos, Autos, Carreras, etc.).
 * Se instancia una sola vez al inicio de la aplicación (en {@link GUI.Inicio})
 * y se pasa a la capa de {@link Servicios.Servicios} a través de inyección de
 * dependencias.
 * <p>
 * En su constructor, llama a {@link #cargarDatosDePrueba()} para poblar el
 * sistema con datos iniciales para demostración y pruebas.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class GestionDeDatos {

    // --- Listas Globales de Persistencia ---
    private List<Piloto> pilotos;
    private List<Escuderia> escuderias;
    private List<Auto> autos;
    private List<Mecanico> mecanicos;
    private List<Circuito> circuitos;
    private List<Carrera> carreras;
    private List<Pais> paises;
    /**
     * Lista global de todos los resultados/inscripciones (relación
     * Auto-Piloto-Carrera).
     */
    private List<AutoPiloto> autoPilotos;
    /**
     * Lista global de todo el historial de contratos (relación
     * Piloto-Escuderia).
     */
    private List<PilotoEscuderia> pilotosEscuderia;

    /**
     * Constructor de GestionDeDatos.
     * Inicializa todas las listas como {@link ArrayList} vacíos y
     * llama inmediatamente a {@link #cargarDatosDePrueba()} para
     * poblar el sistema.
     */
    public GestionDeDatos() {
        this.pilotos = new ArrayList<>();
        this.escuderias = new ArrayList<>();
        this.autos = new ArrayList<>();
        this.mecanicos = new ArrayList<>();
        this.circuitos = new ArrayList<>();
        this.carreras = new ArrayList<>();
        this.paises = new ArrayList<>();
        this.autoPilotos = new ArrayList<>();
        this.pilotosEscuderia = new ArrayList<>();
        cargarDatosDePrueba(); // Carga los datos de prueba al iniciar

    }

    /**
     * Método privado que puebla todas las listas con un conjunto de datos
     * de prueba (mock data) para permitir el testeo de la aplicación
     * sin necesidad de un registro manual inicial.
     * <p>
     * Crea instancias de Países, Circuitos, Escuderías, Pilotos, Autos,
     * Carreras y los resultados (AutoPiloto) que los conectan.
     */
    public void cargarDatosDePrueba() {

        // --- Creación de Países ---
        Pais p1 = new Pais(1, "Holanda");
        Pais p2 = new Pais(2, "Mónaco");
        Pais p3 = new Pais(3, "Reino Unido");
        paises.add(p1);
        paises.add(p2);
        paises.add(p3);

        // --- Creación de Circuitos ---
        Circuito c1 = new Circuito("Circuito de Monza", 5793);
        Circuito c2 = new Circuito("Circuito de Suzuka", 5807);
        circuitos.add(c1);
        circuitos.add(c2);

        // --- Creación de Escuderías ---
        Escuderia e1 = new Escuderia();
        e1.setNombre("Red Bull Racing");
        e1.setValor(1);
        e1.setPais(p1);

        Escuderia e2 = new Escuderia();
        e2.setNombre("McLaren");
        e2.setValor(2);
        e2.setPais(p3);

        Escuderia e3 = new Escuderia();
        e3.setNombre("Ferrari");
        e3.setValor(3);
        e3.setPais(p2);

        escuderias.add(e1);
        escuderias.add(e2);
        escuderias.add(e3);

        // --- Creación de Pilotos ---
        Piloto pil1 = new Piloto();
        pil1.setDni("111-1");
        pil1.setNombre("Max");
        pil1.setApellido("Verstappen");
        pil1.setNumeroCompetencia(1);
        pil1.setPais(p1);
        pilotos.add(pil1);

        Piloto pil2 = new Piloto();
        pil2.setDni("222-2");
        pil2.setNombre("Lando");
        pil2.setApellido("Norris");
        pil2.setNumeroCompetencia(4);
        pil2.setPais(p3);
        pilotos.add(pil2);

        Piloto pil3 = new Piloto();
        pil3.setDni("333-3");
        pil3.setNombre("Charles");
        pil3.setApellido("Leclerc");
        pil3.setNumeroCompetencia(16);
        pil3.setPais(p2);
        pilotos.add(pil3);

        // --- Creación de Autos (asignados a escuderías) ---
        Auto auto1 = new Auto();
        auto1.setModelo("RB20");
        auto1.setMotor("Honda RBPT");
        auto1.setEscuderia(e1); // Asignado a Red Bull
        auto1.setValor(1);
        autos.add(auto1);

        Auto auto2 = new Auto();
        auto2.setModelo("MCL38");
        auto2.setMotor("Mercedes");
        auto2.setEscuderia(e2); // Asignado a McLaren
        auto2.setValor(2);
        autos.add(auto2);

        Auto auto3 = new Auto();
        auto3.setModelo("SF-24");
        auto3.setMotor("Ferrari");
        auto3.setEscuderia(e3); // Asignado a Ferrari
        auto3.setValor(3);
        autos.add(auto3);

        // --- Creación de Carreras ---
        Carrera car1 = new Carrera();
        car1.setValor(1);
        car1.setCircuito(c1); // Monza
        car1.setFechaRealizacion("20241020");
        car1.setNumeroVueltas(53);
        car1.setHoraRealizacion("15:00");
        car1.setPais(p1);
        carreras.add(car1);

        Carrera car2 = new Carrera();
        car2.setValor(2);
        car2.setCircuito(c2); // Suzuka
        car2.setFechaRealizacion("20241105");
        car2.setNumeroVueltas(53);
        car2.setHoraRealizacion("14:00");
        car2.setPais(p3);
        carreras.add(car2);

        Carrera car3 = new Carrera();
        car3.setValor(3);
        car3.setCircuito(c1); // Monza de nuevo
        car3.setFechaRealizacion("20230903");
        car3.setNumeroVueltas(53);
        car3.setHoraRealizacion("15:00");
        car3.setPais(p1);
        carreras.add(car3);

        // --- Creación de Resultados (AutoPiloto) ---
        // Resultados de Monza 2024 (car1)
        AutoPiloto res1_1 = new AutoPiloto("20241019", auto1, pil1, car1, 1, true); // Verstappen P1
        AutoPiloto res1_2 = new AutoPiloto("20241019", auto2, pil2, car1, 2, false); // Norris P2
        AutoPiloto res1_3 = new AutoPiloto("20241019", auto3, pil3, car1, 3, false); // Leclerc P3
        autoPilotos.add(res1_1);
        autoPilotos.add(res1_2);
        autoPilotos.add(res1_3);

        // Resultados de Suzuka 2024 (car2)
        AutoPiloto res2_1 = new AutoPiloto("20241104", auto2, pil2, car2, 1, true); // Norris P1
        AutoPiloto res2_2 = new AutoPiloto("20241104", auto3, pil3, car2, 2, false); // Leclerc P2
        AutoPiloto res2_3 = new AutoPiloto("20241104", auto1, pil1, car2, 3, false); // Verstappen P3
        autoPilotos.add(res2_1);
        autoPilotos.add(res2_2);
        autoPilotos.add(res2_3);

        // Resultados de Monza 2023 (car3)
        AutoPiloto res3_1 = new AutoPiloto("20230902", auto1, pil1, car3, 1, false); // Verstappen P1
        autoPilotos.add(res3_1);

    }

    // --- MÉTODOS GETTERS (para que Servicios acceda a las listas) ---
    
    /**
     * Devuelve la lista completa de pilotos.
     * @return Lista de {@link Piloto}.
     */
    public List<Piloto> getPilotos() {
        return pilotos;
    }

    /**
     * Devuelve la lista completa de historial Piloto-Escudería.
     * @return Lista de {@link PilotoEscuderia}.
     */
    public List<PilotoEscuderia> getPilotosEscuderia() {
        return pilotosEscuderia;
    }

    /**
     * (No utilizado actualmente) Establece la lista de AutoPiloto.
     * @param autoPilotos Nueva lista de {@link AutoPiloto}.
     */
    public void setAutoPilotos(List<AutoPiloto> autoPilotos) {
        this.autoPilotos = autoPilotos;
    }

    /**
     * Devuelve la lista completa de mecánicos (No usada, ver getMecanico()).
     * @return Lista de {@link Mecanico}.
     */
    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

    /**
     * Devuelve la lista completa de resultados/inscripciones (AutoPiloto).
     * @return Lista de {@link AutoPiloto}.
     */
    public List<AutoPiloto> getAutoPilotos() {
        return autoPilotos;
    }

    /**
     * Devuelve la lista completa de escuderías.
     * @return Lista de {@link Escuderia}.
     */
    public List<Escuderia> getEscuderias() {
        return escuderias;
    }

    // --- MÉTODOS "ADD" (para agregar nuevos objetos a las listas) ---
    
    public void agregarAuto(Auto auto) {
        this.autos.add(auto);
    }

    public void agregarPiloto(Piloto piloto) {
        this.pilotos.add(piloto);
    }

    public void agregarMecanico(Mecanico mecanico) {
        this.mecanicos.add(mecanico);
    }

    public void agregarEscuderia(Escuderia escuderia) {
        this.escuderias.add(escuderia);
    }

    public void agregarCircuitos(Circuito circuito) {
        this.circuitos.add(circuito);
    }

    public void agregarCarrera(Carrera carrera) {
        this.carreras.add(carrera);
    }

    public void agregarPais(Pais pais) {
        this.paises.add(pais);
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public List<Circuito> getCircuitos() {
        return circuitos;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    /**
     * Devuelve la lista completa de mecánicos.
     * @return Lista de {@link Mecanico}.
     */
    public List<Mecanico> getMecanico() {
        return mecanicos;
    }

    // --- MÉTODOS "REMOVE" (para eliminar objetos de las listas) ---
    
    public void removePiloto(Piloto p) {
        pilotos.remove(p);
    }

    public void removeAuto(Auto a) {
        autos.remove(a);
    }

    public void removeEscuderia(Escuderia e) {
        escuderias.remove(e);
    }

    public void removeMecanicos(Mecanico m) {
        mecanicos.remove(m);
    }

    public void removeCircuito(Circuito c) {
        circuitos.remove(c);
    }

    public void removeCarreras(Carrera c) {
        carreras.remove(c);
    }

    public void removePaises(Pais p) {
        paises.remove(p);
    }

    public List<Pais> getPaises() {
        return paises;
    }

    /**
     * Agrega una nueva inscripción/resultado (AutoPiloto) a la lista global.
     * @param autoPiloto El objeto {@link AutoPiloto} a agregar.
     */
    public void addAutoPiloto(AutoPiloto autoPiloto) {
        this.autoPilotos.add(autoPiloto);
    }

    /**
     * Elimina una inscripción/resultado (AutoPiloto) de la lista global.
     * @param ap El objeto {@link AutoPiloto} a eliminar.
     */
    public void removeAutoPiloto(AutoPiloto ap) {
        this.autoPilotos.remove(ap);
    }

    // --- MÉTODOS DE BÚSQUEDA / FILTRADO ---
    
    /**
     * Filtra la lista de carreras por un rango de fechas.
     *
     * @param fechaDesdeStr Fecha de inicio en formato "yyyyMMdd".
     * @param fechaHastaStr Fecha de fin en formato "yyyyMMdd".
     * @return Una nueva lista de {@link Carrera} que coincide con el rango.
     */
    public List<Carrera> traerCarrerasPorRango(String fechaDesdeStr, String fechaHastaStr) {
        List<Carrera> carrerasEncontradas = new ArrayList<>();

        int desde = Integer.parseInt(fechaDesdeStr);
        int hasta = Integer.parseInt(fechaHastaStr);

        for (Carrera carreraActual : carreras) {
            int fechaCarrera = Integer.parseInt(carreraActual.getFechaRealizacion());

            if (fechaCarrera >= desde && fechaCarrera <= hasta) {
                carrerasEncontradas.add(carreraActual);
            }
        }
        return carrerasEncontradas;
    }

    /**
     * Filtra la lista global de resultados (AutoPiloto) para encontrar todos
     * los que pertenecen a una carrera específica.
     *
     * @param c La {@link Carrera} a buscar (la comparación usa
     * Carrera.equals()).
     * @return Una nueva lista de {@link AutoPiloto} que coincide con la carrera.
     */
    public List<AutoPiloto> traerResultadosDeCarrera(Carrera c) {
        List<AutoPiloto> resultadosEncontrados = new ArrayList<>();

        for (AutoPiloto resultado : autoPilotos) {
            // Compara usando el .equals() de la clase Carrera
            if (resultado.getCarrera().equals(c)) {
                resultadosEncontrados.add(resultado);
            }
        }
        return resultadosEncontrados;
    }

    /**
     * Filtra la lista global de resultados (AutoPiloto) para encontrar todos
     * los que pertenecen a un piloto específico.
     *
     * @param piloto El {@link Piloto} a buscar (la comparación usa
     * Piloto.equals()).
     * @return Una nueva lista de {@link AutoPiloto} que coincide con el piloto.
     */
    public List<AutoPiloto> traerResultadosDePiloto(Piloto piloto) {
        List<AutoPiloto> resultadosEncontrados = new ArrayList<>();

        for (AutoPiloto resultado : autoPilotos) {
            // Compara usando el .equals() de la clase Piloto
            if (resultado.getPiloto().equals(piloto)) {
                resultadosEncontrados.add(resultado);
            }
        }
        return resultadosEncontrados;
    }

    /**
     * Busca y devuelve una {@link Carrera} específica basándose en su 'valor'
     * (ID).
     *
     * @param valor El ID (valor) de la carrera a buscar.
     * @return El objeto {@link Carrera} encontrado, o {@code null} si no se
     * encuentra.
     */
    public Carrera buscarCarreraPorValor(int valor) {
        for (Carrera c : carreras) {
            if (c.getValor() == valor) {
                return c;
            }
        }
        return null;
    }

}
