package Ejercicio08;

public class Encargado extends Empleado{
    private double sueldo;

    @Override
    public double getSueldo() {
        // TODO Auto-generated method stub
        return super.getSueldo()+(super.getSueldo()/10);
    }
}
