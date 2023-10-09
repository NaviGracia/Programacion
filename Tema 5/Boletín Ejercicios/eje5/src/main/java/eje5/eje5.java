package eje5;

import java.util.Scanner;

public class eje5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el 1r carácter:");
        String x = sc.nextLine();
        System.out.println("Introduzca el 2n carácter:");
        String y = sc.nextLine();
        System.out.println((x.compareTo("a") >= 0) && (x.compareTo("z") <= 0) && (y.compareTo("a") >= 0) && (y.compareTo("z") <= 0) ? "Son dos minúsculas" : "No son minúsculas");
    }
}