package JavaExamples.Wednesday.THURSDAy;

public interface Flyable {
    void fly_obj();
}
class Spacecraft implements Flyable
{
    @Override
    public void fly_obj()
    {
        System.out.println("flying on the sky");
    }
}
class Airplane implements Flyable{
    @Override
    public void fly_obj()
    {
        System.out.println("plane makes sound");
    }
}
class Helicopter implements Flyable{
    @Override
    public void fly_obj()
    {
        System.out.println("helicopter makes sound ");
    }
    public static void main(String[] args) {
        
    
    Flyable m= new Spacecraft();
    Flyable f1= new Airplane();
    Flyable f3= new Helicopter();
    m.fly_obj();

    f1.fly_obj();
    f3.fly_obj();

}
}




