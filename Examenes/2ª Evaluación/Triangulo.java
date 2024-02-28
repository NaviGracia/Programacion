public class Triangulo extends Figuras{

    public Triangulo(String tipo, double base, double altura) {
        super(tipo, base, altura);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return (getBase()*getAltura())/2;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 1;
    }
    
    

}
