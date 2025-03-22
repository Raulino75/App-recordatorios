
package co.edu.konradlorenz.control;

import co.edu.konradlorenz.view.*;
import java.util.Scanner;


public class Menu {
     public void Mostrarmenu1() {
        String opcion;
        Scanner sc2 = new Scanner(System.in);
        Funcionamiento recordatorio = new Funcionamiento();
        Scanner sc = new Scanner(System.in);
        Ventana ventana = new Ventana();
        ventana.mostrarMensaje("Ingrese su nombre");
        String nombre = sc.nextLine();
        ventana.mostrarMensaje("Bienvenido " + nombre + ", seleccione una opcion");
        String opcion2;

        do {
            System.out.println("-------Menu-------");
            System.out.println("1.  Agregar recordatorio");
            System.out.println("2. Ver recordatorios");
            System.out.println("4. Cerrar programa");

            opcion = sc2.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("1.  Agregar recordatorio");
                    recordatorio.agregarRecordatorio();
                    break;
                case "2":
                    System.out.println("2. Ver recordatorios");
                    recordatorio.mostrarRecordatorios();
                    System.out.println("1. Modificar recordatorio");
                    System.out.println("2. Eliminar recordatorio");
                    System.out.println("3. Regresar");
                    opcion2 = sc2.nextLine();

                    switch (opcion2) {
                        case "1":
                            System.out.println("Cambie el recordatorio");
                            recordatorio.modificarRecordatorio();
                            break;
                        case "2":
                            System.out.println("Seleccione el recordatorio a BORRAR");
                            recordatorio.eliminarRecordatorio();
                            break;
                        case "3":
                            break;
                    }
                    break;

                case "4":
                    System.out.println("4. Cerrar programa");
                default:
                    System.out.println("Comando invalido");
                    break;
            }
        } while (!opcion.equals("4"));
    }
}
