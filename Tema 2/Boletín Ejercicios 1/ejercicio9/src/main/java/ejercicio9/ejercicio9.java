package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Cual es su nombre?");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Buenos días " + nombre);
    }
}