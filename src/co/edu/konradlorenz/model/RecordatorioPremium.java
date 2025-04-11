package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.*;

public class RecordatorioPremium extends Recordatorio implements TipoCuenta {
    private int pago;
    private int calificaciones;

    public RecordatorioPremium(String titulo, String descripcion, String fecha, Prioridad prioridad, String ubicacion,
            int pago, int calificaciones) {
        super(titulo, descripcion, fecha, prioridad, ubicacion);
        this.pago = pago;
        this.calificaciones = calificaciones;
    }
    public RecordatorioPremium(int pago, int calificaciones) {
        this.pago = pago;
        this.calificaciones = calificaciones;
    }
    public RecordatorioPremium() {
    }
    public int getPago() {
        return pago;
    }
    public void setPago(int pago) {
        this.pago = pago;
    }
    public int getCalificaciones() {
        return calificaciones;
    }
    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }
    @Override
    public String toString() {
        return "RecordatorioPremium [pago=" + pago + ", calificaciones=" + calificaciones + ", titulo=" + titulo
                + ", descripcion=" + descripcion + ", fecha=" + fecha + ", ubicacion=" + ubicacion + ", prioridad="
                + prioridad + ", getTitulo()=" + getTitulo() + ", getDescripcion()=" + getDescripcion()
                + ", getFecha()=" + getFecha() + ", getPago()=" + getPago() + ", getPrioridad()=" + getPrioridad()
                + ", getUbicacion()=" + getUbicacion() + ", toString()=" + super.toString() + "]";
    }
    public void descripcion(){
        Ventana.mostrarMensaje("Plan premium incluye promedio de calificaciones en tiempo real y mucho mas");
    }

    public void calcularPago(){
        int tiempoPlan = 0; //En meses
        if (tiempoPlan == 1){
            
        }
        Ventana.mostrarMensaje("El costo del plan premium es de "+ pago);
    }
}
