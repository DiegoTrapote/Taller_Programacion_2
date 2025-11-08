
package GUI;

import Modelo.Auto;
import Modelo.Escuderia;
import Modelo.Mecanico;
import Modelo.Piloto;
import Modelo.PilotoEscuderia;
import Servicios.Servicios;
import javax.swing.JOptionPane;

public class AsignarDatosEscuderia extends javax.swing.JFrame {
    
    private Escuderia esc;
    Servicios servicio;
    public AsignarDatosEscuderia(Servicios servicio, Escuderia esc){
       initComponents();
       this.servicio = servicio;
        this.esc = esc;
        cargarCombos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuadar = new javax.swing.JButton();
        cbAsignarAuto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbAsignarMecanico = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbAsignarPiloto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbEscuderia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuadar.setText("Guardar");
        btnGuadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuadarActionPerformed(evt);
            }
        });

        cbAsignarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsignarAutoActionPerformed(evt);
            }
        });

        jLabel1.setText("AsignarAuto");

        cbAsignarMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsignarMecanicoActionPerformed(evt);
            }
        });

        jLabel2.setText("AsignarMecanico");

        cbAsignarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsignarPilotoActionPerformed(evt);
            }
        });

        jLabel3.setText("AsignarPiloto");

        jLabel4.setText("AsignarEscuderia");

        cbEscuderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEscuderiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGuadar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(cbAsignarAuto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbAsignarPiloto, 0, 55, Short.MAX_VALUE)
                            .addComponent(cbAsignarMecanico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAsignarAuto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbAsignarMecanico)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAsignarPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(btnGuadar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAsignarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsignarPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAsignarPilotoActionPerformed

    private void cbAsignarMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsignarMecanicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAsignarMecanicoActionPerformed

    private void cbAsignarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsignarAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAsignarAutoActionPerformed

    private void cbEscuderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEscuderiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEscuderiaActionPerformed

    private void btnGuadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuadarActionPerformed
      Piloto piloto = (Piloto) cbAsignarPiloto.getSelectedItem();
    Mecanico mecanico = (Mecanico) cbAsignarMecanico.getSelectedItem();
    Auto auto = (Auto) cbAsignarAuto.getSelectedItem();
    Escuderia escuderiaSeleccionada = this.esc;

    if (piloto == null || mecanico == null || auto == null) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar todas las opciones.");
        return;
    }

    // 🔥 VALIDACIÓN: el piloto ya tiene una escudería activa?
    for (PilotoEscuderia pe : servicio.traerPilotosEscuderia()) {
        if (pe.getPiloto().equals(piloto) && (pe.getHastaFecha() == null || pe.getHastaFecha().isEmpty())) {
            if (!pe.getEscuderia().equals(escuderiaSeleccionada)) {
                JOptionPane.showMessageDialog(this,
                    "⚠ El piloto ya pertenece a la escudería: " + pe.getEscuderia().getNombre() +
                    "\nDebe cerrar ese período antes de asignarlo a otra.",
                    "Asignación no permitida",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }

    // ✅ Si pasó la validación → asignamos
    String fechaHoy = servicio.fechaActual(); // o la función con la que generás fechas

    PilotoEscuderia nuevaRelacion = new PilotoEscuderia(fechaHoy, "", escuderiaSeleccionada, piloto);
    servicio.traerPilotosEscuderia().add(nuevaRelacion);

    JOptionPane.showMessageDialog(this, "✅ Piloto asignado correctamente a la escudería.");
    this.dispose();
    }//GEN-LAST:event_btnGuadarActionPerformed
    private void cargarCombos() {

    // Pilotos de la escudería
    cbAsignarPiloto.removeAllItems();
    for (PilotoEscuderia pe : esc.getListaPilotoEscuderia()) {
        cbAsignarPiloto.addItem(pe.getPiloto());
    }

    // Mecánicos de la escudería
    cbAsignarMecanico.removeAllItems();
    for (Mecanico m : esc.getListaMecanicos()) {
        cbAsignarMecanico.addItem(m);
    }

    // Autos disponibles (o todos si no hay restricciones)
    cbAsignarAuto.removeAllItems();
    for (Auto a : servicio.traerAutos()) { 
        cbAsignarAuto.addItem(a);
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuadar;
    private javax.swing.JComboBox<Auto> cbAsignarAuto;
    private javax.swing.JComboBox<Mecanico> cbAsignarMecanico;
    private javax.swing.JComboBox<Piloto> cbAsignarPiloto;
    private javax.swing.JComboBox<Escuderia> cbEscuderia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
