package revision.tasks.designpatterns;

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
        System.out.println(message + " was logged.");
    }
}

class Main {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("this is the first log message");
        l2.log("this is the second log message");

        System.out.println("logger instances are the same: " + (l1 == l2));
    }
}
