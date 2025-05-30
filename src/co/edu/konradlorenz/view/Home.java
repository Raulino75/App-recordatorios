package co.edu.konradlorenz.view;

import co.edu.konradlorenz.controller.Controller;
import co.edu.konradlorenz.view.EditReminder;
import co.edu.konradlorenz.view.NewReminder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author dulce
 */
public class Home extends javax.swing.JFrame {
    
    Controller control;
    NewReminder newReminder;
    EditReminder editReminder;
    
    public Home(Controller control) {
        this.control = control;
        initComponents();
    }
    
    public JButton getBtnAddReminder() {
        return btnAddReminder;
    }
    
    public void setBtnAddReminder(JButton btnAddReminder) {
        this.btnAddReminder = btnAddReminder;
    }
    
    public JButton getBtnDeleteReminder() {
        return btnDeleteReminder;
    }
    
    public void setBtnDeleteReminder(JButton btnDeleteReminder) {
        this.btnDeleteReminder = btnDeleteReminder;
    }
    
    public JButton getBtnEditReminder() {
        return btnEditReminder;
    }
    
    public void setBtnEditReminder(JButton btnEditReminder) {
        this.btnEditReminder = btnEditReminder;
    }
    
    public JButton getBtnShowAllReminders() {
        return btnShowAllReminders;
    }
    
    public void setBtnShowAllReminders(JButton btnShowAllReminders) {
        this.btnShowAllReminders = btnShowAllReminders;
    }
    
    public JButton getBtnTranslate() {
        return btnTranslate;
    }
    
    public void setBtnTranslate(JButton btnTranslate) {
        this.btnTranslate = btnTranslate;
    }
    
    public JList<String> getLstRemindersList() {
        return lstRemindersList;
    }
    
    public void setLstRemindersList(JList<String> lstRemindersList) {
        this.lstRemindersList = lstRemindersList;
    }
    
    public NewReminder getNewReminder() {
        return newReminder;
    }
    
    public void setNewReminder(NewReminder newReminder) {
        this.newReminder = newReminder;
    }
    
    public EditReminder getEditReminder() {
        return editReminder;
    }
    
    public void setEditReminder(EditReminder editReminder) {
        this.editReminder = editReminder;
    }
    
