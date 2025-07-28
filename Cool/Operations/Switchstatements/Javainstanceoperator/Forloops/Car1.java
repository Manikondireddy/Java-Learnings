package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops;

public class Car1 {
    static int totalCars = 0;
    String model;
    int year;
    public Car1(String model, int year) {
        this.model = model;
        this.year = year;
        totalCars++;
    }
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
    public static void displayTotalCars() {
        System.out.println("Total cars created: " + totalCars);
    }

    public static void main(String[] args) {
        Car1 car1 = new Car1("BMW", 2020);
        Car1 car2 = new Car1("suzuki", 2022);

        car1.displayInfo();
        car2.displayInfo();

        // Static method called on class itself
        Car1.displayTotalCars();
    }
}
    

