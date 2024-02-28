public class Trapecio extends Figuras{
    private double base2;


    public Trapecio(String tipo, double base, double altura, double base2) {
        super(tipo, base, altura);
        this.base2 = base2;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n base2: " + base2;
    }

    
    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return ((getbase2()+base2)*getAltura())/2;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return ;
    }
}
