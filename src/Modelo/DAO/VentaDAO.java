
package Modelo.DAO;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentaDAO {
    PreparedStatement ps;
    ResultSet rs;

    Conexion con = new Conexion();
    Connection acceso;
}
