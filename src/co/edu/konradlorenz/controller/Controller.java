package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.View;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static List<Recordatory> remindersList = new ArrayList<>();

    public void run() {
        int opcion;
        do {
            try {
                opcion = View.mostrarMenuPrincipal();
                switch (opcion) {
                    case 1:
                        addReminder();
                        break;
                    case 2:
                        viewReminders();
                        break;
                    case 3:
                        modifyReminder();
                        break;
                    case 4:
                        eliminarRecordatory();
                        break;
                    case 5:
                        closeProgram();
                        break;
                    default:
                        throw new InvalidMenuOptionException(opcion);
                }
            } catch (EmptyInputException | InvalidMenuOptionException | InvalidPriorityException
                    | DuplicateReminderException | InvalidReminderDateException e) {
                View.mostrarMensaje("Error: " + e.getMessage());
                opcion = 0;
            } catch (Exception e) {
                View.mostrarMensaje("" + e.getMessage());
                opcion = 0;
            }
        } while (opcion != 5);
    }

    private void addReminder() throws EmptyInputException, InvalidPriorityException, InvalidMenuOptionException,
            DuplicateReminderException, InvalidReminderDateException {
        View.mostrarMensaje("Select the type of reminder to add:");
        View.mostrarMensaje("1. Basic Recordatory");
        View.mostrarMensaje("2. Premium Reminder.");
        int key = View.ingresarDatoInt();
        switch (key) {
            case 1:
                createBasicReminder();
                break;
            case 2:
                createPremiumReminder();
                break;
            default:
                throw new InvalidMenuOptionException(key);
        }
    }

    private void createBasicReminder() throws DuplicateReminderException, InvalidReminderDateException,
        EmptyInputException, InvalidPriorityException {
        String title = obtainASingleCertificate();
        String description = obtainDescripcion();
        LocalDateTime date = obtainValidDate();
        Priority priority = obtainPriority();
        String location = obtainLocation();

        Recordatory basicRecordatory = new RecordatorioBasico();
        basicRecordatory.setTitulo(title);
        basicRecordatory.setDescripcion(description);
        basicRecordatory.setFecha(date.format(DATE_FORMATTER));
        basicRecordatory.setPrioridad(priority);
        basicRecordatory.setUbicacion(location);

        remindersList.add(basicRecordatory);
        View.mostrarMensaje("Basic reminder successfully created.");
    }

    private void createPremiumReminder() throws DuplicateReminderException, InvalidReminderDateException,
            EmptyInputException, InvalidPriorityException {
        String titulo = obtainASingleCertificate();
        String description = obtainDescripcion();
        LocalDateTime date = obtainValidDate();
        Priority priority = obtainPriority();
        String location = obtainLocation();
        int grade = obtainGrade();

        Recordatory recordatorioPremium = new RecordatorioPremium();
        recordatorioPremium.setTitulo(titulo);
        recordatorioPremium.setDescripcion(description);
        recordatorioPremium.setFecha(date.format(DATE_FORMATTER));
        recordatorioPremium.setPrioridad(priority);
        recordatorioPremium.setUbicacion(location);
        recordatorioPremium.setCalificaciones(grade);

        remindersList.add(recordatorioPremium);
        View.mostrarMensaje("Premium reminder successfully created.");
    }

    private String obtainASingleCertificate() throws DuplicateReminderException, EmptyInputException {
        View.mostrarMensaje("Enter the title of the reminder:");
        String titulo = View.ingresarDatoString();

        for (Recordatory r : remindersList) {
            if (r.getTitulo().equals(titulo)) {
                throw new DuplicateReminderException("The title is already in use");
            }
        }
        return titulo;
    }

    private String obtainDescripcion() throws EmptyInputException {
        View.mostrarMensaje("Enter the description:");
        return View.ingresarDatoString();
    }

    private LocalDateTime obtainValidDate() throws InvalidReminderDateException, EmptyInputException {
        View.mostrarMensaje("Enter the date (DD/MM/YYYYYY):");
        String fechaStr = View.ingresarDatoString();
        try {
            LocalDateTime date = LocalDateTime.parse(fechaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy")); // FIXME
            if (date.isBefore(LocalDateTime.now())) {
                throw new InvalidReminderDateException(date);
            }
            return date;
        } catch (DateTimeParseException e) {
            throw new InvalidReminderDateException(null);
        }
    }

    private Priority obtainPriority() throws InvalidPriorityException, EmptyInputException {
        View.mostrarMensaje("Enter the priority (HIGH/MEDIUM/LOW/ NO_PRIORITY):");
        return View.ingresarDatoPrioridad();
    }

    private String obtainLocation() throws EmptyInputException {
        View.mostrarMensaje("Enter the location:");
        return View.ingresarDatoString();
    }

    private void viewReminders() {
        if (remindersList.isEmpty()) {
            View.mostrarMensaje("No reminders are available.");
            return;
        }

        for (Recordatory recordatorio : remindersList) {
            View.mostrarMensaje(recordatorio.toString());
        }
    }

    private void modifyReminder() throws EmptyInputException, InvalidPriorityException,
            DuplicateReminderException, InvalidReminderDateException {
        if (remindersList.isEmpty()) {
            View.mostrarMensaje("There are no reminders to modify.");
            return;
        }

        View.mostrarMensaje("Enter the title of the reminder to be modified:");
        String title = View.ingresarDatoString();
        boolean encontrado = false;

        for (Recordatory recordatorio : remindersList) {
            if (recordatorio.getTitulo().equals(title)) {
                encontrado = true;
                View.mostrarMensaje("Enter the new reminder data:");

                String nuevoTitulo = obtainASingleCertificate();
                String nuevaDescripcion = obtainDescripcion();
                LocalDateTime nuevaFecha = obtainValidDate();
                Priority nuevaPrioridad = obtainPriority();
                String nuevaUbicacion = obtainLocation();

                recordatorio.setTitulo(nuevoTitulo);
                recordatorio.setDescripcion(nuevaDescripcion);
                recordatorio.setFecha(nuevaFecha.format(DATE_FORMATTER));
                recordatorio.setPrioridad(nuevaPrioridad);
                recordatorio.setUbicacion(nuevaUbicacion);

                View.mostrarMensaje("Reminder successfully modified.");
                break;
            }
        }

        if (!encontrado) {
            View.mostrarMensaje("");
        }
    }

    private void eliminarRecordatory() throws EmptyInputException {
        if (remindersList.isEmpty()) {
            View.mostrarMensaje("A reminder with that title was not found.");
            return;
        }

        View.mostrarMensaje("Enter the title of the reminder to delete:");
        String titulo = View.ingresarDatoString();
        Recordatory aEliminar = null;

        for (Recordatory r : remindersList) {
            if (r.getTitulo().equals(titulo)) {
                aEliminar = r;
                break;
            }
        }

        if (aEliminar != null) {
            remindersList.remove(aEliminar);
            View.mostrarMensaje("Reminder successfully removed.");
        } else {
            View.mostrarMensaje("A reminder with that title was not found.");
        }
    }

    private void closeProgram() {
        View.mostrarMensaje("Closed program.");
    }

    

    private int obtainGrade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
