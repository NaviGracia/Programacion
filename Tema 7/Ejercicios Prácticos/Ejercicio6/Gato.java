package Ejercicio6;

public class Gato extends Mamifero implements PuedeCaminar, PuedeNadar{
    @Override
    public void puedeCaminar() {
        System.out.println("Halo");
    }

    @Override
    public void puedeNadar() {
        System.out.println("Nado");
    }
    

}
