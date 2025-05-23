package co.edu.konradlorenz.view;

import co.edu.konradlorenz.controller.Controller;
import co.edu.konradlorenz.model.*;
import java.time.LocalTime;
import java.util.*;

public class View {

    private static final Scanner scanner = new Scanner(System.in);

    private static LocalTime currentTime = LocalTime.now();
    private static LocalTime timeLimit = LocalTime.of(12, 0);

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static int ingresarDatoInt() throws EmptyInputException {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new EmptyInputException("número");
                }
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                mostrarMensaje("Error: Ingrese un número válido");
                mostrarMensaje("Intente nuevamente:");
            } catch (EmptyInputException e) {
                mostrarMensaje("Error: " + e.getMessage());
                mostrarMensaje("Intente nuevamente:");
            }
        }
    }

    public static String ingresarDatoString() throws EmptyInputException {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new EmptyInputException("texto");
                }
                return input;
            } catch (EmptyInputException e) {
                mostrarMensaje("Error: " + e.getMessage());
                mostrarMensaje("Intente nuevamente:");
            }
        }
    }

    public static Priority ingresarDatoPrioridad() throws InvalidPriorityException, EmptyInputException {
        while (true) {
            try {
                mostrarMensaje("Prioridades disponibles:");
                for (Priority prioridad : Priority.values()) {
                    mostrarMensaje("- " + prioridad.name());
                }

                String input = scanner.nextLine().trim().toUpperCase();
                if (input.isEmpty()) {
                    throw new EmptyInputException("prioridad");
                }

                try {
                    Priority prioridad = Priority.valueOf(input);
                    mostrarMensaje("Prioridad seleccionada: " + prioridad);
                    return prioridad;
                } catch (IllegalArgumentException e) {
                    throw new InvalidPriorityException(input);
                }

            } catch (EmptyInputException | InvalidPriorityException e) {
                mostrarMensaje("Error: " + e.getMessage());
                mostrarMensaje("Intente nuevamente con alguna de las opciones listadas:");
            }
        }
    }

    public static String ingresarFecha() throws InvalidReminderDateException, EmptyInputException {
        while (true) {
            try {
                mostrarMensaje("Ingrese la fecha en formato DD/MM/YYYY:");
                String fecha = ingresarDatoString();
                if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
                    throw new InvalidReminderDateException(null);
                }
                return fecha;
            } catch (InvalidReminderDateException e) {
                mostrarMensaje("Error: Formato de fecha inválido. Use DD/MM/YYYY");
                mostrarMensaje("Intente nuevamente:");
            }
        }
    }
    public static int mostrarMenuCuentas() {
        while (true) {
            try {
                mostrarMensaje("\n=== Bienvenido ===");
                mostrarMensaje("1. Registrarse");
                mostrarMensaje("2. Inicia sesión");
                mostrarMensaje("3. Salir");
                
                mostrarMensaje("\nSeleccione una opción (1-3):");

                int opcion = ingresarDatoInt();
                if (opcion < 1 || opcion > 5) {
                    throw new IllegalArgumentException("Opción fuera de rango");
                }
                return opcion;

            } catch (IllegalArgumentException e) {
                mostrarMensaje("Error: Seleccione una opción entre 1 y 5");
            } catch (EmptyInputException e) {
                mostrarMensaje("Error: " + e.getMessage());
            }
        }
    }
    
    public static int mostrarMenuPrincipal() {
        while (true) {
            try {
                String time;
                if (currentTime.isBefore(timeLimit)) {
                    time = "Good Morning. Welcome to Ding!";
//                    mostrarMensaje(time);
                } else {
                    time = "Good Afternoon. Welcome to Ding!";
                }
                mostrarMensaje(time);
                mostrarMensaje("\n=== SISTEMA DE RECORDATORIOS BASICOS===");
                mostrarMensaje("1. Agregar recordatorio");
                mostrarMensaje("2. Ver recordatorios");
                mostrarMensaje("3. Modificar recordatorio");
                mostrarMensaje("4. Eliminar recordatorio");
                mostrarMensaje("5. Cerrar programa");
                mostrarMensaje("\nSeleccione una opción (1-5):");

                int opcion = ingresarDatoInt();
                if (opcion < 1 || opcion > 5) {
                    throw new IllegalArgumentException("Opción fuera de rango");
                }
                return opcion;

            } catch (IllegalArgumentException e) {
                mostrarMensaje("Error: Seleccione una opción entre 1 y 5");
            } catch (EmptyInputException e) {
                mostrarMensaje("Error: " + e.getMessage());
            }
        }
    }

}
