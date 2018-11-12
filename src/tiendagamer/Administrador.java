
package tiendagamer;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import CRUD.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Administrador extends javax.swing.JFrame {
    
    private DefaultTableModel modelo;
   
    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(800, 550);
    }
     private void mostrarColumna(){
        modelo = (DefaultTableModel) tbladministrador.getModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("GENERO");
        modelo.addColumn("VALOR");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("ESTADO");
    }
       private void cargarRegistro(){
        
        Administradores objAdministrador  = new Administradores();
        
        modelo = (DefaultTableModel) tbladministrador.getModel();
        
        ResultSet resultado = objAdministrador.cargarAdministrador();
         
        try {
            Object datos[] = new Object[6];
            while (resultado.next()) {
                for (int i = 0; i < 6; i++) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodVideo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnomVideo = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        txtgeneroVideo = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbladministrador = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtcanvideo = new javax.swing.JTextField();
        txtvalorVideo2 = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESO VIDEO JUEGOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(143, 11, 210, 14);

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("NOMBRE JUEGO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 110, 14);

        txtcodVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodVideoActionPerformed(evt);
            }
        });
        txtcodVideo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodVideoKeyTyped(evt);
            }
        });
        getContentPane().add(txtcodVideo);
        txtcodVideo.setBounds(150, 100, 59, 20);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("CODIGO JUEGO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 110, 14);

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("GENERO JUEGO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 200, 100, 14);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("CANTIDAD JUEGO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 280, 110, 14);

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("VALOR JUEGO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 240, 100, 14);

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("ESTADO ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 320, 50, 14);

        txtnomVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomVideoActionPerformed(evt);
            }
        });
        txtnomVideo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomVideoKeyTyped(evt);
            }
        });
        getContentPane().add(txtnomVideo);
        txtnomVideo.setBounds(150, 150, 60, 20);

        txtestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtestadoKeyTyped(evt);
            }
        });
        getContentPane().add(txtestado);
        txtestado.setBounds(150, 320, 60, 20);

        txtgeneroVideo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgeneroVideoKeyTyped(evt);
            }
        });
        getContentPane().add(txtgeneroVideo);
        txtgeneroVideo.setBounds(150, 200, 60, 20);

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
        btneliminar.setBounds(330, 153, 120, 30);

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maps-and-flags.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(330, 193, 120, 30);

        tbladministrador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbladministrador.setGridColor(new java.awt.Color(102, 255, 255));
        tbladministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbladministradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbladministrador);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 360, 580, 100);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cloud-reload-symbol.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(330, 233, 120, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
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
        jButton1.setBounds(30, 50, 90, 33);

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(460, 50, 80, 40);

        txtcanvideo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcanvideoKeyTyped(evt);
            }
        });
        getContentPane().add(txtcanvideo);
        txtcanvideo.setBounds(150, 280, 60, 20);

        txtvalorVideo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalorVideo2KeyTyped(evt);
            }
        });
        getContentPane().add(txtvalorVideo2);
        txtvalorVideo2.setBounds(150, 240, 60, 20);

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archeology.png"))); // NOI18N
        btnlimpiar.setText("Limpliar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar);
        btnlimpiar.setBounds(330, 113, 120, 30);

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarMouseClicked(evt);
            }
        });
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(330, 283, 120, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gru.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-16, 0, 650, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodVideoActionPerformed
       
    }//GEN-LAST:event_txtcodVideoActionPerformed

    private void txtnomVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomVideoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
            Menu MN = new Menu();
            MN .setVisible(true);
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void tbladministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbladministradorMouseClicked
       /*cuando el usuario selecciones una fila de datos y se mustre en los compornetes */
        modelo = (DefaultTableModel) tbladministrador.getModel();
        
        try {
            txtcodVideo.setText(String.valueOf(modelo.getValueAt(tbladministrador.getSelectedRow(), 0)));
            txtnomVideo.setText(String.valueOf(modelo.getValueAt(tbladministrador.getSelectedRow(), 1)));
            txtgeneroVideo.setText(String.valueOf(modelo.getValueAt(tbladministrador.getSelectedRow(), 2)));
            txtvalorVideo2.setText(String.valueOf(modelo.getValueAt(tbladministrador.getSelectedRow(), 3)));
            txtcanvideo.setText(String.valueOf(modelo.getValueAt(tbladministrador.getSelectedRow(), 4)));
            txtestado.setText(String.valueOf(modelo.getValueAt(tbladministrador.getSelectedRow(), 5)));
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lo sentimos, ocurrio un error al seleccionar una fila");
        }
    }//GEN-LAST:event_tbladministradorMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       System.exit(WIDTH);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtcanvideo.setText("");
        txtnomVideo.setText("");
        txtgeneroVideo.setText("");
        txtcanvideo.setText("");
        txtvalorVideo2.setText("");
        txtestado.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       
        if (tbladministrador.getRowCount() == 0){
          JOptionPane.showMessageDialog(null, "por favor presione el booton de buscar");
          return;
        }
        if (tbladministrador.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "por favor selecciones una fila");
            return;
        }
        
        Administradores objAdministrador = new Administradores();        
        modelo = (DefaultTableModel) tbladministrador.getModel();
        
        try {
            int codigo = Integer.parseInt(txtcodVideo.getText());
            
            boolean result = objAdministrador.eliminarAdministrador(codigo);
            
            if (result == true){
                JOptionPane.showConfirmDialog(null, "El registro se elimino correctamennte");
                txtcodVideo.setText("");
                txtnomVideo.setText("");
                txtgeneroVideo.setText("");
                txtvalorVideo2.setText("");
                txtcanvideo.setText("");
                txtestado.setText("");
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
        int eli=tbladministrador.getSelectedRowCount();
        if (eli>=0){
            modelo.removeRow(eli);
            }else{
            JOptionPane.showConfirmDialog(null, "No hoy datos qye eliminar");
        }
    }//GEN-LAST:event_btneliminarMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        mostrarColumna();
        cargarRegistro();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    if (tbladministrador.getRowCount() ==0){
        JOptionPane.showMessageDialog(null, "Por favor presione el boton buscar");
        return;
    }
    if (tbladministrador.getRowCount() == -1){
    JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
    return;
    }
    if (txtcodVideo.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa codigo");
    txtcodVideo.requestFocus();
    return;
    }
    if (txtnomVideo.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa nonbre de juego");
    txtnomVideo.requestFocus();
    return;
    }
       if (txtgeneroVideo.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa genero de juego");
    txtgeneroVideo.requestFocus();
    return;
    }
        if (txtvalorVideo2.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa valor del juego");
    txtvalorVideo2.requestFocus();
    return;
    }
         if (txtcanvideo.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa cantidad de juegos");
    txtcanvideo.requestFocus();
    return;
    }
    if (txtestado.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa estado de juego");
    txtestado.requestFocus();
    return;
    }
    
          Administradores objAdministrador = new Administradores();
             
             int codigo = Integer.parseInt(txtcodVideo.getText());
             String nombre = txtnomVideo.getText();
             String genero = txtgeneroVideo.getText();
             String valor = txtestado.getText();
             String cantidad = txtcanvideo.getText();
             String estado = txtestado.getText();
        
        try {
             boolean  resultado = objAdministrador.insertarAdministrador(codigo, nombre, genero, valor, cantidad, estado);      
             if (resultado == true){
                 JOptionPane.showMessageDialog(null, "Los datos se actulizaron satisfactoriamente");
                txtcodVideo.setText("");
                txtnomVideo.setText("");
                txtgeneroVideo.setText("");
                txtvalorVideo2.setText("");
                txtcanvideo.setText("");
                txtestado.setText("");
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
             }
             else{
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror"+ e.getMessage());
  
        }
    
    
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtcodVideoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodVideoKeyTyped
         char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtcodVideoKeyTyped

    private void txtnomVideoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomVideoKeyTyped
        char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtnomVideoKeyTyped

    private void txtgeneroVideoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgeneroVideoKeyTyped
        char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtgeneroVideoKeyTyped

    private void txtvalorVideo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorVideo2KeyTyped
       char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtvalorVideo2KeyTyped

    private void txtcanvideoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcanvideoKeyTyped
         char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtcanvideoKeyTyped

    private void txtestadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtestadoKeyTyped
         char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtestadoKeyTyped

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
         
 Conexion objConec = new Conexion();           
        if (txtcodVideo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"por favor, Ingrese cogido");
            txtcodVideo.requestFocus();
            return;
        }
        if (txtnomVideo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese un nombre de juego");
            txtnomVideo.requestFocus();
            return;
        }
        if (txtgeneroVideo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese genero juego");
            txtgeneroVideo.requestFocus();
            return;
        }
         if (txtvalorVideo2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese valor de juego");
            txtestado.requestFocus();
            return; 
         }
         if (txtcanvideo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese cantidad");
            txtcanvideo.requestFocus();
            return;   
         }
         if (txtestado.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese estado de juego");
            txtestado.requestFocus();
            return;  
         }
         
       
          Administradores objAdministrador = new Administradores();
             
             int codigo = Integer.parseInt(txtcodVideo.getText());
             String nombre = txtnomVideo.getText();
             String genero = txtgeneroVideo.getText();
             String valor = txtvalorVideo2.getText();
             String cantidad = txtcanvideo.getText();
             String estado = txtestado.getText();
        
        try {
             boolean  resultado = objAdministrador.insertarAdministrador(codigo, nombre, genero, valor, cantidad, estado);      
             if (resultado == true){
                 JOptionPane.showMessageDialog(null, "Los datos se han registrado satisfactoriamente");
                txtcodVideo.setText("");
                txtnomVideo.setText("");
                txtgeneroVideo.setText("");
                txtvalorVideo2.setText("");
                txtcanvideo.setText("");
                txtestado.setText("");
             }
             else{
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lo sentimos, ocurrio algo inesperado, por favor vuelva a intentarlo");
  
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
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
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbladministrador;
    private javax.swing.JTextField txtcanvideo;
    private javax.swing.JTextField txtcodVideo;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtgeneroVideo;
    private javax.swing.JTextField txtnomVideo;
    private javax.swing.JTextField txtvalorVideo2;
    // End of variables declaration//GEN-END:variables
}
