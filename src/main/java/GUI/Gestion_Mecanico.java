/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Modelo.Mecanico;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Servicios.Servicios;

public class Gestion_Mecanico extends javax.swing.JFrame {

    public Gestion_Mecanico() {
    }
    Servicios servicio;
    Gestion volver;

    public Gestion_Mecanico(Servicios servicio, Gestion menu) {
        initComponents();
        this.servicio = servicio;
        this.volver = menu;
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VolverGestionButtom = new javax.swing.JButton();
        RegistrarButtom = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();
        ModificarMecanicoButtom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMecanicos = new javax.swing.JTable();
        ActualizarButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Gestion Mecanicos");

        VolverGestionButtom.setText("Volver");
        VolverGestionButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverGestionButtomActionPerformed(evt);
            }
        });

        RegistrarButtom.setText("Registrar");
        RegistrarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarButtomActionPerformed(evt);
            }
        });

        EliminarButton.setText("Eliminar");
        EliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtonActionPerformed(evt);
            }
        });

        ModificarMecanicoButtom.setText("Modificar");
        ModificarMecanicoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarMecanicoButtomActionPerformed(evt);
            }
        });

        tablaMecanicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Anios Experiencia", "Pais", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(tablaMecanicos);

        ActualizarButtom.setText("Actualizar");
        ActualizarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VolverGestionButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(RegistrarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(ModificarMecanicoButtom, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(ActualizarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VolverGestionButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RegistrarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ModificarMecanicoButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ActualizarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverGestionButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverGestionButtomActionPerformed

        this.volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverGestionButtomActionPerformed

    private void RegistrarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarButtomActionPerformed
        // 1. Crear la nueva ventana
        Registro_Mecanico v2 = new Registro_Mecanico(this.servicio, this);
        v2.setVisible(true); // Hacerla visible
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarButtomActionPerformed

    private void EliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtonActionPerformed
        int filaSeleccionada = tablaMecanicos.getSelectedRow();
        System.out.println("Fila seleccionada: " + filaSeleccionada);
        if (filaSeleccionada != -1) {

            String dni = (String) tablaMecanicos.getValueAt(filaSeleccionada, 0);
            System.out.println("ID: " + dni);

            servicio.eliminarPiloto(dni);

            cargarTabla(); // Refresca
        }
    }//GEN-LAST:event_EliminarButtonActionPerformed

    private void ModificarMecanicoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarMecanicoButtomActionPerformed
        int filaSeleccionada = tablaMecanicos.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtiene el ID de la columna 5 (la oculta)
            String dni = (String) tablaMecanicos.getValueAt(filaSeleccionada, 0);

            Modificar_Mecanico v2 = new Modificar_Mecanico(this.servicio, this, dni);
            v2.setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_ModificarMecanicoButtomActionPerformed

    private void ActualizarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarButtomActionPerformed
        System.out.println("--- Botón Refrescar presionado ---"); // SOPLÓN 5
        cargarTabla();
    }//GEN-LAST:event_ActualizarButtomActionPerformed
    private void cargarTabla() {
        // 1. Obtener el modelo de la tabla
        // (Asegurate de que tu JTable en el diseñador se llame 'tablaPilotos' o cambia el nombre aquí)
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaMecanicos.getModel();

        // 2. Limpiar la tabla por si tenía datos viejos
        modeloTabla.setRowCount(0);

        // 3. Pedir los datos a la capa de servicios
        // (Este método "traerPilotos()" lo tenés que crear en tu clase Servicios)
        List<Mecanico> listaMecanicos = servicio.traerMecanicos();

        // 4. Recorrer la lista y agregar cada piloto como una fila
        if (listaMecanicos != null) {
            for (Mecanico p : listaMecanicos) {
                // "Object[]" es un array de objetos que representa una fila

                Object[] fila = {
                    p.getDni(),
                    p.getNombre(),
                    p.getApellido(),
                    p.getAniosExperiencia(), // Asegúrate de tener este getter en tu clase Piloto
                    p.getPais(),
                    p.getEspecialidad()
                };

                // 5. Agregar la fila al modelo
                modeloTabla.addRow(fila);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarButtom;
    private javax.swing.JButton EliminarButton;
    private javax.swing.JButton ModificarMecanicoButtom;
    private javax.swing.JButton RegistrarButtom;
    private javax.swing.JButton VolverGestionButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMecanicos;
    // End of variables declaration//GEN-END:variables
}
