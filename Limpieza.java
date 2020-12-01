package Productos;

public class Limpieza extends Productos{
    private String contenido;

    public Limpieza(String nombre, String contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: "+ super.getNombre()+ " /// Contenido: "+ contenido + " /// Precio: $" + super.getPrecio();
    }
    
}
