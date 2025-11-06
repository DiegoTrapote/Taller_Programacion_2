package GUI;

import Modelo.Carrera;
import Servicios.Servicios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Gestion_Carreras extends javax.swing.JFrame {
    Servicios servicio;
    Gestion volver;
    public Gestion_Carreras(Servicios servicio, Gestion volver) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
       /* javax.swing.table.TableColumnModel columnModel = tablaCarreras.getColumnModel();
        javax.swing.table.TableColumn columnaOculta = columnModel.getColumn(0); 
        columnaOculta.setMinWidth(0);
        columnaOculta.setMaxWidth(0);
        columnaOculta.setPreferredWidth(0);
        columnaOculta.setResizable(false);*/
        
        cargarTabla();
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
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jbInscribirPiloto = new javax.swing.JButton();
        jbCargarResultados = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

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

        jButton5.setText("Buscar");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbInscribirPiloto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCargarResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbVolver)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
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

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        Registro_Carrera registrarCarrera = new Registro_Carrera(this.servicio, this);
                registrarCarrera.setVisible(true); 
                this.setVisible(false);
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbInscribirPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirPilotoActionPerformed
        int filaSeleccionada = tablaCarreras.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtiene el ID de la columna 5 (la oculta)
            int valor = (Integer) tablaCarreras.getValueAt(filaSeleccionada, 0);

            Inscripcion_Carrera v2 = new Inscripcion_Carrera(this.servicio, this, valor);
            v2.setVisible(true);

        }
    }//GEN-LAST:event_jbInscribirPilotoActionPerformed

    private void jbCargarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarResultadosActionPerformed
        Registro_Resultados_Carreras cargaResultados = new Registro_Resultados_Carreras();
                cargaResultados.setVisible(true); 
                Gestion_Carreras.this.dispose();
    }//GEN-LAST:event_jbCargarResultadosActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
         int filaSeleccionada = tablaCarreras.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtiene el ID de la columna 5 (la oculta)
            int valor = (Integer) tablaCarreras.getValueAt(filaSeleccionada, 0);

            Modificar_Carrera v2 = new Modificar_Carrera(this.servicio, this, valor);
            v2.setVisible(true);

        }
        this.setVisible(false);
                                 
    }//GEN-LAST:event_jbModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaCarreras.getSelectedRow();
        System.out.println("Fila seleccionada: " + filaSeleccionada);
        if (filaSeleccionada != -1) {

            int valor = (Integer) tablaCarreras.getValueAt(filaSeleccionada, 0);
            

            servicio.eliminarCarrera(valor);

            cargarTabla(); // Refresca
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed
    private void cargarTabla() {
        // 1. Obtener el modelo de la tabla
        // (Asegurate de que tu JTable en el diseñador se llame 'tablaPilotos' o cambia el nombre aquí)
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaCarreras.getModel();

        // 2. Limpiar la tabla por si tenía datos viejos
        modeloTabla.setRowCount(0);

        // 3. Pedir los datos a la capa de servicios
        // (Este método "traerPilotos()" lo tenés que crear en tu clase Servicios)
        List<Carrera> listaCarreras = servicio.traerCarreras();

        // 4. Recorrer la lista y agregar cada piloto como una fila
        if (listaCarreras != null) {
            for (Carrera c : listaCarreras) {
                // "Object[]" es un array de objetos que representa una fila

                Object[] fila = {
                    c.getValor(),
                    c.getCircuito(),
                    c.getPais(),
                    c.getFechaRealizacion(),
                    c.getHoraRealizacion(),
                    c.getNumeroVueltas()
                };

                // 5. Agregar la fila al modelo
                modeloTabla.addRow(fila);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbCargarResultados;
    private javax.swing.JButton jbInscribirPiloto;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTable tablaCarreras;
    // End of variables declaration//GEN-END:variables
}
