package GUI;

import Modelo.Carrera;
import Modelo.Circuito;
import Modelo.Pais;
import Servicios.Servicios;
import java.util.Date;

/**
 * Ventana (JFrame) para modificar los datos de una Carrera existente.
 * <p>
 * Esta clase permite al usuario editar los atributos de una carrera específica,
 * identificada por su 'valor' (ID). Carga los datos actuales de la carrera en
 * los campos del formulario (incluyendo JDateChooser para la fecha y JSpinner
 * para la hora) y luego guarda los cambios en la capa de persistencia a través
 * de la capa de Servicios.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Modificar_Carrera extends javax.swing.JFrame {

    Servicios servicio;
    Gestion_Carreras volver;
    int valor;

    /**
     * Constructor de la ventana Modificar_Carrera.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección
     * de dependencias).
     * @param volver La ventana {@link Gestion_Carreras} anterior a la cual se
     * debe regresar.
     * @param valor El ID (valor) de la {@link Carrera} que se va a modificar.
     */
    public Modificar_Carrera(Servicios servicio, Gestion_Carreras volver, int valor) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        this.valor = valor;

        javax.swing.SpinnerDateModel modeloSpinner = new javax.swing.SpinnerDateModel();

        modeloSpinner.setCalendarField(java.util.Calendar.MINUTE);

        jsHora.setModel(modeloSpinner);

        jsHora.setEditor(new javax.swing.JSpinner.DateEditor(jsHora, "HH:mm"));
        cargarComboPaises();
        cargarComboCircuitos();
        cargarDatosDeLaCarrera();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jsNumVueltas = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        cbCircuito = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jsHora = new javax.swing.JSpinner();
        cbPais = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Modificar Carrera");

        jLabel2.setText("Circuito:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Hora:");

        jLabel5.setText("Nro. de vueltas:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Pais:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbCircuito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jsHora, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(jLabel6)
                                    .addGap(44, 44, 44)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jsNumVueltas, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(cbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jsHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jsNumVueltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(btnGuardar)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Manejador del evento clic para el botón "Guardar".
     * <p>
     * Recoge todos los valores (nuevos o modificados) de los campos del
     * formulario. Convierte los objetos {@link Date} del JDateChooser (fecha) y
     * JSpinner (hora) a sus respectivos formatos de {@link String} ("yyyyMMdd"
     * y "HH:mm"). Llama al servicio {@link Servicios#modificarCarrera} para
     * persistir los cambios. Finalmente, muestra la ventana anterior (`volver`)
     * y cierra esta.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Circuito circuito = (Circuito) cbCircuito.getSelectedItem();
        Pais pais = (Pais) cbPais.getSelectedItem();
        int vueltas = (Integer) jsNumVueltas.getValue();

        Date fechaDate = jdFecha.getDate();
        java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("yyyyMMdd");
        String fechaString = formatoFecha.format(fechaDate);

        Date horaDate = (Date) jsHora.getValue();
        java.text.SimpleDateFormat formatoHora = new java.text.SimpleDateFormat("HH:mm");
        String horaString = formatoHora.format(horaDate);

        servicio.modificarCarrera(fechaString, horaString, vueltas, circuito, valor, pais);
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed
    /**
     * Método auxiliar privado para poblar el `cbPais` (ComboBox). Carga todos
     * los países disponibles desde el servicio.
     */
    private void cargarComboPaises() {
        cbPais.removeAllItems();
        for (Pais p : servicio.traerPaises()) {
            cbPais.addItem(p);
        }
    }

    /**
     * Método auxiliar privado para poblar el `cbCircuito` (ComboBox). Carga
     * todos los circuitos disponibles desde el servicio.
     */
    private void cargarComboCircuitos() {
        cbCircuito.removeAllItems();
        for (Circuito c : servicio.traerCircuitos()) {
            cbCircuito.addItem(c);
        }
    }

    /**
     * Carga los datos existentes de la carrera (identificada por `this.valor`)
     * en los componentes del formulario. Convierte los Strings de fecha y hora
     * de la persistencia a objetos {@link Date} para que el JDateChooser y el
     * JSpinner puedan mostrarlos.
     */
    private void cargarDatosDeLaCarrera() {

        Carrera carrera = servicio.buscarCarreraPorValor(this.valor);

        if (carrera == null) {

            return;
        }

        jsNumVueltas.setValue(carrera.getNumeroVueltas());
        cbCircuito.setSelectedItem(carrera.getCircuito());
        cbPais.setSelectedItem(carrera.getPais());

        try {
            java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("yyyyMMdd");
            Date fecha = formatoFecha.parse(carrera.getFechaRealizacion());
            jdFecha.setDate(fecha);
        } catch (java.text.ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }

        try {
            java.text.SimpleDateFormat formatoHora = new java.text.SimpleDateFormat("HH:mm");
            Date hora = formatoHora.parse(carrera.getHoraRealizacion());
            jsHora.setValue(hora);
        } catch (java.text.ParseException e) {
            System.out.println("Error al parsear la hora: " + e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Circuito> cbCircuito;
    private javax.swing.JComboBox<Pais> cbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JSpinner jsHora;
    private javax.swing.JSpinner jsNumVueltas;
    // End of variables declaration//GEN-END:variables
}
