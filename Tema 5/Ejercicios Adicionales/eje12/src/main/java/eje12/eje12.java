package eje12;

import java.util.Scanner;

public class eje12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cuota del primer mes:");
        int cuota = sc.nextInt();
        int sumaDinero = cuota;
        System.out.println("Cúantos meses va a estar pagando?");
        int lastMes = sc.nextInt();
        System.out.println("Mes Nº1: " + cuota + "€");
        for(int mes = 2; mes<=lastMes; mes++){
            cuota = cuota * 2;
            sumaDinero = sumaDinero + cuota;
            System.out.println("Mes Nº" + mes + ": " + cuota + "€");
        }
        System.out.println("La cantidad total a pagar es: " + sumaDinero);
    }
}