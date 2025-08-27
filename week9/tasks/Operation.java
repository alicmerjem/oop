package week9.tasks;

interface Operation {
    int apply(int a, int b);
}

class Main {
    public static void main(String[] args) {
        // lamba expression for addition
        Operation add = (x, y) -> x + y;

        int result = add.apply(5, 4);
        System.out.println(result);
    }
}