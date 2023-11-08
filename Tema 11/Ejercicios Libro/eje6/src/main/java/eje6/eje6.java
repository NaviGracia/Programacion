package eje6;

public class eje6 {
    long multi (long [] vector1, int pos){
        if (pos<vector1.length) {
            return vector1[pos] * multi(vector1, pos+1);
        }
        return 1;

    }
    public static void main(String[] args) {
        eje6 eje6 = new eje6();
        long [] vector1;
        vector1 = new long[15];
        for (int x = 0; x<vector1.length;x++){
            vector1[x] = (int)(Math.random()*9)+1;
        }
        
        System.out.println("La multiplicación de los Nº generados aleatoriamente es: " + eje6.multi(vector1, 0));
        
    }
}
