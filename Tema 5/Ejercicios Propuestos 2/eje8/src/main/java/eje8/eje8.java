package eje8;

import java.util.Scanner;

public class eje8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el numero:");
        int n = sc.nextInt();
        int par = 1;
        int r, m;
        int i =2;
        int alreves = 0;
        while (i<n){
            r = n%2;
            if (r == 0){
                par = 0;
            }
            i = i+1;
        }
        m = n;
        while (m>0){
            r = m%10;
            m = (m/10)%10;
            alreves = m*10 + r;
        }
        int esprimoA = 1;
        while (i<alreves%i){
            r = alreves%i;
            if (r==0){
                esprimoA = 0;
            }
            i = i + 1;
        }
        String omirp = "";
        if((par==1) && (esprimoA==1)){
            omirp = " es Omirp";
        } else 
        omirp = " no es Omirp";
        System.out.println("El Nº: " + n + omirp);
    }
}