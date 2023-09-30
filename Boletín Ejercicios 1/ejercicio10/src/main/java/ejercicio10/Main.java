package ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduza un número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int doble = (num*2);
        int triple = (num*3);
        System.out.println("El doble de " + num + " es " + doble + " y el triple es " + triple);
    }
}