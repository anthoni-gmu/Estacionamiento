
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
   Connection con;
   String url="jdbc:mysql://localhost/ParkingLot";
   String user="root";
   String pass="";
   public Connection Conectar(){
       try {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection(url,user,pass);
              
           
       } catch (Exception e) {
           System.out.println("Error al conectar la base de datos");
       }
       return con;
   }
}
