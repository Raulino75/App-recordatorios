/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.konradlorenz.view;

import co.edu.konradlorenz.controller.Controller;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dulce
 */
public class EditReminder extends javax.swing.JDialog {

    Controller control;
    
    public EditReminder(java.awt.Frame parent, boolean modal, Controller control) {
        super(parent, modal);
        initComponents();
        this.control = control;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(JButton btnEdit) {
        this.btnEdit = btnEdit;
    }

    public JCalendar getCalDateCalendar() {
        return calDateCalendar;
    }

    public void setCalDateCalendar(JCalendar calDateCalendar) {
        this.calDateCalendar = calDateCalendar;
    }

    public JComboBox<String> getCmbPlan() {
        return cmbPlan;
    }

    public void setCmbPlan(JComboBox<String> cmbPlan) {
        this.cmbPlan = cmbPlan;
    }

    public JComboBox<String> getCmbPriority() {
        return cmbPriority;
    }

    public void setCmbPriority(JComboBox<String> cmbPriority) {
        this.cmbPriority = cmbPriority;
    }

    public JTextField getTxtLocation() {
        return txtLocation;
    }

    public void setTxtLocation(JTextField txtLocation) {
        this.txtLocation = txtLocation;
    }

    public JTextField getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(JTextField txtTitle) {
        this.txtTitle = txtTitle;
    }

    public JTextArea getTxtaDescription() {
        return txtaDescription;
    }

    public void setTxtaDescription(JTextArea txtaDescription) {
        this.txtaDescription = txtaDescription;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEditReminder = new javax.swing.JPanel();
        lblEditReminder = new javax.swing.JLabel();
        lblPlan = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblPriority = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        cmbPlan = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JTextField();
        cmbPriority = new javax.swing.JComboBox<>();
        txtLocation = new javax.swing.JTextField();
        spnDescription = new javax.swing.JScrollPane();
        txtaDescription = new javax.swing.JTextArea();
        calDateCalendar = new com.toedter.calendar.JCalendar();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        imgTacoBell = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Reminder");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setModal(true);
        setName("Edit Reminder"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEditReminder.setBackground(new java.awt.Color(237, 189, 178));
        pnlEditReminder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEditReminder.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        lblEditReminder.setForeground(new java.awt.Color(104, 0, 0));
        lblEditReminder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditReminder.setText("Edit Reminder");
        pnlEditReminder.add(lblEditReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 470, 50));

        lblPlan.setBackground(new java.awt.Color(104, 0, 0));
        lblPlan.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblPlan.setForeground(new java.awt.Color(104, 0, 0));
        lblPlan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlan.setText("Plan");
        pnlEditReminder.add(lblPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 190, 50));

        lblTitle.setBackground(new java.awt.Color(104, 0, 0));
        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(104, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Title");
        pnlEditReminder.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 190, 50));

        lblDate.setBackground(new java.awt.Color(104, 0, 0));
        lblDate.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblDate.setForeground(new java.awt.Color(104, 0, 0));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date");
        pnlEditReminder.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 190, 140));

        lblPriority.setBackground(new java.awt.Color(104, 0, 0));
        lblPriority.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblPriority.setForeground(new java.awt.Color(104, 0, 0));
        lblPriority.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPriority.setText("Priority");
        pnlEditReminder.add(lblPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 190, 50));

        lblLocation.setBackground(new java.awt.Color(104, 0, 0));
        lblLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(104, 0, 0));
        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocation.setText("Location");
        pnlEditReminder.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 190, 50));

        lblDescription.setBackground(new java.awt.Color(104, 0, 0));
        lblDescription.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(104, 0, 0));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Description");
        pnlEditReminder.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 190, 90));

        cmbPlan.setBackground(new java.awt.Color(104, 0, 0));
        cmbPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlanActionPerformed(evt);
            }
        });
        pnlEditReminder.add(cmbPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 280, 50));

        txtTitle.setBackground(new java.awt.Color(104, 0, 0));
        txtTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });
        pnlEditReminder.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 280, 50));

        cmbPriority.setBackground(new java.awt.Color(104, 0, 0));
        cmbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPriorityActionPerformed(evt);
            }
        });
        pnlEditReminder.add(cmbPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 280, 50));

        txtLocation.setBackground(new java.awt.Color(104, 0, 0));
        txtLocation.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        pnlEditReminder.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 280, 50));

        txtaDescription.setBackground(new java.awt.Color(104, 0, 0));
        txtaDescription.setColumns(20);
        txtaDescription.setRows(5);
        spnDescription.setViewportView(txtaDescription);

        pnlEditReminder.add(spnDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 280, -1));

        calDateCalendar.setBackground(new java.awt.Color(104, 0, 0));
        pnlEditReminder.add(calDateCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 280, 140));

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlEditReminder.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 120, 40));

        btnEdit.setBackground(new java.awt.Color(102, 0, 255));
        btnEdit.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        pnlEditReminder.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 120, 40));

        imgTacoBell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTacoBell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/ding-logo-semitransparent 500x500.png"))); // NOI18N
        pnlEditReminder.add(imgTacoBell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(pnlEditReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void cmbPriorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPriorityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPriorityActionPerformed

    private void cmbPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPlanActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private com.toedter.calendar.JCalendar calDateCalendar;
    private javax.swing.JComboBox<String> cmbPlan;
    private javax.swing.JComboBox<String> cmbPriority;
    private javax.swing.JLabel imgTacoBell;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEditReminder;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPlan;
    private javax.swing.JLabel lblPriority;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlEditReminder;
    private javax.swing.JScrollPane spnDescription;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextArea txtaDescription;
    // End of variables declaration//GEN-END:variables
}
