package week5;

class Shape {
    void area() {
        System.out.println("Area from Shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle: " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle: " + (10 * 4));
    }
}

public class Main3 {
    public static void main(String[] args) {
        Shape s;
        
        s = new Circle();   // dynamic binding
        s.area();           // calls Circle's area

        s = new Rectangle(); 
        s.area();           // calls Rectangle's area
    }
}
