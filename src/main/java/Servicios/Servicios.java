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
        auto.setModelo(modelo);
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
        circuito.setLongitud(longitud);
        circuito.setNombre(nombre);
        gestion.agregarCircuitos(circuito);
    }
    public void registrarCarrera(Circuito circuito, String fecha, String hora, int numeroVueltas ){
        Carrera carrera = new Carrera();
        carrera.setCircuito(circuito);
        carrera.setFechaRealizacion(fecha);
        carrera.setHoraRealizacion(hora);
        carrera.setNumeroVueltas(numeroVueltas);
        gestion.agregarCarrera(carrera);
    }
    public void registrarEscuderia(String nombre, Pais pais){
        Escuderia escuderia = new Escuderia();
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
        pais.setDescripcion(nombre);
        gestion.agregarPais(pais);
    }
    public void registroResultadoCarreras(String posicion, int puntos){
        
    }
    
    
    public void modificarPiloto(String nombre, String apellido, Pais pais, String dni, int id, int numeroCompetencias){
        System.out.println("Entro al metodo");
        for(Piloto e : gestion.getPilotos()){
            System.out.println("Buscando piloto");
            if(e.getID() == id){   
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
    public void modificarAuto(String modelo, String motor, int id){
        for(Auto a : gestion.getAutos()){
            if(a.getID() == id){
                a.setModelo(modelo);
                a.setMotor(motor);
                break;
            }
        }
    }
    public void modificarCircuito(String nombre, int longitud, int id){
        for(Circuito c : gestion.getCircuito()){
            if(c.getID() == id){
                c.setLongitud(longitud);
                c.setNombre(nombre);
                break;
            }
        }
    }
    public void modificarCarrera(String fecha, String hora, int numeroVueltas, int id, Circuito circuito){
        for(Carrera c : gestion.getCarrera()){
            if(c.getID() == id){
                c.setCircuito(circuito);
                c.setFechaRealizacion(fecha);
                c.setHoraRealizacion(hora);
                c.setNumeroVueltas(numeroVueltas);
                break;
            }
        }
    }
    public void modificarEscuderia(String nombre, Pais pais, int id){
        for(Escuderia e : gestion.getEscuderias()){
            if(e.getID() == id){
                e.setNombre(nombre);
                e.setPais(pais);
                break;
            }
        }
    }
    public void mofidicarMecanico(String nombre, String apellido, Pais pais, String dni, int aniosExperencia, Especialidad especialidad, int id){
        for(Mecanico m : gestion.getMecanico()){
            if(m.getID() == id){
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
    public void eliminarAuto(int id){
        for(Auto a : gestion.getAutos()){
            if(id == a.getID()){
                gestion.removeAuto(a);
                break;
            }
        }
    }
    public void eliminarCircuito(int id){
        for(Circuito c : gestion.getCircuito()){
            if(id == c.getID()){
               gestion.removeCircuito(c);
               break;
            }
        }
    }
    public void eliminarCarrera(int id){
        for(Carrera c: gestion.getCarrera()){
            if(id == c.getID()){
                gestion.removeCarreras(c);
                break;
            }
        }
    }
    public void eliminarEscuderia(int id){
        for(Escuderia e : gestion.getEscuderias()){
            if(e.getID() == id){
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
}
