public class CalculatorApp {
    public static void main(String[] args) {
        double summand1 = 2.5;
        int summand2 = 7;
        double addition = Calculator.addition(summand1, summand2);
        System.out.printf("The result of %s and %s is %s", summand1, summand2, addition);
    }
}
