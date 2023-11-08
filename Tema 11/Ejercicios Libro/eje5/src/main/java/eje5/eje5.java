package eje5;

import java.util.Scanner;

public class eje5 {
    int division (int dividendo, int divisor, int cociente){
        if (divisor>dividendo) {
            return cociente;
        }else{
            cociente = division(dividendo-divisor, divisor,cociente+1);
            return cociente;
        }
    }
    int resto (int dividendo, int divisor){
        int resto = 0;
        if (divisor>dividendo) {
            resto = dividendo;
            return resto;
        } else{
            resto = resto(dividendo-divisor, divisor);
            return resto;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eje5 eje5 = new eje5();
        System.out.println("Introduzca el dividendo:");
        int dividendo = sc.nextInt();
        System.out.println("Introduzca el divisor:");
        int divisor = sc.nextInt();
        int cociente = 0;
        System.out.println(dividendo + " dividido " + divisor + " es: " + eje5.division(dividendo, divisor, cociente) + " y resto de " + eje5.resto(dividendo, divisor));
    }
}