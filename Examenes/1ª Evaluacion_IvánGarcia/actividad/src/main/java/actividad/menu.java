package actividad;

import java.util.Scanner;

public class menu {
    /*2.- B */
    public static int sumaEspecial(int num){
        int suma = 0;
        for(int numInicial = 1; numInicial<num; numInicial++){
            if (numInicial%3==0 || numInicial%5==0) {
                suma+=numInicial;
            }            
        } 
        return suma;
    }
    /*3.- M */
    public static String sumaBinaria(String bin1, String bin2){
        String resultado = "";
        char comprobacion = 1;
        if (bin1.length()>=bin2.length()) {
            for(int pos = 0; pos<=bin1.length(); pos++){
                if (bin1.charAt(pos)==comprobacion && bin2.charAt(pos)==comprobacion) {
                    resultado = "correcto";
                }
            }   
        }
        return resultado;
    }
    /*4.- B */
    public static int potenciaRecursiva(int base, int exponente){
        if (exponente>0) {
            int resultado = base * potenciaRecursiva(base, exponente-1);
            return resultado;
        }else{
            return 1;
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*1.- B */
        int nElegido = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        do{
            System.out.println("Menú Examen 1ª Evaluación:");
            System.out.println("1-. Calculadora de Sumas especiales");
            System.out.println("2-. Suma binaria");
            System.out.println("3-. Potencia Recursiva");
            System.out.println("4-. Salir");
            nElegido = sc.nextInt();
            if (cont1==1 || cont2 == 1 || cont3 == 1) {
                System.out.println("No repitas");
                break;
            }
            /*No acabado lo anterior */
            switch(nElegido){
                /*2.- B */
                case 1: 
                    System.out.println("Ingrese un Nº positivo: ");
                    int num = sc.nextInt();
                    System.out.println("La suma de los múltiplos de 3 o 5 menores que " + num + " es: " + sumaEspecial(num));
                    cont1++;
                    break;
                /*3.- M */
                case 2:
                    String bin1, bin2; 
                     /*do{*/
                        System.out.println("Ingrese el primer Nº binario: ");
                        sc.nextLine();
                        bin1 = sc.nextLine();
                        System.out.println("Ingrese el segundo Nº binario: ");
                        bin2 = sc.nextLine();
                        /*if (sumaBinaria(bin1, bin2).equals("No")) {
                            System.out.println("Error, por favor vuelva a ingresar los nº correctamente.");
                        }
                    } while ((sumaBinaria(bin1, bin2).equals("No")));*/
                    System.out.println("La suma del nº binario " + bin1 + " y " + bin2 + " es: " + sumaBinaria(bin1, bin2));
                    cont2++;
                    break;
                /*4.- B */
                case 3:
                    System.out.println("Ingrese la base: ");
                    int base = sc.nextInt();
                    System.out.println("Ingrese el exponente: ");
                    int exponente = sc.nextInt();
                    System.out.println("El resultado de la base " + base + " y del exponente " + exponente + " es: " + potenciaRecursiva(base, exponente));
                    cont3++;
            }
        }while(nElegido != 4);
    }
}
/* .charAt */