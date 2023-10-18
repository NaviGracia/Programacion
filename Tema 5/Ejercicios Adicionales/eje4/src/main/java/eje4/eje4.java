package eje4;

import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passw = "";
        int intento = 0;
        for (intento = 3; intento>0; intento--){
            System.out.println("Le quedan " + intento + " intentos.");
            System.out.println("Introduzca la contraseña: ");
            passw = sc.nextLine();
            if(passw.equals("1234")){
                System.out.println("Enhorabuena!");
                break;
            }else{
            System.out.println("Contraseña Incorrecta. Vuelva a intentarlo.");
            }
        }
        if(intento==0){
            System.out.println("Bloqueado. Inténtelo en 30 minutos");
        }
    }
}