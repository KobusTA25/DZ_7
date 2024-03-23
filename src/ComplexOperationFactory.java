public class ComplexOperationFactory {
    public ComplexOperation getOperation(String operation) {
        switch (operation.toLowerCase()) {
            case "addition":
                return new AdditionOperation();
            case "multiplication":
                return new MultiplicationOperation();
            case "division":
                return new DivisionOperation();
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}