package co.edu.konradlorenz.view;

import co.edu.konradlorenz.model.*;
import java.util.Scanner;

public class Ventana {
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static int ingresarDatoInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String ingresarDatoString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Prioridad ingresarDatoPrioridad() {
        Scanner scanner = new Scanner(System.in);
        for (Prioridad prioridad : Prioridad.values()) {
            System.out.println(prioridad);
        }
        String dato = scanner.nextLine().toUpperCase();
        return Prioridad.valueOf(dato);
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
