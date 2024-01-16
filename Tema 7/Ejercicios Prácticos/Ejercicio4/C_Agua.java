package Ejercicio4;

public class C_Agua {
    double salinidad;

    public C_Agua(double salinidad) {
        this.salinidad = salinidad;
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n Salinidad: " +  salinidad + "g/l de agua";
    }
}
