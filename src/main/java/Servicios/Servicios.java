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

public class Servicios {

    private GestionDeDatos gestion;

    public Servicios(GestionDeDatos gestion) {
        this.gestion = gestion;
    }

    public GestionDeDatos getGestion() {
        return this.gestion;
    }

    public void registrarAuto(String motor, String modelo) {
        Auto auto = new Auto();
        int valor = gestion.getAutos().size() + 1;
        auto.setModelo(modelo);
        auto.setValor(valor);
        auto.setMotor(motor);
        gestion.agregarAuto(auto);
    }

    public void registrarPiloto(String nombre, String apellido, String dni, Pais pais) {
        Piloto piloto = new Piloto();
        piloto.setNombre(nombre);
        piloto.setApellido(apellido);
        piloto.setDni(dni);
        piloto.setPais(pais);

        gestion.agregarPiloto(piloto);
    }

    public void registrarCircuito(String nombre, int longitud) {
        Circuito circuito = new Circuito();
        int valor = gestion.getCircuitos().size() + 1;
        circuito.setValor(valor);
        circuito.setLongitud(longitud);
        circuito.setNombre(nombre);
        gestion.agregarCircuitos(circuito);
    }

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

    public void registrarEscuderia(String nombre, Pais pais) {
        Escuderia escuderia = new Escuderia();
        int valor = gestion.getEscuderias().size() + 1;
        escuderia.setValor(valor);
        escuderia.setNombre(nombre);
        escuderia.setPais(pais);
        gestion.agregarEscuderia(escuderia);
    }

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

    public void registrarPais(String nombre) {
        Pais pais = new Pais();
        int valor = gestion.getPaises().size() + 1;
        pais.setValor(valor);
        pais.setDescripcion(nombre);
        gestion.agregarPais(pais);
    }

    public void registroResultadoCarreras(String posicion, int puntos) {

    }

    public void modificarPiloto(String nombre, String apellido, Pais pais, String dni, String dniViejo) {
        System.out.println("Entro al metodo");
        for (Piloto e : gestion.getPilotos()) {
            System.out.println("Buscando piloto");
            if (e.getDni().equals(dniViejo)) {
                System.out.println("Se encontro el objeto");
                e.setApellido(apellido);
                e.setNombre(nombre);
                e.setPais(pais);
                e.setDni(dni);

                break;
            } else {
                System.out.println("No se encontro al piloto");
            }
        }
    }

    public void modificarAuto(String modelo, String motor, int valor) {
        for (Auto a : gestion.getAutos()) {
            if (a.getValor() == valor) {
                a.setModelo(modelo);
                a.setMotor(motor);
                break;
            }
        }
    }

    public void modificarCircuito(String nombre, int longitud, String nombreTabla) {
        for (Circuito c : gestion.getCircuitos()) {
            if (c.getNombre().equals(nombreTabla)) {
                c.setLongitud(longitud);
                c.setNombre(nombre);
                break;
            }
        }
    }

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

    public void modificarEscuderia(String nombre, Pais pais, String nombreV) {
        for (Escuderia e : gestion.getEscuderias()) {
            if (e.getNombre().equals(nombreV)) {
                e.setNombre(nombre);
                e.setPais(pais);
                break;
            }
        }
    }

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

    public List<Piloto> traerPilotos() {
        return gestion.getPilotos();
    }

    public void eliminarPiloto(String Dni) {
        for (Piloto p : gestion.getPilotos()) {
            if (p.getDni().equals(Dni)) {
                gestion.removePiloto(p);
                break;
            }
        }
    }

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

    public void eliminarCircuito(String nombre) {
        for (Circuito c : gestion.getCircuitos()) {
            if (nombre.equalsIgnoreCase(c.getNombre())) {
                gestion.removeCircuito(c);
                break;
            }
        }
    }

    public void eliminarCarrera(int valor) {
        // Primero eliminamos la carrera con ese valor
        Carrera carreraAEliminar = null;

        for (Carrera c : gestion.getCarreras()) {
            if (c.getValor() == valor) {
                carreraAEliminar = c;
                break;
            }
        }
        if (carreraAEliminar != null) {
            gestion.removeCarreras(carreraAEliminar);

            // Ahora actualizamos los valores de las siguientes carreras
            for (Carrera c : gestion.getCarreras()) {
                if (c.getValor() > valor) {
                    c.setValor(c.getValor() - 1);
                }
            }
        }
    }

    public void eliminarEscuderia(String nombre) {
        for (Escuderia e : gestion.getEscuderias()) {
            if (e.getNombre().equals(nombre)) {
                gestion.removeEscuderia(e);
                break;
            }
        }

    }

