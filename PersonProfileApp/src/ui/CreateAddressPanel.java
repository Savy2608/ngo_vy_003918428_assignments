package ui;

public class CreateAddressPanel extends javax.swing.JPanel {

    public CreateAddressPanel() {
        initComponents();
    }

    public void setTitle(String title) {
        lblTitle.setText(title);
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
        lblStreet = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 174, 78));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 25, 20, 25));
        setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblTitle.setText("Create Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 18, 0);
        add(lblTitle, gridBagConstraints);

        addRow(lblOwnerFirstName, "Owner First Name", txtOwnerFirstName, 1);
        addRow(lblOwnerLastName, "Owner Last Name", txtOwnerLastName, 2);
        addRow(lblStreet, "Street", txtStreet, 3);
        addRow(lblCity, "City", txtCity, 4);
        addRow(lblState, "State", txtState, 5);
        addRow(lblZipCode, "Zip Code", txtZipCode, 6);
        addRow(lblCountry, "Country", txtCountry, 7);

        btnSave.setText("Save");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
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
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblOwnerFirstName;
    private javax.swing.JLabel lblOwnerLastName;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZipCode;
    public javax.swing.JTextField txtCity;
    public javax.swing.JTextField txtCountry;
    public javax.swing.JTextField txtOwnerFirstName;
    public javax.swing.JTextField txtOwnerLastName;
    public javax.swing.JTextField txtState;
    public javax.swing.JTextField txtStreet;
    public javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
