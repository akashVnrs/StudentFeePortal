/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
import util.Global;



/**
 *
 * @author Kavya
 */
public class PalcomMainn extends javax.swing.JPanel {

    /**
     * Creates new form PalcomMainn
     */
    MainFee mainFee=new MainFee();
   // AdminLogin adminLog=new AdminLogin();
   
    public PalcomMainn() {
        initComponents();

      
        Global.globalData.put("mainPanel", mainPanel);
       addPanel();
       ShowTime();
      

    }

    public void ShowTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat dte = new SimpleDateFormat("EEEE MMM dd YYYY");
                lblTime.setText(time.format(d));
                lblDate.setText(dte.format(d));
                //time= jlabel 
            }
        }).start();
    }


    private void addPanel() {
       mainPanel.add(mainFee,"MainFee");
     // mainPanel.add(adminLog, "AdminLogin");                                                                                                                                                            //mainpanel.add(Manage_Cable, "Manage_Cable"); 

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Header_p = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnDevice = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        Footer_P = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        Header_p.setBackground(new java.awt.Color(204, 204, 255));
        Header_p.setLayout(new java.awt.GridBagLayout());

        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/64.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        Header_p.add(jButton3, gridBagConstraints);

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblDate.setText("Wed Jan 27 2021");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 5);
        Header_p.add(lblDate, gridBagConstraints);

        jSeparator5.setBackground(new java.awt.Color(204, 204, 255));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        Header_p.add(jSeparator5, gridBagConstraints);

        jSeparator6.setForeground(java.awt.Color.lightGray);
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        Header_p.add(jSeparator6, gridBagConstraints);

        btnDevice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDevice.setBorder(null);
        btnDevice.setBorderPainted(false);
        btnDevice.setContentAreaFilled(false);
        btnDevice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevice.setFocusPainted(false);
        btnDevice.setVerifyInputWhenFocusTarget(false);
        btnDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeviceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        Header_p.add(btnDevice, gridBagConstraints);

        lblTime.setBackground(new java.awt.Color(255, 255, 255));
        lblTime.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblTime.setText("11:03:57");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 14, 5);
        Header_p.add(lblTime, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Fee Portal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        Header_p.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(Header_p, gridBagConstraints);

        mainPanel.setLayout(new java.awt.CardLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(mainPanel, gridBagConstraints);

        Footer_P.setBackground(new java.awt.Color(51, 51, 51));
        Footer_P.setLayout(new java.awt.GridBagLayout());

        jSeparator1.setForeground(java.awt.Color.lightGray);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        Footer_P.add(jSeparator1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright © 2021-2022 Student Fee Portal. All rights reserved.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        Footer_P.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(Footer_P, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   Global.globalData.put("currentpanel", "PalcomMainn");
       JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
       MainFee mainFee=new MainFee();
       mainPanel.add(mainFee,"MainFee");
     //  String cpanel=(String) Global.globalData.get("currentpanel");
         CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "MainFee");    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeviceActionPerformed
     
    }//GEN-LAST:event_btnDeviceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer_P;
    private javax.swing.JPanel Header_p;
    private javax.swing.JButton btnDevice;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
