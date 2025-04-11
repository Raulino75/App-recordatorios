package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.*;

public class RecordatorioBasico extends Recordatorio implements TipoCuenta {

    private int pago;

    
    public RecordatorioBasico(String titulo, String descripcion, String fecha, Prioridad prioridad, String ubicacion,
            int pago) {
        super(titulo, descripcion, fecha, prioridad, ubicacion);
        this.pago = pago;
    }

    public RecordatorioBasico(int pago) {
        this.pago = pago;
    }

    public RecordatorioBasico() {
    }

    public void descripcion() {
        Ventana.mostrarMensaje("Plan basico de Recordatorios que incluye Titulo, descripcion, fecha, prioridad y ubicacion");
    }
    
    public void calcularPago() {
        pago = 0;
        Ventana.mostrarMensaje("El plan basico es GRATIS");
    }
    
    
        public int getPago() {
            return pago;
        }
    
        public void setPago(int pago) {
            this.pago = pago;
        }

        @Override
        public String toString() {
            return "RecordatorioBasico [titulo=" + titulo + ", descripcion=" + descripcion + ", fecha=" + fecha
                    + ", ubicacion=" + ubicacion + ", prioridad=" + prioridad + ", pago=" + pago + ", getTitulo()="
                    + getTitulo() + ", getDescripcion()=" + getDescripcion() + ", getFecha()=" + getFecha()
                    + ", getPago()=" + getPago() + ", getPrioridad()=" + getPrioridad() + ", getUbicacion()="
                    + getUbicacion() + ", toString()=" + super.toString() + "]";
        }
        
}
