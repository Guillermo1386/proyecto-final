
package tiendagamer;


public class Administrador extends javax.swing.JFrame {

   
    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(550, 400);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodVideo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        txtnomVideo = new javax.swing.JTextField();
        txtvalorVideo = new javax.swing.JTextField();
        txtgeneroVideo = new javax.swing.JTextField();
        txtcantVideo = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("INGRESO VIDEO JUEGOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(143, 11, 210, 14);

        jLabel2.setText("Nombre videos juego");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 110, 14);

        txtcodVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodVideoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodVideo);
        txtcodVideo.setBounds(150, 50, 59, 20);

        jLabel3.setText("Codigo video juego");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 110, 14);

        jLabel4.setText("Genero video juego");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 100, 14);

        jLabel5.setText("Cantidad video juego");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 220, 110, 14);

        jLabel6.setText("Valor video juego");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 190, 100, 14);

        jLabel8.setText("Estado");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 250, 34, 14);
        getContentPane().add(txtestado);
        txtestado.setBounds(150, 250, 60, 20);

        txtnomVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomVideoActionPerformed(evt);
            }
        });
        getContentPane().add(txtnomVideo);
        txtnomVideo.setBounds(150, 100, 60, 20);
        getContentPane().add(txtvalorVideo);
        txtvalorVideo.setBounds(150, 180, 60, 20);
        getContentPane().add(txtgeneroVideo);
        txtgeneroVideo.setBounds(150, 140, 60, 20);
        getContentPane().add(txtcantVideo);
        txtcantVideo.setBounds(150, 220, 60, 20);

        btnguardar.setText("Guardar");
        getContentPane().add(btnguardar);
        btnguardar.setBounds(250, 50, 120, 23);

        btneliminar.setText("Eliminar");
        getContentPane().add(btneliminar);
        btneliminar.setBounds(250, 100, 120, 23);

        btnbuscar.setText("Buscar");
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(250, 150, 120, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(102, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 580, 100);

        btnActualizar.setText("Actualizar");
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(250, 200, 120, 23);

        jButton1.setText("Regresar a menu");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 240, 120, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodVideoActionPerformed

    private void txtnomVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomVideoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
            Menu MN = new Menu();
            MN .setVisible(true);
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcantVideo;
    private javax.swing.JTextField txtcodVideo;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtgeneroVideo;
    private javax.swing.JTextField txtnomVideo;
    private javax.swing.JTextField txtvalorVideo;
    // End of variables declaration//GEN-END:variables
}
