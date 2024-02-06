package Ejercicio04;

public class Productos {
    int numLote;
    String fechaEnvasado;
    String fechaCaducidad;
    String paisOrigen;

    public Productos(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen) {
        this.numLote = numLote;
        this.fechaEnvasado = fechaEnvasado;
        this.fechaCaducidad = fechaCaducidad;
        this.paisOrigen = paisOrigen;
    }
    
    public int getNumLote() {
        return numLote;
    }
    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Nº de Lote: " + numLote + "\n Fecha de Envasado: " + fechaEnvasado + "\n Fecha de Caducidad: " + fechaCaducidad + "\n País Origen: " + paisOrigen;
    }
}
