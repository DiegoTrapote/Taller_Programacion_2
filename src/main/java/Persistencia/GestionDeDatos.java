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

public class GestionDeDatos {

    // Listas para almacenar todos los objetos del sistema
    private List<Piloto> pilotos;
    private List<Escuderia> escuderias;
    private List<Auto> autos;
    private List<Mecanico> mecanicos;
    private List<Circuito> circuitos;
    private List<Carrera> carreras;
    private List<Pais> paises;
    private List<AutoPiloto> autoPilotos;
    private List<PilotoEscuderia> pilotosEscuderia;

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
        this.autoPilotos = new ArrayList<>();
        this.pilotosEscuderia = new ArrayList<>();
        cargarDatosDePrueba();

    }

    public void cargarDatosDePrueba() {

        System.out.println("--- Cargando datos de prueba ---");

        // 1. OBJETOS BASE
        Pais p1 = new Pais(1, "Holanda");
        Pais p2 = new Pais(2, "Mónaco");
        Pais p3 = new Pais(3, "Reino Unido");
        paises.add(p1);
        paises.add(p2);
        paises.add(p3);

        Circuito c1 = new Circuito("Circuito de Monza", 5793);
        Circuito c2 = new Circuito("Circuito de Suzuka", 5807);
        circuitos.add(c1);
        circuitos.add(c2);

        Escuderia e1 = new Escuderia();
        e1.setNombre("Red Bull Racing");
        e1.setValor(1); // <-- ¡LA SOLUCIÓN!
        e1.setPais(p1); // (Asigno un país de prueba)
        
        Escuderia e2 = new Escuderia();
        e2.setNombre("McLaren");
        e2.setValor(2); // <-- ¡LA SOLUCIÓN!
        e2.setPais(p3); // (Asigno un país de prueba)

        Escuderia e3 = new Escuderia();
        e3.setNombre("Ferrari");
        e3.setValor(3); // <-- ¡LA SOLUCIÓN!
        e3.setPais(p2); // (Asigno un país de prueba)

        escuderias.add(e1);
        escuderias.add(e2);
        escuderias.add(e3);

        // 2. OBJETOS DEPENDIENTES
       // Piloto 1 (Verstappen)
        Piloto pil1 = new Piloto(); // Usamos el constructor vacío
        pil1.setDni("111-1");
        pil1.setNombre("Max");
        pil1.setApellido("Verstappen");
        pil1.setNumeroCompetencia(1);
        pil1.setPais(p1); // Asignamos Holanda (creado antes)
        // No asignamos victorias, podios, etc. para esta prueba simple
        pilotos.add(pil1);

        // Piloto 2 (Norris)
        Piloto pil2 = new Piloto(); // Usamos el constructor vacío
        pil2.setDni("222-2");
        pil2.setNombre("Lando");
        pil2.setApellido("Norris");
        pil2.setNumeroCompetencia(4);
        pil2.setPais(p3); // Asignamos Reino Unido
        pilotos.add(pil2);
        
        // Piloto 3 (Leclerc)
        Piloto pil3 = new Piloto(); // Usamos el constructor vacío
        pil3.setDni("333-3");
        pil3.setNombre("Charles");
        pil3.setApellido("Leclerc");
        pil3.setNumeroCompetencia(16);
        pil3.setPais(p2); // Asignamos Mónaco
        pilotos.add(pil3);

        Auto auto1 = new Auto("RB20", "Honda RBPT");
        auto1.setEscuderia(e1); // Asignamos Red Bull
        autos.add(auto1);

        Auto auto2 = new Auto("MCL38", "Mercedes");
        auto2.setEscuderia(e2); // Asignamos McLaren
        autos.add(auto2);

        Auto auto3 = new Auto("SF-24", "Ferrari");
        auto3.setEscuderia(e3); // Asignamos Ferrari
        autos.add(auto3);

        // 3. CARRERAS
        // Carrera 1 (para que aparezca en el informe)
        Carrera car1 = new Carrera();
        car1.setCircuito(c1); // Monza
        car1.setFechaRealizacion("20241020"); // Formato 'aaaammdd'
        car1.setNumeroVueltas(53);
        car1.setHoraRealizacion("15:00");
        carreras.add(car1);

        // Carrera 2 (para que también aparezca)
        Carrera car2 = new Carrera();
        car2.setCircuito(c2); // Suzuka
        car2.setFechaRealizacion("20241105"); // Formato 'aaaammdd'
        car2.setNumeroVueltas(53);
        car2.setHoraRealizacion("14:00");
        carreras.add(car2);

        // Carrera 3 (fuera del rango de prueba común)
        Carrera car3 = new Carrera();
        car3.setCircuito(c1); // Monza de nuevo
        car3.setFechaRealizacion("20230903"); // Del año pasado
        car3.setNumeroVueltas(53);
        car3.setHoraRealizacion("15:00");
        carreras.add(car3);

        // 4. RESULTADOS (AutoPiloto)
        // --- Resultados de la Carrera 1 (Monza 2024) ---
        AutoPiloto res1_1 = new AutoPiloto("20241019", auto1, pil1, car1, 1, true); // Verstappen, P1, Vuelta Rápida
        AutoPiloto res1_2 = new AutoPiloto("20241019", auto2, pil2, car1, 2, false); // Norris, P2
        AutoPiloto res1_3 = new AutoPiloto("20241019", auto3, pil3, car1, 3, false); // Leclerc, P3
        autoPilotos.add(res1_1);
        autoPilotos.add(res1_2);
        autoPilotos.add(res1_3);

        // --- Resultados de la Carrera 2 (Suzuka 2024) ---
        AutoPiloto res2_1 = new AutoPiloto("20241104", auto2, pil2, car2, 1, true); // Norris, P1, Vuelta Rápida
        AutoPiloto res2_2 = new AutoPiloto("20241104", auto3, pil3, car2, 2, false); // Leclerc, P2
        AutoPiloto res2_3 = new AutoPiloto("20241104", auto1, pil1, car2, 3, false); // Verstappen, P3
        autoPilotos.add(res2_1);
        autoPilotos.add(res2_2);
        autoPilotos.add(res2_3);

        // --- Resultados de la Carrera 3 (Monza 2023) ---
        AutoPiloto res3_1 = new AutoPiloto("20230902", auto1, pil1, car3, 1, false); // Verstappen, P1
        autoPilotos.add(res3_1);

        System.out.println("--- Datos de prueba cargados ---");
        System.out.println("Total Carreras: " + carreras.size());
        System.out.println("Total Resultados (AutoPiloto): " + autoPilotos.size());
    }

    // --- AQUÍ VAN TUS MÉTODOS DE PERSISTENCIA ---
    // (Como 'traerCarrerasPorRango', 'traerResultadosDeCarrera', etc.)

