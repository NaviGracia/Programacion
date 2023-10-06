package eje6;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nº de 3 cifras");
        int x = sc.nextInt();
        int num1 = (x/100)%10;
        int numres1 = num1 * num1 * num1;
        int num2 = (x/10)%10;
        int numres2 = num2 * num2 * num2;
        int num3 = x%10;
        int numres3 = num3 * num3 * num3;
        int total = numres1 + numres2 + numres3;
        if(total == x){
            System.out.println("Es un número Armstrong");
        } else
            System.out.println("No es un número Armstrong");
    }
}