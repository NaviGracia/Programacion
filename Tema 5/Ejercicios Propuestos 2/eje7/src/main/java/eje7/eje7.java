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
        int miles = (num/1000)%10;
        int centenas = (num/100)%10;
        int decenas = (num/10)%10;
        int unidades = num%10; 
        String m = "", c = "", d = "", u = "";
        switch (miles){
            case 1: m = "M";
            break;
            case 2: m = "MM";
            break;
            case 3: m = "MMM";
            break;
        }
        switch(centenas){
            case 1: c = "C";
            break;
            case 2: c = "CC";
            break;
            case 3: c = "CCC";
            break;
            case 4: c = "CD";
            break;
            case 5: c = "D";
            break;
            case 6: c = "DC";
            break;
            case 7: c = "DCC";
            break;
            case 8: c = "DCCC";
            break;
            case 9: c = "CM";
            break;
        }
        switch(decenas){
            case 1: d = "X";
            break;
            case 2: d = "XX";
            break;
            case 3: d = "XXX";
            break;
            case 4: d = "XL";
            break;
            case 5: d = "L";
            break;
            case 6: d = "LX";
            break;
            case 7: d = "LXX";
            break;
            case 8: d = "LXXX";
            break;
            case 9: d = "XC";
            break;
        }
        switch(unidades){
            case 1: u = "I";
            break;
            case 2: u = "II";
            break;
            case 3: u = "III";
            break;
            case 4: u = "IV";
            break;
            case 5: u = "V";
            break;
            case 6: u = "VI";
            break;
            case 7: u = "VII";
            break;
            case 8: u = "VIII";
            break;
            case 9: u = "IX";
            break;
        }
        System.out.println("El Nº: " + num + " en Nº Romanos es: " + m + c + d + u);
    }
}