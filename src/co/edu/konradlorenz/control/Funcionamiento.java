package co.edu.konradlorenz.control;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionamiento {

    private Scanner sc3 = new Scanner(System.in);
    Ventana menu = new Ventana();
    static List<Recordatorio> ListaRecordatorios = new ArrayList<>();

    public void AgregarRecordatorio() {
        menu.MostrarMensaje("Ingrese el titulo, descripcion, fecha, priordad y estado del RECORDATORIO");
        crearRecordatorio(sc3.nextLine(), sc3.nextLine(), sc3.nextLine(), sc3.nextLine(), sc3.nextLine());
    }

    public void MostrarRecordatorios() {
        if (ListaRecordatorios.isEmpty()) {
            menu.MostrarMensaje("No hay recordatorios");
        } else {
            System.out.println(ListaRecordatorios);

        }
    }

    public void EliminarRecordatorio() {
        ListaRecordatorios.remove(sc3.nextInt());
    }

    public void ModificarRecordatorio() {
        MostrarRecordatorios();
        menu.MostrarMensaje("Ingrese el índice del recordatorio a modificar: ");

        int indice = sc3.nextInt();
        sc3.nextLine();

        if (indice >= 0 && indice < ListaRecordatorios.size()) {
            menu.MostrarMensaje("Ingrese el nuevo título: ");
            String nuevoTitulo = sc3.nextLine();
            menu.MostrarMensaje("Ingrese la nueva descripción: ");
            String nuevaDescripcion = sc3.nextLine();
            menu.MostrarMensaje("Ingrese la nueva fecha: ");
            String nuevaFecha = sc3.nextLine();
            menu.MostrarMensaje("Ingrese la nueva prioridad: ");
            String nuevaPrioridad = sc3.nextLine();
            menu.MostrarMensaje("Ingrese el nuevo estado: ");
            String nuevoEstado = sc3.nextLine();

            Recordatorio nuevoRecordatorio = new Recordatorio(nuevoTitulo, nuevaDescripcion, nuevaFecha, nuevaPrioridad, nuevoEstado);

            ListaRecordatorios.set(indice, nuevoRecordatorio);
            menu.MostrarMensaje("Recordatorio modificado correctamente.");
        } else {
            menu.MostrarMensaje("Índice inválido.");
        }
    }

    public static void crearRecordatorio(String titulo, String descripcion, String fecha, String prioridad, String estado) {

        Recordatorio nuevoRecordatorio = new Recordatorio(titulo, descripcion, fecha, prioridad, estado);

        ListaRecordatorios.add(nuevoRecordatorio);
    }
    
}
