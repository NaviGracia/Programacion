package eje8_4;

public class eje8_4 {

    public static void main(String[] args) {
        int cont = 0;
        int prueba = 0;
        for(int posicion = 0; posicion<args.length; cont++){
            for(int posicionComparacion = 0; posicionComparacion<args.length; posicionComparacion++){
                if (args[posicion].compareToIgnoreCase(args[posicionComparacion])==0) {
                    cont = cont+1;
                }else{
                    prueba=prueba++;
                }/*Problemas con la repetición: Bucle Infinito*/ */
                System.out.println(args[posicion].compareToIgnoreCase(args[posicionComparacion]));
            }
        }
        System.out.println(cont);
    }
}