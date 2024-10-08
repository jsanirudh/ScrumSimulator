/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.scrumsimulator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eshwar Gulupalli
 */
public class deleteUserStories extends javax.swing.JFrame {

    /**
     * Creates new form deleteUserStories
     */
    public deleteUserStories() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadingLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userStoryId = new javax.swing.JTextField();
        FetchDeletingUserStoryButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        DeletingUserStoryTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        DeleteUserStoriesButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        LabelHiddenMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeadingLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        HeadingLabel.setText("SCRUM SIMULATOR");
        HeadingLabel.setAlignmentY(0.0F);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(394, 220));

        jLabel3.setText("Enter the ID of user story to delete :");

        FetchDeletingUserStoryButton.setText("Fetch");
        FetchDeletingUserStoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetchDeletingUserStoryButtonActionPerformed(evt);
            }
        });

        DeletingUserStoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Status", "Assigned To", "Title", "Description", "Story Points", "Business Value", "Comments"
            }
        ));
        jScrollPane4.setViewportView(DeletingUserStoryTable);

        jLabel4.setText("Confirm to Delete User Story :");

        DeleteUserStoriesButton.setText("Delete User");
        DeleteUserStoriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserStoriesButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        LabelHiddenMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userStoryId, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(FetchDeletingUserStoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(190, 190, 190))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(backButton)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteUserStoriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LabelHiddenMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userStoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FetchDeletingUserStoryButton)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(DeleteUserStoriesButton)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(LabelHiddenMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(HeadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void FetchDeletingUserStoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchDeletingUserStoryButtonActionPerformed
        // TODO add your handling code here:

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freesqldatabase.com:3306/sql3659139","sql3659139" ,"ZD2nzaxCwN");
            String uid = userStoryId.getText();
            String query = "select * from UserStories where id = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,uid);
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model =(DefaultTableModel) DeletingUserStoryTable.getModel();
            model.setRowCount(0);
            
            String ID,STATUS,ASGN_TO,TITLE,DESCR,SP,BV,CMNTS;
            if(rs.next())
            {   LabelHiddenMessage.setText("");
                ID = rs.getString(1);
                STATUS = rs.getString(2);
                ASGN_TO = rs.getString(3);
                TITLE = rs.getString(4);
                DESCR = rs.getString(5);
                SP = rs.getString(6);
                BV = rs.getString(7);
                CMNTS = rs.getString(8);
                
                String[] row ={ID,STATUS,ASGN_TO,TITLE,DESCR,SP,BV,CMNTS};
                model.addRow(row);
            }
            else
            {
                 model.setRowCount(0);
                 LabelHiddenMessage.setText("No User Story with ID "+uid);
            }
            st.close();
            con.close();            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_FetchDeletingUserStoryButtonActionPerformed

    public void DeleteUserStoriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserStoriesButtonActionPerformed
        // TODO add your handling code here:
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freesqldatabase.com:3306/sql3659139","sql3659139" ,"ZD2nzaxCwN");
            String uid = userStoryId.getText();
            String query = "delete from UserStories where id = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,uid);
            int deletedRows=st.executeUpdate();
            if (deletedRows > 0) {
            LabelHiddenMessage.setText("User Story with ID " + uid + " is deleted");
            } 
            else {
        LabelHiddenMessage.setText("No user story with ID : " + uid + " exists");
            }
            DefaultTableModel model =(DefaultTableModel) DeletingUserStoryTable.getModel();
            model.setRowCount(0);
            st.close();
            con.close();
            } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_DeleteUserStoriesButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        SimulationOperatorLandingPage d = new SimulationOperatorLandingPage();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(deleteUserStories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(deleteUserStories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(deleteUserStories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(deleteUserStories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new deleteUserStories().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteUserStoriesButton;
    public javax.swing.JTable DeletingUserStoryTable;
    private javax.swing.JButton FetchDeletingUserStoryButton;
    private javax.swing.JLabel HeadingLabel;
    public javax.swing.JLabel LabelHiddenMessage;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextField userStoryId;
    // End of variables declaration//GEN-END:variables
}
