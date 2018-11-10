
package CRUD;

import CRUD.Administradores.*;
import DefinicionInterfaz.Administradores.AdministradorPOA;
import tiendagamer.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Administradores extends AdministradorPOA {
    Conexion objConec = new Conexion();
    @Override
    public boolean insertarAdministrador(int codigo, String nombre, String genero, String valor, String cantidad, String estado) {
        boolean resultado = false;
        try {
            String sql = "insert into administrador (codigo,nombre,genero,valor,cantidad,estado) values ('"+codigo+"','"+nombre+"','"+genero+"','"+valor+"','"+cantidad+"','"+estado+"')";
            objConec.conexion();
            Statement st = objConec.conexion().createStatement();
            int val = st.executeUpdate(sql);
            if(val>0){
                resultado = true;
            }
            //Se cierran las conexiones
            objConec.conexion().close();
            st.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, el código o el usuario ya se encuentran registrados. ¡Por favor, vuelva a intentarlo!" + e.getMessage()); 
        }        
        return resultado; 
    }
    
    @Override
    
    public boolean actualizarAdministrador(int codigo, String nombre, String genero, String valor, String cantidad, String estado) {
           boolean resultado = false;
        try {
            String sql = "UPDATE administrador SET nombre = '"+nombre+"', genero = '"+genero+"', valor = '"+valor+"' , cantidad = '"+cantidad+"' , estado = '"+estado+"' where codigo = '"+codigo+"' ";
            
            objConec.conexion();
            Statement st = objConec.conexion().createStatement();
            int val = st.executeUpdate(sql);
            if(val>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConec.conexion().close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al actualizar. "+e);
        }  
        
        return resultado;
    }

  
       @Override
    public boolean eliminarAdministrador(int codigo) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM administrador WHERE cc = " + codigo;
            //Se realiza la conexión con la base de datos
            objConec.conexion();
            Statement st = objConec.conexion().createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConec.conexion().close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al eliminar. "+e.getMessage());
        }        
        return resultado;
    }
     
       @Override
    public String consultarAdministrador(int cedula) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from administrador where cedula = " + cedula;
            //Se realiza la conexión con la base de datos
            objConec.conexion();
            Statement st = objConec.conexion().createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            
            while (rs.next()) {                
                resultado += rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return resultado;
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

    
     public ResultSet cargarAdministrador(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "Select codigo, nombre, genero, valor, cantidad, estado from administrador";
            //Se realiza la conexión con la base de datos
            objConec.conexion();
            Statement st = objConec.conexion().createStatement();
            resultado = st.executeQuery(sqlConsultar);
           
            //Cerrar las conexiones.
            //st.close();
            //objConect.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
       return resultado;
    }
}
