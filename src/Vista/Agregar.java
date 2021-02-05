package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Agregar extends javax.swing.JFrame {

 
    public Agregar() {
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
        btnBuscar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setText("jButton1");
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btnAceptar.setText("jButton2");
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        txtPlaca.setText("jTextField1");
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        txtNombre.setText("jTextField2");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Agregar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
