package GUI;

import Modelo.Circuito;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana principal (JFrame) para la gestión de la entidad "Circuito".
 * <p>
 * Esta clase proporciona una interfaz gráfica para que el usuario pueda
 * visualizar, buscar, registrar, modificar y eliminar circuitos del sistema. Se
 * comunica con la capa de Servicios ({@link Servicios}) para realizar las
 * operaciones de lógica de negocio y persistencia.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Gestion_Circuitos extends javax.swing.JFrame {

    Servicios servicio;
    Gestion volver;

    /**
     * Constructor de la ventana Gestion_Circuitos.
     *
     * Inicializa los componentes de la GUI, almacena la instancia de servicios
     * y la ventana de retorno. Llama a {@link #cargarTabla()} para poblar la
     * tabla con los datos iniciales.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección
     * de dependencias).
     * @param volver La ventana {@link Gestion} anterior a la cual se debe
     * regresar.
     */
    public Gestion_Circuitos(Servicios servicio, Gestion volver) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCircuitos = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Gestion de Circuitos");

        tablaCircuitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Longitud"
            }
        ));
        jScrollPane1.setViewportView(tablaCircuitos);

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingresar nombre:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
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
     * Manejador del evento clic para el botón "Registrar". Abre la ventana
     * {@link Registro_Circuitos} para crear un nuevo circuito. Oculta la
     * ventana actual de `Gestion_Circuitos`.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        Registro_Circuitos registro = new Registro_Circuitos(this.servicio, this);
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbRegistrarActionPerformed
    /**
     * Manejador del evento clic para el botón "Volver". Cierra (descarta) la
     * ventana actual y vuelve a mostrar la ventana de gestión principal
     * (`volver`).
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    /**
     * Manejador del evento clic para el botón "Modificar". Obtiene la fila que
     * el usuario ha seleccionado en la `tablaCircuitos`. Si una fila está
     * seleccionada, extrae el nombre del circuito y abre la ventana
     * {@link Modificar_Circuito}, pasándole el nombre como identificador para
     * la modificación.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int filaSeleccionada = tablaCircuitos.getSelectedRow();
        if (filaSeleccionada != -1) {

            String nombre = (String) tablaCircuitos.getValueAt(filaSeleccionada, 0);

            Modificar_Circuito v2 = new Modificar_Circuito(this.servicio, this, nombre);
            v2.setVisible(true);

        }
        this.setVisible(false);


    }//GEN-LAST:event_jbModificarActionPerformed
    /**
     * Manejador del evento clic para el botón "Actualizar". Llama a
     * {@link #cargarTabla()} para recargar la tabla con todos los circuitos,
     * limpiando cualquier filtro de búsqueda.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed
    /**
     * Manejador del evento clic para el botón "Eliminar". Obtiene la fila que
     * el usuario ha seleccionado en la `tablaCircuitos`. Si una fila está
     * seleccionada, extrae el nombre del circuito y llama al servicio
     * {@link Servicios#eliminarCircuito(String)} para borrarlo. Finalmente,
     * actualiza la tabla.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaCircuitos.getSelectedRow();

        if (filaSeleccionada != -1) {
            String nombre = (String) tablaCircuitos.getValueAt(filaSeleccionada, 0);
            servicio.eliminarCircuito(nombre);

            cargarTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * Método auxiliar privado para buscar circuitos por nombre. Filtra la
     * JTable 'tablaCircuitos' para mostrar solo los circuitos cuyo nombre
     * coincide (ignorando mayúsculas/minúsculas) con el texto proporcionado.
     *
     * @param nombre El texto (nombre del circuito) a buscar.
     */
    private void buscar(String nombre) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaCircuitos.getModel();
        modeloTabla.setRowCount(0);

        List<Circuito> listaCircuitos = servicio.traerCircuitos();

        for (Circuito c : listaCircuitos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                Object[] fila = {
                    c.getNombre(),
                    c.getLongitud()
                };
                modeloTabla.addRow(fila);
            }
        }
    }

    /**
     * Manejador del evento clic para el botón "Buscar". Obtiene el texto del
     * campo 'txtNombre' y llama al método auxiliar {@link #buscar(String)} para
     * filtrar la tabla.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar(txtNombre.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed
    /**
     * Método auxiliar privado para cargar (o recargar) la `tablaCircuitos` con
     * la lista completa de circuitos obtenida de la capa de servicios. Limpia
     * la tabla antes de poblarla.
     */
    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaCircuitos.getModel();
        modeloTabla.setRowCount(0);

        List<Circuito> listaCircuitos = servicio.traerCircuitos();

        if (listaCircuitos != null) {
            for (Circuito c : listaCircuitos) {
                Object[] fila = {
                    c.getNombre(),
                    c.getLongitud()
                };
                modeloTabla.addRow(fila);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JTable tablaCircuitos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
