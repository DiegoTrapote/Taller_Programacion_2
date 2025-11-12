package GUI;

import Servicios.Servicios;

/**
 * Ventana (JFrame) que funciona como menú principal para acceder a los
 * diferentes informes del sistema.
 * <p>
 * Cada botón en esta pantalla abre una nueva ventana (JFrame) especializada
 * para un informe específico (ej: Ranking de Pilotos, Informe de Autos, etc.).
 * Esta clase se encarga de recibir la instancia de {@link Servicios} y pasarla
 * a las ventanas de informes que la necesiten.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Informes extends javax.swing.JFrame {

    Servicios servicio;
    Inicio volver;

    /**
     * Constructor de la ventana Informes.
     *
     * Inicializa los componentes de la GUI y almacena la instancia de servicios
     * y la ventana de retorno.
     *
     * @param servicio La instancia de la capa de {@link Servicios} (Inyección
     * de dependencias).
     * @param volver La ventana {@link Inicio} anterior a la cual se debe
     * regresar.
     */
    public Informes(Servicios servicio, Inicio volver) {
        initComponents();
        this.servicio = servicio;
        this.volver = volver;
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        RankingPilotosButtom = new javax.swing.JButton();
        btnResultadosCarrera = new javax.swing.JButton();
        btnInformeAutos = new javax.swing.JButton();
        btnInformeMecanico = new javax.swing.JButton();
        btnCantidadCarrerasCircuito = new javax.swing.JButton();
        btnPiloto_Y_Circuito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Informes");

        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        RankingPilotosButtom.setText("Ranking Pilotos");
        RankingPilotosButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingPilotosButtomActionPerformed(evt);
            }
        });

        btnResultadosCarrera.setText("Resultado Carreras");
        btnResultadosCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosCarreraActionPerformed(evt);
            }
        });

        btnInformeAutos.setText("Informe de Autos");
        btnInformeAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeAutosActionPerformed(evt);
            }
        });

        btnInformeMecanico.setText("Informe Mecanicos");
        btnInformeMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeMecanicoActionPerformed(evt);
            }
        });

        btnCantidadCarrerasCircuito.setText("Carreras en un circuito");
        btnCantidadCarrerasCircuito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadCarrerasCircuitoActionPerformed(evt);
            }
        });

        btnPiloto_Y_Circuito.setText("Piloto en un circuito");
        btnPiloto_Y_Circuito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiloto_Y_CircuitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInformeMecanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RankingPilotosButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInformeAutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCantidadCarrerasCircuito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(btnResultadosCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPiloto_Y_Circuito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(RankingPilotosButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btnInformeAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCantidadCarrerasCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInformeMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResultadosCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPiloto_Y_Circuito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnVolver)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Manejador del evento clic para el botón "Ranking Pilotos". Abre la
     * ventana {@link Ranking_pilotos}, pasando el servicio. Oculta la ventana
     * actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void RankingPilotosButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingPilotosButtomActionPerformed
        Ranking_pilotos rank = new Ranking_pilotos(servicio, this);
        rank.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RankingPilotosButtomActionPerformed
    /**
     * Manejador del evento clic para el botón "Volver". Cierra (descarta) la
     * ventana actual y vuelve a mostrar la ventana principal (`volver`).
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnVolverActionPerformed
    /**
     * Manejador del evento clic para el botón "Cantidad Carreras en un
     * circuito". Abre la ventana {@link CantidadCarrerasEnUnCircuito},
     * pasando el servicio. Oculta la ventana actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnCantidadCarrerasCircuitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadCarrerasCircuitoActionPerformed
        CantidadCarrerasEnUnCircuito metodoCarreras = new CantidadCarrerasEnUnCircuito(servicio, this);
        metodoCarreras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCantidadCarrerasCircuitoActionPerformed
    /**
     * Manejador del evento clic para el botón "cantidad de veces...". Abre la
     * ventana {@link PilotosyCircuitos}, pasando el servicio. Oculta la
     * ventana actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnPiloto_Y_CircuitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiloto_Y_CircuitoActionPerformed
        PilotosyCircuitos rank = new PilotosyCircuitos(servicio, this);
        rank.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPiloto_Y_CircuitoActionPerformed
    /**
     * Manejador del evento clic para el botón "Informe de Autos". Abre la
     * ventana {@link Informe_Autos}, pasando el servicio. Oculta la ventana
     * actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnInformeAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeAutosActionPerformed
        Informe_Autos informeAutos = new Informe_Autos(this.servicio, this);
        informeAutos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInformeAutosActionPerformed
    /**
     * Manejador del evento clic para el botón "Informe Mecanicos". Abre la
     * ventana {@link Informe_Mecanico}, pasando el servicio. Oculta la ventana
     * actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnInformeMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeMecanicoActionPerformed
        Informe_Mecanico informeMecanico = new Informe_Mecanico(this.servicio, this);
        informeMecanico.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnInformeMecanicoActionPerformed
    /**
     * Manejador del evento clic para el botón "Resultado Carrera en un rango de
     * fechas". Abre la ventana {@link ResultadosCarreras}, pasando el servicio.
     * Oculta la ventana actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnResultadosCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosCarreraActionPerformed
        ResultadosCarreras resultados = new ResultadosCarreras(this.servicio, this);
        resultados.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnResultadosCarreraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolver;
    private javax.swing.JButton RankingPilotosButtom;
    private javax.swing.JButton btnCantidadCarrerasCircuito;
    private javax.swing.JButton btnInformeAutos;
    private javax.swing.JButton btnInformeMecanico;
    private javax.swing.JButton btnPiloto_Y_Circuito;
    private javax.swing.JButton btnResultadosCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
