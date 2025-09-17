package JavaExamples.Wednesday;
interface Vechicle
{
    void start();
    void stop();
}
class Bike implements Vechicle{
    @Override
    public void start()
    {
        System.out.println("bike started ");
    }
    @Override
    public void stop()
    {
        System.out.println("bike stoped");
    }
}
class Car implements Vechicle
{
    @Override
    public void start()
    {
        System.out.println("car started");
    }
    @Override
    public void stop()
    {
        System.out.println("car stopped");
    }
}

public class Ani {
    public static void main(String[] args) {
        Vechicle b= new Bike();
        Vechicle b2= new Car();
        b.start();
        b2.stop();
        b.stop();
        b2.start();

        };
    }
    

