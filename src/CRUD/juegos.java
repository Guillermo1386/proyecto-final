
package CRUD;
import CRUD.*;
import Juegos.juegoPOA;
import tiendagamer.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class juegos extends juegoPOA{
    Conexion objConec = new Conexion();
    
    @Override
    public boolean insertarVentajuego(int id, String nombre, String nombreJuego, String generoJuego, int subtotal, int cantidad, int totalPagar) {
        boolean resultado = false;
        try {
            String sql = "insert into juegos (id,nombre,nombreJuego,generoJuego,subtotal,cantidad, totalPagar) values ('"+id+"','"+nombre+"','"+nombreJuego+"','"+generoJuego+"','"+subtotal+"','"+cantidad+"','"+totalPagar+"')";
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
            JOptionPane.showMessageDialog(null, "Lo sentimos, el nombre o el nombre de juego son incorrectos. ¡Por favor, vuelva a intentarlo!" + e.getMessage()); 
        }        
        return resultado; 
    }

    @Override
    public boolean actualizarVentajuego(int id, String nombre, String nombreJuego, String generoJuego, int subtotal, int cantidad, int totalPagar) {
        boolean resultado = false;
        try {
            String sql = "UPDATE juegos SET nombre = '"+nombre+"', nombreJuego = '"+nombreJuego+"', generoJuego = '"+generoJuego+"' , subtotal = '"+subtotal+"' , cantidad = '"+cantidad+"', totalPagar = '"+totalPagar+"' where id = '"+id+"' ";
            
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
    public boolean eliminarVentajuego(int id) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM juegos WHERE id = " + id;
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
    public String consultarVentajuego(int id) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from juegos where id = " + id;
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
            String sqlConsultar = "Select id, nombre, nombreJuego, generoJuego, subtotal, cantidad, totalPagar from juegos";
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

    public ResultSet cargarJuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}

