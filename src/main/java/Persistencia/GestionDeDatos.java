package Persistencia;
import Modelo.Auto;
import Modelo.Carrera;
import Modelo.Circuito;
import Modelo.Escuderia;
import Modelo.Mecanico;
import Modelo.Pais;
import Modelo.Piloto;
import java.util.ArrayList;
import java.util.List;

public class GestionDeDatos {
    
    // Listas para almacenar todos los objetos del sistema
    private List<Piloto> pilotos;
    private List<Escuderia> escuderias;
    private List<Auto> autos;
    private List<Mecanico> mecanicos;
    private List<Circuito> circuitos;
    private List<Carrera> carreras;
    private List<Pais> paises;
    // ...y así con todas las demás clases (Carrera, Pais, etc.)

    // El constructor inicializa las listas vacías
    public GestionDeDatos() {
        this.pilotos = new ArrayList<>();
        this.escuderias = new ArrayList<>();
        this.autos = new ArrayList<>();
        this.mecanicos = new ArrayList<>();
        this.circuitos = new ArrayList<>();
        this.carreras = new ArrayList<>();
        this.paises = new ArrayList<>();
    }

    // --- GETTERS para acceder a las listas desde fuera ---
    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public List<Escuderia> getEscuderias() {
        return escuderias;
    }
    public void agregarAuto(Auto auto){
        this.autos.add(auto);
    }
    public void agregarPiloto(Piloto piloto){
        this.pilotos.add(piloto);
    }
    public void agregarMecanico(Mecanico mecanico){
        this.mecanicos.add(mecanico);
    }
    public void agregarEscuderia(Escuderia escuderia){
        this.escuderias.add(escuderia);
    }
    public void agregarCircuitos(Circuito circuito){
        this.circuitos.add(circuito);
    }
    public void agregarCarrera(Carrera carrera){
        this.carreras.add(carrera);
    }
    public void agregarPais(Pais pais){
        this.paises.add(pais);
    }
    public List<Auto> getAutos(){
        return autos;
    }
    public List<Circuito>getCircuito(){
        return circuitos;
    }
    public List<Carrera>getCarrera(){
        return carreras;
    }
    public List<Mecanico> getMecanico(){
        return mecanicos;
    }
}
