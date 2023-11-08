package eje8_1;

public class eje8_1 {
    public static void main(String[] args) {
        int [] x;
        x = new int [100];
        for(int cont = 0; cont <= x.length; cont++){
            x[cont] = (int) (Math.random()*10)+1;
            System.out.println(x[cont]);
        }
    }
}