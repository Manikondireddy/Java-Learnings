package JavaExamples.JAVATASKS;
interface Flyable
 {
    void fly_obj();
}
class Spacecraft implements Flyable
 {
    public void fly_obj() 
    {
        System.out.println("Spacecraf files");
    }
}
class Airplane implements Flyable
 {
    public void fly_obj()
     {
        System.out.println("Airplane flies");
    }
}
class Helicopter implements Flyable
 {
    public void fly_obj()
     {
        System.out.println("Helicopter hovers");
    }
}
public class High 
{
    public static void main(String[] args) {
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();
        System.out.println("Flying Objects:");
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
