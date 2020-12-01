package Productos;

public class Bebidas extends Productos{
    
    private String litros;

    public Bebidas(String nombre, String litros, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: "+ super.getNombre()+ " /// Litros: "+ litros + " /// Precio: $" + super.getPrecio();
    }
    
    
}
