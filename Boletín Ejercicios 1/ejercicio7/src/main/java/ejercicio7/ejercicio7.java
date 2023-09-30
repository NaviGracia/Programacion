package ejercicio7;

public class ejercicio7 {
    public static void main(String[] args) {
        int c = -5;
        int c2 = c%2;
        System.out.println("El valor c es " + c);
        System.out.println("Es " + (c >= 0 ? "Positivo" : "Negativo"));
        System.out.println("Es " + (c2 == 0 ? "Par" : "Impar"));
    }
}