package eje5;

import java.util.Scanner;

public class eje5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer Nº:");
        int x = sc.nextInt();
        System.out.println("Ingrese el segundo Nº");
        int y = sc.nextInt();
        int ayuda = 0;
        if (x>y){
            ayuda = x;
            x = y;
            y = ayuda;
        }
        int nalea = (int)Math.floor(Math.random()*(y-x+1)+x);
        System.out.println(nalea);
    }
}