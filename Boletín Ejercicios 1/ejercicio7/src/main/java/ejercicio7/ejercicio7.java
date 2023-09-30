package ejercicio7;

public class ejercicio7 {
    public static void main(String[] args) {
        int c = 150;
        int par = c%2;
        int multiplo5 = c%5;
        int multiplo10 = c%10;
        System.out.println("El valor c es " + c);
        System.out.println("Es " + (c >= 0 ? "Positivo" : "Negativo"));
        System.out.println("Es " + (par == 0 ? "Par" : "Impar"));
        System.out.println((multiplo5 == 0 ? "Es Múltiplo de 5" : "No es múltiplo de 5"));
        System.out.println((multiplo10 == 0 ? "Es Múltiplo de 10" : "No es Múltiplo de 10"));
        System.out.println("Es " + (c > 100 ? "Mayor que 100" : "Menor de 100"));
    }
}