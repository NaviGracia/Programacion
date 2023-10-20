package eje8;

import java.util.Scanner;

public class eje8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el día: ");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduzca el año: ");
        int año = sc.nextInt();
        if (año>0){
            switch(mes){
                case 1: if((dia>0)&&(dia<=31)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                break;
                case 2: 
                    if((mes%4==0)&&(mes%100!=0)||(mes%400==0)){
                        if((dia>0)&&(dia<=29)){
                            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                        } else{
                            System.out.println("Fecha Incorrecta.");
                        }
                    } if((dia>0)&&(dia<=28)){
                            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                        } else{
                            System.out.println("Fecha Incorrecta.");
                        }
                break;
                case 3: if((dia>0)&&(dia<=31)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                break;
                case 4: if((dia>0)&&(dia<=30)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                break;
                case 5: if((dia>0)&&(dia<=31)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                break;
                case 6: if((dia>0)&&(dia<=30)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + "es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                break;
                case 7: if((dia>0)&&(dia<=31)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + "es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                break;
                case 8: if((dia>0)&&(dia<=31)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + "es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                case 9: if((dia>0)&&(dia<=30)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + "es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                case 10: if((dia>0)&&(dia<=31)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + "es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                case 11: if((dia>0)&&(dia<=30)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + "es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
                case 12: if((dia>0)&&(dia<=31)){
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + "es correcta.");
                } else{
                    System.out.println("Fecha Incorrecta.");
                }
            }
        } else{
            System.out.println("Fecha Incorrecta");
        }
    }
}