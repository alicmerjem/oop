package week9.tasks;

interface StringChecker {
    boolean check(String s);
}

class Main {
    public static void main(String[] args) {
        StringChecker longerThanFive = s -> s.length() > 5;

        System.out.println(longerThanFive.check("hello"));
    }
}