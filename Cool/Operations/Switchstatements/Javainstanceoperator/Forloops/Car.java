package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops;

public class Car {
    String brand;
    String model;
    int year;
    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Innova", 2023);
        car1.displayDetails();
    }
}
    
