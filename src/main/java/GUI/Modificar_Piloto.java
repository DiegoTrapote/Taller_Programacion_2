package GUI;

import Modelo.Pais;
import Modelo.Piloto;
import Servicios.Servicios;
/**
 * Ventana destinada a la modificación de datos de un piloto existente.
 *
 * Permite editar el nombre, apellido, DNI y país asociado al piloto.
 * Utiliza la capa de servicios para aplicar los cambios, identificando
 * al piloto mediante su DNI original recibido por parámetro.
 * 
 * Una vez guardados los datos, retorna a la ventana de gestión de pilotos.
 */

public class Modificar_Piloto extends javax.swing.JFrame {
    
    /**
     * Servicio que administra la lógica del sistema y el acceso a los datos.
     */
    Servicios servicio;
      /**
     * Ventana desde la cual se accedió, para poder regresar al finalizar.
     */
    Gestion_Piloto gestionPiloto;
    
    /**
     * DNI original del piloto a modificar.
     * Se usa para identificar correctamente al piloto a editar.
     */ 
    String dniViejo;
    /**
     * Constructor de la ventana Modificar_Piloto.
     *
     * @param servicio instancia de la capa de servicios
     * @param volver ventana de gestión de pilotos que llamó a esta interfaz
     * @param dni DNI del piloto cuyos datos se desean modificar
     */
    public Modificar_Piloto(Servicios servicio, Gestion_Piloto volver, String dni) {
        initComponents(); // Código autogenerado por NetBeans
        this.servicio = servicio;
        this.gestionPiloto = volver;
        this.dniViejo = dni;
        cargarDatosPiloto();// Carga los datos actuales del piloto en los campos
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cbPais = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Modificar Piloto");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("DNI:");

        jLabel5.setText("País:");

        cbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(22, 22, 22)))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtDni)
                            .addComponent(cbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(419, 419, 419))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
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

    private void cbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaisActionPerformed

    }//GEN-LAST:event_cbPaisActionPerformed
// </editor-fold>

    /**
     * Acción asociada al botón "Guardar".
     *
     * Toma los valores ingresados por el usuario y llama a la capa de servicios
     * para modificar los datos del piloto correspondiente al DNI original.
     * Luego, retorna a la ventana de gestión.
     *
     * @param evt evento de acción del botón
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        servicio.modificarPiloto(txtNombre.getText(), txtApellido.getText(), (Pais) cbPais.getSelectedItem(), txtDni.getText(),  dniViejo);
        this.gestionPiloto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed
      /**
     * Carga los datos del piloto en los campos de texto para poder editarlos.
     *
     * Obtiene el piloto mediante el DNI original. Si existe, se muestran los datos
     * en los campos correspondientes. Si no se encuentra, se muestra un mensaje
     * en consola y se cierra la ventana.
     */
    private void cargarDatosPiloto() {
        Piloto piloto = servicio.buscarPilotoPorDni(this.dniViejo); 
        
        if (piloto != null) {
            txtNombre.setText(piloto.getNombre());
            txtApellido.setText(piloto.getApellido());
            txtDni.setText(piloto.getDni()); 

            cbPais.setSelectedItem(piloto.getPais()); 
        } else {
 
            System.out.println("Error: No se encontró el piloto con DNI " + this.dniViejo);
            this.dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Pais> cbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
