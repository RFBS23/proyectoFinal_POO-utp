/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author fabri
 */
public class menu extends javax.swing.JPanel {
    public menu() {
        initComponents();
        setOpaque(false);
        init();
    }
    
    private void init () {
        setBackground(new Color(0,0,0,0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoinicio = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
            
    public void setLogoImage() {
        // Intenta obtener la imagen
        java.net.URL imageURL = getClass().getResource("/assets/logo-utp.png");
        if (imageURL != null) {
            ImageIcon icon = new ImageIcon(imageURL);
            // Redimensiona la imagen para que se ajuste al tamaño del JLabel logoinicio
            Image image = icon.getImage().getScaledInstance(logoinicio.getWidth(), logoinicio.getHeight(), Image.SCALE_SMOOTH);
            logoinicio.setIcon(new ImageIcon(image));
        } else {
            System.out.println("Error: No se encontró la imagen en /assets/logo-utp.png");
        }
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logoinicio;
    // End of variables declaration//GEN-END:variables
}
