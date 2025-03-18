package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.*;

public class RecordatorioBasico extends Recordatorio implements TipoCuenta {

    int pago;

    public RecordatorioBasico(String titulo, String descripcion, String fecha, String prioridad, String ubicacion) {
        super(titulo, descripcion, fecha, prioridad, ubicacion);
    }
    
    public RecordatorioBasico() {
    }
    Ventana menu = new Ventana();

    public void Descripcion() {
        menu.MostrarMensaje("Plan basico de Recordatorios que incluye Titulo, descripcion, fecha, prioridad y ubicacion");
    }
    
    public void calcularPago() {
        pago = 0;
        menu.MostrarMensaje("El plan basico es GRATIS");
    }
}
