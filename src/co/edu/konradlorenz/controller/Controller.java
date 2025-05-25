package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class Controller {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static List<Recordatory> remindersList = new ArrayList<>();

    private Home home;

    public void run() {
        this.home = new Home(this);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }

    public void addReminder() throws InvalidReminderDateException,  InvalidPriorityException {
        
        try {
        // TITLE
            String title = home.getNewReminder().getTxtTitle().getText(); // ventana -> emergente -> componente -> extrae texto

            if (title == null || title.trim().isEmpty()) {
                throw new EmptyInputException("El título no puede estar vacío.");
            }

            for (Recordatory r : remindersList) {
                if (r.getTitulo().equals(title)) {
                    throw new DuplicateReminderException(title);
                }
            }

            // DESCRIPTION
            String description = home.getDescripcion();
            LocalDateTime date = home.getFecha();
            Priority priority = home.getPrioridad(); 
            String location = home.getUbicacion();
            boolean esPremium = home.isPremium(); 

            Recordatory reminder;
            if (esPremium) {
                int grade = home.getCalificacion(); 
                RecordatorioPremium r = new RecordatorioPremium();
                r.setCalificaciones(grade);
                reminder = r;
            } else {
                reminder = new RecordatorioBasico();
            }

            reminder.setTitulo(title);
            reminder.setDescripcion(description);
            reminder.setFecha(date.format(DATE_FORMATTER));
            reminder.setPrioridad(priority);
            reminder.setUbicacion(location);

            remindersList.add(reminder);
            System.out.println("Recordatorio guardado con éxito.");
        }catch(EmptyInputException e){
                
        }catch(DuplicateReminderException e){
        
        }
    }
//
//    public void createBasicReminder() throws DuplicateReminderException, InvalidReminderDateException,
//        EmptyInputException, InvalidPriorityException {
//    
//    String title = home.getTitle();
//    if (title == null || title.trim().isEmpty()) {
//        throw new EmptyInputException("Title cannot be empty.");
//    }
//
//    for (Recordatory r : remindersList) {
//        if (r.getTitulo().equals(title)) {
//            throw new DuplicateReminderException("The title '" + title + "' is already in use.");
//        }
//    }
//
//    String description = home.getDescription();
//    LocalDateTime date = home.getDate();
//    if (date == null || date.isBefore(LocalDateTime.now())) {
//        throw new InvalidReminderDateException("Date must be in the future.");
//    }
//
//    Priority priority = home.getPriority();
//    if (priority == null) {
//        throw new InvalidPriorityException("Priority must be selected.");
//    }
//
//    String location = home.getLocation();
//
//    Recordatory basicReminder = new RecordatorioBasico();
//    basicReminder.setTitulo(title);
//    basicReminder.setDescripcion(description);
//    basicReminder.setFecha(date.format(DATE_FORMATTER));
//    basicReminder.setPrioridad(priority);
//    basicReminder.setUbicacion(location);
//
//    remindersList.add(basicReminder);
//    home.showMessage("Basic reminder successfully created.");
//}
//
//
//   public void createPremiumReminder() throws DuplicateReminderException, InvalidReminderDateException,
//        EmptyInputException, InvalidPriorityException {
//
//    String title = home.getTitle();
//    if (title == null || title.trim().isEmpty()) {
//        throw new EmptyInputException("Title cannot be empty.");
//    }
//
//    for (Recordatory r : remindersList) {
//        if (r.getTitulo().equals(title)) {
//            throw new DuplicateReminderException("The title '" + title + "' is already in use.");
//        }
//    }
//
//    String description = home.getDescription();
//    LocalDateTime date = home.getDate();
//    if (date == null || date.isBefore(LocalDateTime.now())) {
//        throw new InvalidReminderDateException("Date must be in the future.");
//    }
//
//    Priority priority = home.getPriority();
//    if (priority == null) {
//        throw new InvalidPriorityException("Priority must be selected.");
//    }
//
//    String location = home.getLocation();
//    int grade = home.getGrade(); 
//
//    RecordatorioPremium premiumReminder = new RecordatorioPremium();
//    premiumReminder.setTitulo(title);
//    premiumReminder.setDescripcion(description);
//    premiumReminder.setFecha(date.format(DATE_FORMATTER));
//    premiumReminder.setPrioridad(priority);
//    premiumReminder.setUbicacion(location);
//    premiumReminder.setCalificaciones(grade);
//
//    remindersList.add(premiumReminder);
//    home.showMessage("Premium reminder successfully created.");
//}
//
//
//   public String obtainASingleCertificate() throws DuplicateReminderException, EmptyInputException {
//    String title = home.getTitle();
//
//    if (title == null || title.trim().isEmpty()) {
//        throw new EmptyInputException("The title cannot be empty.");
//    }
//
//    for (Recordatory r : remindersList) {
//        if (r.getTitulo().equals(title)) {
//            throw new DuplicateReminderException("The title is already in use.");
//        }
//    }
//    return title;
//}
//
//
//   public String obtainDescription() throws EmptyInputException {
//    String description = home.getDescription();
//    if (description == null || description.trim().isEmpty()) {
//        throw new EmptyInputException("The description cannot be empty.");
//    }
//    return description;
//}
//
//
//   public LocalDateTime obtainValidDate() throws InvalidReminderDateException, EmptyInputException {
//    LocalDateTime dateTime = home.getDate();
//
//    if (dateTime == null) {
//        throw new EmptyInputException("Date cannot be empty.");
//    }
//
//    if (dateTime.toLocalDate().isBefore(LocalDate.now())) {
//        throw new InvalidReminderDateException("The date cannot be in the past.");
//    }
//
//    return dateTime;
//}
//
//
//    public Priority obtainPriority() throws InvalidPriorityException, EmptyInputException {
//    Priority priority = home.getPriority(); 
//
//    if (priority == null) {
//        throw new EmptyInputException("Priority must be selected.");
//    }
//
//    return priority;
//}
//
//
//   public String obtainLocation() throws EmptyInputException {
//    String location = home.getLocation(); 
//    if (location == null || location.trim().isEmpty()) {
//        throw new EmptyInputException("Location cannot be empty.");
//    }
//    return location;
//}
//
//
//   public void viewReminders() {
//    if (remindersList.isEmpty()) {
//        home.showMessage("No reminders are available.");
//        return;
//    }
//
//    StringBuilder allReminders = new StringBuilder();
//    for (Recordatory reminder : remindersList) {
//        allReminders.append(reminder.toString()).append("\n\n");
//    }
//    home.showMessage(allReminders.toString());
//}
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
}