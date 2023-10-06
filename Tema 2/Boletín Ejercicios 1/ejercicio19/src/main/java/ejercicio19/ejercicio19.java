package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su dia de nacimiento:");
        int dia = sc.nextInt();
        System.out.println("Introduzca su mes de nacimiento en formato númerico:");
        int mes = sc.nextInt();
        System.out.println("Introduzca su año de nacimiento:");
        int año = sc.nextInt();
        int sumadia = ((dia/10)%10) + (dia%10);
        int sumames = ((mes/10)%10) + (mes%10);
        int sumaño = ((año/1000)%10) + ((año/100)%10) + ((año/10)%10) + (año%10);
        int sumasemitotal = sumadia + sumaño + sumames;
        int sumafinal = ((sumasemitotal/10)%10) + (sumasemitotal%10);
        System.out.println("Tu número de la suerte es " + sumafinal);
    }
}