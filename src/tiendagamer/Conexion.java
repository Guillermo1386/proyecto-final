
package tiendagamer;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection conec=null;    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conec= DriverManager.getConnection("jdbc:mysql://localhost/bdtiendajuegos","root","");
            System.out.println("Conexion establecida.");
        } catch (Exception e) {
            System.out.println(e.getMessage());  
        }
        return conec;
    }
}
