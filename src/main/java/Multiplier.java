public class Multiplier {

    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 21;

        int result =  multiply(firstNumber, secondNumber);

        System.out.println("Das Ergebnis ist: " + result);
    }

    public static int multiply(int value1, int value2) {
        return value1 + value2;
    }

}
