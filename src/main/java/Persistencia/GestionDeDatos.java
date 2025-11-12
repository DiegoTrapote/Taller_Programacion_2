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

/**
 * Clase de Persistencia que actúa como la "base de datos en memoria" del
 * sistema.
 * <p>
 * Esta clase es la única fuente de verdad para todos los datos. Contiene
 * {@link List}as para cada entidad del modelo (Pilotos, Autos, Carreras, etc.).
 * Se instancia una sola vez al inicio de la aplicación (en {@link GUI.Inicio})
 * y se pasa a la capa de {@link Servicios.Servicios} a través de inyección de
 * dependencias.
 * <p>
 * En su constructor, llama a {@link #cargarDatosDePrueba()} para poblar el
 * sistema con datos iniciales para demostración y pruebas.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class GestionDeDatos {

    // --- Listas Globales de Persistencia ---
    private List<Piloto> pilotos;
    private List<Escuderia> escuderias;
    private List<Auto> autos;
    private List<Mecanico> mecanicos;
    private List<Circuito> circuitos;
    private List<Carrera> carreras;
    private List<Pais> paises;
    /**
     * Lista global de todos los resultados/inscripciones (relación
     * Auto-Piloto-Carrera).
     */
    private List<AutoPiloto> autoPilotos;
    /**
     * Lista global de todo el historial de contratos (relación
     * Piloto-Escuderia).
     */
    private List<PilotoEscuderia> pilotosEscuderia;

    /**
     * Constructor de GestionDeDatos. Inicializa todas las listas como
     * {@link ArrayList} vacíos y llama inmediatamente a
     * {@link #cargarDatosDePrueba()} para poblar el sistema.
     */
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
        cargarDatosDePrueba(); // Carga los datos de prueba al iniciar

    }

    /**
     * Método privado que puebla todas las listas con un conjunto de datos de
     * prueba (mock data) para permitir el testeo de la aplicación sin necesidad
     * de un registro manual inicial.
     * <p>
     * Crea instancias de Países, Circuitos, Escuderías, Pilotos, Autos,
     * Carreras y los resultados (AutoPiloto) que los conectan.
     */
    public void cargarDatosDePrueba() {

        // --- 1. Creación de Países (CON VALOR) ---
        Pais p1 = new Pais(); p1.setDescripcion("Reino Unido"); p1.setValor(1);
        Pais p2 = new Pais(); p2.setDescripcion("Países Bajos"); p2.setValor(2);
        Pais p3 = new Pais(); p3.setDescripcion("Mónaco"); p3.setValor(3);
        Pais p4 = new Pais(); p4.setDescripcion("España"); p4.setValor(4);
        Pais p5 = new Pais(); p5.setDescripcion("Italia"); p5.setValor(5);
        Pais p6 = new Pais(); p6.setDescripcion("Japón"); p6.setValor(6); // País nuevo
        paises.add(p1);
        paises.add(p2);
        paises.add(p3);
        paises.add(p4);
        paises.add(p5);
        paises.add(p6); // Añadir Japón

        // --- 2. Creación de Circuitos (CON VALOR) ---
        Circuito c1 = new Circuito("Silverstone", 5891); c1.setValor(1); c1.setPais(p1);
        Circuito c2 = new Circuito("Zandvoort", 4259); c2.setValor(2); c2.setPais(p2);
        Circuito c3 = new Circuito("Mónaco", 3337); c3.setValor(3); c3.setPais(p3);
        Circuito c4 = new Circuito("Barcelona-Catalunya", 4675); c4.setValor(4); c4.setPais(p4);
        Circuito c5 = new Circuito("Monza", 5793); c5.setValor(5); c5.setPais(p5);
        // (Circuito para la carrera de Japón, usamos Suzuka del código anterior)
        Circuito c6 = new Circuito("Suzuka", 5807); c6.setValor(6); c6.setPais(p6); 
        circuitos.add(c1);
        circuitos.add(c2);
        circuitos.add(c3);
        circuitos.add(c4);
        circuitos.add(c5);
        circuitos.add(c6); // Añadir Suzuka

        // --- 3. Creación de Escuderías (CON VALOR) ---
        Escuderia e1 = new Escuderia(); e1.setNombre("Red Bull Racing"); e1.setValor(1); e1.setPais(p1);
        Escuderia e2 = new Escuderia(); e2.setNombre("Ferrari"); e2.setValor(2); e2.setPais(p5);
        Escuderia e3 = new Escuderia(); e3.setNombre("McLaren"); e3.setValor(3); e3.setPais(p1);
        Escuderia e4 = new Escuderia(); e4.setNombre("Mercedes"); e4.setValor(4); e4.setPais(p1);
        Escuderia e5 = new Escuderia(); e5.setNombre("Aston Martin"); e5.setValor(5); e5.setPais(p1);
        escuderias.add(e1); escuderias.add(e2); escuderias.add(e3); escuderias.add(e4); escuderias.add(e5);

        // --- 4. Creación de Pilotos (CON PAÍS) ---
        Piloto pil1 = new Piloto(); pil1.setDni("111"); pil1.setNombre("Max"); pil1.setApellido("Verstappen"); pil1.setNumeroCompetencia(1); pil1.setPais(p2);
        Piloto pil2 = new Piloto(); pil2.setDni("222"); pil2.setNombre("Sergio"); pil2.setApellido("Pérez"); pil2.setNumeroCompetencia(11); pil2.setPais(p1); // País de prueba
        Piloto pil3 = new Piloto(); pil3.setDni("333"); pil3.setNombre("Charles"); pil3.setApellido("Leclerc"); pil3.setNumeroCompetencia(16); pil3.setPais(p3);
        Piloto pil4 = new Piloto(); pil4.setDni("444"); pil4.setNombre("Carlos"); pil4.setApellido("Sainz"); pil4.setNumeroCompetencia(55); pil4.setPais(p4);
        Piloto pil5 = new Piloto(); pil5.setDni("555"); pil5.setNombre("Lando"); pil5.setApellido("Norris"); pil5.setNumeroCompetencia(4); pil5.setPais(p1);
        Piloto pil6 = new Piloto(); pil6.setDni("666"); pil6.setNombre("Oscar"); pil6.setApellido("Piastri"); pil6.setNumeroCompetencia(81); pil6.setPais(p1); // País de prueba
        Piloto pil7 = new Piloto(); pil7.setDni("777"); pil7.setNombre("Lewis"); pil7.setApellido("Hamilton"); pil7.setNumeroCompetencia(44); pil7.setPais(p1);
        Piloto pil8 = new Piloto(); pil8.setDni("888"); pil8.setNombre("George"); pil8.setApellido("Russell"); pil8.setNumeroCompetencia(63); pil8.setPais(p1);
        Piloto pil9 = new Piloto(); pil9.setDni("999"); pil9.setNombre("Fernando"); pil9.setApellido("Alonso"); pil9.setNumeroCompetencia(14); pil9.setPais(p4);
        Piloto pil10 = new Piloto(); pil10.setDni("101"); pil10.setNombre("Lance"); pil10.setApellido("Stroll"); pil10.setNumeroCompetencia(18); pil10.setPais(p1); // País de prueba
        pilotos.add(pil1); pilotos.add(pil2); pilotos.add(pil3); pilotos.add(pil4); pilotos.add(pil5);
        pilotos.add(pil6); pilotos.add(pil7); pilotos.add(pil8); pilotos.add(pil9); pilotos.add(pil10);

        // --- 5. Creación de Mecánicos (CON ESCUDERÍA Y PAÍS) ---
        Mecanico m1 = new Mecanico(); m1.setDni("M1"); m1.setNombre("Juan"); m1.setApellido("Perez"); m1.setAniosExperiencia(10); m1.setEspecialidad(Modelo.Especialidad.MOTOR); m1.getListaEscuderia().add(e1); m1.setPais(p4); // Red Bull
        Mecanico m2 = new Mecanico(); m2.setDni("M2"); m2.setNombre("Hanna"); m2.setApellido("Schmitz"); m2.setAniosExperiencia(12); m2.setEspecialidad(Modelo.Especialidad.ELECTRONICA); m2.getListaEscuderia().add(e1); m2.setPais(p1); // Red Bull
        Mecanico m3 = new Mecanico(); m3.setDni("M3"); m3.setNombre("Riccardo"); m3.setApellido("Adami"); m3.setAniosExperiencia(15); m3.setEspecialidad(Modelo.Especialidad.CHASIS); m3.getListaEscuderia().add(e2); m3.setPais(p5); // Ferrari
        Mecanico m4 = new Mecanico(); m4.setDni("M4"); m4.setNombre("Matteo"); m4.setApellido("Togninalli"); m4.setAniosExperiencia(8); m4.setEspecialidad(Modelo.Especialidad.NEUMATICOS); m4.getListaEscuderia().add(e2); m4.setPais(p5); // Ferrari
        Mecanico m5 = new Mecanico(); m5.setDni("M5"); m5.setNombre("Will"); m5.setApellido("Joseph"); m5.setAniosExperiencia(6); m5.setEspecialidad(Modelo.Especialidad.MOTOR); m5.getListaEscuderia().add(e3); m5.setPais(p1); // McLaren
        Mecanico m6 = new Mecanico(); m6.setDni("M6"); m6.setNombre("Tom"); m6.setApellido("Stallard"); m6.setAniosExperiencia(7); m6.setEspecialidad(Modelo.Especialidad.CHASIS); m6.getListaEscuderia().add(e3); m6.setPais(p1); // McLaren
        Mecanico m7 = new Mecanico(); m7.setDni("M7"); m7.setNombre("Peter"); m7.setApellido("Bonnington"); m7.setAniosExperiencia(20); m7.setEspecialidad(Modelo.Especialidad.ELECTRONICA); m7.getListaEscuderia().add(e4); m7.setPais(p1); // Mercedes
        Mecanico m8 = new Mecanico(); m8.setDni("M8"); m8.setNombre("Ric"); m8.setApellido("Musconi"); m8.setAniosExperiencia(10); m8.setEspecialidad(Modelo.Especialidad.MOTOR); m8.getListaEscuderia().add(e4); m8.setPais(p5); // Mercedes
        Mecanico m9 = new Mecanico(); m9.setDni("M9"); m9.setNombre("Mike"); m9.setApellido("Krack"); m9.setAniosExperiencia(18); m9.setEspecialidad(Modelo.Especialidad.CHASIS); m9.getListaEscuderia().add(e5); m9.setPais(p3); // Aston Martin
        Mecanico m10 = new Mecanico(); m10.setDni("M10"); m10.setNombre("Ben"); m10.setApellido("Michell"); m10.setAniosExperiencia(5); m10.setEspecialidad(Modelo.Especialidad.NEUMATICOS); m10.getListaEscuderia().add(e5); m10.setPais(p1); // Aston Martin
        mecanicos.add(m1); mecanicos.add(m2); mecanicos.add(m3); mecanicos.add(m4); mecanicos.add(m5);
        mecanicos.add(m6); mecanicos.add(m7); mecanicos.add(m8); mecanicos.add(m9); mecanicos.add(m10);

        // --- 6. Creación de Autos (CON VALOR y ORDEN CORRECTO) ---
        Auto a1 = new Auto(); a1.setModelo("Honda"); a1.setMotor("RB20"); a1.setValor(1); a1.setEscuderia(e1); // Red Bull
        Auto a2 = new Auto(); a2.setModelo("Honda"); a2.setMotor("RB20-2"); a2.setValor(2); a2.setEscuderia(e1); // Red Bull
        Auto a3 = new Auto(); a3.setModelo("Ferrari"); a3.setMotor("SF-24"); a3.setValor(3); a3.setEscuderia(e2); // Ferrari
        Auto a4 = new Auto(); a4.setModelo("Ferrari"); a4.setMotor("SF-24-2"); a4.setValor(4); a4.setEscuderia(e2); // Ferrari
        Auto a5 = new Auto(); a5.setModelo("Mercedes"); a5.setMotor("MCL38"); a5.setValor(5); a5.setEscuderia(e3); // McLaren
        Auto a6 = new Auto(); a6.setModelo("Mercedes"); a6.setMotor("MCL38-2"); a6.setValor(6); a6.setEscuderia(e3); // McLaren
        Auto a7 = new Auto(); a7.setModelo("Mercedes-AMG"); a7.setMotor("W15"); a7.setValor(7); a7.setEscuderia(e4); // Mercedes
        Auto a8 = new Auto(); a8.setModelo("Mercedes-AMG"); a8.setMotor("W15-2"); a8.setValor(8); a8.setEscuderia(e4); // Mercedes
        Auto a9 = new Auto(); a9.setModelo("Alpine"); a9.setMotor("AMR24"); a9.setValor(9); a9.setEscuderia(e5); // Aston Martin
        Auto a10 = new Auto(); a10.setModelo("Alpine"); a10.setMotor("AMR24-2"); a10.setValor(10); a10.setEscuderia(e5); // Aston Martin
        autos.add(a1); autos.add(a2); autos.add(a3); autos.add(a4); autos.add(a5);
        autos.add(a6); autos.add(a7); autos.add(a8); autos.add(a9); autos.add(a10);
        
        // --- 7. Creación de Carreras (CON VALOR Y PAÍS CORREGIDO) ---
        Carrera car1 = new Carrera(); car1.setValor(1); car1.setCircuito(c1); car1.setFechaRealizacion("20240714"); car1.setNumeroVueltas(52); car1.setHoraRealizacion("15:00"); car1.setPais(p1); // Silverstone
        Carrera car2 = new Carrera(); car2.setValor(2); car2.setCircuito(c5); car2.setFechaRealizacion("20240901"); car2.setNumeroVueltas(53); car2.setHoraRealizacion("15:00"); car2.setPais(p5); // Monza
        Carrera car3 = new Carrera(); car3.setValor(3); car3.setCircuito(c3); car3.setFechaRealizacion("20240526"); car3.setNumeroVueltas(78); car3.setHoraRealizacion("15:00"); car3.setPais(p3); // Mónaco
        Carrera car4 = new Carrera(); car4.setValor(4); car4.setCircuito(c4); car4.setFechaRealizacion("20240623"); car4.setNumeroVueltas(66); car4.setHoraRealizacion("15:00"); car4.setPais(p4); // Barcelona
        Carrera car5 = new Carrera(); car5.setValor(5); car5.setCircuito(c6); car5.setFechaRealizacion("20240407"); car5.setNumeroVueltas(53); car5.setHoraRealizacion("14:00"); car5.setPais(p6); // Suzuka (Japón)
        carreras.add(car1); carreras.add(car2); carreras.add(car3); carreras.add(car4); carreras.add(car5);

        // --- 8. Creación de Historial (PilotoEscuderia) ---
        pilotosEscuderia.add(new PilotoEscuderia("20210101", "", e1, pil1));
        pilotosEscuderia.add(new PilotoEscuderia("20210101", "", e1, pil2));
        pilotosEscuderia.add(new PilotoEscuderia("20190101", "", e2, pil3));
        pilotosEscuderia.add(new PilotoEscuderia("20210101", "", e2, pil4));
        pilotosEscuderia.add(new PilotoEscuderia("20190101", "", e3, pil5));
        pilotosEscuderia.add(new PilotoEscuderia("20230101", "", e3, pil6));
        pilotosEscuderia.add(new PilotoEscuderia("20130101", "", e4, pil7));
        pilotosEscuderia.add(new PilotoEscuderia("20220101", "", e4, pil8));
        pilotosEscuderia.add(new PilotoEscuderia("20230101", "", e5, pil9));
        pilotosEscuderia.add(new PilotoEscuderia("20210101", "", e5, pil10));

        // --- 9. Creación de Resultados (AutoPiloto) ---
        // --- Y CONEXIÓN A LA LISTA INTERNA DE CADA CARRERA ---
        
        // Carrera 1: Silverstone (car1)
        AutoPiloto res1_1 = new AutoPiloto("20240713", a7, pil7, car1, 1, false); // Hamilton P1
        AutoPiloto res1_2 = new AutoPiloto("20240713", a1, pil1, car1, 2, true);  // Verstappen P2 (VR)
        AutoPiloto res1_3 = new AutoPiloto("20240713", a5, pil5, car1, 3, false); // Norris P3
        AutoPiloto res1_4 = new AutoPiloto("20240713", a3, pil4, car1, 10, false); // Sainz P10
        autoPilotos.add(res1_1); car1.getAutoPiloto().add(res1_1);
        autoPilotos.add(res1_2); car1.getAutoPiloto().add(res1_2);
        autoPilotos.add(res1_3); car1.getAutoPiloto().add(res1_3);
        autoPilotos.add(res1_4); car1.getAutoPiloto().add(res1_4);
        
        // Carrera 2: Monza (car2)
        AutoPiloto res2_1 = new AutoPiloto("20240831", a3, pil3, car2, 1, false); // Leclerc P1
        AutoPiloto res2_2 = new AutoPiloto("20240831", a6, pil6, car2, 2, true);  // Piastri P2 (VR)
        AutoPiloto res2_3 = new AutoPiloto("20240831", a5, pil5, car2, 3, false); // Norris P3
        AutoPiloto res2_4 = new AutoPiloto("20240831", a1, pil1, car2, 5, false); // Verstappen P5
        AutoPiloto res2_5 = new AutoPiloto("20240831", a9, pil9, car2, 7, false); // Alonso P7
        autoPilotos.add(res2_1); car2.getAutoPiloto().add(res2_1);
        autoPilotos.add(res2_2); car2.getAutoPiloto().add(res2_2);
        autoPilotos.add(res2_3); car2.getAutoPiloto().add(res2_3);
        autoPilotos.add(res2_4); car2.getAutoPiloto().add(res2_4);
        autoPilotos.add(res2_5); car2.getAutoPiloto().add(res2_5);

        // Carrera 3: Mónaco (car3)
        AutoPiloto res3_1 = new AutoPiloto("20240525", a3, pil3, car3, 1, false); // Leclerc P1
        AutoPiloto res3_2 = new AutoPiloto("20240525", a6, pil6, car3, 2, false); // Piastri P2
        AutoPiloto res3_3 = new AutoPiloto("20240525", a4, pil4, car3, 3, false); // Sainz P3
        AutoPiloto res3_4 = new AutoPiloto("20240525", a1, pil1, car3, 6, false); // Verstappen P6
        AutoPiloto res3_5 = new AutoPiloto("20240525", a7, pil7, car3, 7, true);  // Hamilton P7 (VR)
        autoPilotos.add(res3_1); car3.getAutoPiloto().add(res3_1);
        autoPilotos.add(res3_2); car3.getAutoPiloto().add(res3_2);
        autoPilotos.add(res3_3); car3.getAutoPiloto().add(res3_3);
        autoPilotos.add(res3_4); car3.getAutoPiloto().add(res3_4);
        autoPilotos.add(res3_5); car3.getAutoPiloto().add(res3_5);

        // Carrera 4: Barcelona (car4)
        AutoPiloto res4_1 = new AutoPiloto("20240622", a1, pil1, car4, 1, false); // Verstappen P1
        AutoPiloto res4_2 = new AutoPiloto("20240622", a5, pil5, car4, 2, true);  // Norris P2 (VR)
        AutoPiloto res4_3 = new AutoPiloto("20240622", a7, pil7, car4, 3, false); // Hamilton P3
        AutoPiloto res4_4 = new AutoPiloto("20240622", a3, pil3, car4, 5, false); // Leclerc P5
        AutoPiloto res4_5 = new AutoPiloto("20240622", a4, pil4, car4, 6, false); // Sainz P6
        autoPilotos.add(res4_1); car4.getAutoPiloto().add(res4_1);
        autoPilotos.add(res4_2); car4.getAutoPiloto().add(res4_2);
        autoPilotos.add(res4_3); car4.getAutoPiloto().add(res4_3);
        autoPilotos.add(res4_4); car4.getAutoPiloto().add(res4_4);
        autoPilotos.add(res4_5); car4.getAutoPiloto().add(res4_5);

        // Carrera 5: Suzuka (car5)
        AutoPiloto res5_1 = new AutoPiloto("20240406", a1, pil1, car5, 1, true);  // Verstappen P1 (VR)
        AutoPiloto res5_2 = new AutoPiloto("20240406", a2, pil2, car5, 2, false); // Perez P2
        AutoPiloto res5_3 = new AutoPiloto("20240406", a4, pil4, car5, 3, false); // Sainz P3
        AutoPiloto res5_4 = new AutoPiloto("20240406", a3, pil3, car5, 4, false); // Leclerc P4
        AutoPiloto res5_5 = new AutoPiloto("20240406", a5, pil5, car5, 5, false); // Norris P5
        AutoPiloto res5_6 = new AutoPiloto("20240406", a9, pil9, car5, 6, false); // Alonso P6
        autoPilotos.add(res5_1); car5.getAutoPiloto().add(res5_1);
        autoPilotos.add(res5_2); car5.getAutoPiloto().add(res5_2);
        autoPilotos.add(res5_3); car5.getAutoPiloto().add(res5_3);
        autoPilotos.add(res5_4); car5.getAutoPiloto().add(res5_4);
        autoPilotos.add(res5_5); car5.getAutoPiloto().add(res5_5);
        autoPilotos.add(res5_6); car5.getAutoPiloto().add(res5_6);
    }

    

    // --- MÉTODOS GETTERS (para que Servicios acceda a las listas) ---
    /**
     * Devuelve la lista completa de pilotos.
     *
     * @return Lista de {@link Piloto}.
     */
    public List<Piloto> getPilotos() {
        return pilotos;
    }

    /**
     * Devuelve la lista completa de historial Piloto-Escudería.
     *
     * @return Lista de {@link PilotoEscuderia}.
     */
    public List<PilotoEscuderia> getPilotosEscuderia() {
        return pilotosEscuderia;
    }

    /**
     * (No utilizado actualmente) Establece la lista de AutoPiloto.
     *
     * @param autoPilotos Nueva lista de {@link AutoPiloto}.
     */
    public void setAutoPilotos(List<AutoPiloto> autoPilotos) {
        this.autoPilotos = autoPilotos;
    }

    /**
     * Devuelve la lista completa de mecánicos (No usada, ver getMecanico()).
     *
     * @return Lista de {@link Mecanico}.
     */
    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

    /**
     * Devuelve la lista completa de resultados/inscripciones (AutoPiloto).
     *
     * @return Lista de {@link AutoPiloto}.
     */
    public List<AutoPiloto> getAutoPilotos() {
        return autoPilotos;
    }

    /**
     * Devuelve la lista completa de escuderías.
     *
     * @return Lista de {@link Escuderia}.
     */
    public List<Escuderia> getEscuderias() {
        return escuderias;
    }

    // --- MÉTODOS "ADD" (para agregar nuevos objetos a las listas) ---
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

    /**
     * Devuelve la lista completa de mecánicos.
     *
     * @return Lista de {@link Mecanico}.
     */
    public List<Mecanico> getMecanico() {
        return mecanicos;
    }

    // --- MÉTODOS "REMOVE" (para eliminar objetos de las listas) ---
    public void removePiloto(Piloto p) {
        pilotos.remove(p);
    }

    public void removeAuto(Auto a) {
        autos.remove(a);
    }

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

    /**
     * Agrega una nueva inscripción/resultado (AutoPiloto) a la lista global.
     *
     * @param autoPiloto El objeto {@link AutoPiloto} a agregar.
     */
    public void addAutoPiloto(AutoPiloto autoPiloto) {
        this.autoPilotos.add(autoPiloto);
    }

    /**
     * Elimina una inscripción/resultado (AutoPiloto) de la lista global.
     *
     * @param ap El objeto {@link AutoPiloto} a eliminar.
     */
    public void removeAutoPiloto(AutoPiloto ap) {
        this.autoPilotos.remove(ap);
    }

    // --- MÉTODOS DE BÚSQUEDA / FILTRADO ---
    /**
     * Filtra la lista de carreras por un rango de fechas.
     *
     * @param fechaDesdeStr Fecha de inicio en formato "yyyyMMdd".
     * @param fechaHastaStr Fecha de fin en formato "yyyyMMdd".
     * @return Una nueva lista de {@link Carrera} que coincide con el rango.
     */
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

    /**
     * Filtra la lista global de resultados (AutoPiloto) para encontrar todos
     * los que pertenecen a una carrera específica.
     *
     * @param c La {@link Carrera} a buscar (la comparación usa
     * Carrera.equals()).
     * @return Una nueva lista de {@link AutoPiloto} que coincide con la
     * carrera.
     */
    public List<AutoPiloto> traerResultadosDeCarrera(Carrera c) {
        List<AutoPiloto> resultadosEncontrados = new ArrayList<>();

        for (AutoPiloto resultado : autoPilotos) {
            // Compara usando el .equals() de la clase Carrera
            if (resultado.getCarrera().equals(c)) {
                resultadosEncontrados.add(resultado);
            }
        }
        return resultadosEncontrados;
    }

    /**
     * Filtra la lista global de resultados (AutoPiloto) para encontrar todos
     * los que pertenecen a un piloto específico.
     *
     * @param piloto El {@link Piloto} a buscar (la comparación usa
     * Piloto.equals()).
     * @return Una nueva lista de {@link AutoPiloto} que coincide con el piloto.
     */
    public List<AutoPiloto> traerResultadosDePiloto(Piloto piloto) {
        List<AutoPiloto> resultadosEncontrados = new ArrayList<>();

        for (AutoPiloto resultado : autoPilotos) {
            // Compara usando el .equals() de la clase Piloto
            if (resultado.getPiloto().equals(piloto)) {
                resultadosEncontrados.add(resultado);
            }
        }
        return resultadosEncontrados;
    }

    /**
     * Busca y devuelve una {@link Carrera} específica basándose en su 'valor'
     * (ID).
     *
     * @param valor El ID (valor) de la carrera a buscar.
     * @return El objeto {@link Carrera} encontrado, o {@code null} si no se
     * encuentra.
     */
    public Carrera buscarCarreraPorValor(int valor) {
        for (Carrera c : carreras) {
            if (c.getValor() == valor) {
                return c;
            }
        }
        return null;
    }

    /**
     * Busca y devuelve una {@link Auto} específica basándose en su 'valor'
     * (ID).
     *
     * @param valor El ID (valor) del Auto a buscar.
     * @return El objeto {@link Auto} encontrado, o {@code null} si no se
     * encuentra.
     */

    public Auto buscarAutoPorValor(int valor) {
        for (Auto a : autos) {
            if (a.getValor() == valor) {
                return a;
            }
        }
        return null;
    }

    /**
     * Busca un circuito en la lista global por su nombre exacto.
     *
     * @param nombre El nombre del circuito a buscar.
     * @return El objeto Circuito si se encuentra, o null si no existe.
     */
    public Circuito buscarCircuitoPorNombre(String nombre) {
        for (Circuito c : circuitos) {
            if (c.getNombre().equals(nombre)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Busca un país en la lista global por su descripción (nombre).
     *
     * @param nombre El nombre (descripción) del país a buscar.
     * @return El objeto Pais si se encuentra, o null si no existe.
     */
    public Pais buscarPaisPorDescripcion(String nombre) {
        for (Pais p : paises) {
            if (p.getDescripcion().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

}
