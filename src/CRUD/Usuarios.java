
package CRUD;

import CRUD.Usuarios.*;
import DefinicionInterfaz.Usuarios.UsuarioPOA;
import tiendagamer.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Usuarios  extends UsuarioPOA{
    
Conexion objConec = new Conexion();



    @Override
    public boolean eliminarUsuario(int cedula){
        
        boolean resultado = false;
        try {
            String sql = "DELETE FROM usuario WHERE cedula = " + cedula;
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
    public String consultarUsuario(int cedula) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from usuario where cedula = " + cedula;
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
     public ResultSet cargarUsuario(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "Select cedula, nombre, apellido, telefono, genero from usuario";
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

    @Override
    public boolean insertarUsuario(int cedula, String nombre, String apellido, String telefono, String genero) {
        
       boolean resultado = false;
        try {
            String sql = "insert into usuario (cedula,nombre,apellido,telefono,genero) values ('"+cedula+"','"+nombre+"','"+apellido+"','"+telefono+"','"+genero+"')";
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
            JOptionPane.showMessageDialog(null, "Lo sentimos, la cedula o el nombre ya se encuentran registrados. ¡Por favor, vuelva a intentarlo!" + e.getMessage()); 
        }        
        return resultado; 
    }

    @Override
    public boolean actualizarUsuario(int cedula, String nombre, String apellido, String telefono, String genero) {
         boolean resultado = false;
        try {
            String sql = "UPDATE usuario SET nombre = '"+nombre+"', apellido = '"+apellido+", 'genero = '"+genero+"', telefono = '"+telefono+" where codigo = '"+cedula+"'";
            
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
    
}
