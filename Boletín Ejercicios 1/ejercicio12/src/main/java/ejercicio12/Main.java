package ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el radio de la circunferencia");
        double radio = sc.nextDouble();
        double longitud = radio*3.14*2;
        double area = 3.14*(radio*radio);
        System.out.println("El radio de " + radio + " es " + longitud + " y el área es " + area);
    }
}