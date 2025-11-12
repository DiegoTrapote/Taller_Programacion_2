package GUI;

import Modelo.Piloto;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana principal (JFrame) para la gestión de la entidad "Piloto".
 * <p>
 * Esta clase proporciona una interfaz gráfica para que el usuario pueda
 * visualizar, buscar por DNI, registrar, modificar y eliminar pilotos del
 * sistema. También sirve como punto de entrada para el informe de "Histórico de
 * Pilotos". Se comunica con la capa de Servicios ({@link Servicios}) para
 * realizar las operaciones de lógica de negocio.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Gestion_Piloto extends javax.swing.JFrame {

    Servicios servicio;
    Gestion ventanaGestion;

    /**
     * Constructor de la ventana Gestion_Piloto.
     *
     * Inicializa los componentes de la GUI, almacena la instancia de servicios
     * y la ventana de retorno. Llama a {@link #cargarTabla()} para poblar la
     * tabla con los datos iniciales.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección
     * de dependencias).
     * @param menu La ventana {@link Gestion} anterior a la cual se debe
     * regresar.
     */
    public Gestion_Piloto(Servicios servicio, Gestion menu) {
        initComponents();
        this.servicio = servicio;
        this.ventanaGestion = menu;
        cargarTabla();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPilotos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        RegistrarButtom = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        txtBuscarDni = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Gestion de Pilotos");

        tablaPilotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido", "N° Competencia", "Pais"
            }
        ));
        jScrollPane1.setViewportView(tablaPilotos);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        RegistrarButtom.setText("Registrar");
        RegistrarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarButtomActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingresar DNI:");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnHistorico.setText("Historico");
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RegistrarButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegistrarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Manejador del evento clic para el botón "Registrar". Abre la ventana
     * {@link Registro_Pilotos} para crear un nuevo piloto. Oculta la ventana
     * actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void RegistrarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarButtomActionPerformed

        Registro_Pilotos v2 = new Registro_Pilotos(this.servicio, this);
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarButtomActionPerformed
    /**
     * Manejador del evento clic para el botón "Volver". Cierra (descarta) la
     * ventana actual y vuelve a mostrar la ventana de gestión principal
     * (`ventanaGestion`).
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.ventanaGestion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    /**
     * Manejador del evento clic para el botón "Modificar". Obtiene la fila que
     * el usuario ha seleccionado en la `tablaPilotos`. Si es válida, extrae el
     * DNI del piloto (columna 0) y abre la ventana {@link Modificar_Piloto},
     * pasándole el DNI como identificador. Oculta la ventana actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int filaSeleccionada = tablaPilotos.getSelectedRow();
        if (filaSeleccionada != -1) {

            String dni = (String) tablaPilotos.getValueAt(filaSeleccionada, 0);

            Modificar_Piloto v2 = new Modificar_Piloto(this.servicio, this, dni);
            v2.setVisible(true);

        }
        this.setVisible(false);
    }//GEN-LAST:event_btnModificarActionPerformed
    /**
     * Manejador del evento clic para el botón "Actualizar". Llama a
     * {@link #cargarTabla()} para recargar la lista completa de pilotos,
     * limpiando cualquier filtro de búsqueda.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed
    /**
     * Manejador del evento clic para el botón "Eliminar". Obtiene la fila
     * seleccionada de la `tablaPilotos`. Si es válida, extrae el DNI (columna
     * 0) y llama al servicio {@link Servicios#eliminarPiloto(String)} para
     * borrarlo. Finalmente, refresca la tabla.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaPilotos.getSelectedRow();

        if (filaSeleccionada != -1) {

            String dni = (String) tablaPilotos.getValueAt(filaSeleccionada, 0);

            servicio.eliminarPiloto(dni);

            cargarTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * Manejador del evento clic para el botón "Buscar". Obtiene el texto del
     * campo 'txtBuscarDni' y llama al método auxiliar
     * {@link #buscarDni(String)} para filtrar la tabla.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarDni(txtBuscarDni.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed
    /**
     * Manejador del evento clic para el botón "Historico". Abre la ventana de
     * informe {@link Historico_Pilotos}. Oculta la ventana actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        Historico_Pilotos historico = new Historico_Pilotos(this.servicio, this);
        historico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHistoricoActionPerformed
    /**
     * Método auxiliar privado para buscar un piloto por DNI. Filtra la JTable
     * 'tablaPilotos' para mostrar solo el piloto cuyo DNI coincide con el texto
     * proporcionado.
     *
     * @param dni El DNI del piloto a buscar.
     */
    private void buscarDni(String dni) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPilotos.getModel();
        modeloTabla.setRowCount(0);
        List<Piloto> listaPilotos = servicio.traerPilotos();
        for (Piloto p : listaPilotos) {
            if (p.getDni().equals(dni)) {
                Object[] fila = {
                    p.getDni(),
                    p.getNombre(),
                    p.getApellido(),
                    p.getNumeroCompetencia(),
                    p.getPais()
                };
                modeloTabla.addRow(fila);
            }

        }
    }

    /**
     * Método auxiliar privado para cargar (o recargar) la `tablaPilotos` con la
     * lista completa de pilotos obtenida de la capa de servicios. Limpia la
     * tabla antes de poblarla.
     */
    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPilotos.getModel();

        modeloTabla.setRowCount(0);

        List<Piloto> listaPilotos = servicio.traerPilotos();

        if (listaPilotos != null) {
            for (Piloto p : listaPilotos) {

                Object[] fila = {
                    p.getDni(),
                    p.getNombre(),
                    p.getApellido(),
                    p.getNumeroCompetencia(),
                    p.getPais()
                };

                modeloTabla.addRow(fila);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegistrarButtom;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaPilotos;
    private javax.swing.JTextField txtBuscarDni;
    // End of variables declaration//GEN-END:variables
}
