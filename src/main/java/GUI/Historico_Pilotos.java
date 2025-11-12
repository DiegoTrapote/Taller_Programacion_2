
package GUI;

import Modelo.Piloto;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 * Ventana que muestra el historial de desempeño de los pilotos.
 *
 * En esta vista se visualizan:
 * - Cantidad total de victorias.
 * - Cantidad total de podios.
 *
 * Además, permite:
 * - Filtrar los resultados por piloto.
 * - Mostrar todos los pilotos.
 * - Actualizar la información.
 * - Regresar a la ventana de gestión de pilotos.
 * @author Diego Trapote
 * @author Juan Toribio
 */

public class Historico_Pilotos extends javax.swing.JFrame {
     /** Servicio para acceder a los datos del sistema. */
    Servicios servicio;
     /** Ventana a la cual se vuelve al presionar el botón "Volver". */
    Gestion_Piloto volver;
     /** Modelo de la tabla donde se muestran los datos de los pilotos. */
    DefaultTableModel modeloTabla;
     /** Permite aplicar filtros a la tabla. */
    javax.swing.table.TableRowSorter<DefaultTableModel> sorter;
     /**
     * Constructor de la interfaz.
     *
     * @param servicio objeto servicio que gestiona los datos.
     * @param volver referencia de la pantalla anterior para regresar.
     */
    public Historico_Pilotos(Servicios servicio, Gestion_Piloto volver) {
        initComponents();// Código autogenerado por NetBeans (NO modificar)
        this.servicio = servicio;
        this.volver = volver;
          // Inicializa el modelo y el sistema de ordenamiento/filtrado
        this.modeloTabla = (DefaultTableModel) tablaPilotos.getModel();
        this.sorter = new javax.swing.table.TableRowSorter<>(modeloTabla);
        tablaPilotos.setRowSorter(this.sorter);
        cargarTabla();
        cargarPilotosEnComboBox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbPilotos = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPilotos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Historico victorias y podios de pilotos");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Piloto:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaPilotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Piloto", "Victorias", "Podios"
            }
        ));
        jScrollPane1.setViewportView(tablaPilotos);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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
                        .addComponent(btnVolver)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
  /**
     * Aplica el filtro según el piloto seleccionado.
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Object itemSeleccionado = cbPilotos.getSelectedItem();

        if (itemSeleccionado == null) {
            return;
        }

        if (itemSeleccionado.equals("Mostrar Todos")) {

            sorter.setRowFilter(null);

        } else {

            Piloto pilotoFiltro = (Piloto) itemSeleccionado;

            sorter.setRowFilter(javax.swing.RowFilter.regexFilter(
                    "^" + pilotoFiltro.toString() + "$", 0
            ));
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
 /**
     * Vuelve a la pantalla de gestión de pilotos.
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
   /**
     * Quita filtros y vuelve a cargar los datos desde cero.
     */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        sorter.setRowFilter(null);
        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed
      /**
     * Llena la tabla con todos los pilotos y sus estadísticas.
     */
    private void cargarTabla() {

        modeloTabla.setRowCount(0); 

        List<Piloto> listaDePilotos = servicio.traerPilotos();
        for (Piloto p : listaDePilotos) {
            int[] stats = servicio.calcularEstadisticas(p);
            Object[] fila = {
                p, 
                stats[0], 
                stats[1] 
            };
            modeloTabla.addRow(fila);
        }
    }
    /**
     * Carga los pilotos disponibles en el ComboBox para permitir filtros.
     */
    private void cargarPilotosEnComboBox() {
        cbPilotos.removeAllItems();

        List<Piloto> lista = servicio.traerPilotos();
        for (Piloto p : lista) {
            cbPilotos.addItem(p); 
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Piloto> cbPilotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPilotos;
    // End of variables declaration//GEN-END:variables

}
