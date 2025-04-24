package co.edu.konradlorenz.view;

import co.edu.konradlorenz.model.*;
import java.util.*;
import java.util.Scanner;

public class Ventana {

    private Scanner scanner = new Scanner(System.in);

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static int ingresarDatoInt() {
        int dato = 0;
        try {
            Ventana v = new Ventana();
            dato = v.scanner.nextInt();
        } catch (InputMismatchException e) {
            mostrarMensaje("Tipo de dato nulo");
        } catch (Exception e) {
            mostrarMensaje("Error al guardar la variable tipo entero");
        }
        return dato;

    }

    public static String ingresarDatoString() {
        String dato = null;
        try {
            Ventana v = new Ventana();
            dato = v.scanner.nextLine();
        } catch (NullPointerException e) {
            mostrarMensaje("Tipo de dato nulo");
        } catch (Exception e) {
            mostrarMensaje("Error al guardar la variable String");
        }
        return dato;
    }

    public static Prioridad ingresarDatoPrioridad() {
        Ventana v = new Ventana();
        for (Prioridad prioridad : Prioridad.values()) {
            System.out.println(prioridad);
        }
        String dato = v.scanner.nextLine().toUpperCase();
        Prioridad prioridad = Prioridad.SIN_PRIORIDAD;
        try {
            prioridad = Prioridad.valueOf(dato);
        } catch (IllegalArgumentException e) {
            mostrarMensaje("Valor no valido para enum prioridad");
        } catch (NullPointerException e) {
            mostrarMensaje("El valor ingresado es nulo");
        } catch (Exception e) {
            mostrarMensaje("Error desconocido al guardadr valor de enum prioridad");
        } finally {
            mostrarMensaje("Prioridad guardada como: " + prioridad);
        }

        return prioridad;
    }

    public static int mostrarMenuPrincipal() {
        mostrarMensaje("\n\n\n-------Menu-------");
        mostrarMensaje("1. Agregar recordatorio");
        mostrarMensaje("2. Ver recordatorios");
        mostrarMensaje("3. Modificar recordatorio");
        mostrarMensaje("4. Eliminar recordatorio");
        mostrarMensaje("5. Cerrar programa");
        mostrarMensaje("\n Seleccione una opción");
        return ingresarDatoInt();
    }
}
