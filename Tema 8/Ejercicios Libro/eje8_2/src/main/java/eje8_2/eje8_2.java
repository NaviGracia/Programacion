package eje8_2;

public class eje8_2 {
    int suma (int [] x){
        int total = 0;
        for(int cont = x.length-1; cont >=0; cont--){
            x[cont] = (int)(Math.random()*10)+1;
            total+= x[cont];
        }
        return total;
    }
    public static void main(String[] args) {
        eje8_2 eje8_2 = new eje8_2();
        int [] x;
        x = new int [100];
        System.out.println(eje8_2.suma(x));
    }
}