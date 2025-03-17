package co.edu.konradlorenz.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionamiento {

    Scanner sc3 = new Scanner(System.in);
    
    static List<Recordatorio> ListaRecordatorios = new ArrayList<>();

    public void AgregarRecordatorio() {
        ListaRecordatorios.add(e);
    }

    public void MostrarRecordatorios() {
        System.out.println(ListaRecordatorios);
    }

    public void EliminarRecordatorio() {
        ListaRecordatorios.remove(sc3.nextInt());
    }

    public void ModificarRecordatorios() {
        ListaRecordatorios.set(sc3.nextInt(), sc3.nextLine());
    }
       public static void crearRecordatorio(String titulo, String descripcion, String fecha, String prioridad, String estado)
            {
        // Crear un nuevo recordatorio
        Recordatorio nuevoRecordatorio = new Recordatorio(titulo, descripcion, fecha, prioridad, estado);

        // Agregar el recordatorio a la lista
        ListaRecordatorios.add(nuevoRecordatorio);
    }
}
