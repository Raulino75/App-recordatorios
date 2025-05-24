package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Home;
import co.edu.konradlorenz.view.View;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static List<Recordatory> remindersList = new ArrayList<>();
    
    private Home home;
    
    public void run(){
        this.home = new Home(this);
        home.setVisible(true);
    }

    public void menuPrincipal() {
        int opcion1;
        do {
            try {
                opcion1 = View.mostrarMenuCuentas();
                switch (opcion1) {
                    case 1:
                        SistemaLogin.registrarUsuario();
                        break;
                    case 2:
                        SistemaLogin.iniciarSesion();
                        break;
                    case 3:
                        closeProgram();
                        break;
                    default:
                        throw new InvalidMenuOptionException(opcion1);
                }
            } catch (EmptyInputException | InvalidMenuOptionException  e) {
                View.mostrarMensaje("Error: " + e.getMessage());
                opcion1 = 0;
            } catch (Exception e) {
                View.mostrarMensaje("" + e.getMessage());
                opcion1 = 0;
            }
        } while (opcion1 != 3);

    }


    public void menuBasico() {
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

    public void addReminder() throws EmptyInputException, InvalidPriorityException, InvalidMenuOptionException,
            DuplicateReminderException, InvalidReminderDateException {
        
        //TODO: CAMBIAR LOGICA DE INSERCION DE DATOS Y MANEJO DE EXCEPCIONES
//        try
//        String titulo = home.txtAreaTitulo.getText();
//        
//        if (titulo is null){
//            throw EmptyInputException;
//           }
//        catch (EmptyInputException e){
//                //asdihask
//                }
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

        RecordatorioPremium recordatorioPremium = new RecordatorioPremium();
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
        boolean validDate = false;
        LocalDate date = null;
        
        while (!validDate) {
            View.mostrarMensaje("Enter the date (DD/MM/YYYY):");
            String fechaStr = View.ingresarDatoString();
            try {
                date = LocalDate.parse(fechaStr, DATE_FORMATTER);
                if (date.isBefore(LocalDate.now())) {
                    View.mostrarMensaje("The date cannot be in the past. Please try again.");
                    continue;
                }
                validDate = true;
            } catch (DateTimeParseException e) {
                View.mostrarMensaje("Invalid date format. Please use DD/MM/YYYY format.");
            }
        }
        return date.atStartOfDay(); // Convert LocalDate to LocalDateTime at start of day
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

        boolean encontrado = false;
        Recordatory recordatorioAModificar = null;

        while (!encontrado) {
            try {
                View.mostrarMensaje("Enter the title of the reminder to be modified:");
                String title = View.ingresarDatoString();

                for (Recordatory recordatorio : remindersList) {
                    if (recordatorio.getTitulo().equals(title)) {
                        encontrado = true;
                        recordatorioAModificar = recordatorio;
                        break;
                    }
                }

                if (!encontrado) {
                    throw new ReminderNotFoundException("Reminder with title '" + title + "' not found.");
                }
            } catch (ReminderNotFoundException e) {
                View.mostrarMensaje(e.getMessage() + " Please try again.");
            }
        }

        View.mostrarMensaje("Enter the new reminder data:");
        String nuevoTitulo = obtainASingleCertificate();
        String nuevaDescripcion = obtainDescripcion();
        LocalDateTime nuevaFecha = obtainValidDate();
        Priority nuevaPrioridad = obtainPriority();
        String nuevaUbicacion = obtainLocation();

        recordatorioAModificar.setTitulo(nuevoTitulo);
        recordatorioAModificar.setDescripcion(nuevaDescripcion);
        recordatorioAModificar.setFecha(nuevaFecha.format(DATE_FORMATTER));
        recordatorioAModificar.setPrioridad(nuevaPrioridad);
        recordatorioAModificar.setUbicacion(nuevaUbicacion);

        View.mostrarMensaje("Reminder successfully modified.");
    }    private void eliminarRecordatory() throws EmptyInputException {
        if (remindersList.isEmpty()) {
            View.mostrarMensaje("There are no reminders to delete.");
            return;
        }

        boolean encontrado = false;
        Recordatory recordatorioAEliminar = null;

        while (!encontrado) {
            try {
                View.mostrarMensaje("Enter the title of the reminder to delete:");
                String titulo = View.ingresarDatoString();

                for (Recordatory r : remindersList) {
                    if (r.getTitulo().equals(titulo)) {
                        encontrado = true;
                        recordatorioAEliminar = r;
                        break;
                    }
                }

                if (!encontrado) {
                    throw new ReminderNotFoundException(titulo);
                }
            } catch (ReminderNotFoundException e) {
                View.mostrarMensaje(e.getMessage() + " Please try again.");
            }
        }

        remindersList.remove(recordatorioAEliminar);
        View.mostrarMensaje("Reminder successfully removed.");
    }

    private void closeProgram() {
        View.mostrarMensaje("Closed program.");
    }

    

    private int obtainGrade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
