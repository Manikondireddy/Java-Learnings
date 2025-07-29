package AbstractClasses;
abstract class Vehicles {
    abstract void startEngine(); 

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicles{
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();   
        myCar.stopEngine();  
    }
}


