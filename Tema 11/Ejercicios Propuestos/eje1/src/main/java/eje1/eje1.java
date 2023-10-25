package eje1;

import java.util.Scanner;

public class eje1 {
    int factorial_iterativo(int n){
        int resultado = 1;
        for(int i = n;i>=1;i--){
            resultado *=i;
        }
        return resultado;
    }

    int factorial_recursivo(int n){
        if(n>0){
            int resultado = n * factorial_recursivo(n-1);
            return resultado;
        }else
        return 1;
    }
    public static void main(String[] args) {
        eje1 eje1 = new eje1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un Nº:");
        int n= sc.nextInt();
        System.out.println("El factorial iterativo de " + n + " es: " + eje1.factorial_iterativo(n));
        System.out.println("El factorial recursivo de " + n + " es: " + eje1.factorial_recursivo(n));
    }
}