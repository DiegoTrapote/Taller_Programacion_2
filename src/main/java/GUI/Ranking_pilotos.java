/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Modelo.Auto;
import Modelo.Piloto;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Ranking_pilotos extends javax.swing.JFrame {
    Servicios servicio;
    Gestion_Piloto volver;
    public Ranking_pilotos(Servicios servicio, Gestion_Piloto volver) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRankingPilotos = new javax.swing.JTable();
        ActualizarButtom = new javax.swing.JButton();
        SalirButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Ranking de pilotos");

        TablaRankingPilotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Piloto", "Auto", "DNI", "Posicion"
            }
        ));
        jScrollPane1.setViewportView(TablaRankingPilotos);

        ActualizarButtom.setText("Actualizar");
        ActualizarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarButtomActionPerformed(evt);
            }
        });

        SalirButtom.setText("Salir");
        SalirButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ActualizarButtom)
                        .addGap(31, 31, 31)
                        .addComponent(SalirButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarButtom)
                    .addComponent(SalirButtom))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarButtomActionPerformed
       cargarTabla();
    }//GEN-LAST:event_ActualizarButtomActionPerformed

    private void SalirButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtomActionPerformed
      volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirButtomActionPerformed
    private void cargarTabla() {

    DefaultTableModel modelo = (DefaultTableModel) TablaRankingPilotos.getModel();
    modelo.setRowCount(0); // limpiar tabla

    // Obtenemos la lista ordenada por puntos
    List<Piloto> ranking = servicio.rankingPilotos();

    int posicion = 1;

    for (Piloto p : ranking) {

        Auto auto = servicio.obtenerAutoDePiloto(p);

        Object[] fila = {
            p.getNombre() + " " + p.getApellido(),
            p.getDni(),                             
            (auto != null) ? auto.getModelo() : "Sin auto",
            posicion                                
        };

        modelo.addRow(fila);
        posicion++;
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarButtom;
    private javax.swing.JButton SalirButtom;
    private javax.swing.JTable TablaRankingPilotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
