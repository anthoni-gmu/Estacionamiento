
package Controlador;

import Modelo.DAO.CarroDAO;
import Modelo.DAO.ClienteDAO;
import Modelo.VO.CarroVO;
import Modelo.VO.ClienteVO;
import Vista.Agregar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Cagregar implements ActionListener{
    
    Agregar ag=new Agregar();
   CarroDAO dao=new CarroDAO();
   ClienteDAO Cdao=new ClienteDAO();

    public Cagregar(Agregar a) {
        this.ag=a;
        this.ag.btnAceptar.addActionListener(this);
        this.ag.btnBuscar.addActionListener(this);
        this.ag.txtNombre.addActionListener(this);
        this.ag.txtPlaca.addActionListener(this);
       
        
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ag.btnBuscar) {
            buscarPlaca();
        }
       if (e.getSource() == ag.btnAceptar) {
            ag.dispose();
        }
    }
    
    void buscarPlaca() {
        int r;
        String cod = ag.txtPlaca.getText();
        if (ag.txtPlaca.getText().equals("")) {
            JOptionPane.showMessageDialog(ag, "Debe llenar el campo");
        } else {
            CarroVO Proveedor = dao.listarID(cod);
            if (Proveedor.getPlaca()!= null) {
                int id=Proveedor.getId_cliente();
                ClienteVO cli =Cdao.listarID(id);
                
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
    
}
