
package tiendagamer;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import CRUD.*;
import java.sql.ResultSet;
import java.sql.SQLException;


public class VentaJuegos extends javax.swing.JFrame {
    
    private DefaultTableModel modelo;
     
    //Esta variable global sirve para realizar una validación en agregar.
    private int contador = 0;
     
    public VentaJuegos() {
        initComponents();
          this.setLocationRelativeTo(null);
          this.setSize(800, 500);
          txtValor.setEditable(false);
    }
    private void mostrarColumna(){
        modelo = (DefaultTableModel) tblventas.getModel();
        
        modelo.addColumn("ID VENTA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("NOMBRE JUEGO");
        modelo.addColumn("GENERO JUEGO");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("SUBTOTAL");
    }
  
    private void cargarRegistro(){
        
       juegos objjuego = new juegos();
       
       modelo = (DefaultTableModel) tblventas.getModel();
       
       ResultSet resultado = objjuego.cargarJuego();
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
           
    private void limpiarCampos(){
        
        txtNombre.setText("");
        txtNomJuego.setText("");
        txtGeneroJuego.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtValor.setText("");
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        lblnomJuego = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblGenJuego = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtGeneroJuego = new javax.swing.JTextField();
        txtNomJuego = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblventas = new javax.swing.JTable();
        bntsalir = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTotalPagar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().setLayout(null);

        lblprecio.setText("PRECIO");
        getContentPane().add(lblprecio);
        lblprecio.setBounds(40, 230, 50, 14);

        lblcantidad.setText("CANTIDAD");
        getContentPane().add(lblcantidad);
        lblcantidad.setBounds(40, 260, 52, 14);

        lblnomJuego.setText("NOMBRE JUEGO");
        getContentPane().add(lblnomJuego);
        lblnomJuego.setBounds(40, 170, 68, 14);

        lblnombre.setText("NOMBRE");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(40, 140, 42, 14);

        lblGenJuego.setText("GENERO JUEGO");
        getContentPane().add(lblGenJuego);
        lblGenJuego.setBounds(40, 200, 77, 14);

        jLabel7.setText("VENTA DE JUEGOS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 50, 150, 14);

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(680, 360, 70, 20);

        txtNombre.setSelectionColor(new java.awt.Color(255, 51, 255));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(120, 140, 70, 20);

        txtGeneroJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGeneroJuegoKeyTyped(evt);
            }
        });
        getContentPane().add(txtGeneroJuego);
        txtGeneroJuego.setBounds(120, 200, 70, 20);

        txtNomJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomJuegoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNomJuego);
        txtNomJuego.setBounds(120, 170, 70, 20);

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(120, 230, 70, 20);

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maps-and-flags.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(460, 270, 120, 30);

        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cloud-reload-symbol.png"))); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar);
        btnactualizar.setBounds(460, 230, 120, 30);

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
        btneliminar.setBounds(460, 190, 120, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 50, 57, 23);

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/safebox.png"))); // NOI18N
        btnguardar.setText("Guardar Compra");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(600, 320, 140, 25);

