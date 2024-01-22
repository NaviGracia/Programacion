package Ejercicio7;

public class App {
    public static void main(String[] args) {
        Pez p1 = new Pez("Black Marlin");
        Pez p1Copia = new Pez(p1);
        System.out.println("Pez 1: " + "\n Nº Pez: " + p1.getNumPeces() + "\n Nombre: " + p1.getNombre());
        System.out.println("Pez Copia: " + "\n Nº Pez: " + p1Copia.getNumPeces() + "\n Nombre: " + p1Copia.getNombre());
        System.out.println("Son iguales: " + p1.equals(p1Copia));
    }
}
