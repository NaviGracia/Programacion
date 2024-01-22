package Ejercicio6;

public class Murcielago extends Mamifero implements PuedeVolar{
    @Override
    public void puedeCaminar() {
        // TODO Auto-generated method stub
        System.out.println("El Murciélago camina");
    }

    @Override
    public void puedeVolar() {
        // TODO Auto-generated method stub
        System.out.println("El Murciélago vuela");
    }
}
