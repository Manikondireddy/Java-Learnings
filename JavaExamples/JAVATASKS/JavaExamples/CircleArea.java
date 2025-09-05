package JavaExamples;

public class CircleArea {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        double radius = 7.0;
        CircleArea obj = new CircleArea();
        double area = obj.calculateArea(radius);

        System.out.println("The area of circle with radius " + radius + " is: " + area);
    }
}

    

