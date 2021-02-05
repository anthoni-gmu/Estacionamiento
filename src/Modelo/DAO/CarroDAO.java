
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.VO.CarroVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CarroDAO {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public CarroVO listarID(String Placa){
        CarroVO c=new CarroVO();
       String sql="select * from Carro where Placa=?" ;
        try {
            
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, Placa);
            rs=ps.executeQuery();
            while(rs.next()){
                
                c.setId_carro(rs.getInt(1));
                c.setId_cliente(rs.getInt(2));
                c.setPlaca(rs.getString(3));
                c.setEstado(rs.getInt(4));
                
            }
        } catch (Exception e) {
        }
        return c;
    }
}
