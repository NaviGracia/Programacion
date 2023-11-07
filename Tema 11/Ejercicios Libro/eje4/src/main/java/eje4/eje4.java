package eje4;

import java.util.Scanner;

public class eje4 {
    int recursivo(int posicion){
        if (posicion>1) {
            int resultado = recursivo(posicion-1) + recursivo(posicion-2);
            return resultado;
        } if (posicion==0) {
            return 0;
        }
        return 1;
    }

    int iterativo(int posicion){
        int fib = 0;
        int fibPrev = 1;
        int fibPrev2 = 0;
        for(int cont = 2; cont<=posicion; cont++){
            fib = fibPrev + fibPrev2;
            fibPrev2 = fibPrev;
            fibPrev = fib;
        }
        return fib;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eje4 eje4 = new eje4();
        System.out.println("Ingrese la posición fibonnacci que desea:");
        int posicion = sc.nextInt();
        System.out.println("Recursivo: " + eje4.recursivo(posicion));
        System.out.println("Iterativo: " + eje4.iterativo(posicion));
    }
}