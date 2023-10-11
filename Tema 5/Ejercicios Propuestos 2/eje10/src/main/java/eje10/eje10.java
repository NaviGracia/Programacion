package eje10;

public class eje10 {
    public static void main(String[] args) {
        int x = 0;
        while(x<=100){
            if ((x>=0) && (x<=100)){
                x = x + 1;
                int y = x%5;
                if(y!=0){
                    System.out.println(x);
               }
        }
        }
    }
}