package eje10;

public class eje10 {
    public static void main(String[] args) {
        int t = 7850;
        int h = t/3600;
        int m = (t - (3600*h))/60;
        int s = t - ((h*3600)+(m*60));
        System.out.println(t + "s son simplificados en " + h + "h, " + m + "m y " + s + "s.");
    }
}