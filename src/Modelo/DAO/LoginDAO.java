package Modelo.DAO;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelo.VO.LoginVO;

public class LoginDAO {

    PreparedStatement ps;
    ResultSet rs;

    Conexion con = new Conexion();
    Connection acceso;

    public LoginVO ValidadUsuario(String Name, String Pass) {
        LoginVO lo = new LoginVO();
        System.out.println(Name + Pass);
        String sql = "select * from Login where Name=? and Pass=?";
        try {
            acceso = con.Conectar();

            ps = acceso.prepareStatement(sql);
            ps.setString(1, Name);
            ps.setString(2, Pass);
           

            rs = ps.executeQuery();
            while (rs.next()) {
                lo.setId_user(rs.getInt(1));
                lo.setName(rs.getString(2));
                lo.setPass(rs.getString(3));
                lo.setEstado(rs.getInt(4));

            }
        } catch (Exception e) {
        }
        return lo;
    }
}
