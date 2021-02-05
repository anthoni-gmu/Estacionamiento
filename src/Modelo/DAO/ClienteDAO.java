
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.VO.ClienteVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    public ClienteVO listarID(int Id_cliente){
        ClienteVO c=new ClienteVO();
       String sql="select * from Cliente where Id_cliente=?" ;
        try {
            
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, Id_cliente);
            rs=ps.executeQuery();
            while(rs.next()){
                
                c.setId_cliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setDNI(rs.getString(4));
                c.setNumero(rs.getString(5));
                
            }
        } catch (Exception e) {
        }
        return c;
    }
    public int add(Object[] o) {
        int r=0;
        String  sql="insert into Cliente(Nombre,Apellidos,DNI,Numero)values(?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update Cliente set Nombre=?,Apellidos=?,DNI=?,Numero=? where idCliente=?" ;
        try {
             con=cn.Conectar();
              ps=con.prepareStatement(sql);
              ps.setObject(1, o[0]);
              ps.setObject(2, o[1]);
              ps.setObject(3, o[2]);
              ps.setObject(4, o[3]);
              ps.setObject(5, o[4]);
              r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
}
