/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import util.Global;

/**
 *
 * @author akash
 */
public class MainFee extends JPanel {

    /**
     * Creates new form MainFee
     */
    

    public MainFee() {

        
            initComponents();
          // this.setBackground(new Color(0, 0, 0, 0));
            pnl_SettingAdminLogin1.setBackground(new Color(0, 0, 0, 100));
           
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnl_SettingAdminLogin1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new java.awt.GridBagLayout());

        pnl_SettingAdminLogin1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_SettingAdminLogin1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        pnl_SettingAdminLogin1.setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(240, 240, 240));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/admin.png"))); // NOI18N
        jButton1.setText("Admin Login");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnl_SettingAdminLogin1.add(jButton1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(240, 240, 240));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/accountant.png"))); // NOI18N
        jButton2.setText("Accountant Login");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnl_SettingAdminLogin1.add(jButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 110;
        gridBagConstraints.insets = new java.awt.Insets(0, 500, 0, 500);
        add(pnl_SettingAdminLogin1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Global.globalData.put("currentpanel", "MainFee");
        AccountantLogin accLogin = new AccountantLogin();
        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
        mainPanel.add(accLogin, "AccountantLogin");
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "AccountantLogin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Global.globalData.put("currentpanel", "MainFee");
        AdminLogin adminLog = new AdminLogin();
        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
        mainPanel.add(adminLog, "AdminLogin");
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "AdminLogin");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel pnl_SettingAdminLogin1;
    // End of variables declaration//GEN-END:variables
}
