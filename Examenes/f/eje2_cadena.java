package actividad2;

import java.util.Scanner;

public class eje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena de texto: ");
        String cadena = sc.nextLine();
        if (cadena.length()%2==0) {
            System.out.print(cadena.charAt(cadena.length()/2-1));    
        }
        
    }
}