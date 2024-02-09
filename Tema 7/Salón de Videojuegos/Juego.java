public final class Juego{
    private String titulo = "Sin título";
    private String fabricante = "Desconocido";
    private int anyo = 1970;
    private int totalJuegos = 1;

    public Juego() {}

    public Juego(String titulo, String fabricante, int anyo) {
        this.titulo = titulo;
        this.fabricante = fabricante;
        this.anyo = comprobarAnyo(anyo);
        totalJuegos += 1;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getTotalJuegos() {
        return totalJuegos;
    }

    public void setTotalJuegos(int totalJuegos) {
        this.totalJuegos = totalJuegos;
    }

    private int comprobarAnyo(int anyo){
        if (anyo >= 1970) {
            return anyo;
        } else{
            return 1970;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Titulo: " + titulo + "\n Fabricante: " + fabricante + "\n Anyo: " + anyo + "Total de Juegos en Catalogo: " + totalJuegos;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Juego juegoComp =  (Juego)obj; 
        if ((this.getTitulo().equals(juegoComp.getTitulo())) && (this.getFabricante().equals(juegoComp.getFabricante())) && (this.getAnyo() == (juegoComp.getAnyo()))){
            return true;
        } else{
            return false;
        }
    }

    public void compareTo(Object obj){
        Juego juegoComp =  (Juego)obj;
        if (this.getAnyo()<juegoComp.getAnyo()) {
            System.out.println("La pelicula " + this.getTitulo() + " es menor que " + juegoComp.getTitulo());
        }else{
            System.out.println("La pelicula " + this.getTitulo() + " es mayor que " + juegoComp.getTitulo());
        }
    }
    

}