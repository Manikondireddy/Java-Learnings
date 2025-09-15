package JavaExamples.Monday;
interface Vechicle
{
    void start();
    void stop();

}
class Bike implements Vechicle{
    @Override
    public void start()
    {
        System.out.println("bike started the engine ");
    }
    @Override
    public void stop()
    {
        System.out.println("bike stops the when the engine heated");
    }
}
class Car implements Vechicle{
    @Override
    public void start()
    {
        System.out.println("car started ");
    }
    @Override
    public void stop()
    {
        System.out.println("car stopped");
    }
}

    


public class Danten {
    public static void main(String[] args) {
        Vechicle v= new Bike();
        Vechicle v1= new Car();
        v.start();
        v.stop();
        v1.start();
        v1.stop();

    }
    
}