    public void eliminarMecanico(String Dni) {
        for (Mecanico m : gestion.getMecanico()) {
            if (m.getDni().equals(Dni)) {
                gestion.removeMecanicos(m);
                break;
            }
        }
    }

    public List<Pais> traerPaises() {
        return gestion.getPaises();

    }

    public Piloto buscarPilotoPorDni(String dniViejo) {
        Piloto piloto = new Piloto();
        for (Piloto p : gestion.getPilotos()) {
            if (p.getDni().equals(dniViejo)) {
                piloto = p;
            }
        }
        return piloto;
    }

    public List<Mecanico> traerMecanicos() {
        return gestion.getMecanico();
    }

    public Mecanico buscarMecanicoPorDni(String dniViejo) {
        Mecanico mecanico = new Mecanico();
        for (Mecanico m : gestion.getMecanico()) {
            if (m.getDni().equals(dniViejo)) {
                mecanico = m;
            }
        }
        return mecanico;
    }

    public List<Carrera> traerCarreras() {
        return gestion.getCarreras();
    }

    public List<Circuito> traerCircuitos() {
        return gestion.getCircuitos();
    }

    public void modificarPais(String nombre, String nombreViejo) {
        for (Pais p : gestion.getPaises()) {
            if (p.getDescripcion().equals(nombreViejo)) {
                p.setDescripcion(nombre);
                break;
            }
        }
    }

    public void eliminarPais(String nombre) {
        for (Pais p : gestion.getPaises()) {
            if (p.getDescripcion().equals(nombre)) {
                gestion.removePaises(p);
            }
        }
    }

    public List<Escuderia> traerEscuderias() {
        return gestion.getEscuderias();
    }

    public Escuderia buscarEscuderiaPorNombre(String nombre) {
        for (Escuderia e : gestion.getEscuderias()) {
            if (e.getNombre().equals(nombre)) {
                return e;
            }
        }
        return null; // si no la encuentra
    }

    public List<Auto> traerAutos() {
        return gestion.getAutos();
    }

    public void darDeBajaPiloto(Piloto piloto, int valor) {
        // 1. Encontrar la carrera a la que pertenece el 'valor'
        Carrera carreraActual = null;
        for (Carrera c : gestion.getCarreras()) {
            if (c.getValor() == valor) {
                carreraActual = c;
                break;
            }
        }
        if (carreraActual == null) {
            return; // No se encontró la carrera
        }
        // 2. Encontrar la inscripción a remover
        AutoPiloto inscripcionARemover = null;

        // 3. ¡BUSCAR EN LA LISTA GLOBAL!
        for (AutoPiloto ap : gestion.getAutoPilotos()) {

            // Comprueba si es de la carrera actual Y del piloto actual
            // (Esto ahora funciona gracias a tu .equals() en Carrera.java)
            if (ap.getCarrera().equals(carreraActual) && ap.getPiloto().equals(piloto)) {
                inscripcionARemover = ap;
                break; // Lo encontramos
            }
        }

        // 4. Si se encontró, eliminarlo de la lista global
        if (inscripcionARemover != null) {

            // Llama al método de persistencia
            gestion.removeAutoPiloto(inscripcionARemover);

            // (Opcional pero bueno) Eliminarlo también de la lista interna
            carreraActual.getAutoPiloto().remove(inscripcionARemover);
        }
    }

    public void inscribirPilotoEnCarrera(Piloto piloto, Auto auto, String fecha, int valor) {
        /// 1. Encontrar la carrera CORRECTA usando el 'valor'
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

        // --- 2. NUEVA VALIDACIÓN DE FECHAS ---
        //    (Convertimos los Strings 'aaaammdd' a números para comparar)
        int fechaInscripcion = Integer.parseInt(fecha);
        int fechaDeLaCarrera = Integer.parseInt(carreraActual.getFechaRealizacion());

        if (fechaInscripcion >= fechaDeLaCarrera) {
            throw new RuntimeException("La fecha de inscripción (" + fecha
                    + ") debe ser ANTERIOR a la fecha de la carrera ("
                    + carreraActual.getFechaRealizacion() + ").");
        }
        // --- FIN DE LA NUEVA VALIDACIÓN ---

        // 3. Traer la lista de inscriptos ACTUALES para ESTA carrera
        List<AutoPiloto> inscripciones = gestion.traerResultadosDeCarrera(carreraActual);

        // 4. --- BUCLE DE VALIDACIÓN (El que ya tenías) ---
        for (AutoPiloto inscripcionExistente : inscripciones) {

            // REGLA 1: ¿El piloto ya está inscripto?
            if (inscripcionExistente.getPiloto().equals(piloto)) {
                throw new RuntimeException("El piloto " + piloto.getNombre() + " ya está inscripto en esta carrera.");
            }

            // REGLA 2: ¿El auto ya está asignado?
            if (inscripcionExistente.getAuto().equals(auto)) {
                throw new RuntimeException("El auto " + auto.getModelo() + " ya está asignado a otro piloto en esta carrera.");
            }
        }

        // 5. Si pasa todas las validaciones, creamos la inscripción
        AutoPiloto ap = new AutoPiloto();
        ap.setAuto(auto);
        ap.setPiloto(piloto);
        ap.setFechaAsignacion(fecha);
        ap.setCarrera(carreraActual); // ¡Importante! Asignar la carrera

        // 6. Agregar la inscripción a las listas
        gestion.addAutoPiloto(ap);                // A la lista global
        carreraActual.getAutoPiloto().add(ap);
    }

