package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
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
                case 1:// AGREGA RECORDATORIO
                    agregarRecordatorio();
                    break;
                case 2:// ver recordatorios
                    verRecordatorios();
                    break;
                case 3:// modificar recordatorio
                    modificarRecordatorio();
                    break;
                case 4:// eliminar recordatorio
                    eliminarRecordatorio();
                    break;
                case 5:// Cerrar programa
                    cerrarPrograma();
                    break;
                default:
                    Ventana.mostrarMensaje("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }

    public void agregarRecordatorio() {
        Ventana.mostrarMensaje("Seleccione el tipo de recordatorio a agregar:");
        Ventana.mostrarMensaje("1. Recordatorio Basico");
        Ventana.mostrarMensaje("2. Recordatorio Premium");
        int key = Ventana.ingresarDatoInt();
        switch (key) {
            case 1:
                crearRecordatorioBasico();
                break;
            case 2:
                crearRecordatorioPremium();
                break;
            default:
                Ventana.mostrarMensaje("Opción no válida.");
                break;
        }
    }

    public void crearRecordatorioBasico() {
        Ventana.mostrarMensaje("Ingrese el título del recordatorio:");
        String titulo = Ventana.ingresarDatoString();

        Ventana.mostrarMensaje("Ingrese la descripción:");
        String descripcion = Ventana.ingresarDatoString();

        Ventana.mostrarMensaje("Ingrese la fecha (DD/MM/YYYY):");
        String fecha = Ventana.ingresarDatoString();

        Ventana.mostrarMensaje("Ingrese la prioridad (ALTA/MEDIA/BAJA/SIN_PRIORIDAD):");
        Prioridad prioridad = Ventana.ingresarDatoPrioridad();

        Ventana.mostrarMensaje("Ingrese la ubicación:");
        String ubicacion = Ventana.ingresarDatoString();

        Recordatorio recordatorioBasico = new RecordatorioBasico();
        recordatorioBasico.setTitulo(titulo);
        recordatorioBasico.setDescripcion(descripcion);
        recordatorioBasico.setFecha(fecha);
        recordatorioBasico.setPrioridad(prioridad);
        recordatorioBasico.setUbicacion(ubicacion);

        listaRecordatorios.add(recordatorioBasico);
        Ventana.mostrarMensaje("Recordatorio básico creado exitosamente.");
    }

    public void crearRecordatorioPremium() {
        Ventana.mostrarMensaje("Ingrese el título del recordatorio:");
        String titulo = Ventana.ingresarDatoString();

        Ventana.mostrarMensaje("Ingrese la descripción:");
        String descripcion = Ventana.ingresarDatoString();

        Ventana.mostrarMensaje("Ingrese la fecha (DD/MM/YYYY):");
        String fecha = Ventana.ingresarDatoString();

        Ventana.mostrarMensaje("Ingrese la prioridad (ALTA/MEDIA/BAJA/SIN_PRIORIDAD):");
        Prioridad prioridad = Ventana.ingresarDatoPrioridad();

        Ventana.mostrarMensaje("Ingrese la ubicación:");
        String ubicacion = Ventana.ingresarDatoString();

        Recordatorio recordatorioPremium = new RecordatorioPremium();
        recordatorioPremium.setTitulo(titulo);
        recordatorioPremium.setDescripcion(descripcion);
        recordatorioPremium.setFecha(fecha);
        recordatorioPremium.setPrioridad(prioridad);
        recordatorioPremium.setUbicacion(ubicacion);

        listaRecordatorios.add(recordatorioPremium);
        Ventana.mostrarMensaje("Recordatorio premium creado exitosamente.");
    }

    private void verRecordatorios() {
        if (listaRecordatorios.isEmpty()) {
            Ventana.mostrarMensaje("No hay recordatorios disponibles.");
        } else {
            for (Recordatorio recordatorio : listaRecordatorios) {
                Ventana.mostrarMensaje(recordatorio.toString());
            }
        }
    }

    public void modificarRecordatorio() {
        Ventana.mostrarMensaje("Ingrese el titulo del recordatorio a modificar");
        String titulo = Ventana.ingresarDatoString();
        for (Recordatorio recordatorio : listaRecordatorios) {
            if (recordatorio.getTitulo().equals(titulo)) {
                Ventana.mostrarMensaje(
                        "Ingrese el nuevo titulo, descripcion, fecha, prioridad y ubicacion del RECORDATORIO");
                String nuevoTitulo = Ventana.ingresarDatoString();
                String nuevaDescripcion = Ventana.ingresarDatoString();
                String nuevaFecha = Ventana.ingresarDatoString();
                Prioridad nuevaPrioridad = Ventana.ingresarDatoPrioridad();
                String nuevaUbicacion = Ventana.ingresarDatoString();

                recordatorio.setTitulo(nuevoTitulo);
                recordatorio.setDescripcion(nuevaDescripcion);
                recordatorio.setFecha(nuevaFecha);
                recordatorio.setPrioridad(nuevaPrioridad);
                recordatorio.setUbicacion(nuevaUbicacion);

                Ventana.mostrarMensaje("Recordatorio modificado exitosamente.");
            } else {
                Ventana.mostrarMensaje("No se encontró un recordatorio con ese título.");
            }
        }
    }

    public void eliminarRecordatorio() {
        Ventana.mostrarMensaje("Ingrese el título del recordatorio a eliminar:");
        String titulo = Ventana.ingresarDatoString();
        boolean encontrado = false;
        for (Recordatorio recordatorio : listaRecordatorios) {
            if (recordatorio.getTitulo().equals(titulo)) {
                listaRecordatorios.remove(recordatorio);
                Ventana.mostrarMensaje("Recordatorio eliminado exitosamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            Ventana.mostrarMensaje("No se encontró un recordatorio con ese título.");
        }
    }

    private void cerrarPrograma() {
        Ventana.mostrarMensaje("Programa cerrado.");

    }

}
