package eje3;

import java.util.Scanner;

public class eje3 {
    void quitaletras(String texto){
        if (texto.length()>1) {
            System.out.println(texto);
            quitaletras(texto.substring(0, texto.length()-1));
            
        
        }else{
        System.out.println(texto);
        } 
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eje3 eje3 = new eje3();
        System.out.println("Ingrese la palabra deseada por su mente:");
        String texto = sc.nextLine();
        eje3.quitaletras(texto);
    }
}
