package Modelo.DAO;

import Modelo.Conexion;
import Modelo.VO.EspacioVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EspacioDAO {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public EspacioVO listarID(int Id_Espacio){
        EspacioVO c=new EspacioVO();
       String sql="select * from Espacio where Id_Espacio=?" ;
        try {
            
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, Id_Espacio);
            rs=ps.executeQuery();
            while(rs.next()){
                c.setId_Espacio(rs.getInt(1));
                c.setEstado(rs.getInt(2));
            }
        } catch (Exception e) {
        }
        return c;
    }
}
