package eje4;

import java.util.Scanner;

public class eje4 {
    public static int funcion (int linea, int columnas){
        if ((linea==1)||(columnas==1)) {
            return 1;
        } else{
            int resultado = (funcion((linea - 1), columnas) + funcion(linea, (columnas - 1)));
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
        for(linea = 1; linea<=valorTotal; linea++){
            for(int j = 1; j<=valorTotal-linea; j++){
                System.out.print(" ");
            }        
            for(columna = 1; columna<=j; columna++){
                    System.out.print(eje4.funcion(linea, columna) + "\t");
            }
            System.out.println("");
        }
    }
}