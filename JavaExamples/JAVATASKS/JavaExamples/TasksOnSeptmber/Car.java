package JavaExamples.TasksOnSeptmber;

public class Car {
    String brand;
    String model;
    int year;
    public Car(String brand,String model,int year)
    {
    this.brand = brand;
    this.model = model;
    this.year = year;
    }
    public void start() {
        System.out.println(brand + " " + model + "  starting...");
    }

    public void stop() {
        System.out.println(brand + " " + model + " stopping...");
    }


    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        car1.start();
        car1.stop();

        Car car2 = new Car("Honda", "Civic", 2022);
        car2.start();
        car2.stop();
    }
}



        
    
