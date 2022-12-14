/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import util.EmailValidation;
import bo.Accountant;
import bo.AccountantDao;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import util.Global;
import util.MobileValidation;

/**
 *
 * @author akash
 */
public class AddAccountant extends javax.swing.JPanel {

    /**
     * Creates new form AddAccountant
     */
 

    public AddAccountant() {
        
            initComponents();
            pnl_SettingAdminLogin1.setBackground(new Color(0,0,0,100));
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
        lbl_SettingUsername3 = new javax.swing.JLabel();
        lbl_SettingUsername4 = new javax.swing.JLabel();
        textField1 = new javax.swing.JTextField();
        textField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new java.awt.GridBagLayout());

        pnl_SettingAdminLogin1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_SettingAdminLogin1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        pnl_SettingAdminLogin1.setLayout(new java.awt.GridBagLayout());

        btn_SettingExit2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_SettingExit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        btn_SettingExit2.setText("Back");
        btn_SettingExit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SettingExit2.setFocusPainted(false);
        btn_SettingExit2.setFocusable(false);
        btn_SettingExit2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_SettingExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SettingExit2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
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
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addSubmit.png"))); // NOI18N
        btnLogin.setText("Add Accountant");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.setFocusable(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pnl_SettingAdminLogin1.add(btnLogin, gridBagConstraints);

        lbl_SettingPassword2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingPassword2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingPassword2.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingPassword2, gridBagConstraints);

        textField.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
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

        lbl_SettingUsername3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername3.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername3, gridBagConstraints);

        lbl_SettingUsername4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername4.setText("Contact No:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername4, gridBagConstraints);

        textField1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField1, gridBagConstraints);

        textField2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField2, gridBagConstraints);

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
//        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
//        String cpanel=(String) Global.globalData.get("currentpanel");
//        CardLayout card = (CardLayout) mainPanel.getLayout();
//        card.show(mainPanel, cpanel);

        Global.globalData.put("currentpanel", "AddAccountant");
        AdminSection adminSec = new AdminSection();
        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
        mainPanel.add(adminSec, "AdminSection");
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "AdminSection");
    }//GEN-LAST:event_btn_SettingExit2ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String name = textField.getText().trim();
        char ch[] = passwordField.getPassword();
        String password = String.valueOf(ch).trim();
        String email = textField1.getText().trim();
        String contactno = textField2.getText().trim();

        if (name.trim().length() == 0) {
            JLabel label = new JLabel("Name is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            //UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 15));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (password.trim().length() == 0) {
            JLabel label = new JLabel("Password is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            //UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
           // UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 15));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (EmailValidation.isValid(email)==false) {
            JLabel label = new JLabel("Email is not valid.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
           // UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
           // UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 15));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (MobileValidation.isValid(contactno)==false) {
            JLabel label = new JLabel("Contact Number is not valid.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            //UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
           // UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 15));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else {

            Accountant a = new Accountant(name, password, email, contactno);
            int status = AccountantDao.save(a);
            if (status > 0) {
                JOptionPane.showMessageDialog(AddAccountant.this, "Accountant added successfully!");
                textField.setText("");
                textField1.setText("");
                textField2.setText("");
                passwordField.setText("");
            } else {
                JOptionPane.showMessageDialog(AddAccountant.this, "Sorry, Unable to add Accountant!");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed

    }//GEN-LAST:event_passwordFieldActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btn_SettingExit2;
    private javax.swing.JLabel lbl_SettingPassword2;
    private javax.swing.JLabel lbl_SettingUsername2;
    private javax.swing.JLabel lbl_SettingUsername3;
    private javax.swing.JLabel lbl_SettingUsername4;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel pnl_SettingAdminLogin1;
    private javax.swing.JTextField textField;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
    // End of variables declaration//GEN-END:variables
}
