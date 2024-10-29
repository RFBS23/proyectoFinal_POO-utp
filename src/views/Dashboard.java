/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author fabri
 */
public class Dashboard extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        init();
        menu.setLogoImage();
        alumnos();
        cursos();
    }
    
    private void init () {
        setBackground(new Color(0,0,0,0));
    }
    
    public void alumnos() {
        java.net.URL imageURL = getClass().getResource("/assets/alumnos.png");
        if (imageURL != null) {
            ImageIcon icon = new ImageIcon(imageURL);
            Image image = icon.getImage().getScaledInstance(iconalumnos.getWidth(), iconalumnos.getHeight(), Image.SCALE_SMOOTH);
            iconalumnos.setIcon(new ImageIcon(image));
        } else {
            System.out.println("Error: No se encontró la imagen");
        }
    }
    
    public void cursos() {
        java.net.URL imageURL = getClass().getResource("/assets/cursos.png");
        if (imageURL != null) {
            ImageIcon icon = new ImageIcon(imageURL);
            Image image = icon.getImage().getScaledInstance(iconcursos.getWidth(), iconcursos.getHeight(), Image.SCALE_SMOOTH);
            iconcursos.setIcon(new ImageIcon(image));
        } else {
            System.out.println("Error: No se encontró la imagen");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBordes = new layouts.panelBordes();
        header = new layouts.panelBordes();
        menucontroles = new components.menucontroles();
        contentPanel = new layouts.panelBordes();
        paneles = new javax.swing.JTabbedPane();
        panelalumnos = new javax.swing.JPanel();
        panelBordes2 = new layouts.panelBordes();
        jLabel1 = new javax.swing.JLabel();
        panelcursos = new javax.swing.JPanel();
        panelBordes3 = new layouts.panelBordes();
        jLabel2 = new javax.swing.JLabel();
        panelMenu = new layouts.panelBordes();
        menu = new components.menu();
        jSeparator1 = new javax.swing.JSeparator();
        panelbtnalumnos = new layouts.panelBordes();
        iconalumnos = new javax.swing.JLabel();
        lblalumnos = new javax.swing.JLabel();
        panelbtncursos = new layouts.panelBordes();
        iconcursos = new javax.swing.JLabel();
        lblcursos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBordes.setBackground(new java.awt.Color(246, 249, 255));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menucontroles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menucontroles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(246, 249, 255));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneles.setBackground(new java.awt.Color(246, 249, 255));
        paneles.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        paneles.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        panelalumnos.setBackground(new java.awt.Color(246, 249, 255));
        panelalumnos.setMaximumSize(new java.awt.Dimension(0, 0));

        panelBordes2.setBackground(new java.awt.Color(246, 249, 255));

        jLabel1.setText("almunos");

        javax.swing.GroupLayout panelBordes2Layout = new javax.swing.GroupLayout(panelBordes2);
        panelBordes2.setLayout(panelBordes2Layout);
        panelBordes2Layout.setHorizontalGroup(
            panelBordes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordes2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        panelBordes2Layout.setVerticalGroup(
            panelBordes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordes2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelalumnosLayout = new javax.swing.GroupLayout(panelalumnos);
        panelalumnos.setLayout(panelalumnosLayout);
        panelalumnosLayout.setHorizontalGroup(
            panelalumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordes2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelalumnosLayout.setVerticalGroup(
            panelalumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        paneles.addTab("", panelalumnos);

        panelcursos.setBackground(new java.awt.Color(246, 249, 255));

        panelBordes3.setBackground(new java.awt.Color(246, 249, 255));

        jLabel2.setForeground(new java.awt.Color(204, 0, 255));
        jLabel2.setText("cursos");

        javax.swing.GroupLayout panelBordes3Layout = new javax.swing.GroupLayout(panelBordes3);
        panelBordes3.setLayout(panelBordes3Layout);
        panelBordes3Layout.setHorizontalGroup(
            panelBordes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordes3Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        panelBordes3Layout.setVerticalGroup(
            panelBordes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordes3Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelcursosLayout = new javax.swing.GroupLayout(panelcursos);
        panelcursos.setLayout(panelcursosLayout);
        panelcursosLayout.setHorizontalGroup(
            panelcursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordes3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelcursosLayout.setVerticalGroup(
            panelcursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordes3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        paneles.addTab("", panelcursos);

        contentPanel.add(paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 990, 580));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        panelbtnalumnos.setBackground(new java.awt.Color(255, 255, 255));
        panelbtnalumnos.setPreferredSize(new java.awt.Dimension(206, 46));
        panelbtnalumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelbtnalumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelbtnalumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelbtnalumnosMouseExited(evt);
            }
        });

        iconalumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelbtnalumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelbtnalumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelbtnalumnosMouseExited(evt);
            }
        });

        lblalumnos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblalumnos.setForeground(new java.awt.Color(1, 41, 112));
        lblalumnos.setText("Alumnos");
        lblalumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelbtnalumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelbtnalumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelbtnalumnosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelbtnalumnosLayout = new javax.swing.GroupLayout(panelbtnalumnos);
        panelbtnalumnos.setLayout(panelbtnalumnosLayout);
        panelbtnalumnosLayout.setHorizontalGroup(
            panelbtnalumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbtnalumnosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(iconalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelbtnalumnosLayout.setVerticalGroup(
            panelbtnalumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbtnalumnosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelbtnalumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        panelbtncursos.setBackground(new java.awt.Color(255, 255, 255));
        panelbtncursos.setPreferredSize(new java.awt.Dimension(206, 46));
        panelbtncursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconcursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconcursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconcursosMouseExited(evt);
            }
        });

        iconcursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconcursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconcursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconcursosMouseExited(evt);
            }
        });

        lblcursos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblcursos.setForeground(new java.awt.Color(1, 41, 112));
        lblcursos.setText("Cursos");
        lblcursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconcursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconcursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconcursosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelbtncursosLayout = new javax.swing.GroupLayout(panelbtncursos);
        panelbtncursos.setLayout(panelbtncursosLayout);
        panelbtncursosLayout.setHorizontalGroup(
            panelbtncursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbtncursosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(iconcursos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblcursos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelbtncursosLayout.setVerticalGroup(
            panelbtncursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbtncursosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelbtncursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconcursos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(panelbtnalumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(panelbtncursos, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelbtnalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelbtncursos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBordesLayout = new javax.swing.GroupLayout(panelBordes);
        panelBordes.setLayout(panelBordesLayout);
        panelBordesLayout.setHorizontalGroup(
            panelBordesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBordesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBordesLayout.setVerticalGroup(
            panelBordesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordesLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBordesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void panelbtnalumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbtnalumnosMouseEntered
        // TODO add your handling code here:
        panelbtnalumnos.setBackground(new Color(246, 249, 255));
        lblalumnos.setForeground(new Color(65,84,241));
        panelbtnalumnos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblalumnos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        iconalumnos.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_panelbtnalumnosMouseEntered

    private void panelbtnalumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbtnalumnosMouseExited
        // TODO add your handling code here:        
        panelbtnalumnos.setBackground(new Color(255, 255, 255));
        lblalumnos.setForeground(new Color(1,41,112));
    }//GEN-LAST:event_panelbtnalumnosMouseExited

    private void panelbtnalumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbtnalumnosMouseClicked
        paneles.setSelectedIndex(0);
    }//GEN-LAST:event_panelbtnalumnosMouseClicked

    private void iconcursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconcursosMouseEntered
        // TODO add your handling code here:
        panelbtncursos.setBackground(new Color(246, 249, 255));
        lblcursos.setForeground(new Color(65,84,241));
        panelbtncursos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblcursos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        iconcursos.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_iconcursosMouseEntered

    private void iconcursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconcursosMouseExited
        // TODO add your handling code here:
        panelbtncursos.setBackground(new Color(255, 255, 255));
        lblcursos.setForeground(new Color(1,41,112));
    }//GEN-LAST:event_iconcursosMouseExited

    private void iconcursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconcursosMouseClicked
        // TODO add your handling code here:
        paneles.setSelectedIndex(1);
    }//GEN-LAST:event_iconcursosMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private layouts.panelBordes contentPanel;
    private layouts.panelBordes header;
    private javax.swing.JLabel iconalumnos;
    private javax.swing.JLabel iconcursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblalumnos;
    private javax.swing.JLabel lblcursos;
    private components.menu menu;
    private components.menucontroles menucontroles;
    private layouts.panelBordes panelBordes;
    private layouts.panelBordes panelBordes2;
    private layouts.panelBordes panelBordes3;
    private layouts.panelBordes panelMenu;
    private javax.swing.JPanel panelalumnos;
    private layouts.panelBordes panelbtnalumnos;
    private layouts.panelBordes panelbtncursos;
    private javax.swing.JPanel panelcursos;
    private javax.swing.JTabbedPane paneles;
    // End of variables declaration//GEN-END:variables
}
