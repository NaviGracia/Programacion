package eje7;

import java.util.Scanner;

public class eje7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Nº1:");
        int x = sc.nextInt();
        System.out.println("Introduzca Nº2:");
        int y = sc.nextInt();
        System.out.println(y == 0 ? "Cambie el divisor y vuelva a intentarlo" : "La división de " + x + "/" + y + " es: " + x/y);
    }
}