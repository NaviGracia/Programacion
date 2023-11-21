package eje8;

public class eje8 {
    public static void main(String[] args) {
        String notasAlumnos = "Sergio/n8.5/nMario/n4.9/nPedro/n3.8/nAndrés/n6.3";
        String[] separado = notasAlumnos.split("/n");
        String[] alumnos;
        alumnos = new String[separado.length/2];
        int posNombres = 0;
        double[] notas;
        notas = new double[separado.length/2];
        int posNum = 0;
        for(int pos = 0; pos < separado.length; pos++){
            if ((pos==0) || (pos%2==0)) {               
                alumnos[posNombres] = separado[pos];
                posNombres+=1;
            } else{
                double resultado = Double.valueOf(separado[pos]);
                notas[posNum] = resultado;
                posNum+=1;
            }
        }
        
        for(int pos = 0; pos<alumnos.length; pos++){
            System.out.println(alumnos[pos] + " ha sacado un " + notas[pos]);
        }
    }
}