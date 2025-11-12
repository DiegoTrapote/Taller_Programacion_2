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
        RankingPilotosButtom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCantidadCarrerasCircuito = new javax.swing.JButton();
        btnResultadosCarrera = new javax.swing.JButton();
        btnInformeAutos = new javax.swing.JButton();
        btnInformeMecanico = new javax.swing.JButton();
        btnPiloto_Y_Circuito = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RankingPilotosButtom.setText("Ranking Pilotos");
        RankingPilotosButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingPilotosButtomActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultados");

        btnCantidadCarrerasCircuito.setText("Cantidad Carreras en un circuito");
        btnCantidadCarrerasCircuito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadCarrerasCircuitoActionPerformed(evt);
            }
        });

        btnResultadosCarrera.setText("Resultado Carrera en un rango de fechas");
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

        btnPiloto_Y_Circuito.setText("cantidad de veces de que un piloto corrio en un circuito");
        btnPiloto_Y_Circuito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiloto_Y_CircuitoActionPerformed(evt);
            }
        });

        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(RankingPilotosButtom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnResultadosCarrera))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(196, 196, 196)
                                        .addComponent(btnInformeAutos)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCantidadCarrerasCircuito))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(btnInformeMecanico))
                            .addComponent(btnPiloto_Y_Circuito))))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnVolver)
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RankingPilotosButtom)
                            .addComponent(btnResultadosCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(btnInformeAutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInformeMecanico))
                    .addComponent(btnCantidadCarrerasCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPiloto_Y_Circuito, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(595, Short.MAX_VALUE))
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
     * circuito". Abre la ventana {@link MetodoCantidadCarrerasEnUnCircuito},
     * pasando el servicio. Oculta la ventana actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnCantidadCarrerasCircuitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadCarrerasCircuitoActionPerformed
        MetodoCantidadCarrerasEnUnCircuito metodoCarreras = new MetodoCantidadCarrerasEnUnCircuito(servicio, this);
        metodoCarreras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCantidadCarrerasCircuitoActionPerformed
    /**
     * Manejador del evento clic para el botón "cantidad de veces...". Abre la
     * ventana {@link MetodoPilotosyCircuitos}, pasando el servicio. Oculta la
     * ventana actual.
     *
     * @param evt El evento de acción (no se utiliza).
     */
    private void btnPiloto_Y_CircuitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiloto_Y_CircuitoActionPerformed
        MetodoPilotosyCircuitos rank = new MetodoPilotosyCircuitos(servicio, this);
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
    // End of variables declaration//GEN-END:variables
}
