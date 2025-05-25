/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.konradlorenz.view;

import co.edu.konradlorenz.controller.Controller;
import co.edu.konradlorenz.model.BasicReminder;
import co.edu.konradlorenz.model.DuplicateReminderException;
import co.edu.konradlorenz.model.EmptyInputException;
import co.edu.konradlorenz.model.PremiumReminder;
import co.edu.konradlorenz.model.Priority;
import co.edu.konradlorenz.model.Reminder;
import com.toedter.calendar.JCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dulce
 */
public class EditReminder extends javax.swing.JDialog {

    Controller control;
    private Reminder reminderToEdit;
    private boolean saved = false;
    
    public EditReminder(java.awt.Frame parent, Reminder reminder) {
        super(parent, "Edit reminder", true);
        this.reminderToEdit = reminder;
        this.control = ((Home)parent).getControl();
        initComponents();
        
        // Load reminder values into components
        txtTitle.setText(reminder.getTitulo());
        txtaDescription.setText(reminder.getDescripcion());
        txtLocation.setText(reminder.getUbicacion());
        cmbPriority.setSelectedItem(reminder.getPrioridad().toString());
        
        // Configure date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(reminder.getFecha(), formatter);
        Date dateInJCalendar = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
        calDateCalendar.setDate(dateInJCalendar);
        
        // If it's a premium reminder, show and configure the grade field
        if (reminder instanceof PremiumReminder) {
            lblGrade.setVisible(true);
            txtGrade.setVisible(true);
            txtGrade.setText(String.valueOf(((PremiumReminder) reminder).getCalificaciones()));
            cmbPlan.setSelectedItem("PREMIUM");
        } else {
            lblGrade.setVisible(false);
            txtGrade.setVisible(false);
            cmbPlan.setSelectedItem("BASIC");
        }
        
        // Change button text from "Add" to "Save" 
        btnEdit.setText("Save");
    }
    
    public boolean isSaved() {
        return saved;
    }
    
    public Reminder getEditedReminder() {
        Reminder edited;
        
        if (cmbPlan.getSelectedItem().equals("PREMIUM")) {
            edited = new PremiumReminder();
            ((PremiumReminder) edited).setCalificaciones(Integer.parseInt(txtGrade.getText()));
        } else {
            edited = new BasicReminder();
        }
        
        edited.setTitulo(txtTitle.getText());
        edited.setDescripcion(txtaDescription.getText());
        edited.setUbicacion(txtLocation.getText());
        edited.setPrioridad(Priority.valueOf(cmbPriority.getSelectedItem().toString()));
        
        // Formatear la fecha
        Date selectedDate = calDateCalendar.getDate();
        LocalDate date = selectedDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        edited.setFecha(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        return edited;
    }

    public JButton getBtnAdd() {
        return btnEdit;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnEdit = btnAdd;
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

    public JTextField getTxtGrade() {
        return txtGrade;
    }

    public void setTxtGrade(JTextField txtGrade) {
        this.txtGrade = txtGrade;
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
        btnEdit = new javax.swing.JButton();
        lblGrade = new javax.swing.JLabel();
        txtGrade = new javax.swing.JTextField();
        imgTacoBell = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Reminder");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setModal(true);
        setName("New Reminder"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNewReminder.setBackground(new java.awt.Color(237, 189, 178));
        pnlNewReminder.setMinimumSize(new java.awt.Dimension(800, 800));
        pnlNewReminder.setPreferredSize(new java.awt.Dimension(800, 800));
        pnlNewReminder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewReminder.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        lblNewReminder.setForeground(new java.awt.Color(104, 0, 0));
        lblNewReminder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewReminder.setText("Edit Reminder");
        pnlNewReminder.add(lblNewReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 60));

        lblPlan.setBackground(new java.awt.Color(104, 0, 0));
        lblPlan.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblPlan.setForeground(new java.awt.Color(104, 0, 0));
        lblPlan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlan.setText("Plan");
        pnlNewReminder.add(lblPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 190, 30));

        lblTitle.setBackground(new java.awt.Color(104, 0, 0));
        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(104, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Title");
        pnlNewReminder.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 190, 30));

        lblPriority.setBackground(new java.awt.Color(104, 0, 0));
        lblPriority.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblPriority.setForeground(new java.awt.Color(104, 0, 0));
        lblPriority.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPriority.setText("Priority");
        pnlNewReminder.add(lblPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 190, 30));

