package Modelo.VO;

public class VentaVO {
    int Id_Venta,Id_cliente,Id_Registro;
    double Monto;

    public VentaVO() {
    }

    public VentaVO(int Id_Venta, int Id_cliente, int Id_Registro, double Monto) {
        this.Id_Venta = Id_Venta;
        this.Id_cliente = Id_cliente;
        this.Id_Registro = Id_Registro;
        this.Monto = Monto;
    }

    public int getId_Venta() {
        return Id_Venta;
    }

    public void setId_Venta(int Id_Venta) {
        this.Id_Venta = Id_Venta;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public int getId_Registro() {
        return Id_Registro;
    }

    public void setId_Registro(int Id_Registro) {
        this.Id_Registro = Id_Registro;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    
}
