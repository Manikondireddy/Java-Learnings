package JavaExamples.Monday;
abstract class Person
{
      abstract void  eat();
    abstract void exercise();
}
class Athlete extends Person{
    @Override
    void eat()
    {
        System.out.println("atelete eat food daily ");
    }
    @Override
    void exercise()
    {
        System.out.println("athelete eat food slowly ");
    }

}
class Lazyperson extends Person{
    @Override
    void eat()
    {
        System.out.println("lazy peroples cannot work ");
    }
    @Override
    void exercise()
    {
        System.out.println("lazypeoplr work eat food daily ");
    }
}

public class Malleon {
    public static void main(String[] args) {
        Person p= new Athlete();
        Person p1= new Lazyperson();
        p.eat();
        p.exercise();
        p1.eat();
        p1.exercise();
    }
    
}
