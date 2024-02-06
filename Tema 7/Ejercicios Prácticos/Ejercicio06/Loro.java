package Ejercicio06;

public class Loro extends Aves implements PuedeVolar{
    @Override
    public void puedeCaminar() {
        System.out.println("El loro camina");
    }

    @Override
    public void puedeVolar() {
        System.out.println("El loro vuela");
    }
}
