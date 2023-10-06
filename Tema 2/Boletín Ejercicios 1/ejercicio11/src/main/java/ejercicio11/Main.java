package ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos grados centígrados?");
        int grados = sc.nextInt();
        int gradosFahrenheit = (32 + (9 * grados / 5));    
        System.out.println(grados + "ºC en Fahrenheit son " + gradosFahrenheit + "ºF");
    }
}