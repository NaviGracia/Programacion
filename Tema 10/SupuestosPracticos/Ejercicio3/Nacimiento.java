package SupuestosPracticos.Ejercicio3;

import java.util.Scanner;

public class Nacimiento {
    static Scanner sc = new Scanner(System.in);
    public static void anioNacimiento() throws Exception{
        System.out.println("Ingrese un año de nacimiento:");
        int anioNacimiento = sc.nextInt();
        if (anioNacimiento < 0) {
            throw new Exception();
        }else{
            System.out.println("Tu año de nacimiento es:" + anioNacimiento);
        }

    }
    public static void main(String[] args)  {
        try {
            anioNacimiento();
        } catch (Exception e) {
            System.out.println("El nº introducido no es válido, prueba con uno positivo.");
        }
    }
}
