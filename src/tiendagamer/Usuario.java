
package tiendagamer;


public class Usuario extends javax.swing.JFrame {

    
    public Usuario() {
        initComponents();
         this.setLocationRelativeTo(null);
         this.setSize(650, 550);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcedula = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapeliido = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        cmbgenero = new javax.swing.JComboBox();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblcedula.setText("Cedula");
        getContentPane().add(lblcedula);
        lblcedula.setBounds(37, 55, 33, 14);

        lblnombre.setText("Nombre");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(33, 96, 37, 14);

        lbltelefono.setText("Telefono");
        getContentPane().add(lbltelefono);
        lbltelefono.setBounds(33, 182, 42, 14);

        jLabel9.setText("Apellido");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(33, 141, 37, 14);

        jLabel10.setText("Genero");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(33, 222, 35, 14);
        getContentPane().add(txtcedula);
        txtcedula.setBounds(90, 60, 69, 20);
        getContentPane().add(txtnombre);
        txtnombre.setBounds(90, 100, 69, 20);
        getContentPane().add(txtapeliido);
        txtapeliido.setBounds(90, 140, 69, 20);
        getContentPane().add(txttelefono);
        txttelefono.setBounds(90, 170, 69, 20);

        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar:", "Masculino", "Femenino", "Otro" }));
        cmbgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgeneroActionPerformed(evt);
            }
        });
        getContentPane().add(cmbgenero);
        cmbgenero.setBounds(90, 220, 83, 20);

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(200, 50, 130, 23);

        btneliminar.setText("Eliminar");
        getContentPane().add(btneliminar);
        btneliminar.setBounds(200, 90, 130, 23);

        btnactualizar.setText("Actulizar");
        getContentPane().add(btnactualizar);
        btnactualizar.setBounds(200, 130, 130, 23);

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(200, 170, 130, 23);

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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(25, 268, 452, 84);

        jLabel1.setText("INGRESE CLIENTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 190, 14);

        jButton1.setText("Regresar a menu");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 220, 130, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbgeneroActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox cmbgenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtapeliido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
