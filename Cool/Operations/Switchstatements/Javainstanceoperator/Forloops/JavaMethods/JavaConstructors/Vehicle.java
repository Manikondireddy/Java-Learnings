package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods.JavaConstructors;
class Vehicle {
    String brand;
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called: " + brand);
    }
}
class Car extends Vehicle {
    int speed;
    public Car(String brand, int speed) {
        super(brand);
        this.speed = speed;
        System.out.println("Car constructor called: Speed = " + speed + " km/h");
    }

    public void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 120);
        c1.showDetails();
    }
}
    

