package GUI;

import Modelo.AutoPiloto;
import Modelo.Carrera;
import Modelo.Circuito;
import Modelo.Piloto;
import Servicios.Servicios;

/**
 * Ventana (JFrame) para el informe "Cantidad de veces que un piloto corrió en
 * un circuito".
 * <p>
 * Esta interfaz permite al usuario seleccionar un {@link Piloto} y un
 * {@link Circuito} de dos menús desplegables. Al presionar "Calcular", el
 * sistema cuenta cuántas veces ese piloto participó en una carrera en ese
 * circuito específico y muestra el total en una etiqueta.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class PilotosyCircuitos extends javax.swing.JFrame {

    Servicios servicio;
    Informes volver;

    /**
     * Constructor de la ventana MetodoPilotosyCircuitos.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección
     * de dependencias).
     * @param volver La ventana {@link Informes} anterior a la cual se debe
     * regresar.
     */
    public PilotosyCircuitos(Servicios servicio, Informes volver) {
        this.servicio = servicio;
        initComponents();
        this.volver = volver;
        cargarCombos();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbPilotos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbCIrcuitos = new javax.swing.JComboBox<>();
        lbResultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Veces que corrio un piloto en un circuito");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Pilotos:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Circuitos:");

        lbResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Total De Veces:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbPilotos, 0, 155, Short.MAX_VALUE)
                            .addComponent(cbCIrcuitos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCIrcuitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
     * Manejador del evento clic para el botón "Calcular".
     * <p>
     * Obtiene el {@link Piloto} y el {@link Circuito} seleccionados. Valida que
     * ambos hayan sido seleccionados. Recorre la lista global de carreras y,
     * por cada carrera que coincide con el circuito seleccionado, revisa la
     * lista de participantes ({@link AutoPiloto}) de esa carrera. Si el piloto
     * seleccionado está en esa lista, incrementa el contador.
     * <p>
     * (Nota: Esta lógica asume que los datos de AutoPiloto están almacenados
     * dentro de la lista interna de cada objeto Carrera).
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Piloto piloto = (Piloto) cbPilotos.getSelectedItem();
        Circuito circuito = (Circuito) cbCIrcuitos.getSelectedItem();

        if (piloto == null || circuito == null) {
            lbResultado.setText("Seleccione ambos valores.");
            return;
        }
        int contador = 0;

        for (Carrera carrera : servicio.traerCarreras()) {

            if (carrera.getCircuito().equals(circuito)) {

                for (AutoPiloto ap : carrera.getAutoPiloto()) {
                    if (ap.getPiloto().equals(piloto)) {
                        contador++;
                    }
                }
            }
        }

        lbResultado.setText(String.valueOf(contador));

    }//GEN-LAST:event_btnCalcularActionPerformed
    /**
     * Manejador del evento clic para el botón "Volver". Cierra (descarta) la
     * ventana actual y vuelve a mostrar la ventana de Informes (`volver`).
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        volver.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVolverActionPerformed
    /**
     * Método auxiliar privado para poblar los JComboBox de la ventana. Carga
     * `cbPilotos` con todos los pilotos y `cbCIrcuitos` con todos los
     * circuitos.
     */
    private void cargarCombos() {

        for (Piloto p : servicio.traerPilotos()) {
            cbPilotos.addItem(p);
        }

        for (Circuito c : servicio.traerCircuitos()) {
            cbCIrcuitos.addItem(c);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Circuito> cbCIrcuitos;
    private javax.swing.JComboBox<Piloto> cbPilotos;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private javax.swing.JLabel lbResultado;
    // End of variables declaration//GEN-END:variables
}
