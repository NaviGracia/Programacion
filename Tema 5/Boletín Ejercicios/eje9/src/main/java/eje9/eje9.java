package eje9;

import java.util.Scanner;

public class eje9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las horas:");
        int H = sc.nextInt();
        System.out.println("Introduzca los minutos:");
        int M = sc.nextInt();
        System.out.println("Introduzca los segundos:");
        int S = sc.nextInt();
        if((H>=0) && (M>=0) && (M<=60) && (S>=0) && (S<=60)){
            System.out.println("La hora es: " + H + "h " + M + "m " + S + "s.");
        } else
        System.out.println("Los datos introducidos no son válidos");
    }
}