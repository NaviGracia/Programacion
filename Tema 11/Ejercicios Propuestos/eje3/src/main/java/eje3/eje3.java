package eje3;

import java.util.Scanner;

 public class eje3 {
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
        eje3 eje3 = new eje3();
        int linea;
        int columna;
        System.out.println("Introduzca el Nº:");
        int valorTotal = sc.nextInt();
        for(linea = 1; linea<=valorTotal; linea++){
            for(columna = 1; columna<=valorTotal; columna++){
                System.out.print(eje3.funcion(linea, columna) + "\t");
            }
            System.out.println("");
        }
    }
 }