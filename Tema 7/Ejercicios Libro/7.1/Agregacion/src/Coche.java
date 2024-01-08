public class Coche {
    private Motores[] motores = new Motores[3];
    private int numMotores = 0;

    public Coche(){}

    public void addMotor(Motores motor){
        motores[numMotores] = motor;
        numMotores++;
   }
}
