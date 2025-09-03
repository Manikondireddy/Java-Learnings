package JavaExamples;

interface Flyable{
    void fly_obj();
}
class Spacecraft implements Flyable{
    @Override
   public void fly_obj()
   {
    System.out.println("flying on crafts");
   }
}
class Airplane implements Flyable
{
    @Override
    public void fly_obj()
    {
        System.out.println("sky on airplanes");
    }
}
class Helicopter implements Flyable
{
    @Override
    public void fly_obj()
    {
        System.out.println("going on sky");
    }
}
class Running{
    public static void main(String[] args) {
        Flyable f1= new Spacecraft();
        Flyable f2= new Airplane();
        Flyable f3= new Helicopter();
        f1.fly_obj();
        f2.fly_obj();
        f3.fly_obj();


    }
}
    

    



    
