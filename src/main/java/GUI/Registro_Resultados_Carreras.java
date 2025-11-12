package GUI;

import Modelo.AutoPiloto;
import Modelo.Carrera;
import Modelo.Piloto;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 * Ventana para el registro de resultados de una carrera.
 *
 * Esta interfaz permite asignar posición final y vuelta rápida a los pilotos
 * inscriptos en una carrera determinada. Además, permite visualizar en una
 * tabla los resultados ya guardados.
 * @author Diego Trapote
 * @author Juan Toribio
 */

public class Registro_Resultados_Carreras extends javax.swing.JFrame {
  /**
     * Servicio principal utilizado para gestionar la lógica del sistema.
     */
    Servicios servicio;
    /**
     * Ventana anterior a la cual se retornará al finalizar.
     */
    Gestion_Carreras volver;
     /**
     * Carrera sobre la cual se están registrando resultados.
     */
    Carrera carreraActual;
    /**
     * Constructor de la ventana de registro de resultados.
     * Inicializa la interfaz, carga los pilotos inscriptos en la carrera
     * y muestra los resultados ya existentes.
     *
     * @param servicio Servicio principal de la aplicación.
     * @param volver Ventana a la que se regresará al cerrar esta.
     * @param carrera Carrera cuyos resultados se desean registrar.
     */
    public Registro_Resultados_Carreras(Servicios servicio, Gestion_Carreras volver, Carrera carrera) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        this.carreraActual = carrera;

        
        javax.swing.SpinnerNumberModel modeloPosicion
                = new javax.swing.SpinnerNumberModel(1,
                        1, 
                        25,
                        1); 

        jsPosicion.setModel(modeloPosicion);

        jsPosicion.setEditor(new javax.swing.JSpinner.NumberEditor(jsPosicion, "#"));

        this.setTitle("Resultados de: " + carrera.toString());
        cargarComboPilotosInscriptos();
        cargarTablaResultados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbPilotos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        chkVueltasRapidas = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        jsPosicion = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("Registro Resultado Carrera");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel3.setText("POSICION");

        cbPilotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilotosActionPerformed(evt);
            }
        });

        jLabel4.setText("PILOTO");

        chkVueltasRapidas.setText("Vueltas Rapidas");

        jLabel6.setText("Carrera");

        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaResultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jsPosicion, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chkVueltasRapidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(chkVueltasRapidas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       /**
     * Carga en el ComboBox los pilotos inscriptos en la carrera.
     */
    private void cargarComboPilotosInscriptos() {
        cbPilotos.removeAllItems();


        List<AutoPiloto> inscripciones = servicio.getResultadosDeLaCarrera(this.carreraActual);

        for (AutoPiloto ap : inscripciones) {
            cbPilotos.addItem(ap.getPiloto()); 
        }
    }
       /**
     * Carga en la tabla los resultados ya guardados para esta carrera.
     */
    private void cargarTablaResultados() {
        DefaultTableModel modelo = (DefaultTableModel) tablaResultados.getModel();
        modelo.setRowCount(0);

        List<AutoPiloto> inscripciones = servicio.getResultadosDeLaCarrera(this.carreraActual);

        for (AutoPiloto ap : inscripciones) {
            Object[] fila = {
                ap.getPiloto(),
                ap.getPosicionFinal(), 
                ap.isHizoVueltaRapida() ? "Sí" : "No"
            };
            modelo.addRow(fila);
        }
    }
      /**
     * Acción del botón Volver.
     * Cierra esta ventana y regresa a la gestión de carreras.
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
        /**
     * Acción del botón Guardar.
     * Guarda la posición y la condición de vuelta rápida del piloto seleccionado.
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Piloto pilotoSel = (Piloto) cbPilotos.getSelectedItem();
        boolean vueltaRapida = chkVueltasRapidas.isSelected();

        int posicion = (Integer) jsPosicion.getValue();

        if (pilotoSel == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un piloto.");
            return;
        }

        try {
            servicio.guardarResultado(pilotoSel, this.carreraActual, posicion, vueltaRapida);


            cargarTablaResultados();

        } catch (RuntimeException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbPilotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilotosActionPerformed
     
    }//GEN-LAST:event_cbPilotosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Piloto> cbPilotos;
    private javax.swing.JCheckBox chkVueltasRapidas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jsPosicion;
    private javax.swing.JTable tablaResultados;
    // End of variables declaration//GEN-END:variables
}
