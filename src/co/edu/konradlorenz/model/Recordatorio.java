package co.edu.konradlorenz.model;

public class Recordatorio {

    String titulo, descripcion, fecha, prioridad, ubicacion, estado;

    public Recordatorio(String titulo, String descripcion, String fecha, String prioridad, String ubicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.ubicacion = ubicacion;
        this.estado = estado;
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

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Recordatorio{" + "titulo = " + titulo + ", descripcion = " + descripcion + ", fecha = " + fecha + ", prioridad = " + prioridad + ", ubicacion = " + ubicacion + ", estado = " + estado + '}';
    }

}
