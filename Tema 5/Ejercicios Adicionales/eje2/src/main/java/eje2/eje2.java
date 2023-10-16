package eje2;

import java.util.Scanner;

public class eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String confirmacion;
        int x = 0;
        do{
            System.out.println("Introduzca un Nº");
            x = sc.nextInt() + x;
            System.out.println("Quiere introducir algún Nº más?");
            confirmacion = sc.nextLine();
        } while(!confirmacion.equals("No"));
        System.out.println("terminado");
    }
}