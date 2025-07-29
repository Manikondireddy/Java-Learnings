package Interfaces;
interface Vehicle {
    void start();
    void stop();
}
class Engine {
    void fuel() {
        System.out.println("Petrol engine");
    }
}
class Car extends Engine implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting");
    }

    public void stop() {
        System.out.println("Bike is stopping");
    }
}
public class Snacks {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();      
        myCar.fuel();  
        myCar.stop();    
        Bike myBike = new Bike();
        myBike.start(); 
        myBike.stop();  
    }
}
    

