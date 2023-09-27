public class Test {
    public static char getLetras(){
        return (char) (Math.random() *26 + 'a');
    }
    public static void main(String[] args) throws Exception {
        System.out.println(getLetras());
        System.out.println(getLetras());
        System.out.println(getLetras());
        System.out.println(getLetras());
    }
}
