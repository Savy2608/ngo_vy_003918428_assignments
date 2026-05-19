package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import model.Address;
import model.BankAccount;
import model.Person;

public class MainFrame extends javax.swing.JFrame {

    private Person person;

    public MainFrame() {
        initComponents();
        initCards();
        wireButtons();
        setLocationRelativeTo(null);
    }

    private void initCards() {
        createHomePanel.setTitle("Create Home Address");
        createLocalPanel.setTitle("Create Local Address");
        viewHomePanel.setTitle("View Home Address");
        viewLocalPanel.setTitle("View Local Address");

        rightContainer.add(createPersonPanel, "createPerson");
        rightContainer.add(viewPersonPanel, "viewPerson");
        rightContainer.add(createHomePanel, "createHome");
        rightContainer.add(viewHomePanel, "viewHome");
        rightContainer.add(createLocalPanel, "createLocal");
        rightContainer.add(viewLocalPanel, "viewLocal");
        rightContainer.add(createBankPanel, "createBank");
        rightContainer.add(viewBankPanel, "viewBank");
        showCard("createPerson");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        navPanel = new ui.NavPanel();
        rightContainer = new javax.swing.JPanel();
        createPersonPanel = new ui.CreatePersonPanel();
        viewPersonPanel = new ui.ViewPersonPanel();
        createHomePanel = new ui.CreateAddressPanel();
        viewHomePanel = new ui.ViewAddressPanel();
        createLocalPanel = new ui.CreateAddressPanel();
        viewLocalPanel = new ui.ViewAddressPanel();
        createBankPanel = new ui.CreateBankAccountPanel();
        viewBankPanel = new ui.ViewBankAccountPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Person Profile App");
        setMinimumSize(new java.awt.Dimension(920, 640));
        setPreferredSize(new java.awt.Dimension(920, 640));
        getContentPane().setLayout(new java.awt.BorderLayout());

        splitPane.setDividerLocation(278);
        splitPane.setDividerSize(2);
        splitPane.setEnabled(false);
        splitPane.setBorder(null);
        splitPane.setLeftComponent(navPanel);

        rightContainer.setBackground(new java.awt.Color(250, 174, 78));
        rightContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(rightContainer);

        getContentPane().add(splitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showCard(String cardName) {
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.show(rightContainer, cardName);
    }

    private void loadAddress(Address address, ViewAddressPanel panel) {
        panel.txtOwnerFirstName.setText(address.ownerFirstName());
        panel.txtOwnerLastName.setText(address.ownerLastName());
        panel.txtStreet.setText(address.street());
        panel.txtCity.setText(address.city());
        panel.txtState.setText(address.state());
        panel.txtZipCode.setText(address.zipCode());
        panel.txtCountry.setText(address.country());
    }

    private void wireButtons() {
        navPanel.btnCreatePerson.addActionListener(e -> showCard("createPerson"));
        navPanel.btnViewPerson.addActionListener(e -> viewPerson());
        navPanel.btnCreateHomeAddress.addActionListener(e -> showCard("createHome"));
        navPanel.btnViewHomeAddress.addActionListener(e -> viewHomeAddress());
        navPanel.btnCreateLocalAddress.addActionListener(e -> showCard("createLocal"));
        navPanel.btnViewLocalAddress.addActionListener(e -> viewLocalAddress());
        navPanel.btnCreateBankAccount.addActionListener(e -> showCard("createBank"));
        navPanel.btnViewBankAccount.addActionListener(e -> viewBankAccount());

        createPersonPanel.btnSave.addActionListener(e -> savePerson());
        createHomePanel.btnSave.addActionListener(e -> saveAddress("home"));
        createLocalPanel.btnSave.addActionListener(e -> saveAddress("local"));
        createBankPanel.btnSave.addActionListener(e -> saveBankAccount());
    }

    private void viewPerson() {
        if (person == null) {
            JOptionPane.showMessageDialog(this, "Please create a person first!", "No Data", JOptionPane.WARNING_MESSAGE);
            return;
        }
        viewPersonPanel.txtFirstName.setText(person.getFirstName());
        viewPersonPanel.txtLastName.setText(person.getLastName());
        viewPersonPanel.txtAge.setText(String.valueOf(person.getAge()));
        viewPersonPanel.txtMaritalStatus.setText(person.isMarried() ? "Married" : "Single");
        showCard("viewPerson");
    }

    private void viewHomeAddress() {
        if (person == null || person.getHomeAddress() == null) {
            JOptionPane.showMessageDialog(this, "Please create a home address first!", "No Data", JOptionPane.WARNING_MESSAGE);
            return;
        }
        loadAddress(person.getHomeAddress(), viewHomePanel);
        showCard("viewHome");
    }

    private void viewLocalAddress() {
        if (person == null || person.getLocalAddress() == null) {
            JOptionPane.showMessageDialog(this, "Please create a local address first!", "No Data", JOptionPane.WARNING_MESSAGE);
            return;
        }
        loadAddress(person.getLocalAddress(), viewLocalPanel);
        showCard("viewLocal");
    }

    private void viewBankAccount() {
        if (person == null || person.getBankAccount() == null) {
            JOptionPane.showMessageDialog(this, "Please create a bank account first!", "No Data", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BankAccount bankAccount = person.getBankAccount();
        viewBankPanel.txtOwnerFirstName.setText(bankAccount.ownerFirstName());
        viewBankPanel.txtOwnerLastName.setText(bankAccount.ownerLastName());
        viewBankPanel.txtAccountNumber.setText(bankAccount.accountNumber());
        viewBankPanel.txtAccountType.setText(bankAccount.accountType());
        viewBankPanel.txtBankName.setText(bankAccount.bankName());
        viewBankPanel.txtBalance.setText(String.valueOf(bankAccount.balance()));
        showCard("viewBank");
    }

    private void savePerson() {
        String firstName = createPersonPanel.txtFirstName.getText().trim();
        String lastName = createPersonPanel.txtLastName.getText().trim();
        String ageText = createPersonPanel.txtAge.getText().trim();
        String maritalStatus = (String) createPersonPanel.cmbMaritalStatus.getSelectedItem();

        if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int age;
        try {
            age = Integer.parseInt(ageText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Age must be a valid number!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        person = new Person(firstName, lastName, age, "Married".equals(maritalStatus));
        JOptionPane.showMessageDialog(this, "Person saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void saveAddress(String type) {
        if (person == null) {
            JOptionPane.showMessageDialog(this, "Please create a person first!", "No Person", JOptionPane.WARNING_MESSAGE);
            return;
        }

        CreateAddressPanel panel = "home".equals(type) ? createHomePanel : createLocalPanel;
        String ownerFirstName = panel.txtOwnerFirstName.getText().trim();
        String ownerLastName = panel.txtOwnerLastName.getText().trim();
        String street = panel.txtStreet.getText().trim();
        String city = panel.txtCity.getText().trim();
        String state = panel.txtState.getText().trim();
        String zipCode = panel.txtZipCode.getText().trim();
        String country = panel.txtCountry.getText().trim();

        if (ownerFirstName.isEmpty() || ownerLastName.isEmpty() || street.isEmpty()
                || city.isEmpty() || state.isEmpty() || zipCode.isEmpty() || country.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Address address = new Address(ownerFirstName, ownerLastName, street, city, state, zipCode, country);
        if ("home".equals(type)) {
            person.setHomeAddress(address);
        } else {
            person.setLocalAddress(address);
        }
        JOptionPane.showMessageDialog(this, "Address saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void saveBankAccount() {
        if (person == null) {
            JOptionPane.showMessageDialog(this, "Please create a person first!", "No Person", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String ownerFirstName = createBankPanel.txtOwnerFirstName.getText().trim();
        String ownerLastName = createBankPanel.txtOwnerLastName.getText().trim();
        String accountNumber = createBankPanel.txtAccountNumber.getText().trim();
        String accountType = (String) createBankPanel.cmbAccountType.getSelectedItem();
        String bankName = createBankPanel.txtBankName.getText().trim();
        String balanceText = createBankPanel.txtBalance.getText().trim();

        if (ownerFirstName.isEmpty() || ownerLastName.isEmpty() || accountNumber.isEmpty()
                || bankName.isEmpty() || balanceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double balance;
        try {
            balance = Double.parseDouble(balanceText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Balance must be a valid number!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        person.setBankAccount(new BankAccount(ownerFirstName, ownerLastName, accountNumber, accountType, bankName, balance));
        JOptionPane.showMessageDialog(this, "Bank account saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.CreateBankAccountPanel createBankPanel;
    private ui.CreateAddressPanel createHomePanel;
    private ui.CreateAddressPanel createLocalPanel;
    private ui.CreatePersonPanel createPersonPanel;
    private ui.NavPanel navPanel;
    private javax.swing.JPanel rightContainer;
    private javax.swing.JSplitPane splitPane;
    private ui.ViewBankAccountPanel viewBankPanel;
    private ui.ViewAddressPanel viewHomePanel;
    private ui.ViewAddressPanel viewLocalPanel;
    private ui.ViewPersonPanel viewPersonPanel;
    // End of variables declaration//GEN-END:variables
}
