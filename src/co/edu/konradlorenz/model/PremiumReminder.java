package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.*;

public class PremiumReminder extends Reminder implements TypeAccount {

    private int pago;
    private int calificaciones;

    public PremiumReminder(String titulo, String descripcion, String fecha, Priority prioridad, String ubicacion, int calificaciones) {
        super(titulo, descripcion, fecha, prioridad, ubicacion);
        this.pago = 25000;
        this.calificaciones = calificaciones;
    }

    public PremiumReminder() {
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
        return "PremiumReminder: "+ super.toString()  + " |  Pago: " + pago + " |  Calificaciones: " + calificaciones + '}';
    }

    


    public String descripcion() {
        return "Plan premium incluye promedio de calificaciones en tiempo real y mucho mas";
    }

    public String calcularPago(int tiempoPlan) {

        int precio = this.pago * tiempoPlan;

        return "El costo del plan premium es de " + precio;
    }
}
