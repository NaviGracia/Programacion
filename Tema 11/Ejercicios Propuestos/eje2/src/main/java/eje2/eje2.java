package eje2;

import java.util.Scanner;

public class eje2 {
    int fibonacci_recursivo(int posicion){
        if((posicion==1)||(posicion==0)){
            return 1;
        } else
        return fibonacci_recursivo(posicion-1) + fibonacci_recursivo(posicion-2);
    }

    int fibonacci_iterativo(int posicion){
        int preFib2 = 1;
        int prevFib = 1;
        int fib = 0;
        if ((posicion==1)||(posicion==0)) {
            fib = 1;
        } else{
            for (int i=2; i<=posicion; i++){
                fib = prevFib + preFib2;
                preFib2 = prevFib;
                prevFib = fib;
            }
        }
        return fib;
    }
    public static void main(String[] args) {
        eje2 eje2 = new eje2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un Nº:");
        int posicion = sc.nextInt();
        System.out.println("El Nº fibonacci recursivo de " + posicion + " es: " + eje2.fibonacci_recursivo(posicion));
        System.out.println("El Nº fibonacci iterativo de " + posicion + " es: " + eje2.fibonacci_iterativo(posicion));
    }
}