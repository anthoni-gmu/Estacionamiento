
package Modelo.VO;

public class ClienteVO {
    int Id_cliente;
    String Nombre,Apellidos,DNI,Numero;

    public ClienteVO() {
    }

    public ClienteVO(int Id_cliente, String Nombre, String Apellidos, String DNI, String Numero) {
        this.Id_cliente = Id_cliente;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.Numero = Numero;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
    
          
}
