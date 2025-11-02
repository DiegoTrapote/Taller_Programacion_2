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
    
    private GestionDeDatos gestion;
    
    public void registrarAuto(String motor, String modelo){
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setMotor(motor);
        gestion.agregarAuto(auto);
    }
    public void registrarPiloto(String nombre, String apellido, String dni, Pais pais){
        Piloto piloto= new Piloto();
        piloto.setNombre(nombre);
        piloto.setApellido(apellido);
        piloto.setDni(dni);
        piloto.setPais(pais);
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
    
    
    public void modificarPiloto(String nombre, String apellido, Pais pais, String dni, int id){
        for(Piloto e : gestion.getPilotos()){
            
            if(e.getID() == id){    
               e.setApellido(apellido);
               e.setNombre(nombre);
               e.setPais(pais);
               e.setDni(dni);
               break;
            }
        }
    }
    public void modificarAuto(Auto auto){
        for(Auto a : gestion.getAutos()){
            if(a.equals(auto)){
                a.setModelo(a.getModelo());
                a.setMotor(a.getMotor());
            }
        }
    }
    public void modificarCircuito(Circuito circuito){
        for(Circuito c : gestion.getCircuito()){
            if(c.equals(circuito)){
                c.setNombre(circuito.getNombre());
                c.setLongitud(circuito.getLongitud());
            }
        }
    }
    public void modificarCarrera(Carrera carrera){
        for(Carrera c : gestion.getCarrera()){
            if(c.equals(carrera)){
                c.setCircuito(carrera.getCircuito());
                c.setFechaRealizacion(carrera.getFechaRealizacion());
                c.setHoraRealizacion(carrera.getHoraRealizacion());
                c.setNumeroVueltas(carrera.getNumeroVueltas());
            }
        }
    }
    public void modificarEscuderia(Escuderia escuderia){
        for(Escuderia e : gestion.getEscuderias()){
            if(e.equals(escuderia)){
                e.setNombre(escuderia.getNombre());
                e.setPais(e.getPais());
            }
        }
    }
    public void mofidicarMecanico(Mecanico mecanico){}
    public List<Piloto> traerPilotos(){
        return gestion.getPilotos();
    }
}
