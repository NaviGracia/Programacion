package eje10;

import java.util.Scanner;

public class eje10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAdivinar = (int)Math.floor(Math.random()*(1-100+1)+100);
        int nIntroducido = 0;
        for(int intentos = 10; intentos>=0; intentos--){
            if(intentos>0){
                System.out.println("Intento Nº" + intentos);
                System.out.println("Intente adivinar el Nº: ");
                nIntroducido = sc.nextInt();
                if(nIntroducido<nAdivinar){
                    System.out.println("Es mayor que " + nIntroducido);
                }if (nIntroducido>nAdivinar){
                    System.out.println("Es menor que " + nIntroducido);
                }
                if(nIntroducido==nAdivinar){
                    System.out.println("Correcto!. Has Ganado!");
                    System.out.println("Adivinado en el Intento Nº" + intentos);
                    break;
                } else{
                    System.out.println("Nº Incorrecto!");
                }
            } if(intentos==0){
                System.out.println("Game Over!");
                System.out.println("El Nº era: " + nAdivinar);
                break;
            }
        }
    }
}