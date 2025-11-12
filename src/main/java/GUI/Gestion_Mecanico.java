package GUI;

import Modelo.Mecanico;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Servicios.Servicios;

/**
 * Ventana principal (JFrame) para la gestión de la entidad "Mecanico".
 * <p>
 * Esta clase proporciona una interfaz gráfica para que el usuario pueda
 * visualizar, registrar, modificar y eliminar mecánicos del sistema. Se
 * comunica con la capa de Servicios ({@link Servicios}) para realizar las
 * operaciones de lógica de negocio y persistencia.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Gestion_Mecanico extends javax.swing.JFrame {

    Servicios servicio;
    Gestion volver;

    /**
     * Constructor principal de la ventana Gestion_Mecanico.
     *
     * Inicializa los componentes, almacena las instancias de servicio y la
     * ventana de retorno, y llama a {@link #cargarTabla()} para poblar los
     * datos iniciales.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección
     * de dependencias).
     * @param menu La ventana {@link Gestion} anterior a la cual se debe
     * regresar.
     */
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
    /**
     * Manejador del evento clic para el botón "Volver". Cierra (descarta) la
     * ventana actual y vuelve a mostrar la ventana de gestión principal
     * (`volver`).
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void VolverGestionButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverGestionButtomActionPerformed

        this.volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverGestionButtomActionPerformed
    /**
     * Manejador del evento clic para el botón "Registrar". Abre la ventana
     * {@link Registro_Mecanico} para crear un nuevo mecánico. Oculta la ventana
     * actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void RegistrarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarButtomActionPerformed

        Registro_Mecanico v2 = new Registro_Mecanico(this.servicio, this);
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarButtomActionPerformed
    /**
     * Manejador del evento clic para el botón "Eliminar". Obtiene la fila
     * seleccionada de la `tablaMecanicos`. Si una fila es válida, extrae el DNI
     * (columna 0) y llama al servicio
     * {@link Servicios#eliminarMecanico(String)} para borrarlo. Finalmente,
     * refresca la tabla.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void EliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtonActionPerformed
        int filaSeleccionada = tablaMecanicos.getSelectedRow();

        if (filaSeleccionada != -1) {

            String dni = (String) tablaMecanicos.getValueAt(filaSeleccionada, 0);

            servicio.eliminarMecanico(dni);

            cargarTabla();
        }
    }//GEN-LAST:event_EliminarButtonActionPerformed
    /**
     * Manejador del evento clic para el botón "Modificar". Obtiene la fila
     * seleccionada de la `tablaMecanicos`. Si es válida, extrae el DNI (columna
     * 0) y abre la ventana {@link Modificar_Mecanico}, pasándole el DNI como
     * identificador. Oculta la ventana actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void ModificarMecanicoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarMecanicoButtomActionPerformed
        int filaSeleccionada = tablaMecanicos.getSelectedRow();
        if (filaSeleccionada != -1) {

            String dni = (String) tablaMecanicos.getValueAt(filaSeleccionada, 0);

            Modificar_Mecanico v2 = new Modificar_Mecanico(this.servicio, this, dni);
            v2.setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_ModificarMecanicoButtomActionPerformed
    /**
     * Manejador del evento clic para el botón "Actualizar". Llama a
     * {@link #cargarTabla()} para recargar la lista completa de mecánicos.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void ActualizarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarButtomActionPerformed

        cargarTabla();
    }//GEN-LAST:event_ActualizarButtomActionPerformed
    /**
     * Método auxiliar privado para cargar (o recargar) la `tablaMecanicos` con
     * la lista completa de mecánicos obtenida de la capa de servicios. Limpia
     * la tabla antes de poblarla.
     */
    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaMecanicos.getModel();

        modeloTabla.setRowCount(0);

        List<Mecanico> listaMecanicos = servicio.traerMecanicos();

        if (listaMecanicos != null) {
            for (Mecanico p : listaMecanicos) {

                Object[] fila = {
                    p.getDni(),
                    p.getNombre(),
                    p.getApellido(),
                    p.getAniosExperiencia(),
                    p.getPais(),
                    p.getEspecialidad()
                };

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
