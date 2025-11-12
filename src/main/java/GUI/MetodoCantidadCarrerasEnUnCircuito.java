package GUI;

import Modelo.Carrera;
import Modelo.Circuito;
import Servicios.Servicios;

/**
 * Ventana (JFrame) para el informe "Cantidad de Carreras en un Circuito".
 * <p>
 * Esta interfaz permite al usuario seleccionar un circuito de un menú
 * desplegable. Al presionar "Calcular", el sistema cuenta cuántas carreras se
 * han disputado en ese circuito y muestra el total en una etiqueta.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class MetodoCantidadCarrerasEnUnCircuito extends javax.swing.JFrame {

    Servicios servicio;
    Informes volver;

    /**
     * Constructor de la ventana.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección
     * de dependencias).
     * @param volver La ventana {@link Informes} anterior a la cual se debe
     * regresar.
     */
    public MetodoCantidadCarrerasEnUnCircuito(Servicios servicio, Informes volver) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        cargarCombos();
        agregarEvento();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbCircuito = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Circuito");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad De Carreras:");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Metodo cantidad de carreras en un Circuito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(392, 392, 392))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(btnCalcular))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnVolver)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(77, 77, 77)
                .addComponent(btnCalcular)
                .addContainerGap(526, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Manejador del evento clic para el botón "Calcular".
     * <p>
     * Obtiene el {@link Circuito} seleccionado del ComboBox. Recorre la lista
     * completa de carreras (obtenida del servicio) y cuenta cuántas de ellas se
     * realizaron en el circuito seleccionado. (La comparación se realiza usando
     * el método `.equals()` de la clase Circuito).
     * <p>
     * Finalmente, muestra el resultado (conteo) en la etiqueta `jLabel4`.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        Circuito circuitoSel = (Circuito) cbCircuito.getSelectedItem();

        if (circuitoSel == null) {
            return;
        }

        int contador = 0;

        for (Carrera c : servicio.traerCarreras()) {
            if (c.getCircuito().equals(circuitoSel)) {
                contador++;
            }
        }

        jLabel4.setText(String.valueOf(contador));

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
     * Método auxiliar privado que agrega un listener de acción al botón
     * "Calcular". (Nota: Este método es redundante ya que el diseñador de
     * NetBeans asigna el listener en `initComponents()`).
     */
    private void agregarEvento() {
        btnCalcular.addActionListener(e -> btnCalcularActionPerformed(null));
    }

    /**
     * Método auxiliar privado para poblar el `cbCircuito` (ComboBox). Limpia el
     * ComboBox, llama a {@link Servicios#traerCircuitos()} y añade cada objeto
     * {@link Circuito} a la lista.
     */
    private void cargarCombos() {
        cbCircuito.removeAllItems();
        for (Circuito c : servicio.traerCircuitos()) {
            cbCircuito.addItem(c);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Circuito> cbCircuito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
