package GUI;

import Modelo.Carrera;
import Servicios.Servicios;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 * Ventana principal (JFrame) para la gestión de la entidad Carrera.
 * Esta clase proporciona una interfaz gráfica para que el usuario pueda
 * visualizar, filtrar por fecha, registrar, modificar y eliminar carreras.
 * Además, actúa como punto de entrada para las ventanas de "Inscribir Piloto"
 * y "Cargar Resultados", pasando la carrera seleccionada como contexto.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Gestion_Carreras extends javax.swing.JFrame {

    Servicios servicio;
    Gestion volver;
    /**
     * Constructor de la ventana Gestion_Carreras.
     *
     * Inicializa los componentes de la GUI, almacena la instancia de servicios
     * y la ventana de retorno. Configura la tabla 'tablaCarreras' para ocultar
     * la primera columna (que contiene el ID 'valor') y carga
     * la lista inicial de carreras.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección de
     * dependencias).
     * @param volver La ventana {@link Gestion} anterior a la cual se debe
     * regresar.
     */
    public Gestion_Carreras(Servicios servicio, Gestion volver) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        javax.swing.table.TableColumnModel columnModel = tablaCarreras.getColumnModel();
        javax.swing.table.TableColumn columnaOculta = columnModel.getColumn(0);
        columnaOculta.setMinWidth(0);
        columnaOculta.setMaxWidth(0);
        columnaOculta.setPreferredWidth(0);
        columnaOculta.setResizable(false);
        cargarTablaCompleta();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarreras = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jbInscribirPiloto = new javax.swing.JButton();
        jbCargarResultados = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jdFechaDesde = new com.toedter.calendar.JDateChooser();
        jdFechaHasta = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Gestion de Carreras");

        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        tablaCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Valor", "Circuito", "Pais", "Fecha", "Hora", "Vueltas"
            }
        ));
        jScrollPane1.setViewportView(tablaCarreras);

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

        jLabel2.setText("Fecha desde:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jbInscribirPiloto.setText("Inscribir Piloto");
        jbInscribirPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirPilotoActionPerformed(evt);
            }
        });

        jbCargarResultados.setText("Cargar Resultados");
        jbCargarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarResultadosActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Hasta:");

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
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbInscribirPiloto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCargarResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbVolver)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(btnBuscar)
                                .addComponent(jLabel3))
                            .addComponent(jdFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbInscribirPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbCargarResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jdFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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
     * Manejador del evento clic para el botón "Registrar".
     * Abre la ventana {@link Registro_Carrera} para crear una nueva carrera.
     * Oculta la ventana actual de `Gestion_Carreras`.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        Registro_Carrera registrarCarrera = new Registro_Carrera(this.servicio, this);
        registrarCarrera.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbRegistrarActionPerformed
    /**
     * Manejador del evento clic para el botón "Inscribir Piloto".
     * Obtiene la fila seleccionada de la `tablaCarreras`.
     * Si se selecciona una carrera, obtiene su 'valor' (ID) de la columna
     * oculta (0) y abre la ventana {@link Inscripcion_Carrera}, pasando el
     * ID de la carrera para la cual se inscribirán pilotos.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void jbInscribirPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirPilotoActionPerformed
        int filaSeleccionada = tablaCarreras.getSelectedRow();
        if (filaSeleccionada != -1) {

            int valor = (Integer) tablaCarreras.getValueAt(filaSeleccionada, 0);

            Inscripcion_Carrera v2 = new Inscripcion_Carrera(this.servicio, this, valor);
            v2.setVisible(true);

        }
    }//GEN-LAST:event_jbInscribirPilotoActionPerformed
    /**
     * Manejador del evento clic para el botón "Cargar Resultados".
     * Obtiene la fila seleccionada de la `tablaCarreras`.
     * Si se selecciona una carrera, busca el objeto {@link Carrera} completo
     * usando el servicio y abre la ventana {@link Registro_Resultados_Carreras},
     * pasando el objeto Carrera completo.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void jbCargarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarResultadosActionPerformed
        int filaSeleccionada = tablaCarreras.getSelectedRow();

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una carrera de la tabla.");
            return;
        }

        int valorCarrera = (Integer) tablaCarreras.getValueAt(filaSeleccionada, 0);

        Carrera carreraSel = servicio.buscarCarreraPorValor(valorCarrera);

        if (carreraSel != null) {

            Registro_Resultados_Carreras vResultados = new Registro_Resultados_Carreras(this.servicio, this, carreraSel);
            vResultados.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbCargarResultadosActionPerformed
    /**
     * Manejador del evento clic para el botón "Volver".
     * Cierra (descarta) la ventana actual de `Gestion_Carreras` y vuelve a
     * mostrar la ventana de gestión principal (`volver`).
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed
    /**
     * Manejador del evento clic para el botón "Modificar".
     * Obtiene la fila seleccionada de la `tablaCarreras`.
     * Si se selecciona una carrera, obtiene su 'valor' (ID) de la columna
     * oculta (0) y abre la ventana {@link Modificar_Carrera}, pasando el
     * ID de la carrera a modificar.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int filaSeleccionada = tablaCarreras.getSelectedRow();
        if (filaSeleccionada != -1) {

            int valor = (Integer) tablaCarreras.getValueAt(filaSeleccionada, 0);

            Modificar_Carrera v2 = new Modificar_Carrera(this.servicio, this, valor);
            v2.setVisible(true);

        }
        this.setVisible(false);

    }//GEN-LAST:event_jbModificarActionPerformed
    
    /**
     * Manejador del evento clic para el botón "Eliminar".
     * Obtiene la fila seleccionada de la `tablaCarreras`.
     * Si se selecciona una carrera, obtiene su 'valor' (ID) y llama al
     * servicio {@link Servicios#eliminarCarrera(int)} para borrarla.
     * Finalmente, refresca la tabla.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaCarreras.getSelectedRow();
        if (filaSeleccionada != -1) {

            int valor = (Integer) tablaCarreras.getValueAt(filaSeleccionada, 0);

            servicio.eliminarCarrera(valor);

            cargarTablaCompleta();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    /**
     * Manejador del evento clic para el botón "Actualizar".
     * Llama a {@link #cargarTablaCompleta()} para recargar la tabla con todos
     * los datos, eliminando cualquier filtro de búsqueda activo.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarTablaCompleta();
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    /**
     * Manejador del evento clic para el botón "Buscar".
     * Filtra la `tablaCarreras` para mostrar solo las carreras que se
     * encuentran dentro del rango de fechas seleccionado en los
     * componentes `jdFechaDesde` y `jdFechaHasta`.
     * Valida que ambas fechas estén seleccionadas y que la fecha de inicio
     * no sea posterior a la fecha de fin.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Date fechaInicio = jdFechaDesde.getDate();
        Date fechaFin = jdFechaHasta.getDate();

        if (fechaInicio == null || fechaFin == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione ambas fechas.",
                    "Error de Validación",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (fechaInicio.after(fechaFin)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "La 'Fecha desde' no puede ser posterior a la 'Fecha hasta'.",
                    "Error de Validación",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        List<Carrera> carrerasFiltradas = servicio.buscarCarrerasPorFechas(fechaInicio, fechaFin);

        if (carrerasFiltradas.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No se encontraron carreras en el rango de fechas seleccionado.",
                    "Información",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

        cargarTabla(carrerasFiltradas);
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    /**
     * Método auxiliar que obtiene la lista *completa* de todas las carreras
     * desde la capa de servicio y luego llama a
     * {@link #cargarTabla(List)} para mostrarlas en la JTable.
     */
    private void cargarTablaCompleta() {

        List<Carrera> todasLasCarreras = servicio.traerCarreras();

        cargarTabla(todasLasCarreras);
    }
    
    /**
     * Método auxiliar centralizado para poblar la `tablaCarreras`.
     * Limpia la tabla y luego la llena con las carreras de la lista
     * proporcionada (que puede ser la lista completa o una filtrada).
     *
     * @param carreras La lista de objetos {@link Carrera} a mostrar.
     */
    private void cargarTabla(List<Carrera> carreras) {

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaCarreras.getModel();

        modeloTabla.setRowCount(0);

        if (carreras != null) {

            for (Carrera c : carreras) {

                Object[] fila = {
                    c.getValor(),
                    c.getCircuito(),
                    c.getPais(),
                    c.getFechaRealizacion(),
                    c.getHoraRealizacion(),
                    c.getNumeroVueltas()
                };

                modeloTabla.addRow(fila);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCargarResultados;
    private javax.swing.JButton jbInscribirPiloto;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbVolver;
    private com.toedter.calendar.JDateChooser jdFechaDesde;
    private com.toedter.calendar.JDateChooser jdFechaHasta;
    private javax.swing.JTable tablaCarreras;
    // End of variables declaration//GEN-END:variables
}
