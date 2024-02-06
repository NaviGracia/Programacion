package Ejercicio04;

public class Congelados extends Productos{
    int temperaturaRecomendada;

    public Congelados(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen,
            int temperaturaRecomendada) {
        super(numLote, fechaEnvasado, fechaCaducidad, paisOrigen);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Temperatura Recomendada: " + temperaturaRecomendada + " ºC";
    }
}
