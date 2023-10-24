package eje11;

import java.util.Scanner;

public class eje11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limInf = 0;
        int limSup = 0;
        int nSuma = 0;
        int nIntroducido = 0;
        int nOut = 0;
        String limInfRepetido = "No";
        String limSupRepetido = "No";
        do{
            System.out.println("Ingrese límite inferior:");
            limInf = sc.nextInt();
            System.out.println("Ingrese el límite superior:");
            limSup = sc.nextInt();
        } while (limInf>limSup);
        do{
            System.out.println("Ingrese un Nº: ");
            nIntroducido = sc.nextInt();
            if((nIntroducido>=limInf)&&(nIntroducido<=limSup)){
                nSuma = nSuma + nIntroducido;
            } else{
                nOut++;
            }
            if(nIntroducido==limInf){
                limInfRepetido = "Si";
            }if(nIntroducido==limSup){
                limSupRepetido = "Si";
            }
        }while(nIntroducido!=0);
        System.out.println("La suma de todos los Nº dentro del intervalo es: " + nSuma);
        System.out.println("Has introducido " + nOut + "Nºs fuera del intervalo");
        System.out.println("Nº introducido igual al límite inferior: " + limInfRepetido);
        System.out.println("Nº introducido igual al límite superior: " + limSupRepetido);
    }
}