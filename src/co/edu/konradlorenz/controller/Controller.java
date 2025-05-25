package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Controller {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static List<Reminder> remindersList = new ArrayList<>();

    private Home home;

    public void run() {
        datosDePrueba();
        this.home = new Home(this);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }

    public void addReminder() {

        try {
            // TITLE
            String title = home.getNewReminder().getTxtTitle().getText(); // ventana -> emergente -> componente -> extrae texto

            if (title == null || title.trim().isEmpty()) {
                throw new EmptyInputException("El título no puede estar vacío.");
            }

            for (Reminder r : remindersList) {
                if (r.getTitulo().equals(title)) {
                    throw new DuplicateReminderException(title);
                }
            }            // DESCRIPTION            
            String description = home.getNewReminder().getTxtaDescription().getText();
            Date selectedDate = home.getNewReminder().getCalDateCalendar().getDate();
            LocalDate date = selectedDate.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
            if (date.isBefore(LocalDate.now())) {
//                throw new InvalidReminderDateException("The date cannot be in the past."); //FIXME:
            }
            Priority priority = (Priority) home.getNewReminder().getCmbPriority().getSelectedItem();
            String location = home.getNewReminder().getTxtLocation().getText();
            boolean esPremium = home.getNewReminder().getCmbPlan().getSelectedItem().equals("PREMIUM") ? true : false;

            Reminder reminder;
            if (esPremium) {
                int grade = Integer.parseInt(home.getNewReminder().getTxtGrade().getText());
                PremiumReminder r = new PremiumReminder();
                r.setCalificaciones(grade);
                reminder = r;
            } else {
                reminder = new BasicReminder();
            }

            reminder.setTitulo(title);
            reminder.setDescripcion(description);
            reminder.setFecha(date.format(DATE_FORMATTER));
            reminder.setPrioridad(priority);
            reminder.setUbicacion(location);

            remindersList.add(reminder);
            System.out.println("Recordatorio guardado con éxito.");
        } catch (EmptyInputException e) {

        } catch (DuplicateReminderException e) {

        } //FIXME: Arrojar las exceptions
//        catch (InvalidReminderDateException e) {
//
//        } catch (InvalidPriorityException e {
//
//        }
    }

    public DefaultListModel<String> viewReminders() {
        DefaultListModel<String> listModel = new DefaultListModel<>();

        if (remindersList.isEmpty()) {
            System.out.println("No reminders are available.");
            // TODO: Add JPane de advertencia
        }

        for (Reminder r : remindersList) {
            listModel.addElement(r.toString());
        }

        return listModel;
    }
//
//
//    public void modifyReminder() throws EmptyInputException, InvalidPriorityException,
//        DuplicateReminderException, InvalidReminderDateException {
//    if (remindersList.isEmpty()) {
//        home.showMessage("There are no reminders to modify.");
//        return;
//    }
//
//    boolean found = false;
//    Recordatory reminderToModify = null;
//
//    while (!found) {
//        String title = home.askInput("Enter the title of the reminder to be modified:");
//        if (title == null || title.trim().isEmpty()) {
//            home.showMessage("Title cannot be empty. Please try again.");
//            continue;
//        }
//
//        for (Recordatory reminder : remindersList) {
//            if (reminder.getTitulo().equals(title)) {
//                found = true;
//                reminderToModify = reminder;
//                break;
//            }
//        }
//
//        if (!found) {
//            home.showMessage("Reminder with title '" + title + "' not found. Please try again.");
//        }
//    }
//
//    home.showMessage("Enter the new reminder data:");
//
//    String newTitle = home.getTitle(); 
//    if (newTitle == null || newTitle.trim().isEmpty()) {
//        throw new EmptyInputException("Title cannot be empty.");
//    }
//   
//    for (Recordatory r : remindersList) {
//        if (r != reminderToModify && r.getTitulo().equals(newTitle)) {
//            throw new DuplicateReminderException("The title is already in use");
//        }
//    }
//
//    String newDescription = home.getDescription();
//    LocalDateTime newDate = home.getDate();  
//    Priority newPriority = home.getPriority();
//    String newLocation = home.getLocation();
//
//    reminderToModify.setTitulo(newTitle);
//    reminderToModify.setDescripcion(newDescription);
//    reminderToModify.setFecha(newDate.format(DATE_FORMATTER));
//    reminderToModify.setPrioridad(newPriority);
//    reminderToModify.setUbicacion(newLocation);
//
//    home.showMessage("Reminder successfully modified.");
//}
//
//
//    public void deleteReminder() throws EmptyInputException {
//    if (remindersList.isEmpty()) {
//        home.showMessage("There are no reminders to delete.");
//        return;
//    }
//
//    boolean found = false;
//    Recordatory reminderToDelete = null;
//
//    while (!found) {
//        String title = home.askInput("Enter the title of the reminder to delete:");
//        if (title == null || title.trim().isEmpty()) {
//            home.showMessage("Title cannot be empty. Please try again.");
//            continue;
//        }
//
//        for (Recordatory r : remindersList) {
//            if (r.getTitulo().equals(title)) {
//                found = true;
//                reminderToDelete = r;
//                break;
//            }
//        }
//
//        if (!found) {
//            home.showMessage("Reminder with title '" + title + "' not found. Please try again.");
//        }
//    }
//
//    remindersList.remove(reminderToDelete);
//    home.showMessage("Reminder successfully removed.");
//}
//
//
//    public void closeProgram() {
//    home.showMessage("Program closed.");
//}
//
//
//    private int obtainGrade() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private void datosDePrueba() {
        remindersList.add(new BasicReminder("Recordatorio 1", "Descripción 1", "01/01/2023", Priority.LOW, "Ubicación 1"));
        remindersList.add(new BasicReminder("Recordatorio 2", "Descripción 2", "02/02/2023", Priority.MEDIUM, "Ubicación 2"));
        remindersList.add(new BasicReminder("Recordatorio 3", "Descripción 3", "03/03/2023", Priority.HIGH, "Ubicación 3"));
        remindersList.add(new BasicReminder("Recordatorio 4", "Descripción 4", "04/04/2023", Priority.LOW, "Ubicación 4"));
        remindersList.add(new PremiumReminder("Recordatorio 5", "Descripción 5", "05/05/2023", Priority.MEDIUM, "Ubicación 5",99999999,50));
    }
}