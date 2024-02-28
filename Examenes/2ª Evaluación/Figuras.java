public class Figuras implements Dimensiones{
    private String tipo;
    private double base;
    private double altura;
    
    

    public Figuras(String tipo, double base, double altura) {
        this.tipo = tipo;
        this.base = base;
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase2(){};

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Figura: " + tipo + "\n Base(lado): " + base + "\n Altura: " + altura;
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 0;
    }
}
