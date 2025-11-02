package Servicios;

import Modelo.Auto;
import Modelo.Escuderia;
import Modelo.Pais;
import Modelo.Piloto;
import Persistencia.GestionDeDatos;

public class Servicios {
    private GestionDeDatos gestion;
    public void RegistrarAuto(String motor, String modelo){
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setMotor(motor);
        gestion.agregarAuto(auto);
    }
     public void RegistrarPiloto(String nombre, String apellido, String dni, Pais pais, Escuderia escuderia, Auto auto){
        Piloto piloto= new Piloto();
        piloto.setNombre(nombre);
        piloto.setApellido(apellido);
        piloto.setDni(dni);
        piloto.setPais(pais);
        
        gestion.agregarAuto(piloto);
    }
}
