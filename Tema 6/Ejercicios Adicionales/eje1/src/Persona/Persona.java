package Persona;

public class Persona {

    /*Atributo de objeto constante */
    private final char sexoVariableConstante = 'H'; 
    private char sexo=sexoVariableConstante;

    /*Atributos de objeto */
    private String nombre = "Ivan";
    private int edad = 18;
    private double peso = 85;
    private double altura = 1.88;
    private String dni;



    /*Atributo de clase */
    private int instanciasCreadas = 0;

    /* Constructores */
    Persona() { 
        instanciasCreadas++;
        this.dni = generaDNI();
    }

    Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo, sexoVariableConstante);
        this.dni = generaDNI();
        instanciasCreadas++;
    }

    Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo, sexoVariableConstante);
        this.peso = peso;
        this.altura = altura;
        this.dni = generaDNI();
        instanciasCreadas++;
    }

    /*Getters y Setters de atributos de objeto */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return comprobarSexo(sexo, sexoVariableConstante);
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo, sexoVariableConstante);
    }

    public String getDni() {
        return generaDNI();
    }

    public void setDni(String dni) {
        this.dni = generaDNI();
    }

    /* get del atributo de clase */
    public int getInstanciasCreadas() {
        return instanciasCreadas;
    }

    boolean esMayorDeEdad(int edad){
        boolean mayorEdad = false;
        if (edad>=18) {
            mayorEdad=true;
        }
        return mayorEdad;
    }

    private char comprobarSexo(char sexo, char sexoVariableConstante){
        if (sexo == sexoVariableConstante) {
            sexo = sexoVariableConstante;
        }else{
            sexo = 'M';
        }
        return sexo;
    }

    int calcularIMC(double peso, double altura){
        double imc = peso/(altura*2);
        if (imc<20) {
            final int debajoPesoIdeal = -1;
            return debajoPesoIdeal;
        }if (imc>25) {
            final int encimaPesoIdeal = 1;
            return encimaPesoIdeal;
        }else{
            final int pesoIdeal = 0;
            return pesoIdeal;
        }
    }
    
    public String toString() {
        return "Paciente: " + nombre + "\n Edad: " + edad + " años" + "\n Sexo: " + sexo + "\n Peso: " + peso + " kg" + "\n Altura: " + altura + " metros" + "\n DNI: " + dni;
    }

    private String generaDNI(){
        int numDNI = (int)(Math.random()*(99999999-10000000));
        String dni = String.valueOf(numDNI);
        int divLetraDNI = numDNI%23;
        switch(divLetraDNI){
            case 0: dni = dni + "T";
            break;
            case 1: dni = dni + "R";
            break;
            case 2: dni = dni + "W";
            break;
            case 3: dni = dni + "A";
            break;
            case 4: dni = dni + "G";
            break;
            case 5: dni = dni + "M";
            break;
            case 6: dni = dni + "Y";
            break;
            case 7: dni = dni + "F";
            break;
            case 8: dni = dni + "P";
            break;
            case 9: dni = dni + "D";
            break;
            case 10: dni = dni + "X";
            break;
            case 11: dni = dni + "B";
            break;
            case 12: dni = dni + "N";
            break;
            case 13: dni = dni + "J";
            break;
            case 14: dni = dni + "Z";
            break;
            case 15: dni = dni + "S";
            break;
            case 16: dni = dni + "Q";
            break;
            case 17: dni = dni + "V";
            break;
            case 18: dni = dni + "H";
            break;
            case 19: dni = dni + "L";
            break;
            case 20: dni = dni + "C";
            break;
            case 21: dni = dni + "A";
            break;
            case 22: dni = dni + "E";
            break;
        }
        return dni;
    }
}

