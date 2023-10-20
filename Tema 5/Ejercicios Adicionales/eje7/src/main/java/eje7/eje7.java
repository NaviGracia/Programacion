package eje7;

import java.util.Scanner;

public class eje7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Nº 1:");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el signo aritmético:");
        String signo = sc.nextLine();
        System.out.println("Ingrese Nº 2:");
        int y = sc.nextInt();
        int potencia = 0;
        switch(signo){
            case "+":System.out.println(x + y);
            break;
            case "-": System.out.println(x - y);
            break;
            case "*": System.out.println(x * y);
            break;
            case "/": System.out.println(x / y);
            break;
            case "^": 
                if(y!=1){
                    potencia = x*x;
                    for(int j = 2; j<y; j++){
                        potencia = potencia*x;
                    }
                } if(y==1){
                    potencia = x;
                }
                System.out.println(potencia);
            case "%": System.out.println(x % y); 
        }
    }
}