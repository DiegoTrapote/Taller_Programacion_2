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
import Persistencia.GestionDeDatos;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Servicios {

    private GestionDeDatos gestion = new GestionDeDatos();

    public void registrarAuto(String motor, String modelo) {
        Auto auto = new Auto();
        int valor = gestion.getAutos().size() + 1;
        auto.setModelo(modelo);
        auto.setValor(valor);
        auto.setMotor(motor);
        gestion.agregarAuto(auto);
    }

    public void registrarPiloto(String nombre, String apellido, String dni, Pais pais, int numeroCompetencias) {
        Piloto piloto = new Piloto();
        piloto.setNombre(nombre);
        piloto.setApellido(apellido);
        piloto.setDni(dni);
        piloto.setPais(pais);
        piloto.setNumeroCompetencia(numeroCompetencias);
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

    public void registrarMecanico(String nombre, String apellido, Pais pais, String dni, int aniosExperiencia, Especialidad especialidad) {
        Mecanico mecanico = new Mecanico();
        mecanico.setNombre(nombre);
        mecanico.setApellido(apellido);
        mecanico.setDni(dni);
        mecanico.setPais(pais);
        mecanico.setAniosExperiencia(aniosExperiencia);
        mecanico.setEspecialidad(especialidad);
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

    public void modificarPiloto(String nombre, String apellido, Pais pais, String dni, int numeroCompetencias, String dniViejo) {
        System.out.println("Entro al metodo");
        for (Piloto e : gestion.getPilotos()) {
            System.out.println("Buscando piloto");
            if (e.getDni().equals(dniViejo)) {
                System.out.println("Se encontro el objeto");
                e.setApellido(apellido);
                e.setNombre(nombre);
                e.setPais(pais);
                e.setDni(dni);
                e.setNumeroCompetencia(numeroCompetencias);
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

    public List<Escuderia> traerEscuderia() {
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
        for (Carrera c : gestion.getCarreras()) {
            if (c.getValor() == valor) {
                for (AutoPiloto a : c.getAutoPiloto()) {
                    if (a.getPiloto().equals(piloto)) {
                        c.getAutoPiloto().remove(a);
                        break;
                    }
                }
            }
        }
    }

    public void inscribirPilotoEnCarrera(Piloto piloto, Auto auto, String fecha, int valor) {
        AutoPiloto ap = new AutoPiloto();
        ap.setAuto(auto);
        ap.setPiloto(piloto);
        ap.setFechaAsignacion(fecha);
        for (Carrera c : gestion.getCarreras()) {
            c.getAutoPiloto().add(ap);
            break;
        }
    }

    public List<Piloto> rankingPilotos() {
        // Primero ponemos los puntos de todos los pilotos en 0
        for (Piloto p : gestion.getPilotos()) {   // tu lista original de pilotos
            p.setPuntos(0);
        }

        // Ahora sumamos puntos según los resultados
        for (Piloto p : gestion.getPilotos()) {
            int puntos = puntosSegunPosicion(p.getPolePosition()); // usa la posición del piloto
            p.sumarPuntos(puntos);
        }

        // Hacemos una copia de la lista para no alterar la original
        List<Piloto> ranking = new ArrayList<>(gestion.getPilotos());

        // Ordenamos por puntos desc
        ranking.sort((p1, p2) -> Integer.compare(p2.getPuntos(), p1.getPuntos()));

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
}
