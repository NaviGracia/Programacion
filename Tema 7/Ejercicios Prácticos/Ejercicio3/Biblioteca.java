package Ejercicio3;

public class Biblioteca {
    int codigo;
    String titulo;
    int añoPublicación;

    public Biblioteca(){}

    public Biblioteca(int codigo, String titulo, int añoPublicación) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicación = añoPublicación;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicación() {
        return añoPublicación;
    }

    public void setAñoPublicación(int añoPublicación) {
        this.añoPublicación = añoPublicación;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
