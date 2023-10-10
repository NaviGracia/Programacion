package eje4;

import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el día de nacimiento:");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes de nacimiento:");
        int mes = sc.nextInt();
        System.out.println("Introduzca el año de nacimiento:");
        int año = sc.nextInt();
        int total = dia + mes + año;
        int sumatotal = (((total/1000)%10) + ((total/100)%10) + ((total/10)%10) + (total%10));
        int sumafinal = (((sumatotal/100)%10) + ((sumatotal/10)%10) + (sumatotal%10));
        System.out.println("Tu numero de la suerte es:" + sumafinal);
    }

}