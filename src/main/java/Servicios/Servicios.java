package Servicios;

import Modelo.Auto;
import Modelo.Carrera;
import Modelo.Circuito;
import Modelo.Escuderia;
import Modelo.Especialidad;
import Modelo.Mecanico;
import Modelo.Pais;
import Modelo.Piloto;
import Persistencia.GestionDeDatos;
import java.util.List;

public class Servicios {
    
    private GestionDeDatos gestion = new GestionDeDatos();
    
    public void registrarAuto(String motor, String modelo){
        Auto auto = new Auto();
        int valor = gestion.getAutos().size() + 1;
        auto.setModelo(modelo);
        auto.setValor(valor);
        auto.setMotor(motor);
        gestion.agregarAuto(auto);
    }
    public void registrarPiloto(String nombre, String apellido, String dni, Pais pais, int numeroCompetencias){
        Piloto piloto= new Piloto();
        piloto.setNombre(nombre);
        piloto.setApellido(apellido);
        piloto.setDni(dni);
        piloto.setPais(pais);
        piloto.setNumeroCompetencia(numeroCompetencias);
        gestion.agregarPiloto(piloto);
    }
    public void registrarCircuito(String nombre, int longitud){
        Circuito circuito = new Circuito();
        int valor = gestion.getCircuitos().size() + 1;
        circuito.setValor(valor);
        circuito.setLongitud(longitud);
        circuito.setNombre(nombre);
        gestion.agregarCircuitos(circuito);
    }
    public void registrarCarrera(Circuito circuito, String fecha, String hora, int numeroVueltas, Pais pais ){
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
    public void registrarEscuderia(String nombre, Pais pais){
        Escuderia escuderia = new Escuderia();
        int valor = gestion.getEscuderias().size() + 1;
        escuderia.setValor(valor);
        escuderia.setNombre(nombre);
        escuderia.setPais(pais);
        gestion.agregarEscuderia(escuderia);
    }
    public void registrarMecanico(String nombre, String apellido, Pais pais,String dni, int aniosExperiencia, Especialidad especialidad){
        Mecanico mecanico = new Mecanico();
        mecanico.setNombre(nombre);
        mecanico.setApellido(apellido);
        mecanico.setDni(dni);
        mecanico.setPais(pais);
        mecanico.setAniosExperiencia(aniosExperiencia);
        mecanico.setEspecialidad(especialidad);
        gestion.agregarMecanico(mecanico);
    }
    public void registrarPais(String nombre){
        Pais pais = new Pais();
        int valor = gestion.getPaises().size() + 1;
        pais.setValor(valor);
        pais.setDescripcion(nombre);
        gestion.agregarPais(pais);
    }
    public void registroResultadoCarreras(String posicion, int puntos){
        
    }
    
    
    public void modificarPiloto(String nombre, String apellido, Pais pais, String dni, int numeroCompetencias, String dniViejo){
        System.out.println("Entro al metodo");
        for(Piloto e : gestion.getPilotos()){
            System.out.println("Buscando piloto");
            if(e.getDni().equals(dniViejo)){   
                System.out.println("Se encontro el objeto");
               e.setApellido(apellido);
               e.setNombre(nombre);
               e.setPais(pais);
               e.setDni(dni);
               e.setNumeroCompetencia(numeroCompetencias);
               break;
            }else{
                System.out.println("No se encontro al piloto");
            }
        }
    }
    public void modificarAuto(String modelo, String motor, int id, int valor){
        for(Auto a : gestion.getAutos()){
            if(a.getValor() == valor){
                a.setModelo(modelo);
                a.setMotor(motor);
                break;
            }
        }
    }
    public void modificarCircuito(String nombre, int longitud, String nombreTabla){
        for(Circuito c : gestion.getCircuitos()){
            if(c.getNombre().equals(nombreTabla)){
                c.setLongitud(longitud);
                c.setNombre(nombre);
                break;
            }
        }
    }
    public void modificarCarrera(String fecha, String hora, int numeroVueltas, Circuito circuito, int valor){
        for(Carrera c : gestion.getCarreras()){
            if(c.getValor() == valor){
                c.setCircuito(circuito);
                c.setFechaRealizacion(fecha);
                c.setHoraRealizacion(hora);
                c.setNumeroVueltas(numeroVueltas);
                break;
            }
        }
    }
    public void modificarEscuderia(String nombre, Pais pais, int valor){
        for(Escuderia e : gestion.getEscuderias()){
            if(e.getValor() == valor){
                e.setNombre(nombre);
                e.setPais(pais);
                break;
            }
        }
    }
    public void mofidicarMecanico(String nombre, String apellido, Pais pais, String dni, int aniosExperencia, Especialidad especialidad){
        for(Mecanico m : gestion.getMecanico()){
            if(m.getDni().equals(dni)){
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
    public List<Piloto> traerPilotos(){
        return gestion.getPilotos();
    }
    
    public void eliminarPiloto(String Dni){
        for(Piloto p : gestion.getPilotos()){
              if(p.getDni().equals(Dni)){
                  gestion.removePiloto(p);
                  break;
            }
        }
    }
    public void eliminarAuto(int valor){
        for(Auto a : gestion.getAutos()){
            if(valor == a.getValor()){
                gestion.removeAuto(a);
                break;
            }
        }
    }
    public void eliminarCircuito(int valor){
        for(Circuito c : gestion.getCircuitos()){
            if(valor == c.getValor()){
               gestion.removeCircuito(c);
               break;
            }
        }
    }
    public void eliminarCarrera(int valor){
        for(Carrera c: gestion.getCarreras()){
            if(valor == c.getValor()){
                gestion.removeCarreras(c);
                break;
            }
        }
    }
    public void eliminarEscuderia(int valor){
        for(Escuderia e : gestion.getEscuderias()){
            if(e.getValor() == valor){
                gestion.removeEscuderia(e);
                break;
            }
        }
        
    } 
    public void eliminarMecanico(String Dni){
        for(Mecanico m : gestion.getMecanico()){
            if(m.getDni().equals(Dni)){
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
        for(Piloto p : gestion.getPilotos()){
            if(p.getDni().equals(dniViejo)){
                piloto = p;
            }
        }
        return piloto;
    }
    public List<Mecanico> traerMecanicos(){
        return gestion.getMecanico();
    }
    public Mecanico buscarMecanicoPorDni(String dniViejo) {
        Mecanico mecanico = new Mecanico();
        for(Mecanico m : gestion.getMecanico()){
            if(m.getDni().equals(dniViejo)){
                mecanico = m;
            }
        }
        return mecanico;
    }

    public List<Carrera> traerCarreras(){
        return gestion.getCarreras();
    }

    public List<Circuito> traerCircuitos() {
        return gestion.getCircuitos();
    }

    public void modificarPais(String nombre, int valor) {
        for(Pais p : gestion.getPaises()){
            if(p.getValor()== valor){
                p.setDescripcion(nombre);
                break;
            }
        }
    }

    public void eliminarPais(int valor) {
        for(Pais p : gestion.getPaises()){
            if(p.getValor() == valor){
                gestion.removePaises(p);
            }
        }
    }
}
