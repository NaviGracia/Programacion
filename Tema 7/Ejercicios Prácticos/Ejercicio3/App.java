package Ejercicio3;

public class App {
    public static void main(String[] args) {
        Libros l1 = new Libros(10, "Solo Leveling", 2015, false);
        Revistas r1 = new Revistas(1, "Chainsaw Man", 2018, 3);
        System.out.println(l1.toString());
        l1.devolver();
        System.out.println(l1.prestado());
        l1.prestar();
        System.out.println(l1.prestado());
        System.out.println(r1.toString());
    }
}
