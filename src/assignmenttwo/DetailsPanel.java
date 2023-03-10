/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package assignmenttwo;

import data.Employee;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author gunjitarora
 */
public class DetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form DetailsPanel
     */
    JPanel mainPanel;
    CardLayout cardLayout;

    public DetailsPanel(JPanel mainPanel, Employee employee) {
        initComponents();
        this.mainPanel = mainPanel;
        cardLayout = (CardLayout) mainPanel.getLayout();
        firstNameLabel.setText(employee.getFirstName());
        lastNameLabel.setText(employee.getLastName());
        birthDateLabel.setText(employee.getBirthDate().format(DateTimeFormatter.ISO_DATE));
        genderLabel.setText(employee.getGender().toString());
        startDateLabel.setText(employee.getStartDate().format(DateTimeFormatter.ISO_DATE));
        levelLabel.setText(employee.getLevel());
        phoneLabel.setText(employee.getPhone());
        emailLabel.setText(employee.getEmail());
        employeeIdLabel.setText(employee.getEmployeeId());
        imageView.setIcon(new ImageIcon(employee.getProfileImage()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
