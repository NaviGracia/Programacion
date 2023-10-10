package eje6;

import java.util.*;

public class Test {
    public static void main ( String [ ] args) { 
        Random rnd = new Random();
        int valor = (100+rnd.nextInt((200+1)-100)); 
        System.out.println("El valor " + valor + ((valor%2 == 0) ? " es Par" : " es Impar"));
}
}
