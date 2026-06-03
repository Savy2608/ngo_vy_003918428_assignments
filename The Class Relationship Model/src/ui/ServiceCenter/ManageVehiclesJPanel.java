package ui.ServiceCenter;

import model.*;
import ui.MainJFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * "Manage Vehicles" workflow: lists vehicles in a table with a search box and
 * View Details / Delete actions. NetBeans GUI Builder form (see
 * ManageVehiclesJPanel.form); the JTable itself is built in code and placed
 * into the form's scroll pane. The seed data contains two Toyotas so a search
 * returns multiple matches.
 *
 * @author vyngo
 */
public class ManageVehiclesJPanel extends javax.swing.JPanel {

    private final MainJFrame mainFrame;
    private JTable table;
    private DefaultTableModel tableModel;
    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

    public ManageVehiclesJPanel(MainJFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        setupTable();
        refreshTable();
    }

    /** Builds the table model + JTable and drops it into the form's scroll pane. */
    private void setupTable() {
        tableModel = new DefaultTableModel(
                new String[]{"Owner ID", "Vehicle ID", "Service Opted", "Cost"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        table = new JTable(tableModel);
        table.setFont(new Font("Serif", Font.PLAIN, 14));
        table.setRowHeight(26);
        table.setBackground(new Color(130, 130, 240));
        table.setGridColor(new Color(170, 170, 230));
        table.setSelectionBackground(new Color(173, 216, 230));
        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 14));
        table.getTableHeader().setBackground(Color.WHITE);
        jScrollPane1.setViewportView(table);
        txtSearch.addActionListener(e -> performSearch());
    }

    public void refreshTable() {
        if (txtSearch != null) txtSearch.setText("");
        populate(Business.getInstance().getAllVehicles());
    }

    private void performSearch() {
        String keyword = txtSearch.getText().trim();
        if (keyword.isEmpty()) {
            populate(Business.getInstance().getAllVehicles());
            return;
        }
        // Single search box: match make, owner name or registration number.
        ArrayList<Vehicle> results = new ArrayList<>();
        String k = keyword.toLowerCase();
        for (Vehicle v : Business.getInstance().getAllVehicles()) {
            if (v.getMake().toLowerCase().contains(k)
                    || v.getOwner().getFullName().toLowerCase().contains(k)
                    || v.getRegistrationNumber().toLowerCase().contains(k)) {
                results.add(v);
            }
        }
        populate(results);
        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No vehicles matched: " + keyword,
                    "No Results", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void populate(ArrayList<Vehicle> vehicles) {
        tableModel.setRowCount(0);
        for (Vehicle v : vehicles) {
            tableModel.addRow(new Object[]{
                    v.getOwner().getOwnerID(),
                    v.getVehicleID(),
                    v.getServiceOpted().getServiceType(),
                    String.format("$%.2f", v.getServiceOpted().getCost())
            });
        }
    }

    private Vehicle selectedVehicle() {
        int row = table.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select a vehicle from the table first.",
                    "No Selection", JOptionPane.WARNING_MESSAGE);
            return null;
        }
        int vehicleID = (int) tableModel.getValueAt(row, 1);
        return Business.getInstance().findVehicleByID(vehicleID);
    }

    private void viewDetails() {
        Vehicle v = selectedVehicle();
        if (v == null) return;
        Service s = v.getServiceOpted();
        Owner o = v.getOwner();
        String details = String.format(
                "=== Vehicle Details ===%n" +
                "Vehicle ID:       %d%n" +
                "Make:             %s%n" +
                "Model:            %s%n" +
                "Year:             %d%n" +
                "Registration No.: %s%n" +
                "Mileage:          %d miles%n" +
                "Under Warranty:   %s%n" +
                "Service Date:     %s%n%n" +
                "=== Owner Details ===%n" +
                "Owner ID:         %d%n" +
                "Owner Name:       %s%n%n" +
                "=== Service Details ===%n" +
                "Service ID:       %d%n" +
                "Service Type:     %s%n" +
                "Cost:             $%.2f%n" +
                "Mechanic:         %s%n" +
                "Duration:         %d min",
                v.getVehicleID(), v.getMake(), v.getModel(), v.getYear(),
                v.getRegistrationNumber(), v.getMileage(),
                v.isUnderWarranty() ? "Yes" : "No", SDF.format(v.getServiceDate()),
                o.getOwnerID(), o.getFullName(),
                s.getServiceID(), s.getServiceType(), s.getCost(),
                s.getMechanicName(), s.getServiceDuration());
        JTextArea ta = new JTextArea(details);
        ta.setEditable(false);
        ta.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        JOptionPane.showMessageDialog(this, new JScrollPane(ta),
                "Vehicle Details - ID: " + v.getVehicleID(), JOptionPane.INFORMATION_MESSAGE);
    }

    private void deleteSelected() {
        Vehicle v = selectedVehicle();
        if (v == null) return;
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete Vehicle ID: " + v.getVehicleID() + "?",
                "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Business.getInstance().deleteVehicle(v.getVehicleID());
            populate(Business.getInstance().getAllVehicles());
            JOptionPane.showMessageDialog(this, "Vehicle deleted successfully.",
                    "Deleted", JOptionPane.INFORMATION_MESSAGE);
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
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 245));
        setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        lblTitle.setText("Manage Vehicles");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 12, 10);
        add(lblTitle, gridBagConstraints);

        txtSearch.setColumns(30);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 8, 10);
        add(txtSearch, gridBagConstraints);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 10);
        add(btnSearch, gridBagConstraints);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 20);
        add(btnBack, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        add(jScrollPane1, gridBagConstraints);

        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 6, 10);
        add(btnView, gridBagConstraints);

        btnDelete.setText("Delete Vehicle");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 25, 10);
        add(btnDelete, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        performSearch();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showPanel(MainJFrame.WORK_AREA);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        viewDetails();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteSelected();
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
