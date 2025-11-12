package GUI;

import Modelo.Pais;
import Modelo.Escuderia;
import Servicios.Servicios;

/**
 * Ventana (JFrame) para modificar los datos de una Escudería existente.
 * <p>
 * Esta clase permite al usuario editar el nombre y el país de una escudería
 * específica. Recibe el nombre original (`nombreV`) de la escudería como
 * identificador para buscar y precargar sus datos en el formulario.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Modificar_Escuderia extends javax.swing.JFrame {

    Servicios servicio;
    Gestion_Escuderias volver;
    String nombreV;

    /**
     * Constructor de la ventana Modificar_Escuderia.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección
     * de dependencias).
     * @param volver La ventana {@link Gestion_Escuderias} anterior a la cual se
     * debe regresar.
     * @param nombreV El nombre original de la escudería que se va a modificar.
     */
    public Modificar_Escuderia(Servicios servicio, Gestion_Escuderias volver, String nombreV) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        this.nombreV = nombreV;
        cargarComboPaises();
        cargarDatosEscuderia();
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
        GuardarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Modificar Escuderia");

        jLabel2.setText("Nombre:");

        jLabel3.setText("País:");

        GuardarBoton.setText("Guardar");
        GuardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(cbPais, 0, 154, Short.MAX_VALUE))))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(GuardarBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(GuardarBoton)
                .addContainerGap(94, Short.MAX_VALUE))
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
     * Manejador del evento clic para el botón "Guardar".
     * <p>
     * Recoge los nuevos valores (nombre y país) del formulario. Llama al
     * servicio {@link Servicios#modificarEscuderia} pasándole el nuevo nombre,
     * el nuevo país y el nombre original (`nombreV`) como identificador.
     * Finalmente, muestra la ventana anterior (`volver`) y cierra esta.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void GuardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBotonActionPerformed
        servicio.modificarEscuderia(txtNombre.getText(), (Pais) cbPais.getSelectedItem(), nombreV);
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GuardarBotonActionPerformed
    /**
     * Carga los datos existentes de la escudería (identificada por `nombreV`)
     * en los componentes del formulario.
     * <p>
     * Utiliza el servicio {@link Servicios#buscarEscuderiaPorNombre} para
     * encontrar la escudería. Si la encuentra, establece el texto de
     * `txtNombre` y selecciona el país correspondiente en `cbPais`. Si no la
     * encuentra, cierra la ventana.
     */
    private void cargarDatosEscuderia() {

        Escuderia escuderia = servicio.buscarEscuderiaPorNombre(nombreV);

        if (escuderia != null) {

            txtNombre.setText(escuderia.getNombre());
            cbPais.setSelectedItem(escuderia.getPais());
        } else {

            this.dispose();
        }
    }

    /**
     * Método auxiliar privado para poblar el `cbPais` (ComboBox). Carga todos
     * los países disponibles desde el servicio.
     */
    private void cargarComboPaises() {
        cbPais.removeAllItems();
        for (Pais p : servicio.traerPaises()) {
            cbPais.addItem(p);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarBoton;
    private javax.swing.JComboBox<Pais> cbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
