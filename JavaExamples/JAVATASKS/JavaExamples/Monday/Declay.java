package JavaExamples.Monday;
interface Cry
{
    void engine();
}
interface Dry
{
    void motor();
}
class Magic implements Cry,Dry{
    @Override
    public void engine()
    {
        System.out.println("engine started");
    }
    @Override
    public void motor()
    {
        System.out.println("motor started ");
    }
}


public class Declay {
    public static void main(String[] args) {
        Magic v= new Magic();
        v.engine();
        v.motor();

    }
    
}
