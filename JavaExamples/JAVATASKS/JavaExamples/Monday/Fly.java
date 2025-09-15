package JavaExamples.Monday;
interface Flyable
{
    void fli_obj();
}
class  Spacecraft implements Flyable
{
    @Override
    public void fli_obj()
    {
        System.out.println("flying on the sky ");
    }

}
class Airplane implements Flyable{
     @Override
public void fli_obj()
{
    System.out.println("airplane is flying on the sky");
}
}
class Helicopter implements Flyable
{


     @Override
    public void fli_obj()
    {
        System.out.println("flying on the sky ");
    }

}


public class Fly {
    public static void main(String[] args) {
        Flyable f= new Spacecraft();
        Flyable f1= new Helicopter();
        Flyable f2= new Airplane();
        f.fli_obj();
        f1.fli_obj();
        f2.fli_obj();

    }
}

