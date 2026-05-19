package ui;

import java.awt.Color;
import java.awt.Font;

public class CreatePersonPanel extends javax.swing.JPanel {

    private static final Color RIGHT_BG = new Color(250, 174, 78);

    public CreatePersonPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblMaritalStatus = new javax.swing.JLabel();
        cmbMaritalStatus = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();

        setBackground(RIGHT_BG);
        setLayout(null);

        addLabel(lblFirstName, "First Name", 152);
        addField(txtFirstName, 150);
        addLabel(lblLastName, "Last Name", 202);
        addField(txtLastName, 200);
        addLabel(lblAge, "Age", 252);
        addField(txtAge, 250);
        addLabel(lblMaritalStatus, "Marital Status", 302);

        cmbMaritalStatus.setFont(new Font("Segoe UI", Font.BOLD, 14));
        cmbMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married" }));
        cmbMaritalStatus.setBounds(298, 298, 90, 30);
        add(cmbMaritalStatus);

        btnSave.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnSave.setForeground(new Color(150, 45, 25));
        btnSave.setText("Save");
        btnSave.setFocusPainted(false);
        btnSave.setBorderPainted(false);
        btnSave.setBounds(345, 353, 99, 40);
        add(btnSave);
    }// </editor-fold>//GEN-END:initComponents

    private void addLabel(javax.swing.JLabel label, String text, int y) {
        label.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        label.setText(text);
        label.setBounds(153, y, 130, 25);
        add(label);
    }

    private void addField(javax.swing.JTextField field, int y) {
        field.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        field.setBounds(298, y, 192, 25);
        add(field);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSave;
    public javax.swing.JComboBox<String> cmbMaritalStatus;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMaritalStatus;
    private javax.swing.JLabel lblTitle;
    public javax.swing.JTextField txtAge;
    public javax.swing.JTextField txtFirstName;
    public javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
