package eje7;

public class eje7 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i<=n; i++) {
            for(int j = n-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(n + " ");
            }
            System.out.println("");
        }
    }
}