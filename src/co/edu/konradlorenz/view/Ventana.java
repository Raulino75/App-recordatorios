package co.edu.konradlorenz.view;

import co.edu.konradlorenz.control.Funcionamiento;
import co.edu.konradlorenz.model.*;
import java.util.Scanner;

public class Ventana {

    public void Mostrarmenu1() {
        String opcion;
        Scanner sc2 = new Scanner(System.in);
        Funcionamiento recordatorio = new Funcionamiento();
        Scanner sc = new Scanner(System.in);

        MostrarMensaje("Ingrese su nombre");
        String nombre = sc.nextLine();
        MostrarMensaje("Bienvenido " + nombre + ", seleccione una opcion");
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
                    recordatorio.AgregarRecordatorio();
                    break;
                case "2":
                    System.out.println("2. Ver recordatorios");
                    recordatorio.MostrarRecordatorios();
                    System.out.println("1. Modificar recordatorio");
                    System.out.println("2. Eliminar recordatorio");
                    System.out.println("3. Regresar");
                    opcion2 = sc2.nextLine();

                    switch (opcion2) {
                        case "1":
                            System.out.println("Cambie el recordatorio");
                            recordatorio.ModificarRecordatorio();
                            break;
                        case "2":
                            System.out.println("Seleccione el recordatorio a BORRAR");
                            recordatorio.EliminarRecordatorio();
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

    public void MostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
