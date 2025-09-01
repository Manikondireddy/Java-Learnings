package JavaExamples.TasksOnSeptmber;

class ShapeDemo {
    double area() {
        return 0;
    }
}

class Circle extends ShapeDemo {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends ShapeDemo{
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

class Square extends Shape {
    double side;

    Square(double s) {
        side = s;
    }

    double area() {
        return side * side;
    }
}

public class Shape {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Square s = new Square(3);
        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Square Area: " + s.area());
    }
}
