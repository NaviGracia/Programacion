public class Rectangulo extends Figuras{
    public Rectangulo(String tipo, double base, double altura) {
        super(tipo, base, altura);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return (getBase()*getAltura());
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 2*calcularArea();
    }
}
