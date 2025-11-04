/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import Modelo.Escuderia;
import Modelo.Pais;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanf
 */
public class Gestion_Escuderias extends javax.swing.JFrame {
    Servicios servicio;
    Gestion ventanaGestion;
    public Gestion_Escuderias(){}

    public Gestion_Escuderias(Servicios servicio, Gestion menu) {
        initComponents();
        this.servicio = servicio;
        System.out.println("Gestion_Piloto: Creó su servicio: " + this.servicio);
        this.ventanaGestion = menu;
        cargarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEscuderia = new javax.swing.JTable();
        ModificarButtom = new javax.swing.JButton();
        EliminarButtom = new javax.swing.JButton();
        RegistrarButtom = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        BuscarButtom = new javax.swing.JButton();
        ActualizarButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Gestion de Escuderias");

        tablaEscuderia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Pais"
            }
        ));
        jScrollPane1.setViewportView(tablaEscuderia);

        ModificarButtom.setText("Modificar");
        ModificarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarButtomActionPerformed(evt);
            }
        });

        EliminarButtom.setText("Eliminar");
        EliminarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtomActionPerformed(evt);
            }
        });

        RegistrarButtom.setText("Registrar");
        RegistrarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarButtomActionPerformed(evt);
            }
        });

        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        BuscarButtom.setText("Buscar");
        BuscarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtomActionPerformed(evt);
            }
        });

        ActualizarButon.setText("Actualizar");
        ActualizarButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarButonActionPerformed(evt);
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
                        .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuscarButtom))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ModificarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EliminarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RegistrarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(ActualizarButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarButtom))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ModificarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegistrarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ActualizarButon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void RegistrarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarButtomActionPerformed
       Registro_Escuderia v2 = new Registro_Escuderia(this.servicio, this);
        v2.setVisible(true); // Hacerla visible
        System.out.println("Gestion_Escuderia: Abriendo Registro y pasando servicio: " + this.servicio); // SOPLÓN 2
        // 2. Cerrar esta ventana (Ventana1)
        // dispose() libera los recursos de la ventana
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarButtomActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        
                Gestion_Escuderias.this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void ModificarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtomActionPerformed
    int filaSeleccionada = tablaEscuderia.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtiene el ID de la columna 5 (la oculta)
            int valor = (int) tablaEscuderia.getValueAt(filaSeleccionada, 2);

            Modificar_Escuderia v2 = new Modificar_Escuderia(this.servicio, this,valor);
            v2.setVisible(true);

        }
        this.setVisible(false);
    
    }//GEN-LAST:event_ModificarButtomActionPerformed

    private void BuscarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtomActionPerformed
        buscarNombre(txtBuscarNombre.getText());
    }//GEN-LAST:event_BuscarButtomActionPerformed
    private void buscarNombre(String nombre) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaEscuderia.getModel();
        modeloTabla.setRowCount(0);
        List<Escuderia> listaEscuderia = servicio.traerEscuderia();
        for (Escuderia e : listaEscuderia) {
           if(e.getNombre().equals(nombre)){
               Object[] fila = {
                   e.getNombre(),
                   e.getPais()
               };
               modeloTabla.addRow(fila);
           }
            
        }
    }
    private void ActualizarButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarButonActionPerformed
        System.out.println("--- Botón Refrescar presionado ---"); // SOPLÓN 5
        cargarTabla();
    }//GEN-LAST:event_ActualizarButonActionPerformed

    private void EliminarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtomActionPerformed
        int filaSeleccionada = tablaEscuderia.getSelectedRow();
        System.out.println("Fila seleccionada: " + filaSeleccionada);
        if (filaSeleccionada != -1) {

            int valor = (int) tablaEscuderia.getValueAt(filaSeleccionada, 2);
            System.out.println("ID: " + valor);

            servicio.eliminarEscuderia(valor);

            cargarTabla(); // Refresca
        }
    }//GEN-LAST:event_EliminarButtomActionPerformed

 private void cargarTabla() {
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaEscuderia.getModel();
    modeloTabla.setRowCount(0);

    List<Escuderia> listaEscuderia = servicio.traerEscuderia();

    if (listaEscuderia != null) {
        for (Escuderia e : listaEscuderia) {
            Object[] fila = {
                e.getNombre(),
                e.getPais(),
                e.getValor() // 👈 ID o identificador único
            };
            modeloTabla.addRow(fila);
        }
    }

    // Ocultar columna "valor" (la 3°)
    if (tablaEscuderia.getColumnCount() > 2) {
        tablaEscuderia.getColumnModel().getColumn(2).setMinWidth(0);
        tablaEscuderia.getColumnModel().getColumn(2).setMaxWidth(0);
        tablaEscuderia.getColumnModel().getColumn(2).setWidth(0);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarButon;
    private javax.swing.JButton BuscarButtom;
    private javax.swing.JButton EliminarButtom;
    private javax.swing.JButton ModificarButtom;
    private javax.swing.JButton RegistrarButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTable tablaEscuderia;
    private javax.swing.JTextField txtBuscarNombre;
    // End of variables declaration//GEN-END:variables
}

