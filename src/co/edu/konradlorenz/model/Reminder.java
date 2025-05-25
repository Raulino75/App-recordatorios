package co.edu.konradlorenz.model;

public abstract class Reminder {

    protected String titulo, descripcion, fecha, ubicacion;
    protected Priority prioridad;//DEPENDENCIA
    public Reminder(String titulo, String descripcion, String fecha, Priority prioridad, String ubicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.ubicacion = ubicacion;
        
    }

    public Reminder() {
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

    public Priority getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Priority prioridad) {
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
        return  " |  Titulo : " + titulo + " |  Descripcion: " + descripcion + " |  Fecha: " + fecha +  " |  Prioridad: " + prioridad 
                + " |  Ubicacion: " + ubicacion + '}';
    }

}
