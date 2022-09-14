/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.views;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.controllers.RegistrationController;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prudhvi
 */
public class RenewStudent extends javax.swing.JFrame {

    /**
     * Creates new form StudentRenewal
     */
    public RenewStudent() throws SQLException {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSID = new javax.swing.JTextField();
        txtSName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblSID = new javax.swing.JLabel();
        lblSName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRenewStudent = new javax.swing.JTable();
        btnRenew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        txtSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSIDActionPerformed(evt);
            }
        });

        txtSName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNameActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSID.setText("Student ID");

        lblSName.setText("Student Name");

        tblRenewStudent.setBackground(new java.awt.Color(204, 204, 255));
        tblRenewStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Joined Date", "Renewal Date"
            }
        ));
        tblRenewStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRenewStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRenewStudent);

        btnRenew.setText("Renew");
        btnRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSID)
                            .addComponent(lblSName)
                            .addComponent(txtSID, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtSName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnBack)
                        .addGap(34, 34, 34)
                        .addComponent(btnRenew)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblSID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblSName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRenew))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.toBack();
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        frame.toFront();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_studentID3ActionPerformed
        // TODO add your handling code here:
        sId = Integer.parseInt(txtSID.getText());
    }// GEN-LAST:event_studentID3ActionPerformed

    private void btnRenewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_renewActionPerformed
        // TODO add your handling code here:
        sId = Integer.parseInt(txtSID.getText());
        sName = txtSName.getText();

        // TODO: Controller code
        RegistrationController reg = new RegistrationController();
        reg.updateStudent(sId);
        try {
            populateTable();
        } catch (SQLException ex) {
            Logger.getLogger(RenewStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// GEN-LAST:event_renewActionPerformed

    private void tblRenewStudentMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblRenewStudent.getModel();
        int selectedRow = tblRenewStudent.getSelectedRow();

        txtSID.setText(df.getValueAt(selectedRow, 0).toString());
        txtSName.setText(df.getValueAt(selectedRow, 1).toString());

    }// GEN-LAST:event_jTable1MouseClicked

    private void txtSNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_studentName3ActionPerformed
        // TODO add your handling code here:
        sName = txtSName.getText();

    }// GEN-LAST:event_studentName3ActionPerformed

    public void populateTable() throws SQLException {
        DB database = DB.getObj();
        DefaultTableModel tbl = (DefaultTableModel) tblRenewStudent.getModel();
        tbl.setRowCount(0);
        ResultSet set = database.query("SELECT r.student_id,s.name,r.created_date,r.renewal_date,r.years_member"
                + " FROM registration r,student s where s.student_id = r.student_id;");
        ResultSetMetaData rset = set.getMetaData();
        int j = rset.getColumnCount();
        while (set.next()) {
            Vector vec = new Vector();
            for (int i = 1; i <= j; i++) {
                vec.add(set.getString("student_id"));
                vec.add(set.getString("name"));
                vec.add(set.getString("created_date"));
                vec.add(set.getString("renewal_date"));
                vec.add(set.getString("years_member"));

            }
            tbl.addRow(vec);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RenewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RenewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RenewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RenewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RenewStudent().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RenewStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    int sId;
    String sName;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRenew;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSID;
    private javax.swing.JLabel lblSName;
    private javax.swing.JTable tblRenewStudent;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtSName;
    // End of variables declaration//GEN-END:variables
}
