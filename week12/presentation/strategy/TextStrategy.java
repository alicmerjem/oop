package week12.presentation.strategy;

interface TextStrategy {
    String format(String text);
}

class UpperCaseStrategy implements TextStrategy {
    public String format(String text) {
        return text.toUpperCase();
    }
}

class LowerCaseStrategy implements TextStrategy {
    public String format(String text) {
        return text.toLowerCase();
    }
}

class TextEditor {
    private TextStrategy strategy;

    public TextEditor(TextStrategy strategy) {
        this.strategy = strategy;
    }

    public void publish(String text) {
        System.out.println(strategy.format(text));
    }
}

class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new UpperCaseStrategy());
        editor.publish("hello world");
    }
}