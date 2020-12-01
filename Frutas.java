package Productos;

public class Frutas extends Productos {

    private String unidad;

    public Frutas(String nombre, String unidad, int precio) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()+ " ///Precio: $" + super.getPrecio() + " ///Unidad de venta: "+ unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

}
