package Final;

import Productos.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ventas {

    public static void main(String[] args) {
        ArrayList<Productos> listaVenta = new ArrayList<>();
        Productos venta1 = new Bebidas("Coca-Cola Zero", "1.5", 20);
        Productos venta2 = new Bebidas("Coca-Cola", "1.5", 18);
        Productos venta3 = new Limpieza("Shampoo Sedal", "500ml", 19);
        Productos venta4 = new Frutas("Frutillas", "Kilo ", 64);

        listaVenta.add(venta1);
        listaVenta.add(venta2);
        listaVenta.add(venta3);
        listaVenta.add(venta4);

        for (Productos b : listaVenta) {
            System.out.println(b);
        }
        System.out.println("============================");
        Collections.sort(listaVenta);

        String mayor, menor;
        mayor = menor = listaVenta.get(0).getNombre();

        for (int i = 0; i < listaVenta.size(); i++) {
            if (listaVenta.get(i).compareTo(listaVenta.get(0)) < 0) {
                menor = listaVenta.get(i).getNombre();
            }
            if (listaVenta.get(i).compareTo(listaVenta.get(0)) > 0) {
                mayor = listaVenta.get(i).getNombre();
            } 
        }
        System.out.println("Producto más caro: " + mayor);
        System.out.println("Producto más barato: " + menor);
    }

}
