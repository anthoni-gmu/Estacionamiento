
package Modelo.VO;

public class CarroVO {
    int Id_carro,Id_cliente,Estado;
    String Placa;

    public CarroVO() {
    }

    public CarroVO(int Id_carro, int Id_cliente, int Estado, String Placa) {
        this.Id_carro = Id_carro;
        this.Id_cliente = Id_cliente;
        this.Estado = Estado;
        this.Placa = Placa;
       
    }

    public int getId_carro() {
        return Id_carro;
    }

    public void setId_carro(int Id_carro) {
        this.Id_carro = Id_carro;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
    
}
