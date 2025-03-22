package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.*;

public class RecordatorioPremium extends Recordatorio implements TipoCuenta {
    int pago;
    int calificaciones;

    public RecordatorioPremium(String titulo, String descripcion, String fecha, String prioridad, String ubicacion) {
        super(titulo, descripcion, fecha, prioridad, ubicacion);
    }

    public RecordatorioPremium() {
    }
    Ventana menu = new Ventana();
    public void descripcion(){
        menu.mostrarMensaje("Plan premium incluye promedio de calificaciones en tiempo real y mucho mas");
    }

    public void calcularPago(){
        int tiempoPlan = 0; //En meses
        if (tiempoPlan == 1){
            
        }
        menu.mostrarMensaje("El costo del plan premium es de "+ pago);
    }
}
