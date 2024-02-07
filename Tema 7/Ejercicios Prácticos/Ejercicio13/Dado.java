package Ejercicio13;


public class Dado extends Sorteo{
 @Override
 public int lanzar() {
    int dado = (int) (Math.random()*(6-1)+1);
    return dado;
 }
}
