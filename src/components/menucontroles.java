/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import views.Login;

/**
 *
 * @author fabri
 */
public class menucontroles extends javax.swing.JPanel {

    public menucontroles() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBordes5 = new layouts.panelBordes();
        btnminimizar = new javax.swing.JLabel();
        panelBordes1 = new layouts.panelBordes();
        btncerrar = new javax.swing.JLabel();
        panelBordes3 = new layouts.panelBordes();
        btnmaximizar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelBordes5.setBackground(new java.awt.Color(254, 187, 64));

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

        javax.swing.GroupLayout panelBordes5Layout = new javax.swing.GroupLayout(panelBordes5);
        panelBordes5.setLayout(panelBordes5Layout);
        panelBordes5Layout.setHorizontalGroup(
            panelBordes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnminimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );
        panelBordes5Layout.setVerticalGroup(
            panelBordes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnminimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

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
            .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );
        panelBordes1Layout.setVerticalGroup(
            panelBordes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btncerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBordes3.setBackground(new java.awt.Color(52, 200, 72));

        btnmaximizar.setBackground(new java.awt.Color(254, 187, 64));
        btnmaximizar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnmaximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnmaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/maximizar.png"))); // NOI18N
        btnmaximizar.setToolTipText("maximizar");
        btnmaximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmaximizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBordes3Layout = new javax.swing.GroupLayout(panelBordes3);
        panelBordes3.setLayout(panelBordes3Layout);
        panelBordes3Layout.setHorizontalGroup(
            panelBordes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnmaximizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );
        panelBordes3Layout.setVerticalGroup(
            panelBordes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnmaximizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBordes5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBordes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBordes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBordes5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBordes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBordes3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);        
        
        /*Login login = new Login();
        login.setVisible(true);
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (parentFrame != null) {
            parentFrame.dispose();
        }*/
    }//GEN-LAST:event_btncerrarMouseClicked

    private boolean isMaximized = false;
    private void btnmaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmaximizarMouseClicked
        // TODO add your handling code here:
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);    
        if (frame != null) { 
            if (isMaximized) {
                //[1213, 652] - [1213, 652]
                frame.setSize(1213, 652);
                frame.setLocationRelativeTo(null);
                isMaximized = false;
            } else {
                GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
                Rectangle bounds = env.getMaximumWindowBounds();
                frame.setBounds(bounds);
                isMaximized = true;
            }
        }
    }//GEN-LAST:event_btnmaximizarMouseClicked

    private void btnminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizarMouseClicked
        // TODO add your handling code here:
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
    
        if (frame != null) {
            frame.setExtendedState(JFrame.ICONIFIED);
        }
    }//GEN-LAST:event_btnminimizarMouseClicked

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#f0f2f6"), 0, getHeight(), Color.decode("#f0f2f6"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncerrar;
    private javax.swing.JLabel btnmaximizar;
    private javax.swing.JLabel btnminimizar;
    private layouts.panelBordes panelBordes1;
    private layouts.panelBordes panelBordes3;
    private layouts.panelBordes panelBordes5;
    // End of variables declaration//GEN-END:variables

}
