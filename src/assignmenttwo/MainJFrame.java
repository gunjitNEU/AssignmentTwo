/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignmenttwo;

import data.EmployeeDirectory;
import data.Employee;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gunjitarora
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    final static String ADDPANEL = "ADD";
    final static String DETAILPANEL = "DETAIL";
    final static String LISTPANEL = "LIST";
    CardLayout cardLayout;
    DetailsPanel detailsPanel;
    AddPanel addPanel;
    EmployeeDirectory employeeDirectory;
    DefaultTableModel tableModel;
    
    public MainJFrame() {
        
        initComponents();
        employeeDirectory = new EmployeeDirectory();
        cardLayout = (CardLayout) mainPanel.getLayout();
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

        mainPanel = new javax.swing.JPanel();
        listPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        editEmployee = new javax.swing.JButton();
        addEmployee = new javax.swing.JButton();
        viewEmployee = new javax.swing.JButton();
        deleteEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "EmployeeId", "Name", "Email"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        editEmployee.setText("Edit Employee");
        editEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeActionPerformed(evt);
            }
        });

        addEmployee.setText("Add Employee");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        viewEmployee.setText("View Employee");
        viewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmployeeActionPerformed(evt);
            }
        });

        deleteEmployee.setText("Delete Employee");
        deleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addComponent(addEmployee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editEmployee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewEmployee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteEmployee)))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        mainPanel.add(listPanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        // TODO add your handling code here:
        addPanel = new AddPanel(mainPanel, employeeDirectory, null);
        mainPanel.add(addPanel, ADDPANEL);
        cardLayout.show(mainPanel, ADDPANEL);
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void editEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeActionPerformed
        // TODO add your handling code here:
        addPanel = new AddPanel(mainPanel, employeeDirectory, (String) tableModel.getValueAt(employeeTable.getSelectedRow(), 0));
        mainPanel.add(addPanel, ADDPANEL);
        cardLayout.show(mainPanel, ADDPANEL);
    }//GEN-LAST:event_editEmployeeActionPerformed

    private void viewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeeActionPerformed
        // TODO add your handling code here:
        Employee employee = employeeDirectory.getEmployee((String) tableModel.getValueAt(employeeTable.getSelectedRow(), 0));
        detailsPanel = new DetailsPanel(mainPanel, employee);
        mainPanel.add(detailsPanel, DETAILPANEL);
        cardLayout.show(mainPanel, DETAILPANEL);
    }//GEN-LAST:event_viewEmployeeActionPerformed

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
        // TODO add your handling code here:
        if (checkSelection()) {
            return;
        }
        employeeDirectory.removeEmployee((String) tableModel.getValueAt(employeeTable.getSelectedRow(), 0));
        JOptionPane.showMessageDialog(this,
                "User deleted successfully",
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    }//GEN-LAST:event_deleteEmployeeActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    private void populateTable() {
        tableModel = (DefaultTableModel) employeeTable.getModel();
        tableModel.setRowCount(0);
        employeeDirectory.getAllEmployee().forEach((u) -> tableModel.addRow(new Object[]{u.getEmployeeId(), u.getFirstName() + " " + u.getLastName(), u.getEmail()}));
    }
    
    private boolean checkSelection() {

        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please add employee first", "No Employee Avilable", JOptionPane.WARNING_MESSAGE);
            return true;
        } else if (employeeTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select employee from table", "No Employee Slected", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton deleteEmployee;
    private javax.swing.JButton editEmployee;
    private javax.swing.JTable employeeTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton viewEmployee;
    // End of variables declaration//GEN-END:variables
}