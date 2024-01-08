public class Agregacion {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.addMotor(new Motores("Motor Bev Long"));
        coche.addMotor(new Motores("Motor Kia Sport"));
    }
}
