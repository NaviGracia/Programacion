package eje3;

import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un carácter:");
        String x = sc.nextLine();
        System.out.println("El carácter " + x + ((x.compareTo("A") >= 0) && (x.compareTo("Z") <= 0) ? " es una letra mayúscula" : " no es una letra mayúscula"));
    }
}