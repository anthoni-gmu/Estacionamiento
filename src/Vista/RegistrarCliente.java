
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class RegistrarCliente extends javax.swing.JFrame {

   
    public RegistrarCliente() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumero.setBackground(new Color(0,0,0,0));
        txtNumero.setBorder(null);
        txtNumero.setOpaque(false);
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 357, 250, 30));

        txtNombre.setBackground(new Color(0,0,0,0));
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, 30));

        txtApellido.setBackground(new Color(0,0,0,0));
        txtApellido.setBorder(null);
        txtApellido.setOpaque(false);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 213, 250, 30));

        txtDNI.setBackground(new Color(0,0,0,0));
        txtDNI.setBorder(null);
        txtDNI.setOpaque(false);
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 287, 250, 30));

        btnRegistrar.setText("REGISTRAR");
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        btnCancelar.setText("CANCELAR");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/RegistrarCliente.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtDNI;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
