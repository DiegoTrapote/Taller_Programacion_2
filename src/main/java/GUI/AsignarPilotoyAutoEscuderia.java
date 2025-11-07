
package GUI;

import Modelo.Auto;
import Modelo.Escuderia;
import Modelo.Mecanico;
import Modelo.Piloto;
import Modelo.PilotoEscuderia;
import Persistencia.GestionDeDatos;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AsignarPilotoyAutoEscuderia extends javax.swing.JFrame {
    Servicios servicio = new Servicios();
    GestionDeDatos gestion = new  GestionDeDatos();
    public AsignarPilotoyAutoEscuderia() {
        initComponents();
        cargarComboEscuderias();
        agregarEventoCambioEscuderia();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEscuderia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbEscuderia = new javax.swing.JComboBox<>();
        btnAsignar = new javax.swing.JButton();
        bntModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaEscuderia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Pais", "Auto", "Mecanico", "Piloto"
            }
        ));
        jScrollPane1.setViewportView(tablaEscuderia);

        jLabel1.setText("Escuderia");

        btnAsignar.setText("Asignar");

        bntModificar.setText("Modificar");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         Escuderia esc = (Escuderia) cbEscuderia.getSelectedItem();
        cargarTablaEscuderia(esc);
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
   private void cargarTablaEscuderia(Escuderia e) {

    DefaultTableModel modelo = (DefaultTableModel) tablaEscuderia.getModel();
    modelo.setRowCount(0);

    if (e == null) return;

    // 1) Tomamos la lista de piloto-escudería (relación histórica)
    List<PilotoEscuderia> lista = e.getListaPilotoEscuderia();

    // 2) Tomamos la lista de mecánicos de la escudería
    List<Mecanico> mecanicos = e.getListaMecanicos();

    // 3) Por cada piloto ingresamos una fila
    for (PilotoEscuderia pe : lista) {

        Piloto p = pe.getPiloto();

        // Obtener auto asignado mediante servicio
        Auto autoAsignado = servicio.obtenerAutoDePiloto(p);
        String autoTxt = (autoAsignado != null) ? autoAsignado.getModelo() : "Sin Auto";

        // Si la escudería tiene mecánicos, mostrar uno por fila
        if (!mecanicos.isEmpty()) {
            for (Mecanico m : mecanicos) {
                modelo.addRow(new Object[]{
                        e.getNombre(),                         // Nombre Escudería
                        p.getPais().getDescripcion(),          // País Piloto
                        autoTxt,                               // Auto
                        m.getNombre() + " " + m.getApellido(), // Mecanico
                        p.getNombre() + " " + p.getApellido()  // Piloto
                });
            }
        } else {
            // Si NO hay mecánicos, se muestra vacío
            modelo.addRow(new Object[]{
                    e.getNombre(),
                    p.getPais().getDescripcion(),
                    autoTxt,
                    "Sin Mecanicos",
                    p.getNombre() + " " + p.getApellido()
            });
        }
    }
}
   private void cargarComboEscuderias() {
    cbEscuderia.removeAllItems();
    for (Escuderia e : gestion.getEscuderias()){ // si tu getter es distinto decímelo
        cbEscuderia.addItem(e);
    }
}
   private void agregarEventoCambioEscuderia() {
    cbEscuderia.addActionListener(evt -> {
        Escuderia esc = (Escuderia) cbEscuderia.getSelectedItem();
        cargarTablaEscuderia(esc);
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntModificar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Escuderia> cbEscuderia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEscuderia;
    // End of variables declaration//GEN-END:variables
}
