package Password;

public class Password {
    //Object variables
    private int longitud = 8;
    private String password = "12345";
    private int numMay = 0;
    private int numMin = 0;
    private int numNum = 0;

    //Get & Setters
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    
    //Constructores
    public Password(){}
                          
    public Password(int longitud, String password){
        this.longitud = longitud;
        this.password = generarPassword(longitud, longitud, longitud, longitud);
    }

    //Métodos
    String generarPassword(int longitud, int numMay, int numMin, int numNum){
        String password = "";
        for(int cont = 0; cont<this.longitud; cont++){
            switch ((int) (Math.random()*(4-1)+1)) {
                case 1:
                    password += (char) (Math.random()*(26-1)+'a');
                    numMin++;
                    break;
        
                case 2:
                    password += (char) (Math.random()*(26-1)+'A');
                    numMay++;
                    break;
                
                case 3:
                    password += (char) (Math.random()*(10-1)+'0');
                    numNum++;
                    break;
            }
        }
        return password;
    }

    boolean esFuerte(int longitud, String password, int numMay, int numMin, int numNum){
        if (numMay>2&&numMin>1&&numNum>5) {
            return true;
        }
        return false;
    }
}
