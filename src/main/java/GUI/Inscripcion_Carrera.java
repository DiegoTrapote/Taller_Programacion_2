package GUI;

import Modelo.Auto;
import Modelo.AutoPiloto;
import Modelo.Carrera;
import Modelo.Piloto;
import Servicios.Servicios;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana (JFrame) para gestionar la inscripción de pilotos a una carrera
 * específica.
 * <p>
 * Esta clase permite al usuario inscribir pilotos a una carrera seleccionada
 * (identificada por su 'valor'). Muestra una tabla con los pilotos ya
 * inscriptos, permite agregar nuevas inscripciones (validando duplicados y
 * fechas) y permite dar de baja inscripciones existentes.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Inscripcion_Carrera extends javax.swing.JFrame {

    Servicios servicio;
    Gestion_Carreras volver;
    int valor;

    /**
     * Constructor de la ventana Inscripcion_Carrera.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección
     * de dependencias).
     * @param volver La ventana {@link Gestion_Carreras} anterior a la cual se
     * debe regresar.
     * @param valor El ID (valor) de la {@link Carrera} que se va a gestionar.
     */
    public Inscripcion_Carrera(Servicios servicio, Gestion_Carreras volver, int valor) {
        this.servicio = servicio;
        this.volver = volver;
        this.valor = valor;
        initComponents();
        cargarComboPilotos();
        cargarComboAutos();
        cargarTabla();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPilotos = new javax.swing.JTable();
        btnDarBaja = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        InscribirButtom = new javax.swing.JButton();
        VolverButom = new javax.swing.JButton();
        cbAuto = new javax.swing.JComboBox<>();
        cbPilotos = new javax.swing.JComboBox<>();
        jdFechaAsignacion = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Inscripcion a Carreras ");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Pilotos Inscriptos:");

        tablaPilotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Piloto", "Auto", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tablaPilotos);

        btnDarBaja.setText("Dar de baja");
        btnDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBajaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Agregar Piloto");

        jLabel5.setText("Piloto:");

        jLabel6.setText("Auto:");

        jLabel7.setText("Fecha:");

        InscribirButtom.setText("Inscribir");
        InscribirButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirButtomActionPerformed(evt);
            }
        });

        VolverButom.setText("Volver");
        VolverButom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDarBaja)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbAuto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jdFechaAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(InscribirButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VolverButom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(VolverButom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jdFechaAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(InscribirButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDarBaja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     * Manejador del evento clic para el botón "Inscribir".
     * <p>
     * Obtiene el piloto, el auto y la fecha seleccionados. Valida que los
     * campos no estén vacíos. Convierte la fecha ({@link Date}) a un formato
     * {@link String} "yyyyMMdd".
     * <p>
     * Intenta registrar la inscripción llamando a
     * {@link Servicios#inscribirPilotoEnCarrera(Piloto, Auto, String, int)}.
     * Este método de servicio contiene las validaciones de negocio (ej: piloto
     * duplicado, auto duplicado, fecha de inscripción antes de la carrera).
     * <p>
     * Si la inscripción es exitosa, refresca la tabla. Si el servicio lanza una
     * {@link RuntimeException} (por una validación fallida), la captura y
     * muestra el mensaje de error al usuario.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void InscribirButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirButtomActionPerformed

        Piloto pilotoSeleccionado = (Piloto) cbPilotos.getSelectedItem();
        Auto autoSeleccionado = (Auto) cbAuto.getSelectedItem();
        Date fecha = jdFechaAsignacion.getDate();

        if (pilotoSeleccionado == null || autoSeleccionado == null || fecha == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un piloto, un auto y una fecha.",
                    "Datos incompletos",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("yyyyMMdd");
        String fechaComoString = formato.format(fecha);

        try {

            servicio.inscribirPilotoEnCarrera(pilotoSeleccionado, autoSeleccionado, fechaComoString, valor);

            cargarTabla();

        } catch (RuntimeException e) {

            javax.swing.JOptionPane.showMessageDialog(this,
                    e.getMessage(),
                    "Error de Inscripción",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_InscribirButtomActionPerformed
    /**
     * Manejador del evento clic para el botón "Volver". Cierra (descarta) la
     * ventana actual y vuelve a mostrar la ventana de `Gestion_Carreras`
     * (`volver`).
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void VolverButomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButomActionPerformed
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverButomActionPerformed
    /**
     * Manejador del evento clic para el botón "Dar de baja".
     * <p>
     * Obtiene la fila seleccionada de la `tablaPilotos`. Si una fila es válida,
     * extrae el objeto {@link Piloto} de la columna 0. Llama al servicio
     * {@link Servicios#darDeBajaPiloto(Piloto, int)} para eliminar la
     * inscripción de la persistencia. Finalmente, refresca la tabla.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaActionPerformed
        int filaSeleccionada = tablaPilotos.getSelectedRow();

        if (filaSeleccionada != -1) {

            Piloto piloto = (Piloto) tablaPilotos.getValueAt(filaSeleccionada, 0);
            servicio.darDeBajaPiloto(piloto, valor);
            cargarTabla();
        }
    }//GEN-LAST:event_btnDarBajaActionPerformed
    /**
     * Método auxiliar privado para poblar el `cbPilotos` (ComboBox). Carga
     * todos los pilotos disponibles en el sistema.
     */
    private void cargarComboPilotos() {
        cbPilotos.removeAllItems();
        for (Piloto p : servicio.traerPilotos()) {
            cbPilotos.addItem(p);
        }
    }

    /**
     * Método auxiliar privado para poblar el `cbAuto` (ComboBox). Carga todos
     * los autos disponibles en el sistema.
     */
    private void cargarComboAutos() {
        cbAuto.removeAllItems();
        for (Auto a : servicio.traerAutos()) {
            cbAuto.addItem(a);
        }
    }

    /**
     * Método auxiliar privado para cargar (o recargar) la `tablaPilotos`.
     * <p>
     * Este método filtra la lista *global* de inscripciones (`AutoPiloto`) para
     * mostrar únicamente aquellas que pertenecen a la carrera actual
     * (identificada por la variable `valor`).
     */
    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPilotos.getModel();
        modeloTabla.setRowCount(0);

        Carrera carreraActual = null;
        for (Carrera c : servicio.traerCarreras()) {
            if (c.getValor() == valor) {
                carreraActual = c;
                break;
            }
        }

        if (carreraActual == null) {
            return;
        }

        List<AutoPiloto> inscripciones = servicio.getResultadosDeLaCarrera(carreraActual);

        for (AutoPiloto a : inscripciones) {
            Object[] fila = {
                a.getPiloto(),
                a.getAuto(),
                a.getFechaAsignacion()
            };
            modeloTabla.addRow(fila);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InscribirButtom;
    private javax.swing.JButton VolverButom;
    private javax.swing.JButton btnDarBaja;
    private javax.swing.JComboBox<Auto> cbAuto;
    private javax.swing.JComboBox<Piloto> cbPilotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFechaAsignacion;
    private javax.swing.JTable tablaPilotos;
    // End of variables declaration//GEN-END:variables
}
