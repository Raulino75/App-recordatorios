package co.edu.konradlorenz.control;

import co.edu.konradlorenz.view.*;
import java.util.Scanner;

public class Menu {

    public void Mostrarmenu1() {

        Funcionamiento recordatorio = new Funcionamiento();

        Ventana ventana = new Ventana();
        ventana.mostrarMensaje("Ingrese su nombre");
        String nombre = Ventana.ingresarDatoString();
        ventana.mostrarMensaje("Bienvenido " + nombre + ", seleccione una opcion");
        String opcion2;

        do {

            
            switch (opcion) {
                case 1:
                    Ventana.mostrarMensaje("1.  Agregar recordatorio");
                    recordatorio.agregarRecordatorio();
                    break;
                case 2:
                    Ventana.mostrarMensaje("2. Ver recordatorios");
                    recordatorio.mostrarRecordatorios();
                    Ventana.mostrarMensaje("1. Modificar recordatorio");
                    Ventana.mostrarMensaje("2. Eliminar recordatorio");
                    Ventana.mostrarMensaje("3. Regresar");
                    opcion2 = sc2.nextLine();

                    switch (opcion2) {
                        case "1":
                            Ventana.mostrarMensaje("Cambie el recordatorio");
                            recordatorio.modificarRecordatorio();
                            break;
                        case "2":
                            Ventana.mostrarMensaje("Seleccione el recordatorio a BORRAR");
                            recordatorio.eliminarRecordatorio();
                            break;
                        case "3":
                            break;
                    }
                    break;

                case "4":
                    Ventana.mostrarMensaje("4. Cerrar programa");
                default:
                    Ventana.mostrarMensaje("Comando invalido");
                    break;
            }
        } while (!opcion.equals("4"));
    }
}
