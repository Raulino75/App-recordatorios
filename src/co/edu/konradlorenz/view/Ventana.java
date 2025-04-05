package co.edu.konradlorenz.view;

import co.edu.konradlorenz.model.*;
import java.util.Scanner;

public class Ventana {

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static int ingresarDatoInt() {
        Scanner sc = new Scanner(System.in);
        int dato = sc.nextInt();
        sc.close();
        return dato;

    }

    public static String ingresarDatoString() {
        Scanner sc = new Scanner(System.in);
        String dato = sc.nextLine();
        sc.close();
        return dato;

    }

    public static Prioridad ingresarDatoPrioridad() {
        Scanner sc = new Scanner(System.in);
        for (Prioridad prioridad : Prioridad.values()) {
            System.out.println(prioridad);
        }
        String dato = sc.nextLine().toUpperCase();
        Prioridad prioridadSeleccionada = Prioridad.valueOf(dato);
        sc.close();
        return prioridadSeleccionada;
    }

    public static int mostrarMenuPrincipal() {
        mostrarMensaje("-------Menu-------");
        mostrarMensaje("1. Agregar recordatorio");
        mostrarMensaje("2. Ver recordatorios");
        mostrarMensaje("4. Cerrar programa");
        mostrarMensaje("\n Seleccione una opción");
        return ingresarDatoInt();
    }

}
