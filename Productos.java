package Productos;

public class Productos implements Comparable<Productos> {

    private String nombre;
    private int precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Productos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Productos o) {
        if (this.precio < o.getPrecio()) {
            return -1;
        } else if (this.precio > o.getPrecio()) {
            return +1;
        }
        return 0;
    }

}
