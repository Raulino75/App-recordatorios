package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.*;

public class BasicReminder extends Reminder implements TypeAccount {

    private int pago;

    
    public BasicReminder(String titulo, String descripcion, String fecha, Priority prioridad, String ubicacion) {
        super(titulo, descripcion, fecha, prioridad, ubicacion);
        this.pago = 0;
    }

    public BasicReminder() {
    }

    public String descripcion() {
        return "Plan basico de Recordatorios que incluye Titulo, descripcion, fecha, prioridad y ubicacion";
    }
    
    public String calcularPago(int tiempoPlan) {
        pago = 0;
        return "El plan basico es GRATIS!!";
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
