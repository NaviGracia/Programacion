package eje7;

import java.util.Scanner;

public class eje7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduzca un número entre 1 y 3999:");
            int X = sc.nextDouble();
        } while ((X<=3999) && (X>=1));
        int miles = N/1000;
        int centenas = (N/100)%10;
        int decimas = (N/10)%10;
        int unidades = N%10; 
        String m = "", c = "", d = "", u = "";
        switch (miles){
            case 1: m = "M";
            case 2: m = "MM";
            case 3: m = "MMM";
        }
        switch(centenas){
            case 1: c = "C";
            case 2: c = "CC";
            case 3: c = "CCC";

        }
    }
}