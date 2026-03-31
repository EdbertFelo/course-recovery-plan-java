package com.mycompany.assignment1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ViewUserPage extends javax.swing.JFrame {

    private User currentUser;
    private List<User> users;

public ViewUserPage(User currentUser) {
    this.currentUser = currentUser;
    initComponents();
    users = loadUsersFromFile();

    if (users.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No users found in the system.");
    }

    populateUsersTable();
}

    private List<User> loadUsersFromFile() {
        List<User> userList = new ArrayList<>();
        String filePath = "users.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                User user = User.fromCsv(line);
                if (user != null) {
                    userList.add(user);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading users file: " + e.getMessage());
        }

        return userList;
    }

private void populateUsersTable() {
    String[] columnNames = {
        "User ID", "Username", "Email", "Password", "Role", "Last Login", "Last Logout"
    };

    Object[][] data = new Object[users.size()][7];

    for (int i = 0; i < users.size(); i++) {
        User u = users.get(i);
        data[i][0] = u.getuserID();
        data[i][1] = u.getusername();
        data[i][2] = u.getemail();
        data[i][3] = u.getpassword();
        data[i][4] = u.getRole().toString();
        data[i][5] = u.getlastLogin();
        data[i][6] = u.getlastLogout();
    }

    ViewU_Table.setModel(new DefaultTableModel(data, columnNames) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    });
}

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewU_Label = new javax.swing.JLabel();
        Back_Button = new javax.swing.JButton();
        ViewU_Pane = new javax.swing.JScrollPane();
        ViewU_Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewU_Label.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        ViewU_Label.setText("View Users");

        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        ViewU_Pane.setForeground(new java.awt.Color(102, 102, 102));
        ViewU_Pane.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ViewU_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "Username", "Email", "Password", "Role", "Last login", "Last logout"
            }
        ));
        ViewU_Pane.setViewportView(ViewU_Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(ViewU_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewU_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(ViewU_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewU_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        this.dispose();
        new AdminPage(currentUser).setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel ViewU_Label;
    private javax.swing.JScrollPane ViewU_Pane;
    private javax.swing.JTable ViewU_Table;
    // End of variables declaration//GEN-END:variables
}
