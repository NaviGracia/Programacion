package persona.viajero;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        int num1 = num.nextInt(99);
        int num2 = num.nextInt(99);
        System.out.println("Nº 1: " + num1 + " | Nº2: " + num2);
        System.out.println("El Nº mayor es: " + Math.max(num1, num2));
    }
}