package com.mycompany.scrumsimulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class AddUserStoriesScreen extends javax.swing.JFrame {

    public AddUserStoriesScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new GradientPanel();
        userStoryId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userTitle = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        userStoryStatus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        storyPoints = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        businessValue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        assignedTo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        storyComments = new javax.swing.JTextField();
        MessageLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 440));

        // Header Label
        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 24)); 
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("SCRUM SIMULATOR");
        jLabel1.setAlignmentY(0.0F);

        // Gradient Panel for background
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        // Labels
        jLabel3.setText("User Story ID :");
        jLabel3.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); 

        jLabel4.setText("Title :");
        jLabel4.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); 

        jLabel2.setText("Description :");
        jLabel2.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); 

        jLabel5.setText("Status :");
        jLabel5.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); 

        jLabel6.setText("Story Points :");
        jLabel6.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); 

        jLabel7.setText("Business Value :");
        jLabel7.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); 

        jLabel8.setText("Assigned to :");
        jLabel8.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); 

        jLabel9.setText("Comments :");
        jLabel9.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); 

        // Text Fields with Border
        userStoryId.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        userTitle.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        description.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        userStoryStatus.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        storyPoints.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        businessValue.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        assignedTo.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        storyComments.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        // Save Button
        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setForeground(Color.WHITE);
        jButton1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); 
        jButton1.setText("SAVE");
        jButton1.setFocusPainted(false);

        // Back Button
        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); 
        jButton3.setText("BACK");
        jButton3.setFocusPainted(false);

        // Adding Padding and Spacing
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(storyComments))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(userStoryStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(businessValue, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(storyPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(assignedTo))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(description))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(userTitle))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(userStoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userStoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storyPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(assignedTo
