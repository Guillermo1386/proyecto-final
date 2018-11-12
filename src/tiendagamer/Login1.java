
package tiendagamer;

import javax.swing.JOptionPane;


public class Login1 extends javax.swing.JFrame {

   
    public Login1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(500, 400);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusuario = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/team.png"))); // NOI18N
        getContentPane().add(lblusuario);
        lblusuario.setBounds(130, 70, 150, 80);

        lblcontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/room-key.png"))); // NOI18N
        getContentPane().add(lblcontraseña);
        lblcontraseña.setBounds(130, 170, 110, 60);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 10, 80, 60);

        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuarioMouseClicked(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtusuario);
        txtusuario.setBounds(230, 100, 110, 20);

        jButton1.setText("Ingresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 270, 130, 30);

        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });
        getContentPane().add(Password);
        Password.setBounds(230, 190, 120, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/d.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 0, 610, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
   
    }
        public static void main(String args[]){
            java.awt.EventQueue.invokeLater(new Runnable(){
                public void run(){
                new Login1().setVisible(true);
            }
                
            
        });
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
        String Usuario = "guillermo";
        String Contraseña = "12345";
        
        String Pass = new String(Password.getPassword());        
        
        if(txtusuario.getText() .equals(Usuario)&& Pass.equals(Contraseña)){
            
            Menu MN = new Menu();
            MN .setVisible(true);
            dispose();
            
        }
        else {
            JOptionPane.showMessageDialog(this, "Usuario/ Contraseña Inconrrecta");
                    
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseClicked
     
    }//GEN-LAST:event_txtusuarioMouseClicked

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }        
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_PasswordKeyTyped
   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
