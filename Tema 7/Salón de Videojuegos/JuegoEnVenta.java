public class JuegoEnVenta extends Juego{
    double precio;
    int numCopiasDisponibles;

    public JuegoEnVenta(){}

    public JuegoEnVenta(String titulo, String fabricante, int anyo, double precio,
            int numCopiasDisponibles) {
        super(titulo, fabricante, anyo);
        this.precio = precio;
        this.numCopiasDisponibles = numCopiasDisponibles;
    }

    int vender(){
        this.numCopiasDisponibles-= 1;
        return numCopiasDisponibles;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n Precio de Venta: " + precio + "€" + "\n Nº Copias Disponibles: " + numCopiasDisponibles;
    }

    

}
