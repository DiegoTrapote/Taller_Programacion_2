package Persistencia;
import Modelo.Auto;
import Modelo.Circuito;
import Modelo.Escuderia;
import Modelo.Mecanico;
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
    // ...y así con todas las demás clases (Carrera, Pais, etc.)

    // El constructor inicializa las listas vacías
    public GestionDeDatos() {
        this.pilotos = new ArrayList<>();
        this.escuderias = new ArrayList<>();
        this.autos = new ArrayList<>();
        this.mecanicos = new ArrayList<>();
        this.circuitos = new ArrayList<>();
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
    // ... agrega getters para las otras listas

    /**
     * Método para crear objetos de prueba y agregarlos a las listas.
     * A esto se le llama "hardcodear" o "sembrar" datos (seeding).
     */
   /*public void cargarDatosIniciales() {
        System.out.println("Cargando datos iniciales de prueba...");

        // --- 1. Creamos Escuderías [cite: 28] ---
        Escuderia ferrari = new Escuderia("Scuderia Ferrari");
        Escuderia redbull = new Escuderia("Red Bull Racing");
        Escuderia mercedes = new Escuderia("Mercedes-AMG Petronas");

        // Las agregamos a la lista de escuderías
        this.escuderias.add(ferrari);
        this.escuderias.add(redbull);
        this.escuderias.add(mercedes);

        // --- 2. Creamos Pilotos [cite: 27] ---
        Piloto leclerc = new Piloto("1234567A", "Charles", "Leclerc", 16);
        Piloto sainz = new Piloto("2345678B", "Carlos", "Sainz", 55);
        Piloto verstappen = new Piloto("3456789C", "Max", "Verstappen", 1);
        Piloto perez = new Piloto("4567890D", "Sergio", "Pérez", 11);

        // Los agregamos a la lista de pilotos
        this.pilotos.add(leclerc);
        this.pilotos.add(sainz);
        this.pilotos.add(verstappen);
        this.pilotos.add(perez);

        // --- 3. Creamos Circuitos [cite: 27] ---
        Circuito monza = new Circuito("Autodromo Nazionale di Monza", 5793);
        Circuito silverstone = new Circuito("Silverstone Circuit", 5891);
        
        this.circuitos.add(monza);
        this.circuitos.add(silverstone);

        // --- 4. Creamos y asociamos otros objetos (Autos, Mecánicos, Carreras, etc.) ---
        // Por ejemplo, podrías crear autos y asociarlos a una escudería
        Auto f175 = new Auto("F1-75", "Ferrari V6");
        Auto rb19 = new Auto("RB19", "Honda RBPTH001");
        
        this.autos.add(f175);
        this.autos.add(rb19);
        
        // Aquí también deberías crear los objetos de las clases asociativas
        // como PilotoEscuderia para registrar que un piloto pertenece a un equipo. [cite: 44]
        
        System.out.println("¡Datos cargados exitosamente!");
        System.out.println("Total de pilotos: " + this.pilotos.size());
        System.out.println("Total de escuderías: " + this.escuderias.size());

    }*/
}
