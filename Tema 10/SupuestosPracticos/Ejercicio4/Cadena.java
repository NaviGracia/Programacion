package SupuestosPracticos.Ejercicio4;

import java.util.Scanner;

public class Cadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena de caracteres:");
        String cadena = sc.nextLine();
        System.out.println("Ingrese la posicion del caracter que desea buscar:");
        int pos = sc.nextInt();
        try {
            System.out.println("Caracter buscado en la posición " + pos + " es: " + cadena.charAt(pos));
        } catch (Exception e) {
            System.out.println("Posición Introducida Incorrecta");
        }

    }
}