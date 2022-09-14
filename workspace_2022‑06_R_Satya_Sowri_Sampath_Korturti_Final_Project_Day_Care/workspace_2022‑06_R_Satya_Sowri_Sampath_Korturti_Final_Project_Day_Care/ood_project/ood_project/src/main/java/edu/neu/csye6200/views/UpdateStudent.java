/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.views;

import java.sql.ResultSet;
import edu.neu.csye6200.DB;
import edu.neu.csye6200.controllers.Controller_Student;
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
public class UpdateStudent extends javax.swing.JFrame {

    /**
     * Creates new form StudentUpdateDelete
     */
    public UpdateStudent() throws SQLException {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUStudent = new javax.swing.JTable();
        txtSID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblSName = new javax.swing.JLabel();
        txtSName = new javax.swing.JTextField();
        lblSgpa = new javax.swing.JLabel();
        txtSGpa = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblPID = new javax.swing.JLabel();
        txtPID = new javax.swing.JTextField();
        lblPName = new javax.swing.JLabel();
        txtPName = new javax.swing.JTextField();
        lblPAddress = new javax.swing.JLabel();
        txtPAdd = new javax.swing.JTextField();
        lblPPhn = new javax.swing.JLabel();
        txtPPhn = new javax.swing.JTextField();
        lblSDob = new javax.swing.JLabel();
        txtSDob = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        lblSID.setText("Student ID");

        tblUStudent.setBackground(new java.awt.Color(204, 204, 255));
        tblUStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Age", "Date of Birth", "GPA", "Parent ID", "Parent Name", "Address", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUStudent);
        if (tblUStudent.getColumnModel().getColumnCount() > 0) {
            tblUStudent.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblUStudent.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblUStudent.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblUStudent.getColumnModel().getColumn(4).setPreferredWidth(25);
            tblUStudent.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        txtSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSIDActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblSName.setText("Student Name");

        txtSName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNameActionPerformed(evt);
            }
        });

        lblSgpa.setText("GPA");

        txtSGpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSGpaActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPID.setText("Parent ID");

        txtPID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPIDActionPerformed(evt);
            }
        });

        lblPName.setText("Parent Name");

        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });

        lblPAddress.setText("Parent Address");

        txtPAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAddActionPerformed(evt);
            }
        });

        lblPPhn.setText("Parent Phone Number");

        txtPPhn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPPhnActionPerformed(evt);
            }
        });

        lblSDob.setText("Date of Birth");

        txtSDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSID)
                    .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSDob)
                    .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDob, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate))
                    .addComponent(lblPID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPName)
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPAddress)
                    .addComponent(txtPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPPhn)
                    .addComponent(txtPPhn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSgpa)
                    .addComponent(txtSGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSName))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSDob)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSgpa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(lblPID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPPhn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPPhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnBack))
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSIDActionPerformed
        // TODO add your handling code here:
        sId=Integer.parseInt(txtSID.getText());
        
    }//GEN-LAST:event_txtSIDActionPerformed

    private void txtPAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAddActionPerformed
        // TODO add your handling code here:
        pAddress=txtPAdd.getText();
    }//GEN-LAST:event_txtPAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       this.toBack();
       
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        mf.toFront();
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPPhnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPPhnActionPerformed
        // TODO add your handling code here:
        pPhone=txtPPhn.getText();
    }//GEN-LAST:event_txtPPhnActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        sName = txtSName.getText();
        sId=Integer.parseInt(txtSID.getText());
        sgpa = Double.parseDouble(txtSGpa.getText());
        sdob = txtSDob.getText();
        pId=Integer.parseInt(txtPID.getText());
        pName=txtPName.getText();
        pAddress=txtPAdd.getText();
        pPhone=txtPPhn.getText();
        
        
    
        Controller_Student control_student = new Controller_Student();
        try {
            control_student.modifyParentStudent(sId, sName, sdob, sgpa,
                    pId, pName, pAddress, pPhone);
            populateTable();
        } catch (InterruptedException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNameActionPerformed
        // TODO add your handling code here:
        sName = txtSName.getText();
        
    }//GEN-LAST:event_txtSNameActionPerformed

    private void txtSGpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSGpaActionPerformed
        // TODO add your handling code here:
        sgpa = Double.parseDouble(txtSGpa.getText());
    }//GEN-LAST:event_txtSGpaActionPerformed

    private void txtSDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDobActionPerformed
        // TODO add your handling code here:
        sdob = txtSDob.getText();
    }//GEN-LAST:event_txtSDobActionPerformed

    private void txtPIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPIDActionPerformed
        // TODO add your handling code here:
        pId=Integer.parseInt(txtPID.getText());
    }//GEN-LAST:event_txtPIDActionPerformed

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        // TODO add your handling code here:
        pName=txtPName.getText();
    }//GEN-LAST:event_txtPNameActionPerformed

    private void tblUStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUStudentMouseClicked
        // TODO add your handling code here:
         DefaultTableModel tbl = (DefaultTableModel) tblUStudent.getModel();
         int srow = tblUStudent.getSelectedRow();
         
         txtSID.setText(tbl.getValueAt(srow,0).toString());
         txtSName.setText(tbl.getValueAt(srow,1).toString());
         txtSDob.setText(tbl.getValueAt(srow,3).toString());
         txtSGpa.setText(tbl.getValueAt(srow,4).toString());
         txtPID.setText(tbl.getValueAt(srow,5).toString());
         txtPName.setText(tbl.getValueAt(srow,6).toString());
         txtPAdd.setText(tbl.getValueAt(srow,7).toString());
         txtPPhn.setText(tbl.getValueAt(srow,8).toString());
         
         
    }//GEN-LAST:event_tblUStudentMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UpdateStudent().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void populateTable() throws SQLException{
        DB database = DB.getObj();
        DefaultTableModel tbl = (DefaultTableModel) tblUStudent.getModel();
        tbl.setRowCount(0);
        ResultSet set = database.query("SELECT s.student_id,s.name,s.age,s.dob,s.gpa,s.parent_id,p.p_name,p.address,p.phone "
                    + " FROM student s,parent p WHERE s.parent_id=p.parent_id order by s.student_id ;");
        ResultSetMetaData rset = set.getMetaData();
        int j = rset.getColumnCount();
        while(set.next()){
            Vector vec = new Vector();
            for (int i=1;i<=j;i++){
                vec.add(set.getString("student_id"));
                vec.add(set.getString("name"));
                vec.add(set.getString("age"));
                vec.add(set.getString("dob"));
                vec.add(set.getString("gpa"));
                vec.add(set.getString("parent_id"));
                vec.add(set.getString("p_name"));
                vec.add(set.getString("address"));
                vec.add(set.getString("phone"));    
            }
            tbl.addRow(vec);
        }
    }
    
    int sId;
    String sName;
    String sdob;
    double sgpa;
    int pId; 
    String pName;
    String pAddress;
    String pPhone;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPAddress;
    private javax.swing.JLabel lblPID;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblPPhn;
    private javax.swing.JLabel lblSDob;
    private javax.swing.JLabel lblSID;
    private javax.swing.JLabel lblSName;
    private javax.swing.JLabel lblSgpa;
    private javax.swing.JTable tblUStudent;
    private javax.swing.JTextField txtPAdd;
    private javax.swing.JTextField txtPID;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPPhn;
    private javax.swing.JTextField txtSDob;
    private javax.swing.JTextField txtSGpa;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtSName;
    // End of variables declaration//GEN-END:variables
}
