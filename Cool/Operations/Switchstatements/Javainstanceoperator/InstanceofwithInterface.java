package Cool.Operations.Switchstatements.Javainstanceoperator;

// public class InstanceofwithInterface {

interface Shape {
    void draw();
}
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
    public static void main(String[] args) {
        Shape myShape = new Circle();
        if (myShape instanceof Circle) {
            System.out.println("myShape is a Circle");
            ((Circle) myShape).draw();
        }
        if (myShape instanceof Shape) {
            System.out.println("myShape implements the Shape interface");
        }
    }
}

