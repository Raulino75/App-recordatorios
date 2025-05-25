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
public class NewReminder extends javax.swing.JDialog {

    Controller control;
    
    public NewReminder(java.awt.Frame parent, boolean modal, Controller control) {
        super(parent, modal);
        initComponents();
        this.control = control;
        
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
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

        pnlNewReminder = new javax.swing.JPanel();
        lblNewReminder = new javax.swing.JLabel();
        lblPlan = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblPriority = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        cmbPlan = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JTextField();
        calDateCalendar = new com.toedter.calendar.JCalendar();
        cmbPriority = new javax.swing.JComboBox<>();
        txtLocation = new javax.swing.JTextField();
        spnDescription = new javax.swing.JScrollPane();
        txtaDescription = new javax.swing.JTextArea();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        imgTacoBell = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Reminder");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setModal(true);
        setName("New Reminder"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNewReminder.setBackground(new java.awt.Color(237, 189, 178));
        pnlNewReminder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewReminder.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        lblNewReminder.setForeground(new java.awt.Color(104, 0, 0));
        lblNewReminder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewReminder.setText("New Reminder");
        pnlNewReminder.add(lblNewReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 470, 50));

        lblPlan.setBackground(new java.awt.Color(104, 0, 0));
        lblPlan.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblPlan.setForeground(new java.awt.Color(104, 0, 0));
        lblPlan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlan.setText("Plan");
        pnlNewReminder.add(lblPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 190, 30));

        lblTitle.setBackground(new java.awt.Color(104, 0, 0));
        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(104, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Title");
        pnlNewReminder.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 190, 30));

        lblPriority.setBackground(new java.awt.Color(104, 0, 0));
        lblPriority.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblPriority.setForeground(new java.awt.Color(104, 0, 0));
        lblPriority.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPriority.setText("Priority");
        pnlNewReminder.add(lblPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 190, 30));

        lblLocation.setBackground(new java.awt.Color(104, 0, 0));
        lblLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(104, 0, 0));
        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocation.setText("Location");
        pnlNewReminder.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 190, 30));

        lblDescription.setBackground(new java.awt.Color(104, 0, 0));
        lblDescription.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(104, 0, 0));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Description");
        pnlNewReminder.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 190, 60));

        cmbPlan.setBackground(new java.awt.Color(104, 0, 0));
        cmbPlan.setMaximumRowCount(2);
        cmbPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASIC", "PREMIUM" }));
        cmbPlan.setToolTipText("");
        cmbPlan.setBorder(null);
        cmbPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlanActionPerformed(evt);
            }
        });
        pnlNewReminder.add(cmbPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 280, 30));

        txtTitle.setBackground(new java.awt.Color(104, 0, 0));
        txtTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtTitle.setBorder(null);
        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });
        pnlNewReminder.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 280, 30));

        calDateCalendar.setAlignmentX(0.0F);
        calDateCalendar.setAlignmentY(0.0F);
        calDateCalendar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        calDateCalendar.setDecorationBackgroundVisible(false);
        calDateCalendar.setName("calDateCalendar"); // NOI18N
        calDateCalendar.setWeekOfYearVisible(false);
        pnlNewReminder.add(calDateCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 430, 200));

        cmbPriority.setBackground(new java.awt.Color(104, 0, 0));
        cmbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO_PRIORITY", "LOW", "MEDIUM", "HIGH" }));
        cmbPriority.setBorder(null);
        cmbPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPriorityActionPerformed(evt);
            }
        });
        pnlNewReminder.add(cmbPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 280, 30));

        txtLocation.setBackground(new java.awt.Color(104, 0, 0));
        txtLocation.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtLocation.setBorder(null);
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        pnlNewReminder.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 280, 30));

        txtaDescription.setBackground(new java.awt.Color(104, 0, 0));
        txtaDescription.setColumns(10);
        txtaDescription.setRows(3);
        txtaDescription.setTabSize(2);
        txtaDescription.setAlignmentX(0.0F);
        txtaDescription.setAlignmentY(0.0F);
        txtaDescription.setBorder(null);
        spnDescription.setViewportView(txtaDescription);

        pnlNewReminder.add(spnDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 471, 280, 60));

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlNewReminder.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 120, 40));

        btnAdd.setBackground(new java.awt.Color(0, 204, 51));
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlNewReminder.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 120, 40));

        imgTacoBell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTacoBell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/ding-logo-semitransparent 500x500.png"))); // NOI18N
        pnlNewReminder.add(imgTacoBell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(pnlNewReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        control.addReminder();
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private com.toedter.calendar.JCalendar calDateCalendar;
    private javax.swing.JComboBox<String> cmbPlan;
    private javax.swing.JComboBox<String> cmbPriority;
    private javax.swing.JLabel imgTacoBell;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblNewReminder;
    private javax.swing.JLabel lblPlan;
    private javax.swing.JLabel lblPriority;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlNewReminder;
    private javax.swing.JScrollPane spnDescription;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextArea txtaDescription;
    // End of variables declaration//GEN-END:variables
}
