public class ComplexOperationFactory {
    public ComplexOperation getOperation(String operation) {
        switch (operation.toLowerCase()) {
            case "сумма":
                return new AdditionOperation();
            case "умножение":
                return new MultiplicationOperation();
            case "деление":
                return new DivisionOperation();
            default:
                throw new IllegalArgumentException("Операция неизвестна: " + operation);
        }
    }
}