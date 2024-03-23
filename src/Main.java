public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexNumber a = new ComplexNumber(3, 2);
        ComplexNumber b = new ComplexNumber(1, -1);

        calculator.calculate("сумма", a, b);
        calculator.calculate("умножение", a, b);
        calculator.calculate("деление", a, b);
    }
}