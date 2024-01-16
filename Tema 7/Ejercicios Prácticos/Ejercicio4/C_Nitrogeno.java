package Ejercicio4;

public class C_Nitrogeno {
    String metodo;
    double tiempoExposicion;
    
    public C_Nitrogeno(String metodo, double tiempoExposicion) {
        this.metodo = metodo;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public double getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(double tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n Método: " + metodo + "\n Tiempo de Exposición: " + tiempoExposicion + "s";
    }
}
