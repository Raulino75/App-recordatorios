package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Ventana;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Controlador {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static List<Recordatorio> listaRecordatorios = new ArrayList<>();

    public void run() {
        int opcion;
        do {
            try {
                opcion = Ventana.mostrarMenuPrincipal();
                switch (opcion) {
                    case 1:
                        agregarRecordatorio();
                        break;
                    case 2:
                        verRecordatorios();
                        break;
                    case 3:
                        modificarRecordatorio();
                        break;
                    case 4:
                        eliminarRecordatorio();
                        break;
                    case 5:
                        cerrarPrograma();
                        break;
                    default:
                        throw new InvalidMenuOptionException(opcion);
                }
            } catch (EmptyInputException | InvalidMenuOptionException | InvalidPriorityException | 
                     DuplicateReminderException | InvalidReminderDateException e) {
                Ventana.mostrarMensaje("Error: " + e.getMessage());
                opcion = 0;
            } catch (Exception e) {
                Ventana.mostrarMensaje("Error inesperado: " + e.getMessage());
                opcion = 0;
            }
        } while (opcion != 5);
    }

    private void agregarRecordatorio() throws EmptyInputException, InvalidPriorityException, InvalidMenuOptionException, 
            DuplicateReminderException, InvalidReminderDateException {
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
                throw new InvalidMenuOptionException(key);
        }
    }

    private void crearRecordatorioBasico() throws DuplicateReminderException, InvalidReminderDateException, 
            EmptyInputException, InvalidPriorityException {
        String titulo = obtenerTituloUnico();
        String descripcion = obtenerDescripcion();
        LocalDateTime fecha = obtenerFechaValida();
        Prioridad prioridad = obtenerPrioridad();
        String ubicacion = obtenerUbicacion();

        Recordatorio recordatorioBasico = new RecordatorioBasico();
        recordatorioBasico.setTitulo(titulo);
        recordatorioBasico.setDescripcion(descripcion);
        recordatorioBasico.setFecha(fecha.format(DATE_FORMATTER));
        recordatorioBasico.setPrioridad(prioridad);
        recordatorioBasico.setUbicacion(ubicacion);

        listaRecordatorios.add(recordatorioBasico);
        Ventana.mostrarMensaje("Recordatorio básico creado exitosamente.");
    }

    private void crearRecordatorioPremium() throws DuplicateReminderException, InvalidReminderDateException, 
            EmptyInputException, InvalidPriorityException {
        String titulo = obtenerTituloUnico();
        String descripcion = obtenerDescripcion();
        LocalDateTime fecha = obtenerFechaValida();
        Prioridad prioridad = obtenerPrioridad();
        String ubicacion = obtenerUbicacion();

        Recordatorio recordatorioPremium = new RecordatorioPremium();
        recordatorioPremium.setTitulo(titulo);
        recordatorioPremium.setDescripcion(descripcion);
        recordatorioPremium.setFecha(fecha.format(DATE_FORMATTER));
        recordatorioPremium.setPrioridad(prioridad);
        recordatorioPremium.setUbicacion(ubicacion);

        listaRecordatorios.add(recordatorioPremium);
        Ventana.mostrarMensaje("Recordatorio premium creado exitosamente.");
    }

    private String obtenerTituloUnico() throws DuplicateReminderException, EmptyInputException {
        Ventana.mostrarMensaje("Ingrese el título del recordatorio:");
        String titulo = Ventana.ingresarDatoString();
        
        for (Recordatorio r : listaRecordatorios) {
            if (r.getTitulo().equals(titulo)) {
                throw new DuplicateReminderException("El título ya está en uso");
            }
        }
        return titulo;
    }

    private String obtenerDescripcion() throws EmptyInputException {
        Ventana.mostrarMensaje("Ingrese la descripción:");
        return Ventana.ingresarDatoString();
    }

    private LocalDateTime obtenerFechaValida() throws InvalidReminderDateException, EmptyInputException {
        Ventana.mostrarMensaje("Ingrese la fecha (DD/MM/YYYY):");
        String fechaStr = Ventana.ingresarDatoString();
        try {
            LocalDateTime fecha = LocalDateTime.parse(fechaStr + " 00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
            if (fecha.isBefore(LocalDateTime.now())) {
                throw new InvalidReminderDateException(fecha);
            }
            return fecha;
        } catch (DateTimeParseException e) {
            throw new InvalidReminderDateException(null);
        }
    }

    private Prioridad obtenerPrioridad() throws InvalidPriorityException, EmptyInputException {
        Ventana.mostrarMensaje("Ingrese la prioridad (ALTA/MEDIA/BAJA/SIN_PRIORIDAD):");
        return Ventana.ingresarDatoPrioridad();
    }

    private String obtenerUbicacion() throws EmptyInputException {
        Ventana.mostrarMensaje("Ingrese la ubicación:");
        return Ventana.ingresarDatoString();
    }

    private void verRecordatorios() {
        if (listaRecordatorios.isEmpty()) {
            Ventana.mostrarMensaje("No hay recordatorios disponibles.");
            return;
        }
        
        for (Recordatorio recordatorio : listaRecordatorios) {
            Ventana.mostrarMensaje(recordatorio.toString());
        }
    }

    private void modificarRecordatorio() throws EmptyInputException, InvalidPriorityException, 
            DuplicateReminderException, InvalidReminderDateException {
        if (listaRecordatorios.isEmpty()) {
            Ventana.mostrarMensaje("No hay recordatorios para modificar.");
            return;
        }

        Ventana.mostrarMensaje("Ingrese el título del recordatorio a modificar:");
        String titulo = Ventana.ingresarDatoString();
        boolean encontrado = false;

        for (Recordatorio recordatorio : listaRecordatorios) {
            if (recordatorio.getTitulo().equals(titulo)) {
                encontrado = true;
                Ventana.mostrarMensaje("Ingrese los nuevos datos del recordatorio:");
                
                String nuevoTitulo = obtenerTituloUnico();
                String nuevaDescripcion = obtenerDescripcion();
                LocalDateTime nuevaFecha = obtenerFechaValida();
                Prioridad nuevaPrioridad = obtenerPrioridad();
                String nuevaUbicacion = obtenerUbicacion();

                recordatorio.setTitulo(nuevoTitulo);
                recordatorio.setDescripcion(nuevaDescripcion);
                recordatorio.setFecha(nuevaFecha.format(DATE_FORMATTER));
                recordatorio.setPrioridad(nuevaPrioridad);
                recordatorio.setUbicacion(nuevaUbicacion);

                Ventana.mostrarMensaje("Recordatorio modificado exitosamente.");
                break;
            }
        }
        
        if (!encontrado) {
            Ventana.mostrarMensaje("No se encontró un recordatorio con ese título.");
        }
    }

    private void eliminarRecordatorio() throws EmptyInputException {
        if (listaRecordatorios.isEmpty()) {
            Ventana.mostrarMensaje("No hay recordatorios para eliminar.");
            return;
        }

        Ventana.mostrarMensaje("Ingrese el título del recordatorio a eliminar:");
        String titulo = Ventana.ingresarDatoString();
        Recordatorio aEliminar = null;

        for (Recordatorio r : listaRecordatorios) {
            if (r.getTitulo().equals(titulo)) {
                aEliminar = r;
                break;
            }
        }

        if (aEliminar != null) {
            listaRecordatorios.remove(aEliminar);
            Ventana.mostrarMensaje("Recordatorio eliminado exitosamente.");
        } else {
            Ventana.mostrarMensaje("No se encontró un recordatorio con ese título.");
        }
    }

    private void cerrarPrograma() {
        Ventana.mostrarMensaje("Programa cerrado.");
    }
}
