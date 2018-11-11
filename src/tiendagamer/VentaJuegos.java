
package tiendagamer;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import CRUD.*;
import java.sql.ResultSet;



public class VentaJuegos extends javax.swing.JFrame {
    
     private DefaultTableModel modelo;
   
   
    public VentaJuegos() {
        initComponents();
          this.setLocationRelativeTo(null);
          this.setSize(650, 550);
    }  
    private void  mostrarColumna(){
        modelo = (DefaultTableModel) tblventasjuegos.getModel();
        
        modelo.addColumn("NOMBRE");
        modelo.addColumn("NOMBREJUEGOS");
        modelo.addColumn("GENEROJUEGOS");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("TOTAL");
    }
    private void cargarRegistro(){
        
        VentaJuegos objventaJuego  = new VentaJuegos();
        
        modelo = (DefaultTableModel) tblventasjuegos.getModel();
        
        ResultSet resultado = objventaJuego.cargarventajuego();
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

        lblprecio = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        lblnomJuego = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblGenJuego = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtgenerojuego = new javax.swing.JTextField();
        txtnomjuego = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblventasjuegos = new javax.swing.JTable();
        txtcantidad1 = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().setLayout(null);

        lblprecio.setText("Precio");
        getContentPane().add(lblprecio);
        lblprecio.setBounds(23, 167, 29, 14);

        lblcantidad.setText("Cantidad");
        getContentPane().add(lblcantidad);
        lblcantidad.setBounds(23, 199, 43, 14);

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
        getContentPane().add(txttotal);
        txttotal.setBounds(120, 230, 70, 20);

        txtnombre.setSelectionColor(new java.awt.Color(255, 51, 255));
        getContentPane().add(txtnombre);
        txtnombre.setBounds(120, 70, 70, 20);
        getContentPane().add(txtgenerojuego);
        txtgenerojuego.setBounds(120, 130, 70, 20);
        getContentPane().add(txtnomjuego);
        txtnomjuego.setBounds(120, 100, 70, 20);
        getContentPane().add(txtprecio);
        txtprecio.setBounds(120, 160, 70, 20);

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(210, 160, 120, 23);

        btnactualizar.setText("Actulizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar);
        btnactualizar.setBounds(210, 130, 120, 23);

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(210, 100, 120, 23);

        btnregresar.setText("Regresar a menu");
        btnregresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregresarMouseClicked(evt);
            }
        });
        getContentPane().add(btnregresar);
        btnregresar.setBounds(210, 200, 120, 23);

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(210, 70, 120, 23);

        jLabel1.setText("Total");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 230, 50, 20);

        tblventasjuegos.setBackground(new java.awt.Color(204, 204, 255));
        tblventasjuegos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblventasjuegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblventasjuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblventasjuegosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblventasjuegos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 452, 90);
        getContentPane().add(txtcantidad1);
        txtcantidad1.setBounds(120, 200, 70, 20);

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(360, 70, 53, 23);

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 120, 65, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseClicked
            Menu MN = new Menu();
            MN .setVisible(true);
            dispose();      
    }//GEN-LAST:event_btnregresarMouseClicked

    private void tblventasjuegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblventasjuegosMouseClicked
       modelo = (DefaultTableModel) tblventasjuegos.getModel();
        
        try {
            txtnombre.setText(String.valueOf(modelo.getValueAt(tblventasjuegos.getSelectedRow(), 0)));
            txtnomjuego.setText(String.valueOf(modelo.getValueAt(tblventasjuegos.getSelectedRow(), 1)));
            txtgenerojuego.setText(String.valueOf(modelo.getValueAt(tblventasjuegos.getSelectedRow(), 2)));
            txtprecio.setText(String.valueOf(modelo.getValueAt(tblventasjuegos.getSelectedRow(), 3)));
            txtcantidad1.setText(String.valueOf(modelo.getValueAt(tblventasjuegos.getSelectedRow(), 4)));
            txttotal.setText(String.valueOf(modelo.getValueAt(tblventasjuegos.getSelectedRow(), 5)));
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lo sentimos, ocurrio un error al seleccionar una fila");
        }
    }//GEN-LAST:event_tblventasjuegosMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
     System.exit(WIDTH);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtnombre.setText("");
        txtnomjuego.setText("");
        txtgenerojuego.setText("");
        txtcantidad1.setText("");
        txtprecio.setText("");
        txttotal.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        
        if (tblventasjuegos.getRowCount() == 0){
          JOptionPane.showMessageDialog(null, "por favor presione el booton de buscar");
          return;
        }
        if (tblventasjuegos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "por favor selecciones una fila");
            return;
        }
        
        VentasJuegos objVentaJuegos = new VentasJuegos();        
        modelo = (DefaultTableModel) tblventasjuegos.getModel();
        
        try {
            String nombre = txtnombre.getText();
            
            boolean result = objVentaJuegos.eliminarVentajuego(nombre);
            
            if (result == true){
                JOptionPane.showConfirmDialog(null, "El registro se elimino correctamennte");
                txtnombre.setText("");
                txtnomjuego.setText("");
                txtgenerojuego.setText("");
                txtprecio.setText("");
                txtcantidad1.setText("");
                txttotal.setText("");
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
            }
        
                else{
                     JOptionPane.showMessageDialog(null, "Error al eliminar");
                                
                   }
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }
            
  
    }                                           

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {                                         
        int eli=tblventasjuegos.getSelectedRowCount();
        if (eli>=0){
            modelo.removeRow(eli);
            }else{
            JOptionPane.showConfirmDialog(null, "No hoy datos que eliminar");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       mostrarColumna();
        cargarRegistro();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
       if (tblventasjuegos.getRowCount() ==0){
        JOptionPane.showMessageDialog(null, "Por favor presione el boton buscar");
        return;
    }
    if (tblventasjuegos.getRowCount() == -1){
    JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
    return;
    }
    if (txtnombre.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa nombre");
    txtnombre.requestFocus();
    return;
    }
    if (txtnomjuego.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa nonbre de juego");
    txtnomjuego.requestFocus();
    return;
    }
       if (txtgenerojuego.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa genero de juego");
    txtgenerojuego.requestFocus();
    return;
    }
        if (txtprecio.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa valor del juego");
    txtprecio.requestFocus();
    return;
    }
         if (txtcantidad1.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa cantidad de juegos");
    txtcantidad1.requestFocus();
    return;
    }
    if (txttotal.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa pago");
    txttotal.requestFocus();
    return;
    }
    
         VentasJuegos objVentasJuegos = new VentasJuegos();
             
             int nombre = Integer.parseInt(txtnombre.getText());
             String nombrej = txtnomjuego.getText();
             String genero = txtgenerojuego.getText();
             String precio = txtprecio.getText();
             String cantidad = txtcantidad1.getText();
             String total = txttotal.getText();
        
        try {
             boolean  resultado = objVentasJuegos.insertarVentajuego(nombre, nombrej, genero, precio, cantidad, total);      
             if (resultado == true){
                 JOptionPane.showMessageDialog(null, "Los datos se actulizaron satisfactoriamente");
                txtnombre.setText("");
                txtnomjuego.setText("");
                txtgenerojuego.setText("");
                txtprecio.setText("");
                txtcantidad1.setText("");
                txttotal.setText("");
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
             }
             else{
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror"+ e.getMessage());
  
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Conexion objConec = new Conexion();           
        if (txtnombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"por favor, Ingrese nombre");
            txtnombre.requestFocus();
            return;
        }
        if (txtnomjuego.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese un nombre de juego");
            txtnomjuego.requestFocus();
            return;
        }
        if (txtgenerojuego.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese genero juego");
            txtgenerojuego.requestFocus();
            return;
        }
         if (txtprecio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese valor de juego");
            txtprecio.requestFocus();
            return; 
         }
         if (txtcantidad1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese cantidad");
            txtcantidad1.requestFocus();
            return;   
         }
         if (txttotal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese estado y total");
            txttotal.requestFocus();
            return;  
         }
         
       
          VentasJuegos objVentaJuegos = new VentasJuegos();
             
             int nombre = Integer.parseInt(txtnombre.getText());
             String nombrej = txtnomjuego.getText();
             String genero = txtgenerojuego.getText();
             String valor = txtprecio.getText();
             String cantidad = txtcantidad1.getText();
             String total = txttotal.getText();
        
        try {
             boolean  resultado = objVentaJuegos.insertarVentajuego(nombre, nombrej, genero, valor, cantidad, total);      
             if (resultado == true){
                 JOptionPane.showMessageDialog(null, "Los datos se han registrado satisfactoriamente");
                txtnombre.setText("");
                txtnomjuego.setText("");
                txtgenerojuego.setText("");
                txtprecio.setText("");
                txtcantidad1.setText("");
                txttotal.setText("");
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
                new VentaJuegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGenJuego;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblnomJuego;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JTable tblventasjuegos;
    private javax.swing.JTextField txtcantidad1;
    private javax.swing.JTextField txtgenerojuego;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnomjuego;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    private ResultSet cargarventajuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
