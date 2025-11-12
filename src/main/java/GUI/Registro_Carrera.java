package GUI;

import Modelo.Circuito;
import Modelo.Pais;
import Servicios.Servicios;
import java.util.Date;

/**
 * Ventana de registro de nuevas carreras.
 * 
 * Permite seleccionar:
 *  - Circuito donde se disputará la carrera
 *  - País donde se desarrolla
 *  - Fecha (mediante selector JDateChooser)
 *  - Hora (mediante JSpinner con formato HH:mm)
 *  - Cantidad de vueltas de la carrera
 * 
 * Al confirmar, se envían los datos a la capa de servicios para su registro.
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Registro_Carrera extends javax.swing.JFrame {
    
    /**
     * Objeto de servicios que contiene la lógica del sistema.
     */
    Servicios servicio;
    
    /**
     * Ventana anterior a la cual se vuelve al finalizar el registro.
     */
    Gestion_Carreras volver;
   /**
     * Constructor.
     *
     * @param servicio referencia al servicio principal
     * @param volver ventana desde la que se accedió y a la cual se regresará
     */
    public Registro_Carrera(Servicios servicio, Gestion_Carreras volver) {
        initComponents();// CÓDIGO GENERADO DE LA INTERFAZ
        this.servicio = servicio;
        this.volver = volver;
        javax.swing.SpinnerDateModel modeloSpinner = new javax.swing.SpinnerDateModel();

      
        modeloSpinner.setCalendarField(java.util.Calendar.MINUTE);


        jsHora.setModel(modeloSpinner);


        jsHora.setEditor(new javax.swing.JSpinner.DateEditor(jsHora, "HH:mm"));
        cargarComboCircuitos();
        cargarComboPaises();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbCircuito = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jsNumVueltas = new javax.swing.JSpinner();
        jbGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbPais = new javax.swing.JComboBox<>();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jsHora = new javax.swing.JSpinner();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Registro de Carreras");

        jLabel2.setText("Circuito:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Hora:");

        jLabel5.setText("Nro. de vueltas:");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Pais:");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(cbCircuito, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jsHora)
                                    .addComponent(jsNumVueltas)
                                    .addComponent(cbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jsHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jsNumVueltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jbGuardar)
                .addContainerGap(53, Short.MAX_VALUE))
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
     * Valida los campos y registra la carrera mediante el servicio.
     */
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
      
        Circuito circuito = (Circuito) cbCircuito.getSelectedItem();
        Pais pais = (Pais) cbPais.getSelectedItem();
        int vueltas = (Integer) jsNumVueltas.getValue();

        java.util.Date fechaDate = jdFecha.getDate();

        java.util.Date horaDate = (Date) jsHora.getValue();

        if (circuito == null || pais == null || fechaDate == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe completar todas las celdas para continuar.",
                    "Datos Incompletos",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }


        java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("yyyyMMdd");
        String fechaString = formatoFecha.format(fechaDate);

        java.text.SimpleDateFormat formatoHora = new java.text.SimpleDateFormat("HH:mm");
        String horaString = formatoHora.format(horaDate);
  
        servicio.registrarCarrera(circuito, fechaString, horaString, vueltas, pais);

       
        javax.swing.JOptionPane.showMessageDialog(this, "Carrera registrada con éxito.");

       
        this.volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
     /**
     * Carga la lista de circuitos en el combo correspondiente.
     */
    private void cargarComboCircuitos() {
        cbCircuito.removeAllItems();
        for (Circuito c : servicio.traerCircuitos()) {
            cbCircuito.addItem(c);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Circuito> cbCircuito;
    private javax.swing.JComboBox<Pais> cbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGuardar;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JSpinner jsHora;
    private javax.swing.JSpinner jsNumVueltas;
    // End of variables declaration//GEN-END:variables
}
