package eje2;

import java.util.Scanner;

public class eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un Nº:");
        int x = sc.nextInt();
        System.out.println("El Nº " + x + " es " + (x%10 == 0 ? "múltiplo de 10" : "no es multiplo"));
    }
}