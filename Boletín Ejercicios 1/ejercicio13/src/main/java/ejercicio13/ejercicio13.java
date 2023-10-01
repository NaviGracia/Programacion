package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduza la velocidad en km/h");
        double km = sc.nextDouble();
        double m = km*(1000/1)*(1/3.600);
        System.out.println("La velocidad " + km + "km/h son " + m + "m/s");
    }
}