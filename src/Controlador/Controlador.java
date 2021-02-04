package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.DAO.*;
import Modelo.VO.*;
import Vista.*;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    LoginDAO dao = new LoginDAO();
    LoginVO vo = new LoginVO();
    Ingresar login = new Ingresar();
    Inicio  in= new Inicio();
    

    public Controlador(Ingresar i) {
        this.login = i;
        this.login.btnIngresar.addActionListener(this);
        this.login.btnClose.addActionListener(this);
        
        
        
    }

   
    
    

    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btnIngresar) {
            validar();
            in.setVisible(true);
            login.dispose();
        }
        if (e.getSource() == login.btnClose ) {
            login.dispose();
        }
        
        
    }

    public void validar() {
        String usuario = login.txtName.getText();
        String clave = login.txtPass.getText();
        if (login.txtName.getText().equals("") || login.txtPass.getText().equals("")) {
            login.txtName.requestFocus();
        } else {
            vo = dao.ValidadUsuario(usuario, clave);
            if (vo.getName() != null && vo.getPass() != null) {
//                JOptionPane.showMessageDialog(this, "Bienvenido");
                login.dispose();

            } else {
                login.txtName.requestFocus();

            }
        }
    }
    
    

}
