package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cateto a en cm");
        int a = sc.nextInt();
        System.out.println("Introduzca cateto b en cm");
        int b = sc.nextInt();
        double hipotenusa = Math.sqrt(a * a + b * b);
        System.out.println("La hipotenusa es " + hipotenusa + "cm");
    }
}