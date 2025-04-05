package co.edu.konradlorenz.model;

public class Recordatorio {

    String titulo, descripcion, fecha, ubicacion;
    Prioridad prioridad;//DEPENDENCIA
    public Recordatorio(String titulo, String descripcion, String fecha, Prioridad prioridad, String ubicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.ubicacion = ubicacion;
        
    }

    public Recordatorio() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

   

    @Override
    public String toString() {
        return "Recordatorio{" + "titulo = " + titulo + ", descripcion = " + descripcion + ", fecha = " + fecha + ", prioridad = " + prioridad + ", ubicacion = " + ubicacion + '}';
    }

}
