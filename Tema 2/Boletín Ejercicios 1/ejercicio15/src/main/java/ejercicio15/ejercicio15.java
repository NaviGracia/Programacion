package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio en cm");
        double radio = sc.nextDouble();
        double volumen = (4 * 3.1416 * radio)/3;
        System.out.println("El volumen es " + volumen + "cm");
    }
}