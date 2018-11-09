
package tiendagamer;


public class VentaJuegos extends javax.swing.JFrame {

   
    public VentaJuegos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(550, 400);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblprecio = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        lblmodo = new javax.swing.JLabel();
        lblnomJuego = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblGenJuego = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtgenerojuego = new javax.swing.JTextField();
        txtnomjuego = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        cmbmodoPago = new javax.swing.JComboBox();
        btnbuscar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().setLayout(null);

        lblprecio.setText("Precio");
        getContentPane().add(lblprecio);
        lblprecio.setBounds(23, 167, 29, 14);

        lblcantidad.setText("Cantidad");
        getContentPane().add(lblcantidad);
        lblcantidad.setBounds(23, 199, 43, 14);

        lblmodo.setText("Modo de pago");
        getContentPane().add(lblmodo);
        lblmodo.setBounds(23, 231, 68, 14);

        lblnomJuego.setText("Nombre juego");
        getContentPane().add(lblnomJuego);
        lblnomJuego.setBounds(23, 103, 68, 14);

        lblnombre.setText("Nombre ");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(23, 71, 40, 14);

        lblGenJuego.setText("Genero juego");
        getContentPane().add(lblGenJuego);
        lblGenJuego.setBounds(23, 135, 65, 14);

        jLabel7.setText("VENTA DE JUEGOS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(143, 11, 150, 14);
        getContentPane().add(txtcantidad);
        txtcantidad.setBounds(120, 200, 70, 20);

        txtnombre.setSelectionColor(new java.awt.Color(255, 51, 255));
        getContentPane().add(txtnombre);
        txtnombre.setBounds(120, 70, 70, 20);
        getContentPane().add(txtgenerojuego);
        txtgenerojuego.setBounds(120, 130, 70, 20);
        getContentPane().add(txtnomjuego);
        txtnomjuego.setBounds(120, 100, 70, 20);
        getContentPane().add(txtprecio);
        txtprecio.setBounds(120, 160, 70, 20);

        cmbmodoPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar:", "Tarjeta", "Efecty", "Batolo", "Suchance", "otro" }));
        getContentPane().add(cmbmodoPago);
        cmbmodoPago.setBounds(120, 230, 83, 20);

        btnbuscar.setText("Buscar");
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(210, 160, 120, 23);

        btnactualizar.setText("Actulizar");
        getContentPane().add(btnactualizar);
        btnactualizar.setBounds(210, 130, 120, 23);

        btneliminar.setText("Eliminar");
        getContentPane().add(btneliminar);
        btneliminar.setBounds(210, 100, 120, 23);

        jButton4.setText("Regresar a menu");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(210, 200, 120, 23);

        btnguardar.setText("Guardar");
        getContentPane().add(btnguardar);
        btnguardar.setBounds(210, 70, 120, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
            Menu MN = new Menu();
            MN .setVisible(true);
            dispose();      
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(VentaJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaJuegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox cmbmodoPago;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblGenJuego;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblmodo;
    private javax.swing.JLabel lblnomJuego;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtgenerojuego;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnomjuego;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
