package eje1;

public class Main {
    public static void main(String[] args) {
        Sca
        System.out.println("Hello world!");
    }
}









































/* 
public static int funcion (int linea, int columnas, int contador){
        if ((columnas==1)) {
            return 1;
        } if ((columnas>1)&&(contador==columnas)) {
            return 1;
        }if (linea==2) {
            return 1;
        }if ((columnas>contador-2)&&(contador!=columnas)) {
            int resultado = (funcion(linea-1, columnas-2, contador-2) + funcion(linea-1, columnas-1, contador-2));
            return resultado;
        }if (columnas==2) {
            int resultado = (funcion((linea-1), columnas, contador-2) + funcion(linea-1, columnas-1, contador-2));
            return resultado;
        }else{
            int resultado = (funcion((linea - 1), (columnas), contador-2) + funcion((linea - 1), (columnas-1), contador-2) + funcion((linea - 1), (columnas-2), contador-2));
            return resultado;
        }
        
    }
    /*
    1
    111
    12321
    1367631
    --------
    1
    111
    12331
    1368779
    */
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eje5 eje5 = new eje5();
        int linea;
        int columna;
        int contador =  1;
        System.out.println("Introduzca el Nº:");
        int valorTotal = sc.nextInt();
        for (linea = 1; linea<valorTotal; linea++) {
            for(int j = 1; j<=valorTotal-linea; j++){
                System.out.print(" ");
            }
            for(columna=1; columna<2*linea; columna++){
                System.out.print(eje5.funcion(linea, columna,contador));
            }
            contador = contador+2;
            System.out.println("");
        }
    }
}
*/