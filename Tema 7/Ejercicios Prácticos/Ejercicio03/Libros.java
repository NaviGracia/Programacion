package Ejercicio03;

public class Libros extends Biblioteca implements Prestable{
    boolean prestado = false;

    public Libros(int codigo, String titulo, int añoPublicación, boolean prestado) {
        super(codigo, titulo, añoPublicación);
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Prestado: " + prestado;
    }

    @Override
    public void prestar() {
        prestado=true;
    }

    @Override
    public void devolver() {
        prestado=false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }
}
