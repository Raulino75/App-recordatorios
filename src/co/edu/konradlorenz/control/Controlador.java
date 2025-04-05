package co.edu.konradlorenz.control;

import co.edu.konradlorenz.model.Prioridad;
import co.edu.konradlorenz.model.Recordatorio;
import co.edu.konradlorenz.view.Ventana;
import java.util.ArrayList;
import java.util.List;

public class Controlador {

    public static List<Recordatorio> listaRecordatorios = new ArrayList<>();

    void run() {
        int opcion;
        do {
            opcion = Ventana.mostrarMenuPrincipal();
            switch (opcion) {
                case 1://AGREGA RECORDATORIO
                    agregarRecordatorio();
                    break;
                case 2://ver recordatorios
                    verRecordatorios();
                    break;
//                case 3://POR DEFINIR
//                    break;
                case 4://Cerrar programa
                    cerrarPrograma();
                    break;
                default:
                    break;
            }
        } while (true);
    }

    public void agregarRecordatorio() {
        boolean comprobacion = true;
        Ventana.mostrarMensaje("Ingrese el titulo, descripcion, fecha, priordad y estado del RECORDATORIO");
        String titulo = Ventana.ingresarDatoString();
        String descripcion = Ventana.ingresarDatoString();
        String fecha = Ventana.ingresarDatoString();
        Prioridad prioridad = Prioridad.SIN_PRIORIDAD;
        while (comprobacion) {
             prioridad = Ventana.ingresarDatoPrioridad();
        }
        String ubicacion = Ventana.ingresarDatoString();
        Recordatorio nuevoRecordatorio = new Recordatorio(titulo, descripcion, fecha, prioridad, ubicacion);
        listaRecordatorios.add(nuevoRecordatorio);
    }

    private void verRecordatorios() {
         // TODO: Llenar 
    }

    private void cerrarPrograma() {
         // TODO: Llenar 
    }
}
