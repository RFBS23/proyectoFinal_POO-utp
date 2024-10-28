/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import layouts.menu_layout;

/**
 *
 * @author fabri
 */
public class menu extends javax.swing.JPanel {

    public menu() {
        initComponents();
        setOpaque(false);
        listmenu.setOpaque(false);
        initData();
    }
    
    private void initData () {
        listmenu.addItem(new menu_layout("1", "Alumnos", menu_layout.MenuType.MENU));
        listmenu.addItem(new menu_layout("2", "Cursos", menu_layout.MenuType.MENU));
        listmenu.addItem(new menu_layout("3", "Gestion de Alumnos", menu_layout.MenuType.MENU));
        listmenu.addItem(new menu_layout("4", "Gestion de Cursos", menu_layout.MenuType.MENU));
        listmenu.addItem(new menu_layout("5", "Calificaciones", menu_layout.MenuType.MENU));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoinicio = new javax.swing.JLabel();
        listmenu = new layouts.Listmenu<>();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(listmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(listmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#ffffff"), 0, getHeight(), Color.decode("#ffffff"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }

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
    private layouts.Listmenu<String> listmenu;
    private javax.swing.JLabel logoinicio;
    // End of variables declaration//GEN-END:variables
}
