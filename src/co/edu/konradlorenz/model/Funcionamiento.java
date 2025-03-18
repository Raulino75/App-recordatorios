package co.edu.konradlorenz.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionamiento {

    private Scanner sc3 = new Scanner(System.in);

    static List<Recordatorio> ListaRecordatorios = new ArrayList<>();

    public void AgregarRecordatorio() {
        System.out.println("Ingrese el titulo, descripcion, fecha, priordad y estado del RECORDATORIO");
        crearRecordatorio(sc3.nextLine(), sc3.nextLine(), sc3.nextLine(), sc3.nextLine(), sc3.nextLine());
    }

    public void MostrarRecordatorios() {
        if (ListaRecordatorios.isEmpty()) {
            System.out.println("No hay recordatorios");
        } else {
            System.out.println(ListaRecordatorios);

        }
    }

    public void EliminarRecordatorio() {
        ListaRecordatorios.remove(sc3.nextInt());
    }

    public void ModificarRecordatorio() {
        MostrarRecordatorios();
        System.out.print("Ingrese el índice del recordatorio a modificar: ");
        int indice = sc3.nextInt();
        sc3.nextLine();

        if (indice >= 0 && indice < ListaRecordatorios.size()) {
            System.out.print("Ingrese el nuevo título: ");
            String nuevoTitulo = sc3.nextLine();
            System.out.print("Ingrese la nueva descripción: ");
            String nuevaDescripcion = sc3.nextLine();
            System.out.print("Ingrese la nueva fecha: ");
            String nuevaFecha = sc3.nextLine();
            System.out.print("Ingrese la nueva prioridad: ");
            String nuevaPrioridad = sc3.nextLine();
            System.out.print("Ingrese el nuevo estado: ");
            String nuevoEstado = sc3.nextLine();

            Recordatorio nuevoRecordatorio = new Recordatorio(nuevoTitulo, nuevaDescripcion, nuevaFecha, nuevaPrioridad, nuevoEstado);

            ListaRecordatorios.set(indice, nuevoRecordatorio);
            System.out.println("Recordatorio modificado correctamente.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void crearRecordatorio(String titulo, String descripcion, String fecha, String prioridad, String estado) {

        Recordatorio nuevoRecordatorio = new Recordatorio(titulo, descripcion, fecha, prioridad, estado);

        ListaRecordatorios.add(nuevoRecordatorio);
    }
}
