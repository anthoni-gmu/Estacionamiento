package Controlador;

import Modelo.DAO.CarroDAO;
import Modelo.DAO.ClienteDAO;
import Modelo.DAO.RegistroDAO;
import Modelo.VO.CarroVO;
import Modelo.VO.ClienteVO;
import Vista.Agregar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Cagregar  implements ActionListener {

    public int Id_Espacio;
    
    Agregar ag = new Agregar();
    CarroDAO dao = new CarroDAO();
    ClienteDAO Cdao = new ClienteDAO();
    RegistroDAO Rdao = new RegistroDAO();

    public Cagregar(Agregar a) {
        this.ag = a;
        this.ag.btnAceptar.addActionListener(this);
        this.ag.btnBuscar.addActionListener(this);
        this.ag.txtNombre.addActionListener(this);
        this.ag.txtPlaca.addActionListener(this);

    }

    Cagregar() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ag.btnBuscar) {
            buscarPlaca();
        }
        if (e.getSource() == ag.btnAceptar) {
            AgregarRegistro();
            System.out.println(Id_Espacio);
            ag.dispose();
        }
    }

    void buscarPlaca() {

        String cod = ag.txtPlaca.getText();
        if (ag.txtPlaca.getText().equals("")) {
            JOptionPane.showMessageDialog(ag, "Debe llenar el campo");
        } else {
            CarroVO x = dao.listarID(cod);
            if (x.getPlaca() != null) {
                int id = x.getId_cliente();
                ClienteVO cli = Cdao.listarID(id);

                ag.txtNombre.setText(cli.getNombre());
            }
//            } else {
//                r = JOptionPane.showConfirmDialog(this, "Cliente no registrado, Desea registrar");
//                if (r == 0) {
//                    Proveedores Pv = new Proveedores();
//                    Pv.setVisible(true);
//                    dispose();
//                }
//            }
        }
    }

    void AgregarRegistro() {
        int Id_Carro;
        String Fecha,Tiempo;
        String cod = ag.txtPlaca.getText();
        CarroVO x = dao.listarID(cod);

        Id_Carro = x.getId_carro();
        
        Calendar f = new GregorianCalendar();
  
        int año = f.get(Calendar.YEAR);
        int mes = f.get(Calendar.MONTH);
        int dia = f.get(Calendar.DAY_OF_MONTH);
  
        if (Integer.valueOf(mes) < 10) {
            if (Integer.valueOf(dia) < 10) {
                Fecha=(año + "-0" + mes + "-0" + dia);
            } else {
                Fecha= (año + "-0" + mes + "-" + dia);
               
            }
        } else {
            if (Integer.valueOf(dia) < 10) {
                Fecha=(año + "-" + mes + "-0" + dia);
            } else {
                Fecha=(año + "-" + mes + "-" + dia);
            }
        }
        
        
        
        
        int hora, minutos;
        Calendar calendario = Calendar.getInstance();
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
       
        Tiempo=(hora + ":" + minutos );
//        System.out.println(Id_Espacio);
//        System.out.println(Id_Carro);
//        System.out.println(Fecha);
//        System.out.println(Tiempo);

        Object[] ob = new Object[4];
        ob[0] = Id_Espacio;
        ob[1] = Id_Carro;
        ob[2] = Fecha;
        ob[3] = Tiempo;

        Rdao.add(ob);
    }
    
}
