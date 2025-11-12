package GUI;

import Modelo.Pais;
import Servicios.Servicios;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 * Ventana de registro de nuevas Escuderías.
 * 
 * Esta interfaz permite ingresar el nombre de una escudería y seleccionar su
 * país de origen. Una vez ingresados los datos, se almacena la información
 * a través de la capa de servicios, y al finalizar retorna a la pantalla
 * de gestión de escuderías.
 * @author Diego Trapote
 * @author Juan Toribio
 */

public class Registro_Escuderia extends javax.swing.JFrame {
     /**
     * Ventana de gestión a la que se regresa al finalizar.
     */
    Gestion_Escuderias volver;
        /**
     * Servicio principal que ofrece acceso a la capa de lógica y datos.
     */
    Servicios servicio;
     /**
     * Constructor de la ventana de registro de escuderías.
     * Inicializa los componentes gráficos, almacena la referencia al servicio
     * y a la ventana de retorno, y carga los países disponibles en el combo.
     *
     * @param servicio Objeto servicio para acceder a la lógica del sistema.
     * @param volver Ventana de gestión que llamó a esta interfaz.
     */
    public Registro_Escuderia(Servicios servicio, Gestion_Escuderias volver) {
        initComponents();
        this.servicio = servicio;
        System.out.println("Registro_Pilotos: Abierto CON el servicio: " + this.servicio);
        this.volver = volver;
        cargarPaises();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbPais = new javax.swing.JComboBox<>();
        GuardarBotom = new javax.swing.JButton();
        LimpiarButtom = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Registro de Escuderia");

        jLabel2.setText("Nombre:");

        jLabel3.setText("País:");

        GuardarBotom.setText("Guardar");
        GuardarBotom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBotomActionPerformed(evt);
            }
        });

        LimpiarButtom.setText("Limpiar");
        LimpiarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarButtomActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LimpiarButtom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(GuardarBotom))
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarBotom)
                    .addComponent(LimpiarButtom))
                .addContainerGap(85, Short.MAX_VALUE))
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
     * Acción del botón Guardar.
     * Obtiene el nombre y el país seleccionado, y llama al servicio para
     * registrar la nueva escudería. Luego regresa a la ventana anterior.
     *
     * @param evt Evento de clic del botón.
     */
    private void GuardarBotomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBotomActionPerformed
        String nombre = txtNombre.getText();
        Pais pais = (Pais) cbPais.getSelectedItem();
        servicio.registrarEscuderia(nombre, pais);
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GuardarBotomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LimpiarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarButtomActionPerformed
        txtNombre.setText("");
    }//GEN-LAST:event_LimpiarButtomActionPerformed
       /**
     * Carga los países disponibles en el combo de selección.
     * Utiliza un DefaultComboBoxModel para actualizar la lista de elementos.
     */
    private void cargarPaises() {
    DefaultComboBoxModel<Pais> modeloPais = new DefaultComboBoxModel<>();
    

    cbPais.setModel(modeloPais);

    List<Pais> listaPaises = servicio.traerPaises(); 


    if (listaPaises != null) {
        for (Pais p : listaPaises) {
           
            modeloPais.addElement(p); 
        }
    }
}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarBotom;
    private javax.swing.JButton LimpiarButtom;
    private javax.swing.JComboBox<Pais> cbPais;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
