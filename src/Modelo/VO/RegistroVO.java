package Modelo.VO;

public class RegistroVO {
    int Id_Registro,Id_Espacio,Id_Carro,Tiempo;
    String Fecha;

    public RegistroVO() {
    }

    public RegistroVO(int Id_Registro, int Id_Espacio, int Id_Carro, int Tiempo, String Fecha) {
        this.Id_Registro = Id_Registro;
        this.Id_Espacio = Id_Espacio;
        this.Id_Carro = Id_Carro;
        this.Tiempo = Tiempo;
        this.Fecha = Fecha;
    }

    public int getId_Registro() {
        return Id_Registro;
    }

    public void setId_Registro(int Id_Registro) {
        this.Id_Registro = Id_Registro;
    }

    public int getId_Espacio() {
        return Id_Espacio;
    }

    public void setId_Espacio(int Id_Espacio) {
        this.Id_Espacio = Id_Espacio;
    }

    public int getId_Carro() {
        return Id_Carro;
    }

    public void setId_Carro(int Id_Carro) {
        this.Id_Carro = Id_Carro;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
