package JavaExamples.TUESDAY;
abstract class Person{
    abstract void eat();
    abstract void exercise();
}
class Athlete extends Person{
    @Override
    public void eat()
    {
        System.out.println("Athlete eat good food");
    }
    @Override
    public void exercise()
    {
        System.out.println("athelete eat good exercise ");
    }
}
class LazyPerson extends Person{
    @Override
    public void eat()
    {
        System.out.println("lazy peoplrs eat good food");
    }
    @Override
    public void exercise()
    {
        System.out.println("lazypeoples do exercise daily ");

    }
}

public class Tea {
    public static void main(String[] args) {
        Person p = new Athlete();
        Person  P = new LazyPerson();
        p.eat();
p.exercise();

    }
}
    
            
        
    
    

