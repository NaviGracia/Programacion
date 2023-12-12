package Persona;

public class Persona {

    /*Atributo de objeto constante */
    private final char sexoVariableConstante = 'H'; 
    private char sexo=sexoVariableConstante;

    /*Atributos de objeto */
    private String nombre = "Ivan";
    private int edad = 1;
    private double peso = 10;
    private double altura = 10;

    /*Atributo de clase */
    private int instanciasCreadas = 0;

    /* Constructores */
    Persona() { 
        instanciasCreadas++;
    }

    Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo, sexoVariableConstante);
        instanciasCreadas++;
    }

    Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo, sexoVariableConstante);
        this.peso = peso;
        this.altura = altura;
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

    int calcularIMC(int peso, int altura){
        int imc = peso/(altura*2);
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

}

