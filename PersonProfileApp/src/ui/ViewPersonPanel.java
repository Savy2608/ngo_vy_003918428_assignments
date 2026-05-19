package ui;

public class ViewPersonPanel extends javax.swing.JPanel {

    public ViewPersonPanel() {
        initComponents();
        txtFirstName.setEditable(false);
        txtLastName.setEditable(false);
        txtAge.setEditable(false);
        txtMaritalStatus.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblMaritalStatus = new javax.swing.JLabel();
        txtMaritalStatus = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 174, 78));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 25, 20, 25));
        setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblTitle.setText("View Person");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 18, 0);
        add(lblTitle, gridBagConstraints);

        addRow(lblFirstName, "First Name", txtFirstName, 1);
        addRow(lblLastName, "Last Name", txtLastName, 2);
        addRow(lblAge, "Age", txtAge, 3);
        addRow(lblMaritalStatus, "Marital Status", txtMaritalStatus, 4);
    }// </editor-fold>//GEN-END:initComponents

    private void addRow(javax.swing.JLabel label, String text, javax.swing.JTextField field, int row) {
        label.setText(text);
        field.setColumns(18);
        add(label, labelConstraints(row));
        add(field, fieldConstraints(row));
    }

    private java.awt.GridBagConstraints labelConstraints(int row) {
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        gbc.insets = new java.awt.Insets(6, 0, 6, 15);
        return gbc;
    }

    private java.awt.GridBagConstraints fieldConstraints(int row) {
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = row;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.insets = new java.awt.Insets(6, 0, 6, 0);
        return gbc;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMaritalStatus;
    private javax.swing.JLabel lblTitle;
    public javax.swing.JTextField txtAge;
    public javax.swing.JTextField txtFirstName;
    public javax.swing.JTextField txtLastName;
    public javax.swing.JTextField txtMaritalStatus;
    // End of variables declaration//GEN-END:variables
}
