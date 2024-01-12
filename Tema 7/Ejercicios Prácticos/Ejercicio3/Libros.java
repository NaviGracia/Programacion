package Ejercicio3;

public class Libros extends Biblioteca{
    boolean prestado = false;

    public Libros(int codigo, String titulo, int añoPublicación) {
        super(codigo, titulo, añoPublicación);
    }
}
