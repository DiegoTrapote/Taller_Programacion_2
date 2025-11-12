package GUI;

import Modelo.Piloto;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 * Ventana destinada a mostrar el ranking de pilotos según sus puntos acumulados.
 *
 * La tabla presenta la posición en el ranking, el nombre del piloto y sus puntos.
 * El ranking se obtiene desde la capa de servicios, que realiza el cálculo y ordenamiento.
 * 
 * La interfaz permite actualizar el ranking y volver a la ventana de informes.
 * @author Diego Trapote
 * @author Juan Toribio
 */

public class Ranking_pilotos extends javax.swing.JFrame {
 /**
     * Servicio que administra la lógica de negocio y acceso a los datos.
     */
    Servicios servicio;
       /**
     * Ventana desde la que se accedió, utilizada para volver al menú de informes.
     */
    Informes volver;
 /**
     * Constructor de la ventana Ranking_pilotos.
     *
     * @param servicio instancia de la capa de servicios
     * @param volver referencia a la ventana de informes para regresar al salir
     */
    public Ranking_pilotos(Servicios servicio, Informes volver) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRanking = new javax.swing.JTable();
        ActualizarButtom = new javax.swing.JButton();
        SalirButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Ranking de pilotos");

        tablaRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Posicion", "Piloto", "Puntos"
            }
        ));
        jScrollPane1.setViewportView(tablaRanking);

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
 /**
     * Acción del botón "Actualizar".
     * 
     * Permite recargar el contenido de la tabla para reflejar cambios recientes
     * en los puntos de los pilotos.
     *
     * @param evt evento de acción del botón
     */
    private void ActualizarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarButtomActionPerformed
        cargarTabla();
    }//GEN-LAST:event_ActualizarButtomActionPerformed
  /**
     * Acción del botón "Salir".
     * 
     * Retorna a la ventana de informes y cierra esta ventana.
     *
     * @param evt evento de acción del botón
     */
    private void SalirButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtomActionPerformed
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirButtomActionPerformed
      /**
     * Carga los datos del ranking de pilotos en la tabla.
     *
     * Obtiene una lista ordenada de pilotos desde la capa de servicios,
     * limpia la tabla y agrega cada piloto con su posición y puntos.
     */
    private void cargarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) tablaRanking.getModel();
        modelo.setRowCount(0);

        List<Piloto> ranking = servicio.rankingPilotos();

        int posicion = 1;
        for (Piloto p : ranking) {
            Object[] fila = {
                posicion + "º", 
                p, 
                p.getPuntos() 
            };
            modelo.addRow(fila);
            posicion++;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarButtom;
    private javax.swing.JButton SalirButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRanking;
    // End of variables declaration//GEN-END:variables
}
