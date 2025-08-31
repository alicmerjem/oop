package week12.presentation.singleton;

public class PrinterSpooler {
    private static PrinterSpooler instance;

    private PrinterSpooler() {}

    public static PrinterSpooler getInstance() {
        if(instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    public void print(String doc) {
        System.out.println("printing: " + doc);
    }
}

class Main {
    public static void main(String[] args) {
        PrinterSpooler spooler1 = PrinterSpooler.getInstance();
        PrinterSpooler spooler2 = PrinterSpooler.getInstance();

        spooler1.print("exam paper");
        spooler2.print("cheatsheet");

        System.out.println(spooler1 == spooler2);
    }
}
