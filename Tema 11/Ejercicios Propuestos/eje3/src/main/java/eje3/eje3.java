package eje3;

import java.util.Scanner;

public class eje3 {
    void cuadrado (int columnas, int lineas){
        int n = 1;
            for(int i = 2; i<=lineas; i++){
                for(int j = 2; j<=columnas; j++){
                        System.out.println(columnas);
                }
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eje3 eje3 = new eje3();
        System.out.println("Ingrese la columnas:");
        int columnas = sc.nextInt();
        System.out.println("Ingrese la líneas:");
        int lineas = sc.nextInt();
        System.out.println(eje3.cuadrado(columnas, lineas));
    }
}