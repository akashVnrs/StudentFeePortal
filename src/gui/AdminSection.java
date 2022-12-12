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
public class AdminSection extends javax.swing.JPanel {

    /**
     * Creates new form AdminSection
     */
    
    public AdminSection() {
     
             initComponents();
             pnl_SettingAdminLogin1.setBackground(new Color(0,0,0,100));
           
         }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnl_SettingAdminLogin1 = new javax.swing.JPanel();
        lbl_SettingUsername2 = new javax.swing.JLabel();
        lbl_SettingPassword2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_SettingUsername3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new java.awt.GridBagLayout());

        pnl_SettingAdminLogin1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_SettingAdminLogin1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        pnl_SettingAdminLogin1.setLayout(new java.awt.GridBagLayout());

        lbl_SettingUsername2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername2, gridBagConstraints);

        lbl_SettingPassword2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingPassword2, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addS.png"))); // NOI18N
        jButton1.setText("Add Accountant");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/view.png"))); // NOI18N
        jButton2.setText("View Accountant");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(jButton2, gridBagConstraints);

        lbl_SettingUsername3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_SettingUsername3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SettingUsername3.setText("Admin Section");
        lbl_SettingUsername3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername3, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jButton4.setText("Log Out");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 110;
        add(pnl_SettingAdminLogin1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Global.globalData.put("currentpanel", "AdminSection");
        AddAccountant addAcc=new AddAccountant();
        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
        mainPanel.add(addAcc, "AddAccountant");
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "AddAccountant");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Global.globalData.put("currentpanel", "AdminSection");
        ViewAccountant viewAcc=new ViewAccountant();
        JPanel mainPanel=(JPanel) Global.globalData.get("mainPanel");
        mainPanel.add(viewAcc,"ViewAccountant");
         CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "ViewAccountant");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         Global.globalData.put("currentpanel", "AdminSection");
        AdminLogin adminLog=new AdminLogin();
        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
        mainPanel.add(adminLog, "AdminLogin");
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "AdminLogin");
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel lbl_SettingPassword2;
    private javax.swing.JLabel lbl_SettingUsername2;
    private javax.swing.JLabel lbl_SettingUsername3;
    private javax.swing.JPanel pnl_SettingAdminLogin1;
    // End of variables declaration//GEN-END:variables
}
