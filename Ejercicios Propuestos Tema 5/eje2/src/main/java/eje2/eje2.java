package eje2;

public class eje2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if ((num%4 == 0) && (num%100 != 0) && (num%400 == 0))
            System.out.println("Es bisiesto");
        else
            System.out.println("No es bisiesto");
    }
}