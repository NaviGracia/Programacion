public class Punto{
    private int x;
    private int y;
    
    public Punto(int coord_X, int coord_Y){
        x = coord_X;
        y = coord_Y;
    }
    public Punto(){
        x=0;
        y=0;
    }

   public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
