package eje1;

import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un Nº: ");
        int x = sc.nextInt();
        System.out.println("El nº " + x + " es " + (x%2 == 0 ? "par." : "impar."));
    }
}