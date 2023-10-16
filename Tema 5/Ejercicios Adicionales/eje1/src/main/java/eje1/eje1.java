package eje1;

import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo:");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el Nº de modulos cursados:");
        int modulos = sc.nextInt();
        double notas = 0;
        double media = 0;
        for(int contador = 0; contador<modulos; contador++){
            System.out.println("Introduzca una nota: ");
            notas = sc.nextDouble() + notas;
            media = notas/modulos;
        }
        System.out.println(nombre + ": " + media);
    }
}