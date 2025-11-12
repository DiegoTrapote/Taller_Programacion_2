package Servicios;

import Modelo.Auto;
import Modelo.AutoPiloto;
import Modelo.Carrera;
import Modelo.Circuito;
import Modelo.Escuderia;
import Modelo.Especialidad;
import Modelo.Mecanico;
import Modelo.Pais;
import Modelo.Piloto;
import Modelo.PilotoEscuderia;
import Persistencia.GestionDeDatos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Capa de Servicios (Lógica de Negocio).
 * <p>
 * Esta clase actúa como intermediario entre la Interfaz de Usuario (GUI) y la
 * capa de Persistencia ({@link GestionDeDatos}). Contiene toda la lógica de
 * negocio, validaciones y orquestación de operaciones.
 * <p>
 * Recibe una instancia de {@link GestionDeDatos} en su constructor (Inyección
 * de Dependencias) para operar sobre una única fuente de datos.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Servicios {

    /**
     * Instancia única de la capa de persistencia.
     */
    private GestionDeDatos gestion;

    /**
     * Constructor de la clase Servicios.
     *
     * @param gestion La instancia única de {@link GestionDeDatos} que manejará
     * la persistencia de los datos.
     */
    public Servicios(GestionDeDatos gestion) {
        this.gestion = gestion;
    }

    /**
     * Obtiene la instancia de la capa de persistencia. (Generalmente no debería
     * ser público, pero se mantiene si las GUIs lo necesitan).
     *
     * @return la instancia de {@link GestionDeDatos}.
     */
    public GestionDeDatos getGestion() {
        return this.gestion;
    }

    // --- MÉTODOS DE REGISTRO (CREATE) ---
    /**
     * Crea un nuevo objeto Auto y lo agrega a la persistencia.
     *
     * @param motor El motor del auto.
     * @param modelo El modelo del auto.
     * @param escuderia La {@link Escuderia} a la que pertenece el auto.
     */
    public void registrarAuto(String motor, String modelo, Escuderia escuderia) {
        Auto auto = new Auto();
        int valor = gestion.getAutos().size() + 1;
        auto.setModelo(modelo);
        auto.setValor(valor);
        auto.setMotor(motor);
        auto.setEscuderia(escuderia);
        gestion.agregarAuto(auto);
    }

    /**
     * Crea un nuevo objeto Piloto y lo agrega a la persistencia.
     *
     * @param nombre El nombre del piloto.
     * @param apellido El apellido del piloto.
     * @param dni El DNI del piloto.
     * @param pais El {@link Pais} de origen del piloto.
     */
    public void registrarPiloto(String nombre, String apellido, String dni, Pais pais) {
        Piloto piloto = new Piloto();
        piloto.setNombre(nombre);
        piloto.setApellido(apellido);
        piloto.setDni(dni);
        piloto.setPais(pais);
        gestion.agregarPiloto(piloto);
    }

    /**
     * Crea un nuevo objeto Circuito y lo agrega a la persistencia.
     *
     * @param nombre El nombre del circuito.
     * @param longitud La longitud en metros del circuito.
     */
    public void registrarCircuito(String nombre, int longitud) {
        Circuito circuito = new Circuito();
        int valor = gestion.getCircuitos().size() + 1;
        circuito.setValor(valor);
        circuito.setLongitud(longitud);
        circuito.setNombre(nombre);
        gestion.agregarCircuitos(circuito);
    }

    /**
     * Crea un nuevo objeto Carrera y lo agrega a la persistencia.
     *
     * @param circuito El {@link Circuito} donde se corre.
     * @param fecha La fecha de la carrera (formato "yyyyMMdd").
     * @param hora La hora de la carrera (formato "HH:mm").
     * @param numeroVueltas El número de vueltas.
     * @param pais El {@link Pais} donde se corre.
     */
    public void registrarCarrera(Circuito circuito, String fecha, String hora, int numeroVueltas, Pais pais) {
        Carrera carrera = new Carrera();
        int valor = gestion.getCarreras().size() + 1;
        carrera.setValor(valor);
        carrera.setCircuito(circuito);
        carrera.setFechaRealizacion(fecha);
        carrera.setHoraRealizacion(hora);
        carrera.setNumeroVueltas(numeroVueltas);
        carrera.setPais(pais);
        gestion.agregarCarrera(carrera);
    }

    /**
     * Crea un nuevo objeto Escuderia y lo agrega a la persistencia.
     *
     * @param nombre El nombre de la escudería.
     * @param pais El {@link Pais} de origen de la escudería.
     */
    public void registrarEscuderia(String nombre, Pais pais) {
        Escuderia escuderia = new Escuderia();
        int valor = gestion.getEscuderias().size() + 1;
        escuderia.setValor(valor);
        escuderia.setNombre(nombre);
        escuderia.setPais(pais);
        gestion.agregarEscuderia(escuderia);
    }

    /**
     * Crea un nuevo objeto Mecanico y lo agrega a la persistencia. Asigna la
     * escudería inicial a la lista de escuderías del mecánico.
     *
     * @param nombre El nombre.
     * @param apellido El apellido.
     * @param pais El {@link Pais} de origen.
     * @param dni El DNI.
     * @param aniosExperiencia Los años de experiencia.
     * @param especialidad La {@link Especialidad} (Enum).
     * @param escuderia La {@link Escuderia} inicial a la que se une.
     */
    public void registrarMecanico(String nombre, String apellido, Pais pais, String dni, int aniosExperiencia, Especialidad especialidad, Escuderia escuderia) {
        Mecanico mecanico = new Mecanico();
        mecanico.setNombre(nombre);
        mecanico.setApellido(apellido);
        mecanico.setDni(dni);
        mecanico.setPais(pais);
        mecanico.setAniosExperiencia(aniosExperiencia);
        mecanico.setEspecialidad(especialidad);
        mecanico.getListaEscuderia().add(escuderia);
        gestion.agregarMecanico(mecanico);
    }

    /**
     * Crea un nuevo objeto Pais y lo agrega a la persistencia.
     *
     * @param nombre El nombre (descripción) del país.
     */
    public void registrarPais(String nombre) {
        Pais pais = new Pais();
        int valor = gestion.getPaises().size() + 1; // Asigna un ID simple
        pais.setValor(valor);
        pais.setDescripcion(nombre);
        gestion.agregarPais(pais);
    }

    /**
     * (Método vacío) Placeholder para un futuro registro de resultados.
     */
    public void registroResultadoCarreras(String posicion, int puntos) {
        // Lógica futura
    }

    // --- MÉTODOS DE MODIFICACIÓN (UPDATE) ---
    /**
     * Modifica los datos de un Piloto existente. Busca al piloto por su
     * `dniViejo` y actualiza todos sus campos.
     *
     * @param nombre El nuevo nombre.
     * @param apellido El nuevo apellido.
     * @param pais El nuevo {@link Pais}.
     * @param dni El nuevo DNI (puede ser el mismo o uno nuevo).
     * @param dniViejo El DNI original, usado para buscar al piloto.
     */
    public void modificarPiloto(String nombre, String apellido, Pais pais, String dni, String dniViejo) {
        for (Piloto e : gestion.getPilotos()) {
            if (e.getDni().equals(dniViejo)) {
                e.setApellido(apellido);
                e.setNombre(nombre);
                e.setPais(pais);
                e.setDni(dni);
                break;
            }
        }
    }

    /**
     * Modifica los datos de un Auto existente.
     *
     * @param modelo El nuevo modelo.
     * @param motor El nuevo motor.
     * @param valor El ID (valor) del auto a modificar.
     */
    public void modificarAuto(String modelo, String motor, int valor) {
        for (Auto a : gestion.getAutos()) {
            if (a.getValor() == valor) {
                a.setModelo(modelo);
                a.setMotor(motor);
                break;
            }
        }
    }

    /**
     * Modifica los datos de un Circuito existente.
     *
     * @param nombre El nuevo nombre.
     * @param longitud La nueva longitud.
     * @param nombreTabla El nombre original, usado para buscar el circuito.
     */
    public void modificarCircuito(String nombre, int longitud, String nombreTabla) {
        for (Circuito c : gestion.getCircuitos()) {
            if (c.getNombre().equals(nombreTabla)) {
                c.setLongitud(longitud);
                c.setNombre(nombre);
                break;
            }
        }
    }

    /**
     * Modifica los datos de una Carrera existente.
     *
     * @param fecha La nueva fecha (yyyyMMdd).
     * @param hora La nueva hora (HH:mm).
     * @param numeroVueltas El nuevo número de vueltas.
     * @param circuito El nuevo {@link Circuito}.
     * @param valor El ID (valor) de la carrera a modificar.
     * @param pais El nuevo {@link Pais}.
     */
    public void modificarCarrera(String fecha, String hora, int numeroVueltas, Circuito circuito, int valor, Pais pais) {
        for (Carrera c : gestion.getCarreras()) {
            if (c.getValor() == valor) {
                c.setCircuito(circuito);
                c.setFechaRealizacion(fecha);
                c.setHoraRealizacion(hora);
                c.setNumeroVueltas(numeroVueltas);
                break;
            }
        }
    }

    /**
     * Modifica los datos de una Escuderia existente.
     *
     * @param nombre El nuevo nombre.
     * @param pais El nuevo {@link Pais}.
     * @param nombreV El nombre original, usado para buscar la escudería.
     */
    public void modificarEscuderia(String nombre, Pais pais, String nombreV) {
        for (Escuderia e : gestion.getEscuderias()) {
            if (e.getNombre().equals(nombreV)) {
                e.setNombre(nombre);
                e.setPais(pais);
                break;
            }
        }
    }

    /**
     * Modifica los datos de un Mecanico existente.
     *
     * @param nombre El nuevo nombre.
     * @param apellido El nuevo apellido.
     * @param pais El nuevo {@link Pais}.
     * @param dni El DNI (usado como ID para buscar).
     * @param aniosExperencia Los nuevos años de experiencia.
     * @param especialidad La nueva {@link Especialidad}.
     */
    public void mofidicarMecanico(String nombre, String apellido, Pais pais, String dni, int aniosExperencia, Especialidad especialidad) {
        for (Mecanico m : gestion.getMecanico()) {
            if (m.getDni().equals(dni)) {
                m.setNombre(nombre);
                m.setApellido(apellido);
                m.setPais(pais);
                m.setDni(dni);
                m.setAniosExperiencia(aniosExperencia);
                m.setEspecialidad(especialidad);
                break;
            }
        }
    }

    // --- MÉTODOS "TRAER" (READ - Listas) ---
    /**
     * Devuelve la lista completa de todos los pilotos.
     *
     * @return una {@link List} de {@link Piloto}.
     */
    public List<Piloto> traerPilotos() {
        return gestion.getPilotos();
    }

    // --- MÉTODOS "ELIMINAR" (DELETE) ---
    /**
     * Elimina un Piloto de la persistencia buscándolo por DNI.
     *
     * @param Dni El DNI del piloto a eliminar.
     */
    public void eliminarPiloto(String Dni) {
        for (Piloto p : gestion.getPilotos()) {
            if (p.getDni().equals(Dni)) {
                gestion.removePiloto(p);
                break;
            }
        }
    }

    /**
     * Elimina un Auto de la persistencia buscándolo por su ID (valor). Reajusta
     * los IDs de los autos restantes.
     *
     * @param valor El ID (valor) del auto a eliminar.
     */
    public void eliminarAuto(int valor) {
        Auto autoAEliminar = null;
        for (Auto a : gestion.getAutos()) {
            if (valor == a.getValor()) {
                autoAEliminar = a;
                break;
            }
        }
        if (autoAEliminar != null) {
            gestion.removeAuto(autoAEliminar);

            for (Auto a : gestion.getAutos()) {
                if (a.getValor() > valor) {
                    a.setValor(a.getValor() - 1);
                }
            }
        }
    }

    /**
     * Elimina un Circuito de la persistencia buscándolo por nombre.
     *
     * @param nombre El nombre del circuito a eliminar.
     */
    public void eliminarCircuito(String nombre) {
        for (Circuito c : gestion.getCircuitos()) {
            if (nombre.equalsIgnoreCase(c.getNombre())) {
                gestion.removeCircuito(c);
                break;
            }
        }
    }

    /**
     * Elimina una Carrera de la persistencia buscándola por su ID (valor).
     * Reajusta los IDs de las carreras restantes.
     *
     * @param valor El ID (valor) de la carrera a eliminar.
     */
    public void eliminarCarrera(int valor) {
        Carrera carreraAEliminar = null;
        for (Carrera c : gestion.getCarreras()) {
            if (c.getValor() == valor) {
                carreraAEliminar = c;
                break;
            }
        }
        if (carreraAEliminar != null) {
            gestion.removeCarreras(carreraAEliminar);

            for (Carrera c : gestion.getCarreras()) {
                if (c.getValor() > valor) {
                    c.setValor(c.getValor() - 1);
                }
            }
        }
    }

    /**
     * Elimina una Escuderia de la persistencia buscándola por nombre.
     *
     * @param nombre El nombre de la escudería a eliminar.
     */
    public void eliminarEscuderia(String nombre) {
        for (Escuderia e : gestion.getEscuderias()) {
            if (e.getNombre().equals(nombre)) {
                gestion.removeEscuderia(e);
                break;
            }
        }
    }

    /**
     * Elimina un Mecanico de la persistencia buscándolo por DNI.
     *
     * @param Dni El DNI del mecánico a eliminar.
     */
    public void eliminarMecanico(String Dni) {
        for (Mecanico m : gestion.getMecanico()) {
            if (m.getDni().equals(Dni)) {
                gestion.removeMecanicos(m);
                break;
            }
        }
    }

    /**
     * Devuelve la lista completa de todos los países.
     *
     * @return una {@link List} de {@link Pais}.
     */
    public List<Pais> traerPaises() {
        return gestion.getPaises();
    }

    // --- MÉTODOS "BUSCAR" (READ - Específicos) ---
    /**
     * Busca un Piloto específico por su DNI. (Nota: Devuelve un Piloto vacío si
     * no lo encuentra, debería devolver null).
     *
     * @param dniViejo El DNI a buscar.
     * @return El {@link Piloto} encontrado o un Piloto vacío.
     */
    public Piloto buscarPilotoPorDni(String dniViejo) {
        Piloto piloto = new Piloto();
        for (Piloto p : gestion.getPilotos()) {
            if (p.getDni().equals(dniViejo)) {
                piloto = p;
            }
        }
        return piloto;
    }

    /**
     * Devuelve la lista completa de todos los mecánicos.
     *
     * @return una {@link List} de {@link Mecanico}.
     */
    public List<Mecanico> traerMecanicos() {
        return gestion.getMecanico();
    }

    /**
     * Busca un Mecanico específico por su DNI. (Nota: Devuelve un Mecanico
     * vacío si no lo encuentra, debería devolver null).
     *
     * @param dniViejo El DNI a buscar.
     * @return El {@link Mecanico} encontrado o un Mecanico vacío.
     */
    public Mecanico buscarMecanicoPorDni(String dniViejo) {
        Mecanico mecanico = new Mecanico();
        for (Mecanico m : gestion.getMecanico()) {
            if (m.getDni().equals(dniViejo)) {
                mecanico = m;
            }
        }
        return mecanico;
    }

    /**
     * Devuelve la lista completa de todas las carreras.
     *
     * @return una {@link List} de {@link Carrera}.
     */
    public List<Carrera> traerCarreras() {
        return gestion.getCarreras();
    }

    /**
     * Devuelve la lista completa de todos los circuitos.
     *
     * @return una {@link List} de {@link Circuito}.
     */
    public List<Circuito> traerCircuitos() {
        return gestion.getCircuitos();
    }

    /**
     * Modifica el nombre (descripción) de un País existente.
     *
     * @param nombre El nuevo nombre.
     * @param nombreViejo El nombre original, usado para buscar el país.
     */
    public void modificarPais(String nombre, String nombreViejo) {
        for (Pais p : gestion.getPaises()) {
            if (p.getDescripcion().equals(nombreViejo)) {
                p.setDescripcion(nombre);
                break;
            }
        }
    }

    /**
     * Elimina un Pais de la persistencia buscándolo por nombre. (Nota: Este
     * método tiene un bug, no usa `break` después de remover).
     *
     * @param nombre El nombre del país a eliminar.
     */
    public void eliminarPais(String nombre) {
        for (Pais p : gestion.getPaises()) {
            if (p.getDescripcion().equals(nombre)) {
                gestion.removePaises(p);

            }
        }
    }

    /**
     * Devuelve la lista completa de todas las escuderías.
     *
     * @return una {@link List} de {@link Escuderia}.
     */
    public List<Escuderia> traerEscuderias() {
        return gestion.getEscuderias();
    }

    /**
     * Busca una Escuderia específica por su nombre.
     *
     * @param nombre El nombre de la escudería a buscar.
     * @return La {@link Escuderia} encontrada, o {@code null} si no existe.
     */
    public Escuderia buscarEscuderiaPorNombre(String nombre) {
        for (Escuderia e : gestion.getEscuderias()) {
            if (e.getNombre().equals(nombre)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Devuelve la lista completa de todos los autos.
     *
     * @return una {@link List} de {@link Auto}.
     */
    public List<Auto> traerAutos() {
        return gestion.getAutos();
    }

    // --- LÓGICA DE NEGOCIO COMPLEJA (Inscripciones, Informes, etc.) ---
    /**
     * Da de baja (elimina) la inscripción de un piloto de una carrera
     * específica.
     *
     * @param piloto El {@link Piloto} a dar de baja.
     * @param valor El ID (valor) de la {@link Carrera} de la cual se da de
     * baja.
     */
    public void darDeBajaPiloto(Piloto piloto, int valor) {
        Carrera carreraActual = null;
        for (Carrera c : gestion.getCarreras()) {
            if (c.getValor() == valor) {
                carreraActual = c;
                break;
            }
        }
        if (carreraActual == null) {
            return;
        }

        AutoPiloto inscripcionARemover = null;

        for (AutoPiloto ap : gestion.getAutoPilotos()) {

            if (ap.getCarrera().equals(carreraActual) && ap.getPiloto().equals(piloto)) {
                inscripcionARemover = ap;
                break;
            }
        }

        if (inscripcionARemover != null) {
            gestion.removeAutoPiloto(inscripcionARemover);
            carreraActual.getAutoPiloto().remove(inscripcionARemover);
        }
    }

    /**
     * Inscribe un piloto a una carrera con un auto específico. Aplica reglas de
     * negocio: 1. La fecha de inscripción debe ser anterior a la de la carrera.
     * 2. El piloto no puede estar ya inscripto en esa carrera. 3. El auto no
     * puede estar ya asignado a otro piloto en esa carrera.
     *
     * @param piloto El {@link Piloto} a inscribir.
     * @param auto El {@link Auto} a asignar.
     * @param fecha La fecha de inscripción (formato "yyyyMMdd").
     * @param valor El ID (valor) de la {@link Carrera}.
     * @throws RuntimeException si alguna regla de negocio falla.
     */
    public void inscribirPilotoEnCarrera(Piloto piloto, Auto auto, String fecha, int valor) {
        Carrera carreraActual = null;
        for (Carrera c : gestion.getCarreras()) {
            if (c.getValor() == valor) {
                carreraActual = c;
                break;
            }
        }

        if (carreraActual == null) {
            throw new RuntimeException("Error: No se pudo encontrar la carrera (ID: " + valor + ").");
        }

        int fechaInscripcion = Integer.parseInt(fecha);
        int fechaDeLaCarrera = Integer.parseInt(carreraActual.getFechaRealizacion());

        if (fechaInscripcion >= fechaDeLaCarrera) {
            throw new RuntimeException("La fecha de inscripción (" + fecha
                    + ") debe ser ANTERIOR a la fecha de la carrera ("
                    + carreraActual.getFechaRealizacion() + ").");
        }

        List<AutoPiloto> inscripciones = gestion.traerResultadosDeCarrera(carreraActual);
        for (AutoPiloto inscripcionExistente : inscripciones) {
            if (inscripcionExistente.getPiloto().equals(piloto)) {
                throw new RuntimeException("El piloto " + piloto.getNombre() + " ya está inscripto en esta carrera.");
            }
            if (inscripcionExistente.getAuto().equals(auto)) {
                throw new RuntimeException("El auto " + auto.getModelo() + " ya está asignado a otro piloto en esta carrera.");
            }
        }

        AutoPiloto ap = new AutoPiloto();
        ap.setAuto(auto);
        ap.setPiloto(piloto);
        ap.setFechaAsignacion(fecha);
        ap.setCarrera(carreraActual);

        gestion.addAutoPiloto(ap);
        carreraActual.getAutoPiloto().add(ap);
    }

    /**
     * Calcula el ranking de pilotos basado en sus resultados en todas las
     * carreras.
     *
     * @return Una {@link List} de {@link Piloto} ordenada descendentemente por
     * puntos.
     */
    public List<Piloto> rankingPilotos() {

        for (Piloto p : gestion.getPilotos()) {
            p.setPuntos(0);
        }

        List<AutoPiloto> todosLosResultados = gestion.getAutoPilotos();
        for (AutoPiloto res : todosLosResultados) {
            Piloto pilotoDelResultado = res.getPiloto();
            int posicionFinal = res.getPosicionFinal();

            int puntosGanados = puntosSegunPosicion(posicionFinal);

            pilotoDelResultado.sumarPuntos(puntosGanados);
        }

        List<Piloto> ranking = new ArrayList<>(gestion.getPilotos());

        ranking.sort((p1, p2) -> Integer.compare(p2.getPuntos(), p1.getPuntos()));

        return ranking;
    }

    /**
     * Convierte una posición final de carrera en puntos de campeonato.
     *
     * @param posicion La posición final (1, 2, 3...).
     * @return La cantidad de puntos correspondientes.
     */
    public int puntosSegunPosicion(int posicion) {
        switch (posicion) {
            case 1:
                return 25;
            case 2:
                return 18;
            case 3:
                return 15;
            case 4:
                return 12;
            case 5:
                return 10;
            case 6:
                return 8;
            case 7:
                return 6;
            case 8:
                return 4;
            case 9:
                return 2;
            case 10:
                return 1;
            default:
                return 0;
        }
    }

    /**
     * Obtiene el auto principal de un piloto. (Nota: Esta lógica es
     * simplificada, solo devuelve el primer auto encontrado en el historial de
     * resultados).
     *
     * @param p El {@link Piloto} a buscar.
     * @return El {@link Auto} encontrado, o {@code null}.
     */
    public Auto obtenerAutoDePiloto(Piloto p) {
        for (AutoPiloto ap : gestion.getAutoPilotos()) {
            if (ap.getPiloto().equals(p)) {
                return ap.getAuto();
            }
        }
        return null;
    }

    /**
     * Busca carreras dentro de un rango de fechas.
     *
     * @param fechaDesde Fecha de inicio (objeto {@link Date}).
     * @param fechaHasta Fecha de fin (objeto {@link Date}).
     * @return una {@link List} de {@link Carrera} filtrada.
     */
    public List<Carrera> buscarCarrerasPorFechas(Date fechaDesde, Date fechaHasta) {

        java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("yyyyMMdd");
        String fechaDesdeStr = formato.format(fechaDesde);
        String fechaHastaStr = formato.format(fechaHasta);

        return gestion.traerCarrerasPorRango(fechaDesdeStr, fechaHastaStr);
    }

    /**
     * Obtiene todos los resultados ({@link AutoPiloto}) de una {@link Carrera}
     * específica.
     *
     * @param c La {@link Carrera} de la cual se quieren los resultados.
     * @return una {@link List} de {@link AutoPiloto}.
     */
    public List<AutoPiloto> getResultadosDeLaCarrera(Carrera c) {
        return gestion.traerResultadosDeCarrera(c);
    }

    /**
     * Calcula las estadísticas (victorias y podios) para un piloto específico.
     *
     * @param piloto El {@link Piloto} a analizar.
     * @return Un array de `int` (`int[]`) donde:
     * <ul>
     * <li>Índice 0: Total de Victorias (P1)</li>
     * <li>Índice 1: Total de Podios (P1, P2 o P3)</li>
     * </ul>
     */
    public int[] calcularEstadisticas(Piloto piloto) {

        List<AutoPiloto> resultadosDelPiloto = gestion.traerResultadosDePiloto(piloto);

        int contadorVictorias = 0;
        int contadorPodios = 0;

        for (AutoPiloto res : resultadosDelPiloto) {
            int posicion = res.getPosicionFinal();

            if (posicion == 1) {
                contadorVictorias++;
                contadorPodios++;
            } else if (posicion == 2 || posicion == 3) {
                contadorPodios++;
            }
        }

        int[] estadisticas = new int[2];
        estadisticas[0] = contadorVictorias;
        estadisticas[1] = contadorPodios;

        return estadisticas;
    }

    /**
     * Registra una nueva relación histórica (contrato) entre un Piloto y una
     * Escudería. Valida que el piloto no tenga ya una relación activa con otra
     * escudería.
     *
     * @param piloto El {@link Piloto} a asignar.
     * @param escuderia La {@link Escuderia} a la que se asigna.
     * @param fechaDesde La fecha (String) de inicio del contrato.
     * @throws RuntimeException si el piloto ya está asignado a otra escudería.
     */
    public void registrarPilotoEnEscuderia(Piloto piloto, Escuderia escuderia, String fechaDesde) {

        for (PilotoEscuderia pe : gestion.getPilotosEscuderia()) {
            if (pe.getPiloto().equals(piloto)
                    && (pe.getHastaFecha() == null || pe.getHastaFecha().isEmpty())) {

                if (!pe.getEscuderia().equals(escuderia)) {
                    throw new RuntimeException("El piloto ya está asignado a otra escudería ("
                            + pe.getEscuderia().getNombre() + "). Debe cerrar ese período primero.");
                }
            }
        }

        PilotoEscuderia nuevaRelacion = new PilotoEscuderia(fechaDesde, "", escuderia, piloto);

        gestion.getPilotosEscuderia().add(nuevaRelacion);
        escuderia.getListaPilotoEscuderia().add(nuevaRelacion);
    }

    /**
     * Devuelve la fecha actual en formato "yyyy-MM-dd".
     *
     * @return un {@link String} con la fecha.
     */
    public String fechaActual() {
        java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd");
        return f.format(new Date());
    }

    /**
     * Obtiene un informe de todos los autos usados por una escudería específica
     * en todas las carreras.
     *
     * @param escuderiaBuscada La {@link Escuderia} a filtrar.
     * @return Una {@link List} de {@link AutoPiloto} (resultados) que
     * involucran a esa escudería.
     */
    public List<AutoPiloto> getResultadosPorEscuderia(Escuderia escuderiaBuscada) {
        List<AutoPiloto> resultadosEncontrados = new ArrayList<>();
        List<AutoPiloto> todosLosResultados = gestion.getAutoPilotos();

        for (AutoPiloto res : todosLosResultados) {
            Auto autoUsado = res.getAuto();
            if (autoUsado != null) {
                Escuderia escuderiaDelAuto = autoUsado.getEscuderia();

                if (escuderiaDelAuto != null && escuderiaDelAuto.equals(escuderiaBuscada)) {
                    resultadosEncontrados.add(res);
                }
            }
        }
        return resultadosEncontrados;
    }

    /**
     * Devuelve la lista completa del historial Piloto-Escudería.
     *
     * @return una {@link List} de {@link PilotoEscuderia}.
     */
    public List<PilotoEscuderia> traerPilotosEscuderia() {
        return gestion.getPilotosEscuderia();
    }

    /**
     * Obtiene un informe de todos los mecánicos que trabajan (o trabajaron)
     * para una escudería específica.
     *
     * @param escuderiaBuscada La {@link Escuderia} a filtrar.
     * @return Una {@link List} de {@link Mecanico} que coinciden.
     */
    public List<Mecanico> getMecanicosPorEscuderia(Escuderia escuderiaBuscada) {
        List<Mecanico> mecanicosEncontrados = new ArrayList<>();

        for (Mecanico m : gestion.getMecanico()) {
            if (m.getListaEscuderia().contains(escuderiaBuscada)) {
                mecanicosEncontrados.add(m);
            }
        }
        return mecanicosEncontrados;
    }

    /**
     * Busca una Carrera específica por su 'valor' (ID).
     *
     * @param valor El ID (valor) de la carrera a buscar.
     * @return El objeto {@link Carrera} encontrado, o {@code null}.
     */
    public Carrera buscarCarreraPorValor(int valor) {
        return gestion.buscarCarreraPorValor(valor);
    }

    /**
     * Guarda el resultado final (posición y vuelta rápida) de un piloto en una
     * carrera específica. Busca la inscripción ({@link AutoPiloto}) existente y
     * actualiza sus atributos de resultado.
     *
     * @param piloto El {@link Piloto} cuyo resultado se guarda.
     * @param carrera La {@link Carrera} en la que participó.
     * @param posicion La posición final (ej: 1, 2, 3...).
     * @param vueltaRapida {@code true} si hizo la vuelta rápida, {@code false}
     * en caso contrario.
     * @throws RuntimeException si no se encuentra la inscripción (AutoPiloto)
     * de ese piloto para esa carrera.
     */
    public void guardarResultado(Piloto piloto, Carrera carrera, int posicion, boolean vueltaRapida) {

        AutoPiloto inscripcionAActualizar = null;

        List<AutoPiloto> inscripciones = gestion.traerResultadosDeCarrera(carrera);
        for (AutoPiloto ap : inscripciones) {

            if (ap.getPiloto().equals(piloto)) {
                inscripcionAActualizar = ap;
                break;
            }
        }

        if (inscripcionAActualizar != null) {
            inscripcionAActualizar.setPosicionFinal(posicion);
            inscripcionAActualizar.setHizoVueltaRapida(vueltaRapida);
        } else {

            throw new RuntimeException("Error: No se encontró la inscripción para "
                    + piloto.getNombre() + " en la carrera "
                    + carrera.getCircuito().getNombre());
        }
    }
}
