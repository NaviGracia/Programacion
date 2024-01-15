package Ejercicio3;

public class Revistas extends Biblioteca{
    int numero;

    public Revistas(int codigo, String titulo, int añoPublicación, int numero) {
        super(codigo, titulo, añoPublicación);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Numero: "+ numero;
    }
}
