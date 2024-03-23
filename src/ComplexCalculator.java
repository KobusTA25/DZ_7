import java.util.logging.Logger;

public class ComplexCalculator {
    private ComplexOperationFactory operationFactory;
    private Logger logger;

    public ComplexCalculator() {
        this.operationFactory = new ComplexOperationFactory();
        this.logger = LoggerSingleton.getLogger();
    }

    public ComplexNumber calculate(String operation, ComplexNumber a, ComplexNumber b) {
        ComplexOperation complexOperation = operationFactory.getOperation(operation);
        ComplexNumber result = complexOperation.operate(a, b);
        logger.info(String.format("%s %s %s = %s", a, operation, b, result));
        return result;
    }
}