        tblventas.setAutoCreateRowSorter(true);
        tblventas.setBackground(new java.awt.Color(48, 48, 48));
        tblventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblventas.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        tblventas.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        tblventas.setDoubleBuffered(true);
        tblventas.setDragEnabled(true);
        tblventas.setGridColor(new java.awt.Color(204, 204, 255));
        tblventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblventasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblventas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 310, 570, 100);

        bntsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        bntsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntsalirActionPerformed(evt);
            }
        });
        getContentPane().add(bntsalir);
        bntsalir.setBounds(470, 50, 100, 40);

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archeology.png"))); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar);
        btnlimpiar.setBounds(460, 150, 120, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/insert-coin.png"))); // NOI18N
        jLabel2.setText("SUBTOTAL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 360, 90, 20);

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor);
        txtValor.setBounds(120, 260, 70, 20);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clip.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(460, 110, 120, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID VENTA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 110, 60, 14);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(120, 110, 70, 20);
        getContentPane().add(txtTotalPagar);
        txtTotalPagar.setBounds(680, 390, 70, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallet.png"))); // NOI18N
        jLabel3.setText("TOTAL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 390, 60, 16);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 440);

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 180, 40, 14);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(450, 190, 40, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
            Menu MN = new Menu();
            MN .setVisible(true);
            dispose();      
    }//GEN-LAST:event_jButton4MouseClicked

    private void tblventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblventasMouseClicked
      modelo = (DefaultTableModel) tblventas.getModel();
      
       try {
            txtID.setText(String.valueOf(modelo.getValueAt(tblventas.getSelectedRow(), 0)));
            txtNombre.setText(String.valueOf(modelo.getValueAt(tblventas.getSelectedRow(), 1)));
            txtNomJuego.setText(String.valueOf(modelo.getValueAt(tblventas.getSelectedRow(), 2)));
            txtGeneroJuego.setText(String.valueOf(modelo.getValueAt(tblventas.getSelectedRow(), 3)));
            txtCantidad.setText(String.valueOf(modelo.getValueAt(tblventas.getSelectedRow(), 4)));
            txtPrecio.setText(String.valueOf(modelo.getValueAt(tblventas.getSelectedRow(), 5)));
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lo sentimos, ocurrio un error al seleccionar una fila");
        }
    }//GEN-LAST:event_tblventasMouseClicked

    private void bntsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsalirActionPerformed
           System.exit(WIDTH);        
    }//GEN-LAST:event_bntsalirActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtID.setText("");
        txtNombre.setText("");
        txtNomJuego.setText("");
        txtGeneroJuego.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if (tblventas.getRowCount() == 0){
          JOptionPane.showMessageDialog(null, "por favor presione el booton de buscar");
          return;
        }
        if (tblventas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "por favor selecciones una fila");
            return;
        }
        juegos objjuego = new juegos();
         modelo = (DefaultTableModel) tblventas.getModel();
         
          try {
            int id = Integer.parseInt(txtID.getText());
            
            boolean result = objjuego.eliminarVentajuego(id);
            
            if (result == true){
                JOptionPane.showConfirmDialog(null, "El registro se elimino correctamennte");
                txtID.setText("");
                txtNombre.setText("");
                txtNomJuego.setText("");
                txtGeneroJuego.setText("");
                txtCantidad.setText("");
                txtPrecio.setText("");
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
        int eli=tblventas.getSelectedRowCount();
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

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        if (tblventas.getRowCount() ==0){
        JOptionPane.showMessageDialog(null, "Por favor presione el boton buscar");
        return;
    }
    if (tblventas.getRowCount() == -1){
    JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
    return;
    }
    if (txtID.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa ID");
    txtID.requestFocus();
    return;
    }
    if (txtNombre.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa nonbre ");
    txtNombre.requestFocus();
    return;
    }
       if (txtNomJuego.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa nombre de juego");
    txtNomJuego.requestFocus();
    return;
    }
        if (txtGeneroJuego.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa genero del juego");
    txtGeneroJuego.requestFocus();
    return;
    }
         if (txtCantidad.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa cantidad de juegos");
    txtCantidad.requestFocus();
    return;
    }
    if (txtPrecio.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Por favor, ingresa precio de juego");
    txtPrecio.requestFocus();
    return;
    }
    juegos objjuego = new juegos();
             int id = Integer.parseInt(txtID.getText());
             String nombre = txtNombre.getText();
             String nombrej = txtNomJuego.getText();
             String generoj = txtGeneroJuego.getText();
             int cantidad =  Integer.parseInt(txtCantidad.getText());
             int precio = Integer.parseInt(txtPrecio.getText());
             
             
          
        
        try {
             boolean  resultado = objjuego.insertarVentajuego(id, nombre, nombrej, generoj, cantidad, cantidad, contador);
             if (resultado == true){
                 JOptionPane.showMessageDialog(null, "Los datos se actulizaron satisfactoriamente");
                txtID.setText("");
                txtNombre.setText("");
                txtNomJuego.setText("");
                txtGeneroJuego.setText("");
                txtCantidad.setText("");
                txtPrecio.setText("");
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
  
  if (txtID.getText().equals("")){
            JOptionPane.showMessageDialog(null,"por favor, Ingrese ID");
            txtID.requestFocus();
            return;
        }
        if (txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese un nombre");
            txtNombre.requestFocus();
            return;
        }
        if (txtNomJuego.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese nombre juego");
            txtNomJuego.requestFocus();
            return;
        }
         if (txtGeneroJuego.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese genero de juego");
            txtGeneroJuego.requestFocus();
            return; 
         }
         if (txtCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese cantidad");
            txtCantidad.requestFocus();
            return;   
         }
         if (txtPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "por favor,Ingrese estado de juego");
            txtPrecio.requestFocus();
            return;  
         }
         
        int fila = tblventas.getRowCount();
        int valorTotalPagar[] = new int[fila];
        for (int i = 0; i < fila; i++) {
            
            
            
            int valor =  Integer.parseInt(String.valueOf(modelo.getValueAt(i , 6)));
            
            valorTotalPagar[i] = valor;
        }
        String agruparJuego[] = new String[fila];
        for (int i = 0; i < fila; i++) {
           
            
            String  juego =  String.valueOf(modelo.getValueAt(i , 2));
            
            agruparJuego[i] = juego;
        }
        
        
        
        int sumatoria = 0;
        for (int i = 0; i < agruparJuego.length; i++) {
            sumatoria = sumatoria +  valorTotalPagar[i];
            
        }
        
        String concatenacion = "";
        for (int i = 0; i < agruparJuego.length; i++) {
            concatenacion = concatenacion + "," + agruparJuego[i];
            
        }
        
        txtTotalPagar.setText(String.valueOf(sumatoria));
         
        System.out.println(concatenacion);
        
        juegos objjuego = new juegos();
         
            int id = Integer.parseInt(txtID.getText());
            String cliente =  txtNombre.getText();
            String generoJuego =  txtGeneroJuego.getText();
            int precio = Integer.parseInt(txtPrecio.getText());
            int cantidad = Integer.parseInt(txtCantidad.getText());
              try {
             boolean  resultado = objjuego.insertarVentajuego(id, cliente, generoJuego, generoJuego, sumatoria, cantidad, contador);
             if (resultado == true){
                 JOptionPane.showMessageDialog(null, "Los datos se han registrado satisfactoriamente");
                txtID.setText("");
                txtNombre.setText("");
                txtNomJuego.setText("");
                txtGeneroJuego.setText("");
                txtCantidad.setText("");
                txtPrecio.setText("");
             }
             else{
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lo sentimos, ocurrio algo inesperado, por favor vuelva a intentarlo");
  
        }
              double can,pre,val1,vat;
              can = Double.parseDouble (txtCantidad.getText());
              pre = Double.parseDouble (txtPrecio.getText());
              val1=can*pre;
             String valt = val1+"";
             txtValor.setText(valt);
              
    
              
         
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
         char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNomJuegoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomJuegoKeyTyped
      char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtNomJuegoKeyTyped
    
    private void txtGeneroJuegoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneroJuegoKeyTyped
char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo letras");     
        }
    }//GEN-LAST:event_txtGeneroJuegoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
          char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
   char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Programación para agrgar, ¿Porque?
        /*
        Ya que el usario puede comprar muchos juegos pero le pertenece una sola
        compra (el id es sólo una vez por cliente).
        */
        int id = Integer.parseInt(txtID.getText());
        String cliente =  txtNombre.getText();
        String nombreJuego =  txtNomJuego.getText();
        String generoJuego =  txtGeneroJuego.getText();
        int precio = Integer.parseInt(txtPrecio.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());
        
        int operacion =  cantidad * precio;
        
        txtValor.setText(String.valueOf(operacion));
        
        int total = Integer.parseInt(txtValor.getText());
        
        String vector[] = new String[7];
        
        txtID.setEditable(false);
        
        if (contador == 0) {
            mostrarColumna();
            
                // Cargo el vector con los valores de la fila a cargar en el JTabl
                vector[0] = String.valueOf(id);
                vector[1] = cliente;
                vector[2] = nombreJuego;
                vector[3] = generoJuego;
                vector[4] = String.valueOf(precio);
                vector[5] = String.valueOf(cantidad);
                vector[6] = String.valueOf(total);
                

                // Adiciono la fila al JTable (tblRegistroProducto)
                modelo.addRow(vector);
                limpiarCampos();
            
            contador++;
        }
        else{
            
            modelo = (DefaultTableModel) tblventas.getModel();
            
            try{
         
              
                // Cargo el vector con los valores de la fila a cargar en el JTabl
                vector[0] = String.valueOf(id);
                vector[1] = cliente;
                vector[2] = nombreJuego;
                vector[3] = generoJuego;
                vector[4] = String.valueOf(precio);
                vector[5] = String.valueOf(cantidad);
                vector[6] = String.valueOf(total);
                // Adiciono la fila al JTable (tblRegistroProducto)
                modelo.addRow(vector);
                limpiarCampos();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "¡Lo sentimos!\nSe presentó un problema al agregar la venta , ¡intentalo de nuevo!", "¡Mensaje de Error alagregar!", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaJuegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntsalir;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGenJuego;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblnomJuego;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JTable tblventas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtGeneroJuego;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomJuego;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
