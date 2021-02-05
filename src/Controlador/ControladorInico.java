package Controlador;

import Vista.Inicio;
import Vista.RegistrarCliente;
import Vista.Agregar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorInico implements ActionListener {

    Inicio in = new Inicio();

    public ControladorInico(Inicio ic) {
        this.in = ic;
        this.in.btnClose.addActionListener(this);
        this.in.test.addActionListener(this);
        this.in.btnEspacio1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == in.btnClose) {
            System.out.println("hola");
            in.dispose();

        }
        if (e.getSource() == in.test) {
            RegistrarCliente RC = new RegistrarCliente();
            ControladorRegistrarCliente ct = new ControladorRegistrarCliente(RC);
            RC.setVisible(true);

        }

        if (e.getSource() == in.btnEspacio1)  {
            Agregar agg=new Agregar();
            Cagregar ct=new Cagregar(agg);
            agg.setVisible(true);
            

        }

    }

}
