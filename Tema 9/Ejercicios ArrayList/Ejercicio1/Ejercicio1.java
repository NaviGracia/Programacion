package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList leerValores(ArrayList arrayEnteros){
        int num = 0;
        do{
            System.out.println("Introduzca el Nº" + arrayEnteros.size() + ":");
            num = sc.nextInt();
            if (num != -99) {
                arrayEnteros.add(num);   
            }
        }while(num != -99);
        return arrayEnteros;
    }

    public static int calcularSuma(ArrayList arrayEnteros){
        Iterator<Integer> iterador = arrayEnteros.iterator();
        int suma = 0;
        while (iterador.hasNext()) {
            suma+= iterador.next();
        }
        return suma;
    }

    public static void mostrarResultados(ArrayList arrayEnteros, int suma, int media){
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayEnteros = new ArrayList<>();
        leerValores(arrayEnteros);
        int suma = calcularSuma(arrayEnteros);
        int media = calcularSuma(arrayEnteros)/arrayEnteros.size();
        mostrarResultados(arrayEnteros, suma, media);
        
    }
}
