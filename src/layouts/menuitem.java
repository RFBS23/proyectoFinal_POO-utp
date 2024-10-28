/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package layouts;

import java.awt.Color;

/**
 *
 * @author fabri
 */
public class menuitem extends javax.swing.JPanel {

    private final menu_layout data;
            
    public menuitem(menu_layout data) {
        initComponents();
        this.data = data;
        
        setOpaque(false);
        if (data.getType()== menu_layout.MenuType.MENU) {
            lblicon.setIcon(data.toIcon());
            nombremenu.setText(data.getName());
        } else {
            nombremenu.setText(" ");
        }
    }

    public void setSelected (boolean selected) {
        if(data.getType()== menu_layout.MenuType.MENU) {
            if(selected) {
                lblicon.setIcon(data.toIconSelected());
                nombremenu.setForeground(new Color(60, 60, 60));
            } else {
                lblicon.setIcon(data.toIcon());
                nombremenu.setForeground(new Color(214, 217, 223));
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblicon = new javax.swing.JLabel();
        nombremenu = new javax.swing.JLabel();

        nombremenu.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nombremenu.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombremenu, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nombremenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel nombremenu;
    // End of variables declaration//GEN-END:variables
}
