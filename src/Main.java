public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexNumber a = new ComplexNumber(3, 2);
        ComplexNumber b = new ComplexNumber(1, -1);

        calculator.calculate("addition", a, b);
        calculator.calculate("multiplication", a, b);
        calculator.calculate("division", a, b);
    }
}