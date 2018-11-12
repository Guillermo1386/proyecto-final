
package tiendagamer;


public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
         this.setLocationRelativeTo(null);
         this.setSize(600, 450);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnbuscarjuego = new javax.swing.JButton();
        btningCliente = new javax.swing.JButton();
        btnventajuego = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu-button-of-three-horizontal-lines.png"))); // NOI18N
        jLabel1.setText("MENU PRINCIPAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 180, 40));

        btnbuscarjuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clip.png"))); // NOI18N
        btnbuscarjuego.setText("INGRESO VIDEO JUEGO");
        btnbuscarjuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscarjuegoMouseClicked(evt);
            }
        });
        getContentPane().add(btnbuscarjuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 170, 20));

        btningCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clip.png"))); // NOI18N
        btningCliente.setText("INGRESAR CLIENTE");
        btningCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btningClienteMouseClicked(evt);
            }
        });
        btningCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btningCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, 20));

        btnventajuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/credit-card.png"))); // NOI18N
        btnventajuego.setText("VENTA DE JUEGOS");
        btnventajuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnventajuegoMouseClicked(evt);
            }
        });
        getContentPane().add(btnventajuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 170, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gow.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -20, 1200, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btningClienteActionPerformed

    private void btningClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningClienteMouseClicked
            Usuario MN = new Usuario();
            MN .setVisible(true);
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btningClienteMouseClicked

    private void btnventajuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnventajuegoMouseClicked
           VentaJuegos MN = new VentaJuegos();
            MN .setVisible(true);
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnventajuegoMouseClicked

    private void btnbuscarjuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarjuegoMouseClicked
      Administrador MN = new Administrador();
            MN .setVisible(true);
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarjuegoMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarjuego;
    private javax.swing.JButton btningCliente;
    private javax.swing.JButton btnventajuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
