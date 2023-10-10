package eje8;

public class eje8 {
    public static void main(String[] args) {
        System.out.println("Introduzca un texto: ");
        /*Muestra mensaje al usuario */
        while(true){ /*Mientras que sea verdad */
            int letra = System.in.read(); /*Lo que escriba el usuario se almacena en la variable letra */
            System.out.print((char) letra);/*Muestra mensaje al usuario de la variable letra en formato char */
        }
    }
}