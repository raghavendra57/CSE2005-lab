package week5;

class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void display() {
        super.display();
        System.out.println("This is a Circle.");
    }
}

class Rectangle extends Shape {
    void display() {
        super.display();
        System.out.println("This is a Rectangle.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.display();
        r.display();
    }
}
