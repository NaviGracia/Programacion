package eje6;

import java.util.Scanner;

public class eje6 {
    void transformabase (int decimal, int base){
        switch (base) {
            case 2:
                if (decimal<2) {
                        System.out.print(decimal);
                } else{
                    transformabase(decimal/2, base);
                    System.out.print(decimal%2);
                } 
                break;
            case 8:
                if (decimal!=0) {
                    transformabase(decimal/8, base);
                    System.out.print(decimal%8);
                }else{
                    System.out.print("");
                }
                break;
            case 16:
                if (decimal!=0) {
                    String total = "";
                    int hexa = decimal%16;
                    switch (hexa) {
                        case 10:
                            transformabase(decimal/16, base);
                            System.out.print("A");
                            break;
                        case 11:
                            transformabase(decimal/16, base);
                            System.out.print("B");
                            break;
                        case 12:
                            transformabase(decimal/16, base);
                            System.out.print("C");
                            break;
                        case 13:
                            transformabase(decimal/16, base);
                            System.out.print("D");
                            break;
                        case 14:
                            transformabase(decimal/16, base);
                            System.out.print("E");
                            break;
                        case 15:
                            transformabase(decimal/16, base);
                            System.out.print("F");
                            break;
                        default: 
                            transformabase(decimal/16, base);
                            System.out.print(decimal%16);
                    }
                }else{
                    System.out.print("");
                }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eje6 eje6 = new eje6();
        System.out.println("Introduzca un Nº decimal:");
        int decimal = sc.nextInt();
        System.out.println("A que base desea transformarlo?");
        int base = sc.nextInt();
        System.out.print("El Nº " + decimal + " en base de " + base + " es: ");
        eje6.transformabase(decimal, base);
    }
}