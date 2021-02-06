package Modelo.VO;

public class EspacioVO {
    int Id_Espacio,Estado;

    public EspacioVO() {
    }

    
    public EspacioVO(int Id_Espacio, int Estado) {
        this.Id_Espacio = Id_Espacio;
        this.Estado = Estado;
    }

    public int getId_Espacio() {
        return Id_Espacio;
    }

    public void setId_Espacio(int Id_Espacio) {
        this.Id_Espacio = Id_Espacio;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
}
