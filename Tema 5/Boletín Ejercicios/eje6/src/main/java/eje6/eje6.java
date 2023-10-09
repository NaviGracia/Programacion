package eje6;

import java.util.Scanner;

public class eje6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un carácter");
        char x = sc.next().charAt(0);
        System.out.println(Character.isDigit(x) ? "Es un número" : "No es un número");
    }
}