
package tiendagamer;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(550, 400);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblusuario.setText("Usuario");
        getContentPane().add(lblusuario);
        lblusuario.setBounds(30, 60, 36, 14);

        lblcontraseña.setText("Contraseña");
        getContentPane().add(lblcontraseña);
        lblcontraseña.setBounds(30, 100, 60, 14);

        jLabel3.setText("INGRESO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 10, 80, 14);

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario);
        txtusuario.setBounds(150, 60, 70, 20);

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
        jButton1.setBounds(80, 150, 73, 23);
        getContentPane().add(Password);
        Password.setBounds(150, 100, 70, 20);

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
                new Login().setVisible(true);
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
   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
