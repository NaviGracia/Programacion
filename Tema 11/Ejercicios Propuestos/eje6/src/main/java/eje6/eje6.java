package eje6;

import java.util.Scanner;

public class eje6 {
    int transformabase (int decimal, int base){
        switch (base) {
            case 2:
                if (decimal>0) {
                    int resultado = 0;
                    return resultado;    
                } else{
                    return 0;
                } 
            default:
                break;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eje6 eje6 = new eje6();
        System.out.println("Introduzca un Nº decimal:");
        int decimal = sc.nextInt();
        System.out.println("A que base desea transformarlo?");
        int base = sc.nextInt();
        System.out.println("El Nº " + decimal + " en base de " + base + " es: " + eje6.transformabase(decimal, base));
    }
}