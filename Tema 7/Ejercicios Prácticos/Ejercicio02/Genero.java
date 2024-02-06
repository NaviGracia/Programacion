package Ejercicio02;

public enum Genero {
    ROCK("rock"), POP("pop"), OPERA("ópera"), LATINO("latino"), TECHNO("techno");

    String genero;
    private Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }
}
