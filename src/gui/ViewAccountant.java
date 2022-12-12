/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bo.Accountant;
import bo.AccountantDao;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Dimension;
import javax.swing.JScrollBar;

import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import util.Global;

public class ViewAccountant extends javax.swing.JPanel {

    public ViewAccountant() {
        initComponents();
        ViewAccountant();
    }

    private void ViewAccountant() {
        List<Accountant> list = AccountantDao.view();
        int size = list.size();

        String data[][] = new String[size][5];
        int row = 0;
        for (Accountant a : list) {
            data[row][0] = String.valueOf(a.getId());
            data[row][1] = a.getName();
            data[row][2] = a.getPassword();
            data[row][3] = a.getEmail();
            data[row][4] = a.getContactno();
            row++;
        }
        String columnNames[] = {"Id", "Name", "Password", "Email", "Contact No"};
        tbl_List = new JTable(data, columnNames);
        jsp_List.setViewportView(tbl_List);
        tbl_List.setAutoCreateRowSorter(true);
        tbl_List.setFont(new java.awt.Font("Arial", 0, 16));
        tbl_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_List.setFillsViewportHeight(true);
        tbl_List.setGridColor(java.awt.Color.lightGray);
        tbl_List.setRowHeight(40);
        tbl_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_List.setShowVerticalLines(false);
        tbl_List.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tbl_List.setDefaultRenderer(Object.class, centerRenderer);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbl_ListHeading = new javax.swing.JLabel();
        jsp_List = new javax.swing.JScrollPane();
        tbl_List = new javax.swing.JTable();
        tf_ListSearch = new javax.swing.JTextField();
        lbl_ListSearch = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new java.awt.GridBagLayout());

        lbl_ListHeading.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbl_ListHeading.setText("ACCOUNTANT LIST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        add(lbl_ListHeading, gridBagConstraints);

        JScrollBar bar = jsp_List.getVerticalScrollBar();
        bar.setPreferredSize(new Dimension(0, 0));
        jsp_List.setPreferredSize(new java.awt.Dimension(375, 150));

        tbl_List.setAutoCreateRowSorter(true);
        tbl_List.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tbl_List.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "AT30K", "AT30K", null, null}
            },
            new String [] {
                "Id", "Name", "Password", "Email", "Contact No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_List.setFillsViewportHeight(true);
        tbl_List.setGridColor(java.awt.Color.lightGray);
        tbl_List.setPreferredSize(new java.awt.Dimension(300, 50));
        tbl_List.setRowHeight(40);
        tbl_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_List.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
        tbl_List.setDefaultRenderer(Object.class, centerRenderer);
        jsp_List.setViewportView(tbl_List);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(jsp_List, gridBagConstraints);

        tf_ListSearch.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tf_ListSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_ListSearch.setPreferredSize(new java.awt.Dimension(135, 40));
        tf_ListSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf_ListSearchMousePressed(evt);
            }
        });
        tf_ListSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_ListSearchKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        add(tf_ListSearch, gridBagConstraints);

        lbl_ListSearch.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_ListSearch.setText("search:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        add(lbl_ListSearch, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        add(jButton1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_ListSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ListSearchKeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
//        PalcomTableModel mm = new PalcomTableModel(new ArrayList(pagination.getCurrentPageData()), header);
//        String search = tf_ListSearch.getText().trim();
//        TableRowSorter<PalcomTableModel> tr = new TableRowSorter<PalcomTableModel>(mm);
//        tbl_List.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
    }//GEN-LAST:event_tf_ListSearchKeyReleased

    private void tf_ListSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_ListSearchMousePressed
        // TODO add your handling code here:
//        DialogVirtualKeyboardReal dlg = new DialogVirtualKeyboardReal(null, false, tf_ListSearch);
//        dlg.setPoitToUp(true);
//        dlg.setShiftBs(true);

    }//GEN-LAST:event_tf_ListSearchMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Global.globalData.put("currentpanel", "ViewAccountant");
        AdminSection adminSec = new AdminSection();
        JPanel mainPanel = (JPanel) Global.globalData.get("mainPanel");
        mainPanel.add(adminSec, "AdminSection");
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "AdminSection");

    }//GEN-LAST:event_jButton1ActionPerformed
    public void getData() {

//        ArrayList<String> device_Name = device.getDevice_Name();
//        ArrayList<String> group = device.getGroup();
//        ArrayList<String> device_Type = device.getDevice_Type();
//        ArrayList<String> auto_Monitor = device.getAuto_Monitor();
//        ArrayList<String> device_Status = device.getDevice_Status();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jsp_List;
    private javax.swing.JLabel lbl_ListHeading;
    private javax.swing.JLabel lbl_ListSearch;
    private javax.swing.JTable tbl_List;
    private javax.swing.JTextField tf_ListSearch;
    // End of variables declaration//GEN-END:variables
}
