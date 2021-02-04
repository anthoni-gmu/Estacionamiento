package Controlador;

import Vista.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorInico implements ActionListener {

    Inicio in = new Inicio();

    public ControladorInico(Inicio i) {
        this.in = i;
        this.in.btnClose.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == in.btnClose ) {
            System.out.println("hola");
            in.dispose();
        }
    }

}
