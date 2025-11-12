package GUI;

import Modelo.Auto;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana principal (JFrame) para la gestión de la entidad "Auto". * Esta clase
 * proporciona una interfaz gráfica para que el usuario pueda visualizar,
 * buscar, registrar, modificar y eliminar autos del sistema. * Se comunica con
 * la capa de Servicios ({@link Servicios}) para realizar las operaciones de
 * lógica de negocio y persistencia.
 * 
 * * @author Diego Trapote
 * * @author Juan Toribio
 */
public class Gestion_Autos extends javax.swing.JFrame {

    Servicios servicio;
    Gestion volver;

    /**
     * Constructor de la ventana Gestion_Autos. * Inicializa los componentes de
     * la GUI, almacena las instancias de servicio y la ventana de retorno.
     * Configura la tabla para ocultar la columna 0 (ID) y llama a
     * {@link #cargarTabla()} para poblar los datos iniciales.
     *
     * @param servicio La instancia de la capa de {@link Servicios}, inyectada
     * para manejar la lógica de negocio.
     * @param volver La ventana anterior ({@link Gestion}) a la cual se debe
     * regresar al presionar "Volver".
     */
    public Gestion_Autos(Servicios servicio, Gestion volver) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        tablaAuto.getColumnModel().getColumn(0).setMinWidth(0);
        tablaAuto.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaAuto.getColumnModel().getColumn(0).setWidth(0);
        cargarTabla();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeContenido = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAuto = new javax.swing.JTable();
        VolverGestionButtom = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        TablaDeContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaDeContenido);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Gestion de Autos");

        tablaAuto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Modelo", "Motor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaAuto);

        VolverGestionButtom.setText("Volver");
        VolverGestionButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverGestionButtomActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresar Modelo:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(VolverGestionButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VolverGestionButtom)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método auxiliar privado para buscar autos por modelo. Filtra la JTable
     * 'tablaAuto' para mostrar solo los autos cuyo modelo coincide (ignorando
     * mayúsculas/minúsculas) con el texto proporcionado.
     */
    private void buscar(String modelo) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaAuto.getModel();
        modeloTabla.setRowCount(0);

        List<Auto> listaAutos = servicio.traerAutos();

        for (Auto a : listaAutos) {
            if (a.getModelo().equalsIgnoreCase(modelo)) {
                Object[] fila = {
                    a.getValor(), // ID (oculto)
                    a.getModelo(),
                    a.getMotor()
                };
                modeloTabla.addRow(fila);
            }
        }
    }

    /**
     * Manejador del evento clic para el botón "Volver". Cierra (descarta) la
     * ventana actual de `Gestion_Autos` y vuelve a mostrar la ventana de
     * gestión principal (`volver`).
     */
    private void VolverGestionButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverGestionButtomActionPerformed

        volver.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_VolverGestionButtomActionPerformed
    
    /**
     * Manejador del evento clic para el botón "Buscar". Obtiene el texto del
     * campo 'txtModelo' y llama al método auxiliar {@link #buscar(String)} para
     * filtrar la tabla. También re-oculta la columna 0 (ID) después de la
     * búsqueda.
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar(txtModelo.getText());
        tablaAuto.getColumnModel().getColumn(0).setMinWidth(0);
        tablaAuto.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaAuto.getColumnModel().getColumn(0).setWidth(0);
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    /**
     * Manejador del evento clic para el botón "Modificar".
     * Obtiene la fila que el usuario ha seleccionado en la `tablaAuto`.
     * Si una fila está seleccionada, extrae el ID (valor) del auto desde la
     * columna oculta (columna 0) y abre la ventana `Modificar_Auto`,
     * pasándole los datos necesarios (servicio, ventana actual y el ID).
     * Si no hay fila seleccionada, muestra un mensaje de advertencia.
     */
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int filaSeleccionada = tablaAuto.getSelectedRow();

        if (filaSeleccionada != -1) {
            int id = (int) tablaAuto.getValueAt(filaSeleccionada, 0); // columna 0 (oculta)

            Modificar_Auto v2 = new Modificar_Auto(this.servicio, this, id);
            v2.setVisible(true);
            this.setVisible(false);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un auto.");
        }

    }//GEN-LAST:event_btnModificarActionPerformed
    
    /**
     * Manejador del evento clic para el botón "Eliminar".
     * Obtiene la fila que el usuario ha seleccionado en la `tablaAuto`.
     * Si una fila está seleccionada, extrae el ID (valor) de la columna oculta
     * y llama a eliminarAuto(int) para borrarlo.
     * Finalmente, actualiza la tabla.
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaAuto.getSelectedRow();

        if (filaSeleccionada != -1) {
            int id = (int) tablaAuto.getValueAt(filaSeleccionada, 0);
            servicio.eliminarAuto(id);
            cargarTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    /**
     * Manejador del evento clic para el botón "Registrar".
     * Abre la ventana `Registro_Auto` para permitir la creación de un nuevo auto.
     * Oculta la ventana actual de `Gestion_Autos`.
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Registro_Auto registro = new Registro_Auto(this.servicio, this);
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    /**
     * Manejador del evento clic para el botón "Actualizar".
     * Llama a {@link #cargarTabla()} para recargar la lista completa de autos.
     * Esto es útil para limpiar un filtro de búsqueda y ver todos los datos.
     */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    /**
     * Método auxiliar privado para cargar (o recargar) la `tablaAuto` con la
     * lista completa de autos obtenida de la capa de servicios.
     * Limpia la tabla antes de poblarla.
     */
    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaAuto.getModel();

        modeloTabla.setRowCount(0);

        List<Auto> listaAutos = servicio.traerAutos();

        if (listaAutos != null) {
            for (Auto a : listaAutos) {

                Object[] fila = {
                    a.getValor(),
                    a.getModelo(),
                    a.getMotor(),};

                modeloTabla.addRow(fila);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeContenido;
    private javax.swing.JButton VolverGestionButtom;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAuto;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
