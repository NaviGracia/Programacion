package eje9;

import java.util.Scanner;

public class eje9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Nº:");
        int x = sc.nextInt();
        int nSinSaltar = 0;
        int nNecesariosParaSaltar = 1;
        for(int y = 1; y<=x; y++){
            if (nSinSaltar<nNecesariosParaSaltar){
                System.out.print(y + " ");
                nSinSaltar++;
            } if(nSinSaltar==nNecesariosParaSaltar){
                System.out.println("");
                nSinSaltar=0;
                nNecesariosParaSaltar++;
            }
            }
        }
}