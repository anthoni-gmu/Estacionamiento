package Vista;

import Controlador.Controlador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;


public class Ingresar extends javax.swing.JFrame {

   
    public Ingresar() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        panel.setBackground(new Color(0, 0, 0, 0));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        btnClose = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass.setBackground(new Color(0,0,0,0));
        txtPass.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setText("123");
        txtPass.setBorder(null);
        txtPass.setOpaque(false);
        panel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 200, 50));
        panel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, 60));

        btnIngresar.setText("Ingresar");
        panel.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 501, 270, 60));

        txtName.setBackground(new Color(0,0,0,0));
        txtName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtName.setText("TonSoft");
        txtName.setBorder(null);
        txtName.setOpaque(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        panel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/login.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(panel);
        panel.setBounds(0, 0, 922, 720);

        setSize(new java.awt.Dimension(922, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    
    public static void main(String args[]) {
      Ingresar login=new Ingresar();
      Controlador ct=new Controlador(login);
      login.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClose;
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    public javax.swing.JTextField txtName;
    public javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
