package eje8;

import java.util.Scanner;

public class eje8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Nº1:");
        int x = sc.nextInt();
        System.out.println("Introduzca Nº2:");
        int y = sc.nextInt();
        System.out.println("Introduzca Nº3:");
        int z = sc.nextInt();
        if ((x >= y) && (x >= z)){
            System.out.println("Entre los Nº: " + x + " " + y + " " + z + " el más mayor es: " + x);
        } if ((y >= x) && (y >= z)){
            System.out.println("Entre los Nº: " + x + " " + y + " " + z + " el más mayor es: " + y);
        } else
        System.out.println("Entre los Nº: " + x + " " + y + " " + z + " el más mayor es: " + z);
    }
}