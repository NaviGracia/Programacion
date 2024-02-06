package Ejercicio02;

public class App {
    public static void main(String[] args) {
        System.out.println("Películas:");
        Pelicula p1 = new Pelicula("Avatar", "James Camerones", Formato.DVD.getFormato(), "9 Horas", "Avatares", null);
        Pelicula p2 = new Pelicula("Avatar", "James Camerones", Formato.WAV.getFormato(), "9 Horas", null, "Avataras");
        Pelicula p3 = new Pelicula("Operación Camarón", "Carlos Therón", Formato.AVI.getFormato(), "2 Horas", "Sebas", "Pepa");
        p1.setTitulo("Avatar 2");
        p1.setDuracion("24 Horas");
        p1.setFormato(Formato.MP3.getFormato());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println("Discos:");
        Disco d1 = new Disco("Melancoliz", "Almacor", Formato.MP3.getFormato(), "1 Hora y 42 Minutos", Genero.LATINO.getGenero());
        Disco d2 = new Disco("Melancoliz", "Almacor", Formato.MP3.getFormato(), "1 Hora y 42 Minutos", Genero.LATINO.getGenero());
        Disco d3 = new Disco("Okta", "KEiiNO", Formato.MP3.getFormato(), "1 Hora y 23 Minutos", Genero.POP.getGenero());
        d1.setTitulo("Explícame");
        d1.setDuracion("1 Hora y 12 Minutos");
        d1.setFormato(Formato.CDAUDIO.getFormato());
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
    }
}
