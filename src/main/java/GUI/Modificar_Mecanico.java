package GUI;

import Modelo.Especialidad;
import Modelo.Mecanico;
import Modelo.Pais;
import Servicios.Servicios;

/**
 * Ventana destinada a la modificación de datos de un mecánico existente.
 *
 * Permite editar nombre, apellido, DNI, país, años de experiencia y
 * especialidad. La modificación se realiza mediante la capa de servicios y, al
 * finalizar, se regresa a la ventana de gestión de mecánicos.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Modificar_Mecanico extends javax.swing.JFrame {

    /**
     * Servicio que administra la lógica de negocio y acceso a datos.
     */
    Servicios servicio;
    /**
     * Ventana desde la cual se accedió a esta interfaz (para regresar).
     */
    Gestion_Mecanico volver;
    /**
     * DNI original del mecánico que se desea modificar. Funciona como
     * identificador para la actualización.
     */
    String dniViejo;

    /**
     * Constructor de la ventana Modificar_Mecanico.
     *
     * @param servicio instancia de la capa de servicios
     * @param volver ventana de gestión a la cual se regresa al finalizar
     * @param dni DNI del mecánico que será modificado
     */
    public Modificar_Mecanico(Servicios servicio, Gestion_Mecanico volver, String dni) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        this.dniViejo = dni;
        setResizable(false);
        setLocationRelativeTo(null);
        cargarDatosMecanico();
        cargarComboPaises();
        cargarComboEspecialidad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cBespecialidad = new javax.swing.JLabel();
        cbPais = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNombre = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtApellido = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDni = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jsAnioExperiencia = new javax.swing.JSpinner();
        cbEspecialidad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Modificar Mecanico");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        cBespecialidad.setText("Especialidad:");

        jScrollPane1.setViewportView(txtNombre);

        jScrollPane2.setViewportView(txtApellido);

        jScrollPane3.setViewportView(txtDni);

        jLabel6.setText("Años de experiencia:");

        jLabel7.setText("Dni:");

        jLabel8.setText("Pais:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(cBespecialidad)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addComponent(cbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jsAnioExperiencia)
                            .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jsAnioExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBespecialidad))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
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
     * Acción del botón "Guardar".
     *
     * Toma los valores ingresados en la interfaz y llama al servicio para
     * actualizar los datos del mecánico correspondiente al DNI original. Luego,
     * regresa a la ventana de gestión.
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        servicio.mofidicarMecanico(txtNombre.getText(), txtApellido.getText(), (Pais) cbPais.getSelectedItem(), dniViejo, (Integer) jsAnioExperiencia.getValue(), (Especialidad) cbEspecialidad.getSelectedItem(), dniViejo);
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed
    /**
     * Carga los datos del mecanico en los campos de texto para poder editarlos.
     *
     * Obtiene el mecanico mediante el DNI original. Si existe, se muestran los
     * datos en los campos correspondientes. Si no se encuentra, se muestra un
     * mensaje en consola y se cierra la ventana.
     */
    private void cargarDatosMecanico() {
        Mecanico mecanico = servicio.buscarMecanicoPorDni(this.dniViejo);

        if (mecanico != null) {
            txtNombre.setText(mecanico.getNombre());
            txtApellido.setText(mecanico.getApellido());
            txtDni.setText(mecanico.getDni());

            cbPais.setSelectedItem(mecanico.getPais());
        } else {

            System.out.println("Error: No se encontró el mecanico con DNI " + this.dniViejo);
            this.dispose();
        }
    }

    /**
     * Carga la lista de países en el combo correspondiente.
     */
    private void cargarComboPaises() {
        cbPais.removeAllItems();
        for (Pais p : servicio.traerPaises()) {
            cbPais.addItem(p);
        }
    }

    /**
     * Carga la lista de Especialidades
     */
    private void cargarComboEspecialidad() {
        cbEspecialidad.removeAllItems();

        for (Especialidad e : Especialidad.values()) {
            cbEspecialidad.addItem(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel cBespecialidad;
    private javax.swing.JComboBox<Especialidad> cbEspecialidad;
    private javax.swing.JComboBox<Pais> cbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jsAnioExperiencia;
    private javax.swing.JTextPane txtApellido;
    private javax.swing.JTextPane txtDni;
    private javax.swing.JTextPane txtNombre;
    // End of variables declaration//GEN-END:variables
}
