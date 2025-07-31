package practiceOops;
    class Zink {
    double length;
    double width;
    Zink(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
        return length * width;
    }
    void showArea() {
        System.out.println("Area of the rectangle: " + calculateArea());
    }
}

public class Rectangle{
    public static void main(String[] args) {
        Zink myRect = new Zink(10.5, 6.0);
        myRect.showArea();
    }
}
    

