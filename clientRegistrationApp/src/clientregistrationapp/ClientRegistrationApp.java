/*
 * Copyright 2022 ilyes sadaoui.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package clientregistrationapp;

import ilyriadz.databaseman.DbmanUtil;
import ilyriadz.databaseman.H2Database;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ilyes sadaoui
 */
public class ClientRegistrationApp extends javax.swing.JFrame 
{
    private H2Database db;
    
    public final static String DATABASE_NAME = "./clients";
    public final static String TABLE_NAME = "registrations";
    public final static String NAME_COLUMN = "name";
    public final static String ID_COLUMN = "id";
    public final static String ADDRESS_COLUMN = "address";
    
    /**
     * Creates new form ClientRegistrationApp
     */
    public ClientRegistrationApp() 
    {
        initComponents();
        
        initDatabase();
    }
    
    private void initDatabase()
    {
        try 
        {
            db = new H2Database();
            db.connect(DATABASE_NAME);
            
            db.createNotExistTable(TABLE_NAME, ClientRegistration.class);
            
            table.setModel(DbmanUtil.generateTableModel(
                db, TABLE_NAME, "", ClientRegistration.class));
        } catch (Exception ex)
        {
            Logger.getLogger(ClientRegistrationApp.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPanel = new javax.swing.JPanel();
        namePanel = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        nameFld = new javax.swing.JTextField();
        idPanel = new javax.swing.JPanel();
        idLbl = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        addressPanel = new javax.swing.JPanel();
        addressLbl = new javax.swing.JLabel();
        addressFld = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputPanel.setPreferredSize(new java.awt.Dimension(800, 300));
        inputPanel.setLayout(new javax.swing.BoxLayout(inputPanel, javax.swing.BoxLayout.Y_AXIS));

        namePanel.setMaximumSize(new java.awt.Dimension(32767, 150));
        namePanel.setPreferredSize(new java.awt.Dimension(800, 100));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 20);
        flowLayout1.setAlignOnBaseline(true);
        namePanel.setLayout(flowLayout1);

        nameLbl.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        nameLbl.setText("Name:   ");
        namePanel.add(nameLbl);

        nameFld.setColumns(16);
        nameFld.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        nameFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFldActionPerformed(evt);
            }
        });
        namePanel.add(nameFld);

        inputPanel.add(namePanel);

        idPanel.setPreferredSize(new java.awt.Dimension(800, 100));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 20);
        flowLayout2.setAlignOnBaseline(true);
        idPanel.setLayout(flowLayout2);

        idLbl.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        idLbl.setText("ID:         ");
        idPanel.add(idLbl);

        idFld.setColumns(16);
        idFld.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        idFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFldActionPerformed(evt);
            }
        });
        idPanel.add(idFld);

        inputPanel.add(idPanel);

        addressPanel.setPreferredSize(new java.awt.Dimension(800, 100));
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 20);
        flowLayout3.setAlignOnBaseline(true);
        addressPanel.setLayout(flowLayout3);

        addressLbl.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        addressLbl.setText("Address:");
        addressPanel.add(addressLbl);

        addressFld.setColumns(16);
        addressFld.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        addressFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFldActionPerformed(evt);
            }
        });
        addressPanel.add(addressFld);

        addBtn.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        addressPanel.add(addBtn);

        inputPanel.add(addressPanel);

        getContentPane().add(inputPanel, java.awt.BorderLayout.NORTH);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(456, 300));

        table.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFldActionPerformed

    private void idFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFldActionPerformed

    private void addressFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFldActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        addBtn.setEnabled(false);
        
        String name = nameFld.getText();
        String id = idFld.getText();
        String address = addressFld.getText();
        
        try 
        {
            db.insert(TABLE_NAME, 
                List.of(NAME_COLUMN, ID_COLUMN, ADDRESS_COLUMN), 
                "'" + name + "'", id, "'" + address + "'");
            
            table.setModel(DbmanUtil.generateTableModel(
                db, TABLE_NAME, "", ClientRegistration.class));
            
            nameFld.setText("");
            idFld.setText("");
            addressFld.setText("");
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(ClientRegistrationApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        addBtn.setEnabled(true);
    }//GEN-LAST:event_addBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ClientRegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientRegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientRegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientRegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientRegistrationApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addressFld;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JPanel addressPanel;
    private javax.swing.JTextField idFld;
    private javax.swing.JLabel idLbl;
    private javax.swing.JPanel idPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameFld;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JPanel namePanel;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
