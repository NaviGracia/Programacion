package eje4;

import java.util.Scanner;

public class eje4 {
    public static int funcion (int linea, int columnas){
        if ((columnas==1)) {
            return 1;
        } if ((columnas>1)&&(columnas==linea)) {
            return 1;
        }else{
            int resultado = (funcion((linea - 1), (columnas-1)) + funcion((linea-1), columnas));
            return resultado;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eje4 eje4 = new eje4();
        int linea;
        int columna;
        System.out.println("Introduzca el Nº:");
        int valorTotal = sc.nextInt();
        for (linea = 1; linea<=valorTotal; linea++) {
            for(int j = valorTotal-linea; j>0; j--){
                System.out.print(" ");
            }
            for(columna=1; columna<=linea; columna++){
                System.out.print(eje4.funcion(linea, columna) + " ");
            }
            System.out.println("");
        }
    }
}