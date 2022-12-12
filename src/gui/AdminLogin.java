/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import util.Global;

/**
 *
 * @author akash
 */
public class AdminLogin extends javax.swing.JPanel {

    /**
     * Creates new form AdminLogin
     */
    private static final String BACKHGROUND_IMAGE_URL = "https://img.freepik.com/free-photo/happy-young-female-student-with-books-hands-university-background_8119-1502.jpg?w=2000";

    public AdminLogin() {

        initComponents();

        pnl_SettingAdminLogin1.setBackground(new Color(0, 0, 0, 100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnl_SettingAdminLogin1 = new javax.swing.JPanel();
        btn_SettingExit2 = new javax.swing.JButton();
        lbl_SettingUsername2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lbl_SettingPassword2 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new java.awt.GridBagLayout());

        pnl_SettingAdminLogin1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_SettingAdminLogin1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        pnl_SettingAdminLogin1.setLayout(new java.awt.GridBagLayout());

        btn_SettingExit2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_SettingExit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/exit.png"))); // NOI18N
        btn_SettingExit2.setText("Exit");
        btn_SettingExit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SettingExit2.setFocusPainted(false);
        btn_SettingExit2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_SettingExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SettingExit2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 200, 10, 10);
        pnl_SettingAdminLogin1.add(btn_SettingExit2, gridBagConstraints);

        lbl_SettingUsername2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername2.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername2, gridBagConstraints);

        btnLogin.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/login.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 200);
        pnl_SettingAdminLogin1.add(btnLogin, gridBagConstraints);

        lbl_SettingPassword2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingPassword2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingPassword2.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingPassword2, gridBagConstraints);

        textField.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField.setText("admin");
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField, gridBagConstraints);

        passwordField.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        passwordField.setText("admin123");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(passwordField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 110;
        gridBagConstraints.insets = new java.awt.Insets(0, 500, 0, 500);
        add(pnl_SettingAdminLogin1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SettingExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SettingExit2ActionPerformed
        // TODO add your handling code here:
        Global.globalData.put("currentpanel", "AdminLogin");
        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
        MainFee mainFee = new MainFee();
        mainPanel.add(mainFee, "MainFee");
        //  String cpanel=(String) Global.globalData.get("currentpanel");
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "MainFee");
    }//GEN-LAST:event_btn_SettingExit2ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        String name = textField.getText().trim();
        char ch[] = passwordField.getPassword();
        String password = String.valueOf(ch).trim();
        if (name.equals("admin") && password.equals("admin123")) {
//				String s[]={};
//				AdminSection.main(s);
//				frame.dispose();
            Global.globalData.put("currentpanel", "AdminLogin");
            AdminSection adminSec = new AdminSection();
            JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
            mainPanel.add(adminSec, "AdminSection");
            CardLayout card = (CardLayout) mainPanel.getLayout();
            card.show(mainPanel, "AdminSection");
            System.out.println("LOGIN");
        } else {
            JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, username or password error!");
            textField.setText("");
            passwordField.setText("");
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed

    }//GEN-LAST:event_passwordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btn_SettingExit2;
    private javax.swing.JLabel lbl_SettingPassword2;
    private javax.swing.JLabel lbl_SettingUsername2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel pnl_SettingAdminLogin1;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables

}
