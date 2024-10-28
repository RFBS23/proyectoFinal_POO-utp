/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package views;

import controllers.Login_controllers;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import models.Login_models;

/**
 *
 * @author fabri
 */

public class Login extends javax.swing.JFrame {

    Login_models login = new Login_models();
    int xMouse, yMouse;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        setLogoImage();
        init();
    }

    private void init () {
        setBackground(new Color(0,0,0,0));
    }
    
    public void validar() {
        String nombreusuario = txtusuario.getText();
        String clave = String.valueOf(txtpassword.getPassword());
        if(!"".equals(nombreusuario) || "".equals(clave)) {
            Login_controllers logincontrollers = login.IniciarSesion(nombreusuario, clave);
            if (logincontrollers.getNombreusuario()!= null && logincontrollers.getClave()!= null){
                Dashboard inicio = new Dashboard();
                inicio.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingresa el usuario y la contraseña");
        }
    }
    
    private void setLogoImage() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/logo-utp.png"));
        Image image = icon.getImage().getScaledInstance(logoinicio.getWidth(), logoinicio.getHeight(), Image.SCALE_SMOOTH);
        logoinicio.setIcon(new ImageIcon(image));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBordes2 = new layouts.panelBordes();
        logoinicio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btniniciarsesion = new javax.swing.JButton();
        panelheader = new layouts.panelBordes();
        panelBordes1 = new layouts.panelBordes();
        btncerrar = new javax.swing.JLabel();
        panelBordes3 = new layouts.panelBordes();
        btnminimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 249, 255));
        setUndecorated(true);
        setResizable(false);

        panelBordes2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema inventario");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario");

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setText("Ingrese su nombre de usuario");
        txtusuario.setBorder(null);
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(204, 204, 204));
        txtpassword.setText("******");
        txtpassword.setToolTipText("Ingrese su contraseña");
        txtpassword.setBorder(null);
        txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpasswordMousePressed(evt);
            }
        });

        btniniciarsesion.setBackground(new java.awt.Color(51, 153, 255));
        btniniciarsesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btniniciarsesion.setForeground(new java.awt.Color(255, 255, 255));
        btniniciarsesion.setText("Iniciar Sesion");
        btniniciarsesion.setBorder(null);
        btniniciarsesion.setBorderPainted(false);
        btniniciarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarsesionActionPerformed(evt);
            }
        });

        panelheader.setBackground(new java.awt.Color(255, 255, 255));
        panelheader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelheaderMouseDragged(evt);
            }
        });
        panelheader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelheaderMousePressed(evt);
            }
        });

        panelBordes1.setBackground(new java.awt.Color(251, 88, 84));

        btncerrar.setBackground(new java.awt.Color(251, 88, 84));
        btncerrar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btncerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cerrar.png"))); // NOI18N
        btncerrar.setToolTipText("cerrar");
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBordes1Layout = new javax.swing.GroupLayout(panelBordes1);
        panelBordes1.setLayout(panelBordes1Layout);
        panelBordes1Layout.setHorizontalGroup(
            panelBordes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBordes1Layout.setVerticalGroup(
            panelBordes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBordes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBordes3.setBackground(new java.awt.Color(254, 187, 64));

        btnminimizar.setBackground(new java.awt.Color(254, 187, 64));
        btnminimizar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnminimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimizar.png"))); // NOI18N
        btnminimizar.setToolTipText("minimizar");
        btnminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBordes3Layout = new javax.swing.GroupLayout(panelBordes3);
        panelBordes3.setLayout(panelBordes3Layout);
        panelBordes3Layout.setHorizontalGroup(
            panelBordes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnminimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBordes3Layout.setVerticalGroup(
            panelBordes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnminimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelheaderLayout = new javax.swing.GroupLayout(panelheader);
        panelheader.setLayout(panelheaderLayout);
        panelheaderLayout.setHorizontalGroup(
            panelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelheaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBordes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBordes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelheaderLayout.setVerticalGroup(
            panelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelheaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBordes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBordes3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBordes2Layout = new javax.swing.GroupLayout(panelBordes2);
        panelBordes2.setLayout(panelBordes2Layout);
        panelBordes2Layout.setHorizontalGroup(
            panelBordes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelheader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBordes2Layout.createSequentialGroup()
                .addGroup(panelBordes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBordes2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(panelBordes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBordes2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBordes2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btniniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        panelBordes2Layout.setVerticalGroup(
            panelBordes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBordes2Layout.createSequentialGroup()
                .addComponent(panelheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btniniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBordes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btniniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarsesionActionPerformed
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_btniniciarsesionActionPerformed

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btncerrarMouseClicked

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        // TODO add your handling code here:
        if(txtusuario.getText().equals("Ingrese su nombre de usuario")){
            txtusuario.setText("");
            txtusuario.setForeground(Color.black);
        }
        if (String.valueOf(txtpassword.getPassword()).isEmpty()) {
            txtpassword.setText("******");
            txtpassword.setForeground(Color.gray);            
        }
    }//GEN-LAST:event_txtusuarioMousePressed

    private void txtpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMousePressed
        // TODO add your handling code here:
        if (String.valueOf(txtpassword.getPassword()).equals("******")) {
            txtpassword.setText("");
            txtpassword.setForeground(Color.black);            
        }
        if(txtusuario.getText().isEmpty()){
            txtusuario.setText("Ingrese su nombre de usuario");
            txtusuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtpasswordMousePressed

    private void btnminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizarMouseClicked
        // TODO add your handling code here:
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnminimizarMouseClicked

    private void panelheaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelheaderMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelheaderMousePressed

    private void panelheaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelheaderMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelheaderMouseDragged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncerrar;
    private javax.swing.JButton btniniciarsesion;
    private javax.swing.JLabel btnminimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoinicio;
    private layouts.panelBordes panelBordes1;
    private layouts.panelBordes panelBordes2;
    private layouts.panelBordes panelBordes3;
    private layouts.panelBordes panelheader;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