    public Controller getControl() {
        return control;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHome = new javax.swing.JPanel();
        btnTranslate = new javax.swing.JButton();
        pnlDingLogo = new javax.swing.JPanel();
        lblDingLogo = new javax.swing.JLabel();
        pnlControlPanel = new javax.swing.JPanel();
        btnAddReminder = new javax.swing.JButton();
        btnShowAllReminders = new javax.swing.JButton();
        btnEditReminder = new javax.swing.JButton();
        btnDeleteReminder = new javax.swing.JButton();
        pnlCentral = new javax.swing.JPanel();
        spnRemindersScrollPane = new javax.swing.JScrollPane();
        lstRemindersList = new javax.swing.JList<>();
        imgDingLogo500 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ding App");
        setBackground(new java.awt.Color(237, 189, 178));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("Ding App"); // NOI18N
        setResizable(false);

        pnlHome.setBackground(new java.awt.Color(104, 0, 0));
        pnlHome.setMaximumSize(new java.awt.Dimension(1280, 720));
        pnlHome.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTranslate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/G_Translate_Icon_50x50.png"))); // NOI18N
        btnTranslate.setPreferredSize(new java.awt.Dimension(70, 70));
        btnTranslate.setRolloverEnabled(false);
        btnTranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranslateActionPerformed(evt);
            }
        });
        pnlHome.add(btnTranslate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        pnlDingLogo.setBackground(new java.awt.Color(237, 189, 178));
        pnlDingLogo.setPreferredSize(new java.awt.Dimension(200, 70));

        lblDingLogo.setBackground(new java.awt.Color(237, 189, 178));
        lblDingLogo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblDingLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDingLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/ding-logo 50x50.png"))); // NOI18N
        lblDingLogo.setText("Ding!!!");
        lblDingLogo.setToolTipText("");
        lblDingLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlDingLogoLayout = new javax.swing.GroupLayout(pnlDingLogo);
        pnlDingLogo.setLayout(pnlDingLogoLayout);
        pnlDingLogoLayout.setHorizontalGroup(
            pnlDingLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDingLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlDingLogoLayout.setVerticalGroup(
            pnlDingLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDingLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlHome.add(pnlDingLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlControlPanel.setBackground(new java.awt.Color(237, 189, 178));
        pnlControlPanel.setPreferredSize(new java.awt.Dimension(200, 600));
        pnlControlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddReminder.setBackground(new java.awt.Color(104, 0, 0));
        btnAddReminder.setForeground(new java.awt.Color(255, 255, 255));
        btnAddReminder.setText("Add Reminder");
        btnAddReminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReminderActionPerformed(evt);
            }
        });
        pnlControlPanel.add(btnAddReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 7, 188, 40));

        btnShowAllReminders.setBackground(new java.awt.Color(104, 0, 0));
        btnShowAllReminders.setForeground(new java.awt.Color(255, 255, 255));
        btnShowAllReminders.setText("Show All Reminders");
        btnShowAllReminders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllRemindersActionPerformed(evt);
            }
        });
        pnlControlPanel.add(btnShowAllReminders, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, 188, 40));

        btnEditReminder.setBackground(new java.awt.Color(104, 0, 0));
        btnEditReminder.setForeground(new java.awt.Color(255, 255, 255));
        btnEditReminder.setText("Edit Reminder");
        btnEditReminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditReminderActionPerformed(evt);
            }
        });
        pnlControlPanel.add(btnEditReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 99, 188, 40));

        btnDeleteReminder.setBackground(new java.awt.Color(104, 0, 0));
        btnDeleteReminder.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteReminder.setText("Delete Reminder");
        btnDeleteReminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReminderActionPerformed(evt);
            }
        });
        pnlControlPanel.add(btnDeleteReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 145, 188, 40));

        pnlHome.add(pnlControlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 620));

        pnlCentral.setBackground(new java.awt.Color(237, 189, 178));
        pnlCentral.setMinimumSize(new java.awt.Dimension(22, 22));
        pnlCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnRemindersScrollPane.setAlignmentX(0.0F);
        spnRemindersScrollPane.setAlignmentY(0.0F);
        spnRemindersScrollPane.setPreferredSize(new java.awt.Dimension(1048, 620));

        lstRemindersList.setModel(control.viewReminders());
        lstRemindersList.setAlignmentX(0.0F);
        lstRemindersList.setAlignmentY(0.0F);
        spnRemindersScrollPane.setViewportView(lstRemindersList);
        spnRemindersScrollPane.setVisible(false);
        lstRemindersList.setVisible(false);

        pnlCentral.add(spnRemindersScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1030, 600));

        imgDingLogo500.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgDingLogo500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/ding-logo-semitransparent 500x500.png"))); // NOI18N
        imgDingLogo500.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlCentral.add(imgDingLogo500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 1050, 620));

        pnlHome.add(pnlCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranslateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTranslateActionPerformed

    private void btnShowAllRemindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllRemindersActionPerformed
        // Actualiza el modelo de la lista con los recordatorios
        lstRemindersList.setModel(control.viewReminders());

        // Hace visible el scroll pane y la lista
        spnRemindersScrollPane.setVisible(true);
        lstRemindersList.setVisible(true);
    }//GEN-LAST:event_btnShowAllRemindersActionPerformed
    
    private void btnAddReminderActionPerformed(java.awt.event.ActionEvent evt) {
        newReminder = new NewReminder(this, true, control); // this= Home (le dice a quien pertenece esta ventana), true= modular (desactiva Home mientras esté abierto), control= instancia del control unica
        newReminder.setLocationRelativeTo(null); // lo centra en la pantalla
        newReminder.setVisible(true); // lo hace visible
    }
    
    private void btnEditReminderActionPerformed(java.awt.event.ActionEvent evt) {
        // Get selected reminder from list
        int index = lstRemindersList.getSelectedIndex();
        String titulo = control.selectReminder(index).getTitulo();        
        
        if (titulo == null) {
            View.mostrarMensaje(this, "Por favor seleccione un recordatorio para editar.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Call the controller's modifyReminder method with the selected title
        control.modifyReminder(titulo);

        // Update the list after editing
        updateRemindersList();
    }
    
    private void btnDeleteReminderActionPerformed(java.awt.event.ActionEvent evt) {
        // Get selected reminder from list
        int index = lstRemindersList.getSelectedIndex();
        if (index == -1) {
            View.mostrarMensaje(this, "Por favor seleccione un recordatorio para eliminar.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String titulo = control.selectReminder(index).getTitulo();        
        
        // Confirmar con el usuario
        int confirmResult = JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro que desea eliminar el recordatorio '" + titulo + "'?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (confirmResult == JOptionPane.YES_OPTION) {
            // Call the controller's deleteReminder method with the selected title
            control.deleteReminder(titulo);

            // Update the list after deletion
            updateRemindersList();
        }
    }
    
    public void updateRemindersList() {
        // Actualiza el modelo de la lista con los recordatorios
        lstRemindersList.setModel(control.viewReminders());

        // Hace visible el scroll pane y la lista
        spnRemindersScrollPane.setVisible(true);
        lstRemindersList.setVisible(true);
        
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddReminder;
    private javax.swing.JButton btnDeleteReminder;
    private javax.swing.JButton btnEditReminder;
    private javax.swing.JButton btnShowAllReminders;
    private javax.swing.JButton btnTranslate;
    private javax.swing.JLabel imgDingLogo500;
    private javax.swing.JLabel lblDingLogo;
    private javax.swing.JList<String> lstRemindersList;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlControlPanel;
    private javax.swing.JPanel pnlDingLogo;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JScrollPane spnRemindersScrollPane;
    // End of variables declaration//GEN-END:variables
}
