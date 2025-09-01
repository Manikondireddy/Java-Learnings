package JavaExamples.TasksOnAuguest;
public class Car1 {
   String brand;
    String model;
    int year;
    Car1(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car1[] cars = new Car1[3];
        cars[0] = new Car1("Toyota", "Corolla", 2020);
        cars[1] = new Car1("Honda", "Civic", 2022);
        cars[2] = new Car1("Tesla", "Model 3", 2023);
        System.out.println("Car Details:");
        for (Car1 car : cars)
         {
            car.display();
        
         }
        }

    }
    




    
