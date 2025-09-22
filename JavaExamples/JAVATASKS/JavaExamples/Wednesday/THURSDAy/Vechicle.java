package JavaExamples.Wednesday.THURSDAy;

public interface Vechicle {
    void start();
    void stop();
    
}
class Car implements Vechicle
{
    @Override
    public void start()
    {
        System.out.println("car is started :");
    }
    @Override
    public void stop()
    {
        System.out.println("car stoped ");
    }

}
class Bike implements Vechicle{
    @Override
    public void start()
    {
        System.out.println("bike started");
    }
    public void stop()
    {
        System.out.println("bike stopped ");
    }
    public static void main(String[] args) {
        Vechicle q= new Car();
        Vechicle q1= new Bike();
        q.start();
        q.stop();
        q1.start();
        q1.stop();
    }
}
