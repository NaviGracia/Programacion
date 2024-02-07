package Ejercicio13;

public class Moneda extends Sorteo{
    @Override
    public int lanzar() {
        int moneda = (int) (Math.random()*(2-1)+1);
        if (moneda==1) {
            System.out.println("Cara");
        } else{
            System.out.println("Cruz");
        }
        return moneda;
    }
}
