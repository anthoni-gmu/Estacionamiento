
package Modelo.VO;

public class LoginVO {
    int Id_user, Estado;
    String Name, Pass ;

    public LoginVO() {
    }

    public LoginVO(int Id_user, int Estado, String Name, String Pass) {
        this.Id_user = Id_user;
        this.Estado = Estado;
        this.Name = Name;
        this.Pass = Pass;
    }

    public int getId_user() {
        return Id_user;
    }

    public void setId_user(int Id_user) {
        this.Id_user = Id_user;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
}
