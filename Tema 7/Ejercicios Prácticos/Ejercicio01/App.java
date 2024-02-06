package Ejercicio01;

public class App {
    public static void main(String[] args) {
        Fecha f = new Fecha(02, 02, 2024);
        Hora h = new Hora(17, 50);
        Examen e = new Examen("Programación", 79, f.toString(), h.toString());
        System.out.println(e.toString());
        e.setFecha("5/2/2025");
        e.setHora("12:30");
        System.out.println(e.toString());
    }
}
