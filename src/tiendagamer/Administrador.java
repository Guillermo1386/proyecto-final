
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("INGRESO VIDEO JUEGOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(143, 11, 210, 14);

        jLabel2.setText("Nombre juego");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 110, 14);

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
        txtcodVideo.setBounds(160, 60, 59, 20);

        jLabel3.setText("Codigo  juego");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 110, 14);

        jLabel4.setText("Genero  juego");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 100, 14);

        jLabel5.setText("Cantidad  juego");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 220, 110, 14);

        jLabel6.setText("Valor  juego");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 190, 100, 14);

        jLabel8.setText("Estado");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 250, 34, 14);

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
        txtnomVideo.setBounds(160, 100, 60, 20);

        txtestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtestadoKeyTyped(evt);
            }
        });
        getContentPane().add(txtestado);
        txtestado.setBounds(160, 240, 60, 20);

        txtgeneroVideo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgeneroVideoKeyTyped(evt);
            }
        });
        getContentPane().add(txtgeneroVideo);
        txtgeneroVideo.setBounds(160, 140, 60, 20);

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
        btneliminar.setBounds(250, 100, 120, 23);

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(250, 150, 120, 23);

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
        jScrollPane1.setBounds(20, 300, 580, 100);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
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

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(400, 50, 80, 23);

        txtcanvideo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcanvideoKeyTyped(evt);
            }
        });
        getContentPane().add(txtcanvideo);
        txtcanvideo.setBounds(160, 210, 60, 20);

        txtvalorVideo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalorVideo2KeyTyped(evt);
            }
        });
        getContentPane().add(txtvalorVideo2);
        txtvalorVideo2.setBounds(160, 180, 60, 20);

        btnlimpiar.setText("Limpliar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar);
        btnlimpiar.setBounds(400, 100, 100, 23);

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(250, 50, 120, 23);

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
          // Conexion objConec = new Conexion();
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
