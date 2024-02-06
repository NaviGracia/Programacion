package Ejercicio06;

public class Gato extends Felino{
    @Override
    public void puedeCaminar() {
        System.out.println("El gato camina");
    }

    @Override
    public void puedeNadar() {
        System.out.println("El gato nada");
    }
}
