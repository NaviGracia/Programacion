package Ejercicio04;

public class C_Agua extends Congelados{
    double salinidad;

    public C_Agua(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen,
            int temperaturaRecomendada, double salinidad) {
        super(numLote, fechaEnvasado, fechaCaducidad, paisOrigen, temperaturaRecomendada);
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
