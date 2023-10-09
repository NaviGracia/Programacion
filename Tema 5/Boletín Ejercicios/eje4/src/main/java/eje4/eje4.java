package eje4;

import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el 1r carácter:");
        String x = sc.nextLine();
        System.out.println("Introduzca el 2n carácter:");
        String y = sc.nextLine();
        System.out.println(x.equals(y) ? "Son iguales" : "No son iguales");
    }
}