package GUI;

import Servicios.Servicios;
/**
 * Ventana principal de gestión del sistema.
 * Desde aquí se accede a las diferentes pantallas de administración:
 * Autos, Pilotos, Escuderías, Circuitos, Carreras, Países y Mecánicos.
 * @author Diego Trapote
 * @author Juan Toribio
 */

public class Gestion extends javax.swing.JFrame {
    
    Inicio ventanaInicio;
    Servicios servicio;
    /**
     * Constructor que recibe el servicio compartido y la ventana anterior.
     *
     * @param servicio objeto que contiene los métodos de manejo de datos.
     * @param menu ventana de inicio para regresar si se desea.
     */
    public Gestion(Servicios servicio, Inicio menu) {
        initComponents();
        this.servicio = servicio;
        this.ventanaInicio = menu;
    }

    @SuppressWarnings("unchecked")
    // Componentes visuales (generados por el editor)
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        GestionAutos = new javax.swing.JButton();
        GestionPilotosButtom = new javax.swing.JButton();
        jbEscuderia = new javax.swing.JButton();
        btnCircuitos = new javax.swing.JButton();
        jbCarreras = new javax.swing.JButton();
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

        jbEscuderia.setText("Gestion de Escuderias");
        jbEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEscuderiaActionPerformed(evt);
            }
        });

        btnCircuitos.setText("Gestion de Circuitos");
        btnCircuitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircuitosActionPerformed(evt);
            }
        });

        jbCarreras.setText("Gestion de Carreras");
        jbCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCarrerasActionPerformed(evt);
            }
        });

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
                                .addComponent(jbCarreras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GestionPaisesButtom))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GestionAutos)
                                .addGap(72, 72, 72)
                                .addComponent(GestionPilotosButtom)))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbEscuderia)
                                .addGap(61, 61, 61)
                                .addComponent(btnCircuitos))
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
                    .addComponent(jbEscuderia)
                    .addComponent(btnCircuitos))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCarreras)
                    .addComponent(GestionPaisesButtom)
                    .addComponent(GestionMecanicoButtom))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Botón para gestionar Autos
    private void GestionAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionAutosActionPerformed
        Gestion_Autos v2 = new Gestion_Autos(this.servicio, this);
        v2.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_GestionAutosActionPerformed
    // Botón para gestionar Pilotos
    private void GestionPilotosButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionPilotosButtomActionPerformed
        Gestion_Piloto v2 = new Gestion_Piloto(this.servicio, this);
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GestionPilotosButtomActionPerformed
     // Botón para gestionar Mecanicos
    private void GestionMecanicoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionMecanicoButtomActionPerformed
        Gestion_Mecanico v2 = new Gestion_Mecanico(this.servicio, this);
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GestionMecanicoButtomActionPerformed
    // Botón para gestionar Paises
    private void GestionPaisesButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionPaisesButtomActionPerformed
        Gestion_Paises v2 = new Gestion_Paises(this.servicio, this);
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GestionPaisesButtomActionPerformed
  // Botón para volver a inicio
    private void VolverInicioButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverInicioButtomActionPerformed
        this.ventanaInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverInicioButtomActionPerformed
  // Botón para gestionar Circuitos
    private void btnCircuitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircuitosActionPerformed
        Gestion_Circuitos gestionCircuitos = new Gestion_Circuitos(this.servicio, this);
        gestionCircuitos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCircuitosActionPerformed
      // Botón para gestionar Carreras
    private void jbCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarrerasActionPerformed
        Gestion_Carreras gestionCarreras = new Gestion_Carreras(this.servicio, this);
        gestionCarreras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbCarrerasActionPerformed
  // Botón para gestionar Escuderia
    private void jbEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEscuderiaActionPerformed
        Gestion_Escuderias gestionEscuderias = new Gestion_Escuderias(this.servicio, this);
        gestionEscuderias.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbEscuderiaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GestionAutos;
    private javax.swing.JButton GestionMecanicoButtom;
    private javax.swing.JButton GestionPaisesButtom;
    private javax.swing.JButton GestionPilotosButtom;
    private javax.swing.JButton VolverInicioButtom;
    private javax.swing.JButton btnCircuitos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCarreras;
    private javax.swing.JButton jbEscuderia;
    // End of variables declaration//GEN-END:variables
}
