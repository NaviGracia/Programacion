package eje5;

import java.util.Scanner;

public class eje5 {
    public static int funcion (int linea, int columnas){
        if ((columnas==1)) {
            return 1;
        } if ((columnas>1)&&(columnas%2==1)&&(columnas>)) {
            return 1;
        }if (linea==2) {
            return 1;
        }if (columnas==2) {
            int resultado = (funcion((linea-1), columnas) + funcion(linea-1, columnas-1));
            return resultado;
        }else{
            int resultado = (funcion((linea - 1), (columnas)) + funcion((linea - 1), (columnas-1)) + funcion((linea - 1), (columnas-2)));
            return resultado;
        }
    }
    /*
    1
    111
    12321
    1367631
    --------
    1
    111
    12331
    1368771
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eje5 eje5 = new eje5();
        int linea;
        int columna;
        System.out.println("Introduzca el Nº:");
        int valorTotal = sc.nextInt();
        for (linea = 1; linea<valorTotal; linea++) {
            for(int j = 1; j<=valorTotal-linea; j++){
                System.out.print(" ");
            }
            for(columna=1; columna<2*linea; columna++){
                System.out.print(eje5.funcion(linea, columna));
            }
            System.out.println("");
        }
    }
}