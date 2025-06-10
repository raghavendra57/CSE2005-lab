package week4;

public class Calculator {

    void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void calculate(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }

    void calculate(int a, int b, String op) {
        switch (op) {
            case "multiply":
                System.out.println("Multiplication: " + (a * b));
                break;
            case "divide":
                if (b != 0)
                    System.out.println("Division: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.calculate(5, 10);                    // Addition
        c.calculate(20.5, 10.2);               // Subtraction
        c.calculate(6, 3, "multiply");         // Multiplication
        c.calculate(9, 3, "divide");           // Division
    }
}