    public List<Piloto> rankingPilotos() {
        // 1. Pone los puntos de todos los pilotos en 0
        //    (Asumo que tienes un método 'setPuntos' en tu clase Piloto)
        for (Piloto p : gestion.getPilotos()) {
            p.setPuntos(0);
        }

        // 2. Trae la lista de TODOS los resultados de TODAS las carreras
        List<AutoPiloto> todosLosResultados = gestion.getAutoPilotos();

        // 3. Recorre cada resultado para sumar puntos
        for (AutoPiloto res : todosLosResultados) {

            Piloto pilotoDelResultado = res.getPiloto();
            int posicionFinal = res.getPosicionFinal();

            // 4. Llama a tu "traductor" de puntos
            int puntosGanados = puntosSegunPosicion(posicionFinal);

            // 5. Suma los puntos al piloto
            //    (Asumo que tienes un método 'sumarPuntos' o similar en Piloto)
            pilotoDelResultado.sumarPuntos(puntosGanados);
        }

        // 6. Hacemos una copia de la lista para ordenarla
        List<Piloto> ranking = new ArrayList<>(gestion.getPilotos());

        // 7. Ordenamos la lista (de mayor a menor puntaje)
        //    (Asumo que tienes un 'getPuntos()' en Piloto)
        ranking.sort((p1, p2) -> Integer.compare(p2.getPuntos(), p1.getPuntos()));

        // 8. Devuelve la lista ordenada
        return ranking;
    }

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

    public Auto obtenerAutoDePiloto(Piloto p) {
        for (AutoPiloto ap : gestion.getAutoPilotos()) {
            if (ap.getPiloto().equals(p)) {
                return ap.getAuto();
            }
        }
        return null;
    }

    public List<Carrera> buscarCarrerasPorFechas(Date fechaDesde, Date fechaHasta) {
        // 2. CONVERTIR los Date de la GUI al formato 'aaaammdd'
        java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("yyyyMMdd");
        String fechaDesdeStr = formato.format(fechaDesde);
        String fechaHastaStr = formato.format(fechaHasta);

        // 3. Llamar a tu clase de persistencia con los Strings
        return gestion.traerCarrerasPorRango(fechaDesdeStr, fechaHastaStr);
    }

    public List<AutoPiloto> getResultadosDeLaCarrera(Carrera c) {
        return gestion.traerResultadosDeCarrera(c);
    }

    public int[] calcularEstadisticas(Piloto piloto) {

        // 1. Pedimos a la persistencia todos los resultados de ESE piloto
        List<AutoPiloto> resultadosDelPiloto = gestion.traerResultadosDePiloto(piloto);

        // 2. Preparamos los contadores
        int contadorVictorias = 0;
        int contadorPodios = 0;

        // 3. Recorremos los resultados y contamos
        for (AutoPiloto res : resultadosDelPiloto) {
            int posicion = res.getPosicionFinal();

            if (posicion == 1) {
                contadorVictorias++;
                contadorPodios++; // (Una victoria también es un podio)
            } else if (posicion == 2 || posicion == 3) {
                contadorPodios++;
            }
        }

        // 4. Preparamos el array de resultados
        int[] estadisticas = new int[2];
        estadisticas[0] = contadorVictorias; // Victorias en el índice 0
        estadisticas[1] = contadorPodios;   // Podios en el índice 1

        return estadisticas;
    }

