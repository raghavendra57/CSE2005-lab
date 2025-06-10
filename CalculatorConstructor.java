package week4;

public class CalculatorConstructor {
    int a, b;
    String operation;

    // Constructor 1: No arguments
    CalculatorConstructor() {
        a = b = 0;
        System.out.println("Default values set to 0");
    }

    // Constructor 2: Two arguments – perform addition
    CalculatorConstructor(int x, int y) {
        a = x;
        b = y;
        System.out.println("Addition: " + (a + b));
    }

    // Constructor 3: Two numbers and an operation string
    CalculatorConstructor(int x, int y, String op) {
        a = x;
        b = y;
        operation = op.toLowerCase();
        switch (operation) {
            case "add":
                System.out.println("Addition: " + (a + b));
                break;
            case "sub":
                System.out.println("Subtraction: " + (a - b));
                break;
            case "mul":
                System.out.println("Multiplication: " + (a * b));
                break;
            case "div":
                System.out.println(b != 0 ? "Division: " + (a / b) : "Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static void main(String[] args) {
        new CalculatorConstructor();
        new CalculatorConstructor(5, 3);
        new CalculatorConstructor(10, 5, "mul");
    }
}
