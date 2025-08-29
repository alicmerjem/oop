package week9.labs;
import java.util.*;

interface Operation {
    int apply(int a, int b);
}

class Main {
    public static int calculate(int a, int b, Operation op) {
        return op.apply(a, b);
    }

    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation subtract = (x, y) -> x - y;
        Operation multiply = (x, y) -> x * y;
        Operation divide = (x, y) -> x / y;

        int a = 10;
        int b = 5;

        System.out.println("Add: " + calculate(a, b, add));          
        System.out.println("Subtract: " + calculate(a, b, subtract)); 
        System.out.println("Multiply: " + calculate(a, b, multiply)); 
        System.out.println("Divide: " + calculate(a, b, divide));  
        
        Map<String, Operation> operationsMap = new HashMap<>();
        operationsMap.put("add", add);
        operationsMap.put("subtract", subtract);
        operationsMap.put("multiply", multiply);
        operationsMap.put("divide", divide);

        String userInput = "multiply";
        Operation selectedOp = operationsMap.get(userInput);

        int result = calculate(a, b, selectedOp);
        System.out.println("user selected: " + userInput + ", result: " + result);

    }
}
