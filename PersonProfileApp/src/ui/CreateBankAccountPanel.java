package ui;

public class CreateBankAccountPanel extends javax.swing.JPanel {

    public CreateBankAccountPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitle = new javax.swing.JLabel();
        lblOwnerFirstName = new javax.swing.JLabel();
        txtOwnerFirstName = new javax.swing.JTextField();
        lblOwnerLastName = new javax.swing.JLabel();
        txtOwnerLastName = new javax.swing.JTextField();
        lblAccountNumber = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        lblAccountType = new javax.swing.JLabel();
        cmbAccountType = new javax.swing.JComboBox<>();
        lblBankName = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();
        lblBalance = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 174, 78));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 25, 20, 25));
        setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblTitle.setText("Create Bank Account");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 18, 0);
        add(lblTitle, gridBagConstraints);

        addRow(lblOwnerFirstName, "Owner First Name", txtOwnerFirstName, 1);
        addRow(lblOwnerLastName, "Owner Last Name", txtOwnerLastName, 2);
        addRow(lblAccountNumber, "Account Number", txtAccountNumber, 3);

        lblAccountType.setText("Account Type");
        add(lblAccountType, labelConstraints(4));
        cmbAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Checking", "Savings" }));
        add(cmbAccountType, fieldConstraints(4));

        addRow(lblBankName, "Bank Name", txtBankName, 5);
        addRow(lblBalance, "Balance", txtBalance, 6);

        btnSave.setText("Save");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        add(btnSave, gridBagConstraints);
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
    public javax.swing.JButton btnSave;
    public javax.swing.JComboBox<String> cmbAccountType;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblOwnerFirstName;
    private javax.swing.JLabel lblOwnerLastName;
    private javax.swing.JLabel lblTitle;
    public javax.swing.JTextField txtAccountNumber;
    public javax.swing.JTextField txtBalance;
    public javax.swing.JTextField txtBankName;
    public javax.swing.JTextField txtOwnerFirstName;
    public javax.swing.JTextField txtOwnerLastName;
    // End of variables declaration//GEN-END:variables
}
