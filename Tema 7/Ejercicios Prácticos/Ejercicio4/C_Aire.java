package Ejercicio4;

public class C_Aire extends Congelados{
    double nitrogeno;
    double oxigeno;
    double dioxidoCarbono;
    double vaporAgua;

    public C_Aire(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen,
            int temperaturaRecomendada, double nitrogeno, double oxigeno, double dioxidoCarbono, double vaporAgua) {
        super(numLote, fechaEnvasado, fechaCaducidad, paisOrigen, temperaturaRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public void setDioxidoCarbono(double dioxidoCarbono) {
        this.dioxidoCarbono = dioxidoCarbono;
    }

    public double getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(double vaporAgua) {
        this.vaporAgua = vaporAgua;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n Composición: " + "\n" + nitrogeno + "% de Nitrógeno" + "\n" + oxigeno + "% de Oxígeno" + "\n" + dioxidoCarbono + "% de Dióxido de Carbono" + "\n" + vaporAgua + "% de Vapor de Agua";
    }

}
