package JavaExamples.TasksOnSeptmber.AssesmentonSep;

public class Car {
     String brand;
    String model;
    int year;
    public Car(String brand,String model,int year)
    {
        this.brand=brand;
        this.model=model;
        this.year=year ;
    
    }
    void start()
    {
     System.out.println( model +" "+ brand + " "+ year);
    }
    void stop()
    {
         System.out.println(model +" " + brand + " "+ year);
    }
public static void main(String[] args) {
    
    Car c= new Car("toyato","new",2029);
    c.start();
    c.stop();
    Car c2= new Car("suzuki","Model s",2021);
    c2.start();
    c2.stop();

}
}

    


