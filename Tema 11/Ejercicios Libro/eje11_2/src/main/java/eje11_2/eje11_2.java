package eje11_2;

import java.util.Scanner;

public class eje11_2 {
    void binario(int n){
        if (n==0) {
            System.out.print("0");
        } if (n==1) {
            System.out.print("1");
        }if (n>1) {
            binario(n/2);
            System.out.print((n%2));
        }
    }
    public static void main(String[] args) {
        eje11_2 eje11_2 = new eje11_2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un Nº Decimal:");
        int n = sc.nextInt();
        eje11_2.binario(n);
    }
}