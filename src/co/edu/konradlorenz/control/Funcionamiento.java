package co.edu.konradlorenz.control;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionamiento {

    

    

    public void mostrarRecordatorios() {
        if (ListaRecordatorios.isEmpty()) {
            Ventana.mostrarMensaje("No hay recordatorios");
        } else {
            System.out.println(ListaRecordatorios);

        }
    }

    public void eliminarRecordatorio() {
        ListaRecordatorios.remove(Ventana.ingresarDatoInt());
    }

    public void modificarRecordatorio() {
        mostrarRecordatorios();
        Ventana.mostrarMensaje("Ingrese el índice del recordatorio a modificar: ");

        int indice = Ventana.ingresarDatoInt();
        Ventana.ingresarDatoString();

        if (indice >= 0 && indice < ListaRecordatorios.size()) {
            Ventana.mostrarMensaje("Ingrese el nuevo título: ");
            String nuevoTitulo = Ventana.ingresarDatoString();
            Ventana.mostrarMensaje("Ingrese la nueva descripción: ");
            String nuevaDescripcion = Ventana.ingresarDatoString();
            Ventana.mostrarMensaje("Ingrese la nueva fecha: ");
            String nuevaFecha = Ventana.ingresarDatoString();
            Ventana.mostrarMensaje("Ingrese la nueva prioridad: ");
            String nuevaPrioridad = Ventana.ingresarDatoString();
            Ventana.mostrarMensaje("Ingrese el nuevo estado: ");
            String nuevoEstado = Ventana.ingresarDatoString();

            Recordatorio nuevoRecordatorio = new Recordatorio(nuevoTitulo, nuevaDescripcion, nuevaFecha, nuevaPrioridad, nuevoEstado);

            ListaRecordatorios.set(indice, nuevoRecordatorio);
            Ventana.mostrarMensaje("Recordatorio modificado correctamente.");
        } else {
            Ventana.mostrarMensaje("Índice inválido.");
        }
    }

   

}
