package Password;

public class Password {
    //Object variables
    private int longitud = 8;
    private String password = "12345";

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
        this.password = generarPassword(longitud);
    }

    //Métodos
    String generarPassword(int longitud){
        String password = "";
        for(int cont = 0; cont<this.longitud; cont++){
            switch ((int) (Math.random()*(4-1)+1)) {
                case 1:
                    password += (char) (Math.random()*(26-1)+'a');
                    break;
        
                case 2:
                    password += (char) (Math.random()*(26-1)+'A');
                    break;
                
                case 3:
                    password += (char) (Math.random()*(10-1)+'0');
                    break;
            }
        }
        return password;
    }

    boolean esFuerte(String password){
        int numMin = 0;
        int numMaj = 0;
        int numNum = 0;
        for(int pos = 1; pos < password.length(); pos++){
            switch (password.charAt(pos)) {
                case 'a': numMin++;
                break;
                case 'b': numMin++;
                break;
                case 'c': numMin++;
                break;
                case 'd': numMin++;
                break;
                case 'e': numMin++;
                break;
                case 'f': numMin++;
                break;
                case 'g': numMin++;
                break;
                case 'h': numMin++;
                break;
                case 'i': numMin++;
                break;
                case 'j': numMin++;
                break;
                case 'k': numMin++;
                break;
                case 'l': numMin++;
                break;
                case 'm': numMin++;
                break;
                case 'n': numMin++;
                break;
                case 'o': numMin++;
                break;
                case 'p': numMin++;
                break;
                case 'q': numMin++;
                break;
                case 'r': numMin++;
                break;
                case 's': numMin++;
                break;
                case 't': numMin++;
                break;
                case 'u': numMin++;
                break;
                case 'v': numMin++;
                break;
                case 'w': numMin++;
                break;
                case 'x': numMin++;
                break;
                case 'y': numMin++;
                break;
                case 'z': numMin++;
                break;
                case 'A': numMaj++;
                break;
                case 'B': numMaj++;
                break;
                case 'C': numMaj++;
                break;
                case 'D': numMaj++;
                break;
                case 'E': numMaj++;
                break;
                case 'F': numMaj++;
                break;
                case 'G': numMaj++;
                break;
                case 'H': numMaj++;
                break;
                case 'I': numMaj++;
                break;
                case 'J': numMaj++;
                break;
                case 'K': numMaj++;
                break;
                case 'L': numMaj++;
                break;
                case 'M': numMaj++;
                break;
                case 'N': numMaj++;
                break;
                case 'O': numMaj++;
                break;
                case 'P': numMaj++;
                break;
                case 'Q': numMaj++;
                break;
                case 'R': numMaj++;
                break;
                case 'S': numMaj++;
                break;
                case 'T': numMaj++;
                break;
                case 'U': numMaj++;
                break;
                case 'V': numMaj++;
                break;
                case 'W': numMaj++;
                break;
                case 'X': numMaj++;
                break;
                case 'Y': numMaj++;
                break;
                case 'Z': numMaj++;
                break;
                case '1': numNum++;
                break;
                case '2': numNum++;
                break;
                case '3': numNum++;
                break;
                case '4': numNum++;
                break;
                case '5': numNum++;
                break;
                case '6': numNum++;
                break;
                case '7': numNum++;
                break;
                case '8': numNum++;
                break;
                case '9': numNum++;
                break;
            }
        }
        if (numMaj>1&&numMin>2&&numNum>5) {
            return true;
        } else{
            return false;
        }
    }
}
