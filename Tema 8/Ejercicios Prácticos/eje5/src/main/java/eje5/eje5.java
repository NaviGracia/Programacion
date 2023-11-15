package eje5;

import java.util.Scanner;

public class eje5 {
    static int[] v;
    static int lon;

   /*  public asignarDatos(int[] v){
        for(int posicion = 0; posicion<v.length; posicion++){

    }*/

    int[] solicitarTamanyo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la longitud que desea del array:");
        lon = sc.nextInt();
        v = new int[lon];
        return v;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanyo=solicitarTamanyo(v, lon);
        
        System.out.println(v.length);
    }

    

}