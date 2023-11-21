package eje7;

import java.util.Scanner;

public class eje7 {
    public static boolean esCapicua(int dato){
        Integer i = Integer.valueOf(dato);
        String opu = new StringBuffer(i.toString()).reverse().toString();
        return i.toString().equals(opu);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nº que desea comprobar si es capicua: ");
        int dato = sc.nextInt();
        System.out.println(esCapicua(dato));
    }
}