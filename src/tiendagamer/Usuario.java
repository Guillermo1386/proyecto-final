
package tiendagamer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import CRUD.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario extends javax.swing.JFrame {
    
private DefaultTableModel modelo;
    
    public Usuario() {
        initComponents();
         this.setLocationRelativeTo(null);
         this.setSize(650, 550);
    }
    
    private void mostrarColumnas(){
         modelo = (DefaultTableModel) tblusuario.getModel();
        
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("GENERO");
     
    }
    private void cargarRegistro(){
        Usuarios objUsuario  = new Usuarios();
        
        modelo = (DefaultTableModel) tblusuario.getModel();
        
        ResultSet resultado = objUsuario.cargarUsuario();
         
        try {
            Object datos[] = new Object[5];
            while (resultado.next()) {
                for (int i = 0; i < 5; i++) {
                    datos[i] = resultado.getObject(i + 1);
                }
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }     
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcedula = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapeliido = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblusuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtgenero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblcedula.setForeground(new java.awt.Color(204, 204, 204));
        lblcedula.setText("CEDULA");
        getContentPane().add(lblcedula);
        lblcedula.setBounds(40, 120, 60, 14);

        lblnombre.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre.setText("NOMBRE");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(40, 170, 60, 14);

        lbltelefono.setForeground(new java.awt.Color(204, 204, 204));
        lbltelefono.setText("TELEFONO");
        getContentPane().add(lbltelefono);
        lbltelefono.setBounds(40, 250, 60, 14);

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("APELLIDO");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 210, 50, 14);

        txtcedula.setBackground(new java.awt.Color(204, 204, 255));
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtcedula);
        txtcedula.setBounds(140, 110, 100, 30);

        txtnombre.setBackground(new java.awt.Color(204, 204, 255));
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre);
        txtnombre.setBounds(140, 160, 100, 30);

        txtapeliido.setBackground(new java.awt.Color(204, 204, 255));
        txtapeliido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapeliidoActionPerformed(evt);
            }
        });
        txtapeliido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapeliidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtapeliido);
        txtapeliido.setBounds(139, 200, 100, 30);

        txttelefono.setBackground(new java.awt.Color(204, 204, 255));
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono);
        txttelefono.setBounds(140, 240, 100, 30);

        btnguardar.setBackground(new java.awt.Color(204, 204, 255));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(250, 110, 140, 30);

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarMouseClicked(evt);
            }
        });
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(250, 160, 140, 30);

        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cloud-reload-symbol.png"))); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar);
        btnactualizar.setBounds(250, 200, 140, 30);

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maps-and-flags.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(250, 240, 140, 30);

        tblusuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        tblusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblusuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblusuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 330, 660, 84);

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("INGRESE CLIENTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 44, 220, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 280, 140, 30);

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(420, 230, 120, 40);

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archeology.png"))); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar);
        btnlimpiar.setBounds(420, 160, 120, 40);

        txtgenero.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(txtgenero);
        txtgenero.setBounds(140, 280, 100, 30);

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("GENERO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 280, 70, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diccionario-Gamer.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 780, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Conexion objConec = new Conexion(); 
        if (txtcedula.getText().equals("")){
            JOptionPane.showMessageDialog(null,"por favor, Ingrese cedula");
            txtcedula.requestFocus();
            return;
        }
        if (txtnombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese un nombre");
            txtnombre.requestFocus();
            return;
        }
        if (txtapeliido.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese apellido");
            txtapeliido.requestFocus();
            return;
        }
        if (txtgenero.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese genero");
            txtgenero.requestFocus();
            return;
        }
         if (txttelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese telefono");
            txttelefono.requestFocus();
            return; 
        }
         
       
          Usuarios objUsuario = new Usuarios();
             
             int cedula = Integer.parseInt(txtcedula.getText());
             String nombre = txtnombre.getText();
             String apellido = txtapeliido.getText();
             String telefono = txttelefono.getText();
              String genero = txtgenero.getText();
             
                
        try {
             boolean  resultado = objUsuario.insertarUsuario(cedula, nombre, apellido, telefono, genero);
             if (resultado == true){
                 JOptionPane.showMessageDialog(null, "Los datos se han registrado satisfactoriamente");
                txtcedula.setText("");
                txtnombre.setText("");
                txtapeliido.setText("");
                txttelefono.setText("");
                txtgenero.setText("");
              }
             else{
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lo sentimos, ocurrio algo inesperado, por favor vuelva a intentarlo");
  
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        mostrarColumnas();                
        cargarRegistro();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
            Menu MN = new Menu();
            MN .setVisible(true);
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void tblusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblusuarioMouseClicked
        modelo = (DefaultTableModel) tblusuario.getModel();
        
        try {
            txtcedula.setText(String.valueOf(modelo.getValueAt(tblusuario.getSelectedRow(), 0)));
            txtnombre.setText(String.valueOf(modelo.getValueAt(tblusuario.getSelectedRow(), 1)));
            txtapeliido.setText(String.valueOf(modelo.getValueAt(tblusuario.getSelectedRow(), 2)));
            txttelefono.setText(String.valueOf(modelo.getValueAt(tblusuario.getSelectedRow(), 3)));
            txtgenero.setText(String.valueOf(modelo.getValueAt(tblusuario.getSelectedRow(), 4)));
            
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lo sentimos, ocurrio un error al seleccionar una fila");
        }
    }//GEN-LAST:event_tblusuarioMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
     System.exit(WIDTH);        
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
      txtcedula.setText("");
        txtnombre.setText("");
        txtapeliido.setText("");
        txttelefono.setText("");
        txtgenero.setText("");
        
       
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       if (tblusuario.getRowCount() == 0){
          JOptionPane.showMessageDialog(null, "por favor presione el booton de buscar");
          return;
        }
        if (tblusuario.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "por favor selecciones una fila");
            return;
        }
        
        Usuarios objuUsuario = new Usuarios();        
        modelo = (DefaultTableModel) tblusuario.getModel();
        
        try {
            int cedula = Integer.parseInt(txtcedula.getText());
            
            boolean result = objuUsuario.eliminarUsuario(cedula);
            
            if (result == true){
                JOptionPane.showConfirmDialog(null, "El registro se elimino correctamennte");
                txtcedula.setText("");
                txtnombre.setText("");
                txtapeliido.setText("");
                txttelefono.setText("");  
                txttelefono.setText(""); 
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
            }
        
                else{
                     JOptionPane.showMessageDialog(null, "Error al eliminar");
                                
                   }
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseClicked
         int eli=tblusuario.getSelectedRowCount();
        if (eli>=0){
            modelo.removeRow(eli);
            }else{
            JOptionPane.showConfirmDialog(null, "No hoy datos qye eliminar");
        }
    }//GEN-LAST:event_btneliminarMouseClicked

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
       if (tblusuario.getRowCount() ==0){
        JOptionPane.showMessageDialog(null, "Por favor presione el boton buscar");
        return;
    }
    if (tblusuario.getRowCount() == -1){
    JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
    return;
    }
    if (txtcedula.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa cedula");
    txtcedula.requestFocus();
    return;
    }
    if (txtnombre.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa nombre");
    txtnombre.requestFocus();
    return;
    }
    if (txtgenero.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa genero");
    txtgenero.requestFocus();
    return;
    }       
    if (txtapeliido.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa apellido");
    txtapeliido.requestFocus();
    return;
    }
    if (txttelefono.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa telefono");
    txttelefono.requestFocus();
    return;
    }
    
          Usuarios objUsuario = new Usuarios();
             
             int cedula = Integer.parseInt(txtcedula.getText());
             String nombre = txtnombre.getText();
             String apeliido = txtapeliido.getText();
             String telefono = txttelefono.getText();
              String genero = txtgenero.getText();
                
        try {
             boolean  resultado = objUsuario.insertarUsuario(cedula, nombre, apeliido, telefono, genero);
             if (resultado == true){
                 JOptionPane.showMessageDialog(null, "Los datos se actulizaron satisfactoriamente");
                txtcedula.setText("");
                txtnombre.setText("");
                txtapeliido.setText("");
                txttelefono.setText("");
                txtgenero.setText("");
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
             }
             else{
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror"+ e.getMessage());
  
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
         char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapeliidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapeliidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapeliidoActionPerformed

    private void txtapeliidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapeliidoKeyTyped
         char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtapeliidoKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

  
    public static void main(String args[]) {
        
       
        
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
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTable tblusuario;
    private javax.swing.JTextField txtapeliido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtgenero;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    
}
