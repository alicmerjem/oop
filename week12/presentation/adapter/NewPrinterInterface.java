package week12.presentation.adapter;

interface NewPrinterInterface {
    void print(String msg);
}

class OldPrinter {
    public void printOld(String msg) {
        System.out.println("old printer: " + msg);
    }
}

// adapter
class PrinterAdapter implements NewPrinterInterface {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    public void print(String msg) {
        oldPrinter.printOld(msg);
    }
}

class Main {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();

        NewPrinterInterface printer = new PrinterAdapter(oldPrinter);

        printer.print("hello adapter");
    }
}