import java.util.logging.Logger;

public class LoggerSingleton {
    private static Logger logger;

    private LoggerSingleton() {}

    public static Logger getLogger() {
        if (logger == null) {
            logger = Logger.getLogger("CalculatorLogger");
            // Additional configuration for logger if needed
        }
        return logger;
    }
}