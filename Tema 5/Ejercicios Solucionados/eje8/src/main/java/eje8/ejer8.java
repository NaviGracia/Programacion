package eje8;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int x = 0;
        while (x != 999){
            System.out.println("Introduzca un nº: ");
            int y = sc.nextInt();
            if (y == 999){
                break;
            } else
            x = x+y;
        }
        if(x > 0){
            System.out.println("La suma es " + x + " que es mayor a cero");
        } if (x < 0){
            System.out.println("La suma es " + x + " que es menor a cero");
        } if (x == 0) {
            System.out.println("La suma es " + x + " que es igual a cero");
        }
    }
}