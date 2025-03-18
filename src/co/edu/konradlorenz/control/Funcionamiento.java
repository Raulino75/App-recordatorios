package co.edu.konradlorenz.control;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;
import java.util.ArrayList;
import java.util.List;

public class Funcionamiento {

    Ventana menu = new Ventana();
    static List<Recordatorio> listaRecordatorios = new ArrayList<>();

    public void run() {

        String opcion;
      

        menu.mostrarMensaje("Ingrese su nombre");
        String nombre = menu.pedirDato();
        menu.mostrarMensaje("Bienvenido " + nombre + ", seleccione una opcion");
        String opcion2;

        do {
            menu.mostrarMensaje("-------Menu-------");
            menu.mostrarMensaje("1.  Agregar recordatorio");
            menu.mostrarMensaje("2. Ver recordatorios");
            menu.mostrarMensaje("4. Cerrar programa");

            opcion = menu.pedirDato();
            switch (opcion) {
                case "1":
                    menu.mostrarMensaje("1.  Agregar recordatorio");
                    agregarRecordatorio();
                    break;
                case "2":
                    menu.mostrarMensaje("2. Ver recordatorios");
                    mostrarRecordatorios();
                    menu.mostrarMensaje("1. Modificar recordatorio");
                    menu.mostrarMensaje("2. Eliminar recordatorio");
                    menu.mostrarMensaje("3. Regresar");
                    opcion2 = menu.pedirDato();

                    switch (opcion2) {
                        case "1":
                            menu.mostrarMensaje("Cambie el recordatorio");
                            modificarRecordatorio();
                            break;
                        case "2":
                            menu.mostrarMensaje("Seleccione el recordatorio a BORRAR");
                            eliminarRecordatorio();
                            break;
                        case "3":
                            break;
                    }
                    break;

                case "4":
                    menu.mostrarMensaje("4. Cerrar programa");
                default:
                    menu.mostrarMensaje("Comando invalido");
                    break;
            }
        } while (!opcion.equals("4"));
    }

    public void agregarRecordatorio() {
        menu.mostrarMensaje("Ingrese el titulo, descripcion, fecha, priordad y estado del RECORDATORIO");
        crearRecordatorio(menu.pedirDato(), menu.pedirDato(), menu.pedirDato(), menu.pedirDato(), menu.pedirDato());
    }

    public void mostrarRecordatorios() {
        if (listaRecordatorios.isEmpty()) {
            menu.mostrarMensaje("No hay recordatorios");
        } else {
            for (Recordatorio listaRecordatorio : listaRecordatorios) {
                menu.mostrarMensaje(listaRecordatorio.toString());
            }

        }
    }

    public void eliminarRecordatorio() {
        listaRecordatorios.remove(menu.pedirEntero());
    }

    public void modificarRecordatorio() {
        mostrarRecordatorios();
        menu.mostrarMensaje("Ingrese el índice del recordatorio a modificar: ");

        int indice = menu.pedirEntero();
        menu.pedirDato();

        if (indice >= 0 && indice < listaRecordatorios.size()) {
            menu.mostrarMensaje("Ingrese el nuevo título: ");
            String nuevoTitulo = menu.pedirDato();
            menu.mostrarMensaje("Ingrese la nueva descripción: ");
            String nuevaDescripcion = menu.pedirDato();
            menu.mostrarMensaje("Ingrese la nueva fecha: ");
            String nuevaFecha = menu.pedirDato();
            menu.mostrarMensaje("Ingrese la nueva prioridad: ");
            String nuevaPrioridad = menu.pedirDato();
            menu.mostrarMensaje("Ingrese el nuevo estado: ");
            String nuevoEstado = menu.pedirDato();

            Recordatorio nuevoRecordatorio = new Recordatorio(nuevoTitulo, nuevaDescripcion, nuevaFecha, nuevaPrioridad, nuevoEstado);

            listaRecordatorios.set(indice, nuevoRecordatorio);
            menu.mostrarMensaje("Recordatorio modificado correctamente.");
        } else {
            menu.mostrarMensaje("Índice inválido.");
        }
    }

    public static void crearRecordatorio(String titulo, String descripcion, String fecha, String prioridad, String estado) {

        Recordatorio nuevoRecordatorio = new Recordatorio(titulo, descripcion, fecha, prioridad, estado);

        listaRecordatorios.add(nuevoRecordatorio);
    }

}
