package JavaExamples.TasksOnWed;
interface Animal
{
    void eat();
}
interface  Fruit {
    void smell();
}
class Pets implements Animal,Fruit
{
    @Override
    public void eat()
    {
        System.out.println("pets run fastly");
    }
    @Override
    public void smell()
    {
        System.out.println("pets eat food good");
    }

}
public class Doct {
    public static void main(String[] args) {
        Pets p = new Pets();
        p.eat();
        p.smell();

    }
    
}
