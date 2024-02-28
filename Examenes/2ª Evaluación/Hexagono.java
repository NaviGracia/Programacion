public class Hexagono extends Figuras{
    public Hexagono(String tipo, double base, double altura) {
        super(tipo, base, altura);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return (calcularPerimetro()*(getAltura()/2))/2;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 6*getBase();
    }

}
