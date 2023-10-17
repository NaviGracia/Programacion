package eje2;

import java.util.Scanner;

public class eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String confirmacion;
        int x = 0;
        float media = 0;
        int cont = 0;
        int mayor = -2147483647;
        int menor = 2147483647;
        int sumapo = 0;
        int sumane = 0;
        int canpo = 0;
        int canne = 0;
        int sumapar = 0;
        int sumaimp = 0;
        int canpar = 0;
        int canimp = 0;
        do{
            System.out.println("Introduzca un Nº");
            x = sc.nextInt();
            //Calcular Nº Mayor
            if (x>mayor){
                mayor = x;
            }
            //Calcular Nº Menor
            if (x<menor){
                menor = x;
            }
            //Contar y Sumar Positivos
            if (x>0){
                sumapo = sumapo + x;
                canpo = canpo + 1;
            }
            //Contar y Sumar Negativos
            if (x<0){
                sumane = sumane + x;
                canne = canne + 1;
            }
            //Contar y Sumar Pares
            if (x%2==0){
                sumapar = sumapar + x;
                canpar = canpar + 1;
            }
            //Contar y Sumar Impares
            if (x%2==1){
                sumaimp = sumaimp + x;
                canimp = canimp + 1;
            }
            //Media
            cont++;
            media = media + x;

            System.out.println("Quiere introducir algún Nº más?");
            sc.nextLine();
            confirmacion = sc.nextLine();
        } while(!confirmacion.equals("no"));
        media = media/cont;
        System.out.println("terminado");
        System.out.println(media);
        System.out.println(mayor);
        System.out.println(menor);
        System.out.println(sumapo);
        System.out.println(sumane);
        System.out.println(sumapar);
        System.out.println();
        System.out.println();
        System.out.println(canimp);
    }
}