// --- GETTERS para acceder a las listas desde fuera ---
public List<Piloto> getPilotos() {
        return pilotos;
    }

    public List<PilotoEscuderia> getPilotosEscuderia() {
        return pilotosEscuderia;
    }
    public void setAutoPilotos(List<AutoPiloto> autoPilotos) {
        this.autoPilotos = autoPilotos;
    }

    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public List<AutoPiloto> getAutoPilotos() {
        return autoPilotos;
    }

    public List<Escuderia> getEscuderias() {
        return escuderias;
    }

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

    public List<Mecanico> getMecanico() {
        return mecanicos;
    }

    public void removePiloto(Piloto p) {
        pilotos.remove(p);
    }

    public void removeAuto(Auto a) {
        autos.remove(a);
    }
    //mecanicos,circuitos, carreras paises

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

    public void addAutoPiloto(AutoPiloto autoPiloto) {
        this.autoPilotos.add(autoPiloto);
    }

    public void removeAutoPiloto(AutoPiloto ap) {
        this.autoPilotos.remove(ap);
    }

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

    public List<AutoPiloto> traerResultadosDeCarrera(Carrera c) {
        List<AutoPiloto> resultadosEncontrados = new ArrayList<>();

        // Recorremos la lista GRANDE de todos los resultados
        for (AutoPiloto resultado : autoPilotos) {

            // Comparamos si la carrera de este resultado es la misma que buscamos
            // (¡Importante! Asumo que tu clase AutoPiloto tiene un getCarrera())
            if (resultado.getCarrera().equals(c)) {
                resultadosEncontrados.add(resultado);
            }
        }
        return resultadosEncontrados;
    }

    public List<AutoPiloto> traerResultadosDePiloto(Piloto piloto) {
        List<AutoPiloto> resultadosEncontrados = new ArrayList<>();
    
    // 2. Recorre la lista GRANDE de todos los resultados
    //    (Asumo que se llama 'listaAutoPiloto')
    for (AutoPiloto resultado : autoPilotos) {
        
        // 3. Compara si el piloto de ESE resultado es igual al que buscamos
        //    (Asumo que tu clase AutoPiloto tiene un .getPiloto())
        if (resultado.getPiloto().equals(piloto)) {
            
            // 4. Si es del piloto, lo agrega a la lista de "encontrados"
            resultadosEncontrados.add(resultado);
        }
    }
    
    // 5. Devuelve la lista filtrada
    return resultadosEncontrados;
    }
}
