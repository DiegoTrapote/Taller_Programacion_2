package GUI;

import Persistencia.GestionDeDatos;
import Servicios.Servicios;

/**
 * Ventana principal del sistema.
 *
 * Desde esta pantalla el usuario puede acceder a: - El módulo de Gestión (ABM
 * de entidades). - El módulo de Informes (consultas y reportes).
 *
 * La ventana inicializa la única instancia compartida de: - GestionDeDatos
 * (capa de persistencia) - Servicios (capa lógica / intermediaria)
 *
 * Estas instancias se pasan a todas las demás ventanas, garantizando que toda
 * la aplicación trabaje sobre la misma base de datos.
 *
 * @author Diego Trapote
 * @author Juan Toribio
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Única instancia de la clase que maneja el almacenamiento de datos. Actúa
     * como "base de datos" interna simulada.
     */
    private GestionDeDatos miUnicaBaseDeDatos = new GestionDeDatos();

    /**
     * Única instancia de Servicios, la cual opera sobre la base de datos. Esta
     * instancia se compartirá con todas las ventanas de la aplicación.
     */
    private Servicios miUnicoServicio = new Servicios(miUnicaBaseDeDatos);

    /**
     * Constructor de la ventana principal. Inicializa los componentes gráficos.
     */
    public Inicio() {
        initComponents();// Código generado automáticamente por NetBeans (no modificar)
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbGestion = new javax.swing.JButton();
        InformesButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Menú General");

        jbGestion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbGestion.setText("Gestion");
        jbGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionActionPerformed(evt);
            }
        });

        InformesButtom.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        InformesButtom.setText("Informes");
        InformesButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformesButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InformesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jbGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(InformesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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
     * Acción del botón "Gestión". Abre el menú de gestión y mantiene esta
     * ventana abierta.
     */
    private void jbGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGestionActionPerformed
        
        Gestion v2 = new Gestion(miUnicoServicio, this);
        v2.setVisible(true);        
        this.setVisible(false);
    }//GEN-LAST:event_jbGestionActionPerformed
    /**
     * Acción del botón "Informes". Abre la ventana de informes y cierra esta
     * ventana.
     */
    private void InformesButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformesButtomActionPerformed
        Informes vInformes = new Informes(miUnicoServicio, this);
        vInformes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InformesButtomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InformesButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGestion;
    // End of variables declaration//GEN-END:variables
}
