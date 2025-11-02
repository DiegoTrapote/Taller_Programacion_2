/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author juanf
 */
public class Gestion extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Gestion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        GestionAutos = new javax.swing.JButton();
        GestionPilotosButtom = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        GestionCarrera = new javax.swing.JButton();
        GestionPaisesButtom = new javax.swing.JButton();
        GestionMecanicoButtom = new javax.swing.JButton();
        VolverInicioButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Gestion");

        GestionAutos.setText("Gestion de  Autos");
        GestionAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionAutosActionPerformed(evt);
            }
        });

        GestionPilotosButtom.setText("Gestion de Pilotos");
        GestionPilotosButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionPilotosButtomActionPerformed(evt);
            }
        });

        jButton3.setText("Gestion de Escuderias");

        jButton4.setText("Gestion de Circuitos");

        GestionCarrera.setText("Gestion de Carreras");

        GestionPaisesButtom.setText("Gestion de Paises");
        GestionPaisesButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionPaisesButtomActionPerformed(evt);
            }
        });

        GestionMecanicoButtom.setText("Gestion de Mecanicos");
        GestionMecanicoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionMecanicoButtomActionPerformed(evt);
            }
        });

        VolverInicioButtom.setText("Volver");
        VolverInicioButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverInicioButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GestionCarrera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GestionPaisesButtom))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GestionAutos)
                                .addGap(72, 72, 72)
                                .addComponent(GestionPilotosButtom)))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(61, 61, 61)
                                .addComponent(jButton4))
                            .addComponent(GestionMecanicoButtom)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(VolverInicioButtom)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(VolverInicioButtom))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GestionAutos)
                    .addComponent(GestionPilotosButtom)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GestionCarrera)
                    .addComponent(GestionPaisesButtom)
                    .addComponent(GestionMecanicoButtom))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionAutosActionPerformed
         // 1. Crear la nueva ventana
                Gestion_Autos v2 = new Gestion_Autos();
                v2.setVisible(true); // Hacerla visible

                // 2. Cerrar esta ventana (Ventana1)
                // dispose() libera los recursos de la ventana
                Gestion.this.dispose();
    }//GEN-LAST:event_GestionAutosActionPerformed

    private void GestionPilotosButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionPilotosButtomActionPerformed
        // 1. Crear la nueva ventana
                Gestion_Piloto v2 = new Gestion_Piloto();
                v2.setVisible(true); // Hacerla visible

                // 2. Cerrar esta ventana (Ventana1)
                // dispose() libera los recursos de la ventana
                Gestion.this.dispose();
    }//GEN-LAST:event_GestionPilotosButtomActionPerformed

    private void GestionMecanicoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionMecanicoButtomActionPerformed
       // 1. Crear la nueva ventana
                Gestion_Mecanico v2 = new Gestion_Mecanico();
                v2.setVisible(true); // Hacerla visible

                // 2. Cerrar esta ventana (Ventana1)
                // dispose() libera los recursos de la ventana
                Gestion.this.dispose();
    }//GEN-LAST:event_GestionMecanicoButtomActionPerformed

    private void GestionPaisesButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionPaisesButtomActionPerformed
        // 1. Crear la nueva ventana
                Gestion_Paises v2 = new Gestion_Paises();
                v2.setVisible(true); // Hacerla visible

                // 2. Cerrar esta ventana (Ventana1)
                // dispose() libera los recursos de la ventana
                Gestion.this.dispose();
    }//GEN-LAST:event_GestionPaisesButtomActionPerformed

    private void VolverInicioButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverInicioButtomActionPerformed
       // 1. Crear la nueva ventana
                Inicio v2 = new Inicio();
                v2.setVisible(true); // Hacerla visible

                // 2. Cerrar esta ventana (Ventana1)
                // dispose() libera los recursos de la ventana
                Gestion.this.dispose();
    }//GEN-LAST:event_VolverInicioButtomActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GestionAutos;
    private javax.swing.JButton GestionCarrera;
    private javax.swing.JButton GestionMecanicoButtom;
    private javax.swing.JButton GestionPaisesButtom;
    private javax.swing.JButton GestionPilotosButtom;
    private javax.swing.JButton VolverInicioButtom;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
