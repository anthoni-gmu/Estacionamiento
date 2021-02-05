
package Controlador;

import Modelo.DAO.ClienteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.RegistrarCliente;

public class ControladorRegistrarCliente implements ActionListener {
    
RegistrarCliente rc=new RegistrarCliente();
ClienteDAO dao=new ClienteDAO();
    public ControladorRegistrarCliente(RegistrarCliente re) {
        this.rc = re;
        this.rc.btnCancelar.addActionListener(this);
        this.rc.btnRegistrar.addActionListener(this);
        this.rc.txtApellido.addActionListener(this);
        this.rc.txtDNI.addActionListener(this);
        this.rc.txtNombre.addActionListener(this);
        this.rc.txtNumero.addActionListener(this);
    }

     
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == rc.btnRegistrar) {
            agregar();
            rc.dispose();
        }
       if (e.getSource() == rc.btnCancelar) {
            rc.dispose();
        }
    }
    
    void agregar(){
        String dni=rc.txtDNI.getText();
        String nom=rc.txtNombre.getText();
        String ape=rc.txtApellido.getText();
        String numero=rc.txtNumero.getText();  
        System.out.println(dni +nom+ape+numero);
        
        Object[] ob=new Object[4];
        ob[0]=nom;
        ob[1]=ape;
        ob[2]=dni;
        ob[3]=numero;
        
         dao.add(ob);
       
    }
    
}
