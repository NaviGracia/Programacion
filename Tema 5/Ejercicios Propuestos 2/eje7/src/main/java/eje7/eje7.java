package eje7;

import java.util.Scanner;

public class eje7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Introduzca un número entre 1 y 3999:");
            num = sc.nextInt();
        } while ((num<1) || (num>3999));
        int miles = num/1000;
        int centenas = (num/100)%10;
        int decenas = (num/10)%10;
        int unidades = num%10; 
        String m = "", c = "", d = "", u = "";
        switch (miles){
            case 1: m = "M";
            case 2: m = "MM";
            case 3: m = "MMM";
        }
        switch(centenas){
            case 1: c = "C";
            case 2: c = "CC";
            case 3: c = "CCC";
            case 4: c = "CD";
            case 5: c = "D";
            case 6: c = "DC";
            case 7: c = "DCC";
            case 8: c = "DCCC";
            case 9: c = "CM";
        }
        switch(decenas){
            case 1: d = "X";
            case 2: d = "XX";
            case 3: d = "XXX";
            case 4: d = "XL";
            case 5: d = "L";
            case 6: d = "LX";
            case 7: d = "LXX";
            case 8: d = "LXXX";
            case 9: d = "XC";
        }
        switch(unidades){
            case 1: u = "I";
            case 2: u = "II";
            case 3: u = "III";
            case 4: u = "IV";
            case 5: u = "V";
            case 6: u = "VI";
            case 7: u = "VII";
            case 8: u = "VIII";
            case 9: u = "IX";
        }
        System.out.println("El Nº: " + num + " en Nº Romanos es: " + m + c + d + u);
    }
}