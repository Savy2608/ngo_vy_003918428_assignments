package ui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

public class NavPanel extends javax.swing.JPanel {

    private static final Color LEFT_BG = new Color(247, 197, 202);
    private static final Color TITLE_COLOR = new Color(126, 31, 31);
    private static final Color SECTION_COLOR = new Color(185, 95, 95);

    public NavPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblTitle = new javax.swing.JLabel();
        lblPerson = new javax.swing.JLabel();
        btnCreatePerson = new javax.swing.JButton();
        btnViewPerson = new javax.swing.JButton();
        lblHome = new javax.swing.JLabel();
        btnCreateHomeAddress = new javax.swing.JButton();
        btnViewHomeAddress = new javax.swing.JButton();
        lblLocal = new javax.swing.JLabel();
        btnCreateLocalAddress = new javax.swing.JButton();
        btnViewLocalAddress = new javax.swing.JButton();
        lblBank = new javax.swing.JLabel();
        btnCreateBankAccount = new javax.swing.JButton();
        btnViewBankAccount = new javax.swing.JButton();

        setBackground(LEFT_BG);
        setBorder(BorderFactory.createEmptyBorder());
        setLayout(null);
        setPreferredSize(new java.awt.Dimension(278, 600));

        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitle.setForeground(TITLE_COLOR);
        lblTitle.setText("Person Profile");
        lblTitle.setBounds(19, 27, 220, 28);
        add(lblTitle);

        addSection(lblPerson, "PERSON", 84);
        addMenuButton(btnCreatePerson, "Create Person", 101);
        addMenuButton(btnViewPerson, "View Person", 137);

        addSection(lblHome, "HOME ADDRESS", 194);
        addMenuButton(btnCreateHomeAddress, "Create Home Address", 211);
        addMenuButton(btnViewHomeAddress, "View Home Address", 247);

        addSection(lblLocal, "LOCAL ADDRESS", 304);
        addMenuButton(btnCreateLocalAddress, "Create Local Address", 321);
        addMenuButton(btnViewLocalAddress, "View Local Address", 357);

        addSection(lblBank, "BANK ACCOUNT", 414);
        addMenuButton(btnCreateBankAccount, "Create Bank Account", 431);
        addMenuButton(btnViewBankAccount, "View Bank Account", 467);
    }// </editor-fold>//GEN-END:initComponents

    private void addSection(JLabel label, String text, int y) {
        label.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        label.setForeground(SECTION_COLOR);
        label.setText(text);
        label.setBounds(19, y, 230, 18);
        add(label);
    }

    private void addMenuButton(JButton button, String text, int y) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setText(text);
        button.setFocusPainted(false);
        button.setBounds(13, y, 249, 32);
        add(button);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCreateBankAccount;
    public javax.swing.JButton btnCreateHomeAddress;
    public javax.swing.JButton btnCreateLocalAddress;
    public javax.swing.JButton btnCreatePerson;
    public javax.swing.JButton btnViewBankAccount;
    public javax.swing.JButton btnViewHomeAddress;
    public javax.swing.JButton btnViewLocalAddress;
    public javax.swing.JButton btnViewPerson;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblPerson;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
