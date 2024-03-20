package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaHolaMundo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("holamundo.txt"));
            System.out.println(br.readLine());
            /* int i;
            while ((i=br.read())!=-1) {
                System.out.println((char)i);
            } */
            br.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}