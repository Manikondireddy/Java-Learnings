package JavaExamples;
interface Vehicle {
    void start();
    void stop();
}
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started...");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped.");
    }
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}
public class Metro{
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start();
        bike.stop();

        car.start();
        car.stop();
    }
}

    

