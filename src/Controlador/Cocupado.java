
package Controlador;

import Vista.Ocupado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cocupado implements ActionListener {
Ocupado op=new Ocupado();
    public Cocupado(Ocupado o) {
        this.op=o;
        this.op.btnCancelar.addActionListener(this);
        this.op.btnCobrar.addActionListener(this);
        this.op.txtEspacio.addActionListener(this);
        this.op.txtMonto.addActionListener(this);
        this.op.txtNombre.addActionListener(this);
        this.op.txtPlaca.addActionListener(this);
        this.op.txtTiempo.addActionListener(this);
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
