/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import util.mail;
import bo.Student;
import bo.StudentDao;
import java.awt.CardLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import util.EmailValidation;
import util.Global;
import util.MobileValidation;
import util.number;

/**
 *
 * @author akash
 */
public class AddStudent extends javax.swing.JPanel {

    /**
     * Creates new form AddAccountant
     */
    public AddStudent() {

        initComponents();
        //  pnl_SettingAdminLogin1.setBackground(new Color(0,0,0,100));
        // jScrollPane2.setBackground(new Color(0,0,0,100));

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

        jScrollPane2 = new javax.swing.JScrollPane();
        pnl_SettingAdminLogin1 = new javax.swing.JPanel();
        btn_SettingExit2 = new javax.swing.JButton();
        lbl_SettingUsername2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lbl_SettingPassword2 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        lbl_SettingUsername3 = new javax.swing.JLabel();
        lbl_SettingUsername4 = new javax.swing.JLabel();
        textField1 = new javax.swing.JTextField();
        textField2 = new javax.swing.JTextField();
        lbl_SettingUsername5 = new javax.swing.JLabel();
        textField3 = new javax.swing.JTextField();
        lbl_SettingUsername6 = new javax.swing.JLabel();
        textField4 = new javax.swing.JTextField();
        lbl_SettingUsername7 = new javax.swing.JLabel();
        lbl_SettingUsername8 = new javax.swing.JLabel();
        textField6 = new javax.swing.JTextField();
        lbl_SettingUsername9 = new javax.swing.JLabel();
        textField7 = new javax.swing.JTextField();
        lbl_SettingUsername10 = new javax.swing.JLabel();
        textField8 = new javax.swing.JTextField();
        lbl_SettingUsername11 = new javax.swing.JLabel();
        textField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        textField5 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setBackground(new java.awt.Color(0, 204, 204));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pnl_SettingAdminLogin1.setBackground(new java.awt.Color(0, 153, 153));
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
        gridBagConstraints.gridy = 13;
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
        btnLogin.setText("Add Student");
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
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pnl_SettingAdminLogin1.add(btnLogin, gridBagConstraints);

        lbl_SettingPassword2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingPassword2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingPassword2.setText("Email:");
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

        lbl_SettingUsername3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername3.setText("Course:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername3, gridBagConstraints);

        lbl_SettingUsername4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername4.setText("Fee:");
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

        lbl_SettingUsername5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername5.setText("Paid:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername5, gridBagConstraints);

        textField3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField3, gridBagConstraints);

        lbl_SettingUsername6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername6.setText("Due:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername6, gridBagConstraints);

        textField4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField4, gridBagConstraints);

        lbl_SettingUsername7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername7.setText("Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername7, gridBagConstraints);

        lbl_SettingUsername8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername8.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername8.setText("State:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername8, gridBagConstraints);

        textField6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField6, gridBagConstraints);

        lbl_SettingUsername9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername9.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername9.setText("City:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername9, gridBagConstraints);

        textField7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField7, gridBagConstraints);

        lbl_SettingUsername10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername10.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername10.setText("Country:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername10, gridBagConstraints);

        textField8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField8, gridBagConstraints);

        lbl_SettingUsername11.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_SettingUsername11.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SettingUsername11.setText("Contact No:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        pnl_SettingAdminLogin1.add(lbl_SettingUsername11, gridBagConstraints);

        textField9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField9, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(jScrollPane1, gridBagConstraints);

        textField5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        pnl_SettingAdminLogin1.add(textField5, gridBagConstraints);

        jScrollPane2.setViewportView(pnl_SettingAdminLogin1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(jScrollPane2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SettingExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SettingExit2ActionPerformed
        // TODO add your handling code here:
//        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
//        String cpanel=(String) Global.globalData.get("currentpanel");
//        CardLayout card = (CardLayout) mainPanel.getLayout();
//        card.show(mainPanel, cpanel);

        Global.globalData.put("currentpanel", "AddStudent");
        AccountantSection accSection = new AccountantSection();
        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
        mainPanel.add(accSection, "AccountantSection");
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "AccountantSection");
    }//GEN-LAST:event_btn_SettingExit2ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String name = textField.getText().trim();
        String email = textField5.getText().trim();
        String course = textField1.getText().trim();
        String fee = textField2.getText().trim().trim();
        String paid = textField3.getText().trim();
        String due = textField4.getText().trim();
        String address = jTextArea1.getText().trim();
        String city = textField7.getText().trim();
        String state = textField6.getText().trim();
        String country = textField8.getText().trim();
        String contactno = textField9.getText().trim();

        if (name.trim().length() == 0) {
            JLabel label = new JLabel("Name is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (EmailValidation.isValid(email) == false) {
            JLabel label = new JLabel("Email is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (course.trim().length() == 0) {
            JLabel label = new JLabel("course is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (number.onlyDigits(fee) == false) {
            JLabel label = new JLabel("Fee is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (number.onlyDigits(paid) == false) {
            JLabel label = new JLabel("Paid fee is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (number.onlyDigits(due) == false) {
            JLabel label = new JLabel("Due fee is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (address.trim().length() == 0) {
            JLabel label = new JLabel("Address is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (city.trim().length() == 0) {
            JLabel label = new JLabel("City is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (state.trim().length() == 0) {
            JLabel label = new JLabel("State is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (country.trim().length() == 0) {
            JLabel label = new JLabel("Country is required.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            //UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            JOptionPane optionPane = new JOptionPane(label, JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new java.awt.Font("Arial", 0, 15));
            JDialog dialog = optionPane.createDialog(this, "Error");
            dialog.setBackground(new java.awt.Color(255, 255, 255));
            dialog.setSize(450, 200);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else if (MobileValidation.isValid(contactno) == false) {
            JLabel label = new JLabel("Contact Number is not valid.");
            label.setFont(new java.awt.Font("Arial", 0, 15));
            UIManager.put("Button.background", new java.awt.Color(23, 73, 96));
            // UIManager.put("Button.foreground", Color.white);
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 30));
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

            Student s = new Student(name, email, course, Integer.parseInt(fee), Integer.parseInt(paid), Integer.parseInt(due), address, city, state, country, contactno);
            int status = StudentDao.save(s);

            if (status > 0) {
                JOptionPane.showMessageDialog(AddStudent.this, "Student added successfully!");
                textField.setText("");
                textField5.setText("");
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField7.setText("");
                textField6.setText("");
                textField8.setText("");
                textField9.setText("");
                jTextArea1.setText("");
            } else {
                JOptionPane.showMessageDialog(AddStudent.this, "Sorry, Unable to add student!");
            }
            System.out.println("Due is" + due);
            if (Integer.parseInt(due) <= 0) {

                System.out.println("No Due");
            } else {
                mail.sendEmail("Your fees is due.", "College fee due", email, "feeportal1052@gmail.com");
                System.out.println("Due");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed

    private void textField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField7ActionPerformed

    private void textField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField8ActionPerformed

    private void textField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField9ActionPerformed

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btn_SettingExit2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_SettingPassword2;
    private javax.swing.JLabel lbl_SettingUsername10;
    private javax.swing.JLabel lbl_SettingUsername11;
    private javax.swing.JLabel lbl_SettingUsername2;
    private javax.swing.JLabel lbl_SettingUsername3;
    private javax.swing.JLabel lbl_SettingUsername4;
    private javax.swing.JLabel lbl_SettingUsername5;
    private javax.swing.JLabel lbl_SettingUsername6;
    private javax.swing.JLabel lbl_SettingUsername7;
    private javax.swing.JLabel lbl_SettingUsername8;
    private javax.swing.JLabel lbl_SettingUsername9;
    private javax.swing.JPanel pnl_SettingAdminLogin1;
    private javax.swing.JTextField textField;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
    private javax.swing.JTextField textField3;
    private javax.swing.JTextField textField4;
    private javax.swing.JTextField textField5;
    private javax.swing.JTextField textField6;
    private javax.swing.JTextField textField7;
    private javax.swing.JTextField textField8;
    private javax.swing.JTextField textField9;
    // End of variables declaration//GEN-END:variables
}
