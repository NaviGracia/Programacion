package eje8_4;

public class eje8_4 {

    public static void main(String[] args) {
        int prueba = 0;
        int nPalabrasDistintas = 1;
        for(int posicion = 0; posicion<args.length; posicion++){
            int cont = 0;
            for(int posicionComparacion = 0; posicionComparacion<posicion; posicionComparacion++){
                if (args[posicion].compareToIgnoreCase(args[posicionComparacion])==0) {
                    prueba=prueba++;
                }else{
                    cont++;
                }
                if (cont==posicion) {
                    nPalabrasDistintas++;
                }
            }
        }
        System.out.println("El Nº de palabras diferentes es: " + nPalabrasDistintas);
    }
}