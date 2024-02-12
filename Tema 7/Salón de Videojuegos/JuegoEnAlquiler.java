public class JuegoEnAlquiler extends Juego implements Alquilable{
    double precio;
    int numCopiasDisponibles;
    int numDiasAlquilados;
    
    public JuegoEnAlquiler() {}

    public JuegoEnAlquiler(String titulo, String fabricante, int anyo, double precio,
            int numCopiasDisponibles, int numDiasAlquilados) {
        super(titulo, fabricante, anyo);
        this.precio = precio;
        this.numCopiasDisponibles = numCopiasDisponibles;
        this.numDiasAlquilados = numDiasAlquilados;
    }

    public JuegoEnAlquiler(JuegoEnAlquiler obj) {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumCopiasDisponibles() {
        return numCopiasDisponibles;
    }

    public void setNumCopiasDisponibles(int numCopiasDisponibles) {
        this.numCopiasDisponibles = numCopiasDisponibles;
    }

    public int getNumDiasAlquilados() {
        return numDiasAlquilados;
    }

    public void setNumDiasAlquilados(int numDiasAlquilados) {
        this.numDiasAlquilados = numDiasAlquilados;
    }

    @Override
    public int alquilar() {
        // TODO Auto-generated method stub
        return numCopiasDisponibles -1;
    }

    @Override
    public int devolver() {
        // TODO Auto-generated method stub
        return numCopiasDisponibles +1;
    }

    @Override
    public double precioFinal() {
        // TODO Auto-generated method stub
        return precio * numDiasAlquilados;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n Precio de Alquiler: " + precio + "€" + "\n Nº Copias Disponibles: " + numCopiasDisponibles + "\n Nº Días Alquilado: " + numDiasAlquilados;
    }


}