        lblLocation.setBackground(new java.awt.Color(104, 0, 0));
        lblLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(104, 0, 0));
        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocation.setText("Location");
        pnlNewReminder.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 190, 30));

        lblDescription.setBackground(new java.awt.Color(104, 0, 0));
        lblDescription.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(104, 0, 0));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Description");
        pnlNewReminder.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 190, 60));

        cmbPlan.setBackground(new java.awt.Color(104, 0, 0));
        cmbPlan.setForeground(new java.awt.Color(255, 255, 255));
        cmbPlan.setMaximumRowCount(2);
        cmbPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASIC", "PREMIUM" }));
        cmbPlan.setToolTipText("");
        cmbPlan.setBorder(null);
        cmbPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlanActionPerformed(evt);
            }
        });
        pnlNewReminder.add(cmbPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 280, 30));

        txtTitle.setBackground(new java.awt.Color(104, 0, 0));
        txtTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setBorder(null);
        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });
        pnlNewReminder.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 280, 30));

        calDateCalendar.setBackground(new java.awt.Color(242, 176, 227));
        calDateCalendar.setBorder(new javax.swing.border.MatteBorder(null));
        calDateCalendar.setAlignmentX(0.0F);
        calDateCalendar.setAlignmentY(0.0F);
        calDateCalendar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        calDateCalendar.setDecorationBackgroundColor(new java.awt.Color(210, 175, 225));
        calDateCalendar.setDecorationBackgroundVisible(false);
        calDateCalendar.setName("calDateCalendar"); // NOI18N
        calDateCalendar.setWeekOfYearVisible(false);
        pnlNewReminder.add(calDateCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 430, 200));

        cmbPriority.setBackground(new java.awt.Color(104, 0, 0));
        cmbPriority.setForeground(new java.awt.Color(255, 255, 255));
        cmbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO_PRIORITY", "LOW", "MEDIUM", "HIGH" }));
        cmbPriority.setBorder(null);
        cmbPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPriorityActionPerformed(evt);
            }
        });
        pnlNewReminder.add(cmbPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 280, 30));

        txtLocation.setBackground(new java.awt.Color(104, 0, 0));
        txtLocation.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtLocation.setForeground(new java.awt.Color(255, 255, 255));
        txtLocation.setBorder(null);
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        pnlNewReminder.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 280, 30));

        txtaDescription.setBackground(new java.awt.Color(104, 0, 0));
        txtaDescription.setColumns(10);
        txtaDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtaDescription.setRows(3);
        txtaDescription.setTabSize(2);
        txtaDescription.setAlignmentX(0.0F);
        txtaDescription.setAlignmentY(0.0F);
        txtaDescription.setBorder(null);
        spnDescription.setViewportView(txtaDescription);

        pnlNewReminder.add(spnDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 280, 60));

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlNewReminder.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 720, 130, 30));

        btnEdit.setBackground(new java.awt.Color(0, 204, 51));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        pnlNewReminder.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 720, 120, 30));

        lblGrade.setBackground(new java.awt.Color(104, 0, 0));
        lblGrade.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblGrade.setForeground(new java.awt.Color(104, 0, 0));
        lblGrade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrade.setText("Grade");
        pnlNewReminder.add(lblGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 190, 60));

        txtGrade.setBackground(new java.awt.Color(104, 0, 0));
        txtGrade.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtGrade.setForeground(new java.awt.Color(255, 255, 255));
        txtGrade.setBorder(null);
        txtGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradeActionPerformed(evt);
            }
        });
        pnlNewReminder.add(txtGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 280, 30));

        imgTacoBell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTacoBell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/ding-logo-semitransparent 500x500.png"))); // NOI18N
        imgTacoBell.setMaximumSize(new java.awt.Dimension(800, 800));
        imgTacoBell.setMinimumSize(new java.awt.Dimension(800, 800));
        imgTacoBell.setPreferredSize(new java.awt.Dimension(800, 800));
        pnlNewReminder.add(imgTacoBell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        getContentPane().add(pnlNewReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

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
        saved = false;
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            // Validate title
            String title = txtTitle.getText();
            if (title == null || title.trim().isEmpty()) {
                throw new EmptyInputException("El título no puede estar vacío.");
            }

            // Check for duplicate title (except for the current reminder)
            for (Reminder r : Controller.remindersList) {
                if (r != reminderToEdit && r.getTitulo().equals(title)) {
                    throw new DuplicateReminderException(title);
                }
            }
            
            // Mark as saved and close dialog
            saved = true;
            this.dispose();
        } catch (EmptyInputException e) {
            View.mostrarMensaje(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (DuplicateReminderException e) {
            View.mostrarMensaje(this, "Ya existe un recordatorio con ese título: " + e.getTitle(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradeActionPerformed
        txtGrade.setVisible(reminderToEdit instanceof PremiumReminder); 
    }//GEN-LAST:event_txtGradeActionPerformed

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
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblNewReminder;
    private javax.swing.JLabel lblPlan;
    private javax.swing.JLabel lblPriority;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlNewReminder;
    private javax.swing.JScrollPane spnDescription;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextArea txtaDescription;
    // End of variables declaration//GEN-END:variables
}
