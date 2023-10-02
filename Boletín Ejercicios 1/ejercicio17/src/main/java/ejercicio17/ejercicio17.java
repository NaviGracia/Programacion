package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca un número de 5 cifras");
        int n = sc.nextInt();
        System.out.println("Primera cifra de " + n + " es " + (n/10000));
        System.out.println("Segunda cifra de " + n + " es " + (n/1000)%10);
        System.out.println("Tercera cifra de " + n + " es " + (n/100)%10);
        System.out.println("Cuarta cifra de " + n + " es " + (n/10)%10);
        System.out.println("Quinta cifra de " + n + " es " + (n%10));
    }
}