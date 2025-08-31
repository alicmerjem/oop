package week12.presentation.singleton;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}

class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("application started");
        logger2.log("user logged in");

        System.out.println(logger1 == logger2); // true
    }
}