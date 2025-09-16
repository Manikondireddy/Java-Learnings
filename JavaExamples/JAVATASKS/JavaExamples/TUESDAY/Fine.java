package JavaExamples.TUESDAY;
interface Fiyable
{
    void fly_obj();
}
class Spacecraft implements Fiyable{
    @Override
    public void fly_obj()
    {
        System.out.println("flying on the sky ");
    }
}
class Airplane implements Fiyable{
    @Override
    public void fly_obj()
    {
        System.out.println("airplane flying on class ");
    }
}
class Helicopter implements Fiyable
{
@Override
public void fly_obj()
{
    System.out.println("helicopter fly on sky :");
}


}

public class Fine {
    public static void main(String[] args) {
        Fiyable f= new Spacecraft();
        Fiyable f2= new Helicopter();
        Fiyable f3 = new Airplane();
            f.fly_obj();
            f2.fly_obj();
            f3.fly_obj();
        }
    }
    

