package eje2;

import java.util.Scanner;

public class eje2 {
    int fibonacci_iterativo(int posicion){
        int resultado = 0; 
        if(posicion>=1){
            resultado = fibonacci_iterativo((posicion-1)+(posicion-2));
        } else
        resultado = 1;
        return resultado;
    }
    public static void main(String[] args) {
        eje2 eje2 = new eje2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un Nº:");
        int posicion = sc.nextInt();
        System.out.println("El Nº fibonacci de " + n + " es: " + eje2.fibonacci_iterativo(posicion));
    }
}