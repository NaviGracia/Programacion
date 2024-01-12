package Ejercicio2;

public class Multimedia {
    String titulo;
    String autor;
    String formato;
    String duracion;

    public Multimedia(){}

    public Multimedia(String titulo, String autor, String formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {  
        return "Titulo: " + titulo + "\n Autor: " + autor + "\n Formato: " + formato + "\n Duración: " + duracion;
    }
    
}
