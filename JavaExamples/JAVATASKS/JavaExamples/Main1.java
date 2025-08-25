package JavaExamples;
abstract class Shape {
    abstract void draw();  
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Shape s;  

        s = new Circle();
        s.draw(); 

        s = new Rectangle();
        s.draw(); 
    }
}


    

