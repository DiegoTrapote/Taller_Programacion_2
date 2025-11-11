/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
 *
 * @author Diego_Trapote
 */
public class Inscripcion_Carrera extends javax.swing.JFrame {

    Servicios servicio;
    Gestion_Carreras volver;
    int valor;

    public Inscripcion_Carrera(Servicios servicio, Gestion_Carreras volver, int valor) {
        this.servicio = servicio;
        this.volver = volver;
        this.valor = valor;
        initComponents();
        cargarComboPilotos();
        cargarComboAutos();
        cargarTabla();
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
        jLabel2.setText("Pilotos Inscriptos");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(136, 136, 136))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VolverButom)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1))
                            .addComponent(btnDarBaja)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cbAuto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cbPilotos, 0, 162, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jdFechaAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(InscribirButtom)
                                        .addGap(66, 66, 66))))
                            .addComponent(jLabel2))
                        .addContainerGap(119, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(VolverButom))
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addGap(36, 36, 36)
                        .addComponent(InscribirButtom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(btnDarBaja)
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void InscribirButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirButtomActionPerformed

        // 1. Obtener los datos seleccionados
    Piloto pilotoSeleccionado = (Piloto) cbPilotos.getSelectedItem();
    Auto autoSeleccionado = (Auto) cbAuto.getSelectedItem();
    Date fecha = jdFechaAsignacion.getDate(); 

    // 2. Validar que los campos no estén vacíos
    if (pilotoSeleccionado == null || autoSeleccionado == null || fecha == null) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Debe seleccionar un piloto, un auto y una fecha.",
                "Datos incompletos",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Convertir la fecha a String
    java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("yyyyMMdd");
    String fechaComoString = formato.format(fecha);

    // 3. INTENTAR INSCRIBIR
    try {
        
        servicio.inscribirPilotoEnCarrera(pilotoSeleccionado, autoSeleccionado, fechaComoString, valor);

        // --- ¡LA SOLUCIÓN! ---
        // 4. NO agregar la fila manualmente.
        //    Llama al método que SÍ sabe cómo cargar la tabla correctamente.
        cargarTabla(); 
        // --- FIN DE LA SOLUCIÓN ---

    } catch (RuntimeException e) {
        // 5. Si el servicio lanzó un error, mostrar el mensaje
        javax.swing.JOptionPane.showMessageDialog(this,
                e.getMessage(), 
                "Error de Inscripción",
                javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_InscribirButtomActionPerformed

    private void VolverButomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButomActionPerformed
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverButomActionPerformed

    private void btnDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaActionPerformed
        int filaSeleccionada = tablaPilotos.getSelectedRow();

        // 1. 'filaSeleccionada' SIEMPRE ES -1
        //    porque tu método cargarTabla() está fallando y la tabla está vacía.
        if (filaSeleccionada != -1) {
            // 2. COMO ES -1, ESTE CÓDIGO NUNCA SE EJECUTA
            Piloto piloto = (Piloto) tablaPilotos.getValueAt(filaSeleccionada, 0);
            servicio.darDeBajaPiloto(piloto, valor);
            cargarTabla();
        }
    }//GEN-LAST:event_btnDarBajaActionPerformed
    private void cargarComboPilotos() {
        cbPilotos.removeAllItems();
        for (Piloto p : servicio.traerPilotos()) {
            cbPilotos.addItem(p);
        }
    }

    private void cargarComboAutos() {
        cbAuto.removeAllItems();
        for (Auto a : servicio.traerAutos()) {
            cbAuto.addItem(a);
        }
    }

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPilotos.getModel();
    modeloTabla.setRowCount(0); // Limpia la tabla

    // --- ¡AQUÍ ESTÁ LA LÓGICA CORREGIDA! ---
    
    // 1. Busca la carrera actual usando el 'valor'
    Carrera carreraActual = null;
    for (Carrera c : servicio.traerCarreras()) {
        if (c.getValor() == valor) { // 'valor' es el ID de la carrera actual
            carreraActual = c;
            break;
        }
    }

    if (carreraActual == null) return; // Si no se encuentra la carrera, no hacer nada

    // 2. Llama al método de servicio que SÍ busca en la lista global
    //    (Este método ya lo creamos para los informes y funciona)
    List<AutoPiloto> inscripciones = servicio.getResultadosDeLaCarrera(carreraActual);

    // 3. Llena la tabla con los resultados ENCONTRADOS
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
