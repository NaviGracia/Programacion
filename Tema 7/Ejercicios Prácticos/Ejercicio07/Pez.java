package Ejercicio07;

public class Pez {
    String nombre;
    private int numPeces = 1;

    public Pez(String nombre) {
        this.nombre = nombre;
        numPeces+=1;
    }

    public Pez(Pez p1){
        this.nombre = p1.nombre;
        this.numPeces = p1.numPeces;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPeces() {
        return numPeces;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Pez pezComp = (Pez)obj;
        return this.getNombre().equals(pezComp.getNombre());
    }
}
