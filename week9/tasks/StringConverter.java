package week9.tasks;

interface StringConverter {
    String convert(String s);
}

class Main {
    public static void main(String[] args) {
        StringConverter toUpperCase = s -> s.toUpperCase();

        System.out.println(toUpperCase.convert("hehe"));
    }
}