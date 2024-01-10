package Ejercicio1;

public class Fecha {
    int dia;
    int mes;
    int anyo;

    Fecha(int dia, int mes, int anyo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }
    
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnyo() {
        return anyo;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anyo;
    }
}
