package Vista;

import Controlador.ControladorInico;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;

public class Inicio extends javax.swing.JFrame {

   
    public Inicio() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        Panel.setBackground(new Color(0, 0, 0, 0));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        test = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEspacio1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 70));

        test.setText("jButton1");
        Panel.add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, 80));

        jButton1.setText("jButton1");
        Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        btnEspacio1.setText("1");
        Panel.add(btnEspacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Principal.png"))); // NOI18N
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1750, -1));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1749, 1000));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    public javax.swing.JButton btnClose;
    public javax.swing.JButton btnEspacio1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JButton test;
    // End of variables declaration//GEN-END:variables
}
