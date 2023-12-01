package eje6_4;

public class Producto {
    static double rebaja = 0;
    double precio;
    Producto(double precio){
        this.precio = precio;
    }



    public static void infoRebajaActual() {
        System.out.println("Rebaja actual: " + rebaja + "%");
    }

    public double getPrecioFinal() {
        return this.precio-rebaja/100*precio;
    }
}
