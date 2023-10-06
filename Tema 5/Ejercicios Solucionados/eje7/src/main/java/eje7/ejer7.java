package eje7;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nº de alturas a introducir:");
        int n = sc.nextInt();
        int cont = 1;
        double alt = 0;
        while(cont <= n){
            System.out.println("Introduzca la altura nº" + cont + ": ");
            alt = alt + sc.nextDouble(); 
            cont++;
        }
        double pro = alt / n;
        System.out.println("El promedio es de " + pro + "m");
    }
}