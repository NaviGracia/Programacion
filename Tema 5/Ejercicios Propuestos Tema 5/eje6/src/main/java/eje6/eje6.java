package eje6;

import java.util.Scanner;

public class eje6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ale ="";
        while(!ale.equals("FIN")){
            System.out.println("Introduzca la información para acabar el bucle");
            ale = sc.nextLine();
        } 
    }
}