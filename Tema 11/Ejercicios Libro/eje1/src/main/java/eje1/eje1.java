package eje1;

public class eje1 {
    static void recursivo(int a){
        System.out.println(a);
        recursivo(a+1);   
    }
    public static void main(String[] args) {
        int a = 0;
        recursivo(a);
    }
}