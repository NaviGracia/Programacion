package eje1;

public class eje1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        if ((a >= b) && (a >= c)){
            System.out.println("Entre los Nº: " + a + " " + b + " " + c + " el mayor es: " + a);
        } if ((b >= a) && (b >= c)){
            System.out.println("Entre los Nº: " + a + " " + b + " " + c + " el mayor es: " + b);
        } if ((c >= a) && (c >= b)){
            System.out.println("Entre los Nº: " + a + " " + b + " " + c + " el mayor es: " + c);
        }
        if ((a <= b) && (a <= c)){
            System.out.println("Entre los Nº: " + a + " " + b + " " + c + " el menor es: " + a);
        } if ((b <= a) && (b <= c)){
            System.out.println("Entre los Nº: " + a + " " + b + " " + c + " el menor es: " + b);
        } if ((c <= a) && (c <= b)){
            System.out.println("Entre los Nº: " + a + " " + b + " " + c + " el menor es: " + c);
        }
    }
}