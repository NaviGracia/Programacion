package Ejercicio02;

public class Disco extends Multimedia{
    String genero;

    public Disco(String titulo, String autor, String tipoFormato, String duracion, String genero) {
        super(titulo, autor, tipoFormato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n Autor: " + autor + "\n Formato: " + formato + "\n Duración: " + duracion + "\n Género: " + genero;
    }
}
