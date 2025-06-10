package week4;

// Parent Class
class Operation {
    void calculate() {
        System.out.println("Parent calculation method");
    }
}

// Child Class
class Addition extends Operation {
    @Override
    void calculate() {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.calculate();  // Calls overridden method
    }
}

