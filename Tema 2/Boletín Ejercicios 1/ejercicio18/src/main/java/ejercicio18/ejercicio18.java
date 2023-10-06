package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca un número de 5 cifras");
        int n = sc.nextInt();
        System.out.println("Quinta cifra de " + n + " es " + (n%10));
        System.out.println("Cuarta cifra de " + n + " es " + (n/10)%10);
        System.out.println("Tercera cifra de " + n + " es " + (n/100)%10);
        System.out.println("Segunda cifra de " + n + " es " + (n/1000)%10);
        System.out.println("Primera cifra de " + n + " es " + (n/10000));
    }
}