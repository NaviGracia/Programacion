package eje6;

import java.util.Scanner;

public class eje6 {
    public static void main(String[] args) {
        int n = 1;
        int comp = 0;
        int comp2 = 0;
        while (n<=100){
            int pruebas = n;
            if(pruebas%2==1){
                comp = 1;
            } if(pruebas%2==0){
                comp=0;
            }
            if(pruebas%3!=0){
                comp2 = 1;
            } if(pruebas%3==0){
                comp2=0;
            }
            if((comp==1)&&(comp2==1)){
                System.out.println(n);
            }
            n++;
        }
    }
}