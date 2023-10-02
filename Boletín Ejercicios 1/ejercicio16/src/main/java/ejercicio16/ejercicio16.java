package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        System.out.println("Primera cifra de " + n + " es " + (n/100));
        System.out.println("Cifra central de " + n + " es " + (n/10)%10);
        System.out.println("Primera cifra de " + n + " es " + (n%10));
    }
}