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
public class MetodoPilotosyCircuitos extends javax.swing.JFrame {

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
    public MetodoPilotosyCircuitos(Servicios servicio, Informes volver) {
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
        jPanel1 = new javax.swing.JPanel();
        cbCIrcuitos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbPilotos = new javax.swing.JComboBox<>();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pilotos");

        jLabel2.setText("Circuitos");

        lbResultado.setText("jLabel3");

        jLabel4.setText("Total De Veces");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel5.setText("Metodo Cantidad de Veces que corrio un piloto en un circuito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(btnVolver))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(cbCIrcuitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(242, 242, 242)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lbResultado))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel5)))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnVolver)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCIrcuitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResultado))
                .addGap(30, 30, 30)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    private javax.swing.JLabel lbResultado;
    // End of variables declaration//GEN-END:variables
}
