package Ejercicio6;

public class Loro extends Aves implements PuedeCaminar, PuedeVolar{
    @Override
    public void puedeCaminar() {
        System.out.println("d");
    }

    @Override
    public void puedeVolar() {
        System.out.println("El loro vuela");
    }
}
