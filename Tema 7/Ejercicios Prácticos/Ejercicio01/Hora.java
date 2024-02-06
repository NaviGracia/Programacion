package Ejercicio01;

public class Hora {
    int hora;
    int minuto;

    Hora(int hora, int minuto){
        this.hora=hora;
        this.minuto=minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    @Override
    public String toString() {
        return hora+":"+minuto;
    }
}