    public void registrarPilotoEnEscuderia(Piloto piloto, Escuderia escuderia, String fechaDesde) {

        // Primero verificamos que el piloto no tenga una relación activa en otra escudería
        for (PilotoEscuderia pe : gestion.getPilotosEscuderia()) {
            if (pe.getPiloto().equals(piloto)
                    && (pe.getHastaFecha() == null || pe.getHastaFecha().isEmpty())) {

                if (!pe.getEscuderia().equals(escuderia)) {
                    throw new RuntimeException("El piloto ya está asignado a otra escudería ("
                            + pe.getEscuderia().getNombre() + "). Debe cerrar ese período primero.");
                }
            }
        }
        // Si pasa la validación → Creamos la nueva relación
        PilotoEscuderia nuevaRelacion = new PilotoEscuderia(fechaDesde, "", escuderia, piloto);

        // Guardamos la relación
        gestion.getPilotosEscuderia().add(nuevaRelacion);

        // También agregamos el piloto a la escudería (opcional pero recomendado)
        escuderia.getListaPilotoEscuderia().add(nuevaRelacion);
    }

    public String fechaActual() {
        java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd");
        return f.format(new Date());
    }

    public List<AutoPiloto> getResultadosPorEscuderia(Escuderia escuderiaBuscada) {

        // 1. Prepara la lista de resultados que coinciden
        List<AutoPiloto> resultadosEncontrados = new ArrayList<>();

        // 2. Obtiene la lista GLOBAL de todos los resultados
        //    (¡Este es el cambio clave!)
        List<AutoPiloto> todosLosResultados = gestion.getAutoPilotos();

        // 3. Bucle Nivel 1: Recorre todos los resultados
        for (AutoPiloto res : todosLosResultados) {

            // 4. Conexión: Obtiene el auto de esa inscripción
            Auto autoUsado = res.getAuto();

            // (Asegúrate de que autoUsado no sea nulo)
            if (autoUsado != null) {

                // 5. Conexión: Obtiene la escudería de ESE auto
                Escuderia escuderiaDelAuto = autoUsado.getEscuderia();

                // 6. ¡LA COMPARACIÓN!
                // (Esto fallará si no haces el Arreglo #2 de abajo)
                if (escuderiaDelAuto != null && escuderiaDelAuto.equals(escuderiaBuscada)) {

                    // 7. ¡Coincidencia! Agrega este resultado a la lista
                    resultadosEncontrados.add(res);
                }
            }
        }

        // 8. Devuelve la lista filtrada
        return resultadosEncontrados;
    }

    public List<PilotoEscuderia> traerPilotosEscuderia() {
        return gestion.getPilotosEscuderia();
    }

    public List<Mecanico> getMecanicosPorEscuderia(Escuderia escuderiaBuscada) {

        List<Mecanico> mecanicosEncontrados = new ArrayList<>();

        // Recorre la lista COMPLETA de mecánicos
        // (Asegúrate de que gestion.getMecanico() exista y devuelva la lista)
        for (Mecanico m : gestion.getMecanico()) {

            // Revisa si la lista de escuderías del mecánico CONTIENE la que buscamos
            // (Esto usa el .getListaEscuderia() de tu clase Mecanico)
            if (m.getListaEscuderia().contains(escuderiaBuscada)) {
                mecanicosEncontrados.add(m);
            }
        }
        return mecanicosEncontrados;
    }

    public Carrera buscarCarreraPorValor(int valor) {
        return gestion.buscarCarreraPorValor(valor);
    }

    public void guardarResultado(Piloto piloto, Carrera carrera, int posicion, boolean vueltaRapida) {

        // 1. Encontrar la inscripción (AutoPiloto) que coincida
        AutoPiloto inscripcionAActualizar = null;

        // 2. Buscar en la lista GLOBAL de resultados
        //    (Llama al método de persistencia que ya tienes)
        List<AutoPiloto> inscripciones = gestion.traerResultadosDeCarrera(carrera);

        for (AutoPiloto ap : inscripciones) {

            // Comprueba si esta inscripción es del piloto que buscamos
            if (ap.getPiloto().equals(piloto)) {
                inscripcionAActualizar = ap;
                break;
            }
        }

        // 3. Si se encuentra, actualizar los datos
        if (inscripcionAActualizar != null) {
            // (Asegúrate de tener estos setters en tu clase AutoPiloto)
            inscripcionAActualizar.setPosicionFinal(posicion);
            inscripcionAActualizar.setHizoVueltaRapida(vueltaRapida);

            System.out.println("Resultado guardado para: " + piloto.getNombre());

        } else {
            // Esto no debería pasar si la GUI está bien hecha
            throw new RuntimeException("Error: No se encontró la inscripción para "
                    + piloto.getNombre() + " en la carrera "
                    + carrera.getCircuito().getNombre());
        }
    }
}
