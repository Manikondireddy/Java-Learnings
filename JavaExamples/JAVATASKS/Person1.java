package JavaExamples.JAVATASKS;
abstract class Person {
    abstract void eat();
    abstract void exercise();
}
class Athlete extends Person
{
    void eat() {
        System.out.println("Athlete eats a balanced diet");
    }
    void exercise() 
    {
        System.out.println("Athlete exercise daily");
    }
}
class LazyPerson extends Person
{
    void eat() {
        System.out.println("LazyPerson eats junk food ");
    }
    void exercise()
     {
        System.out.println("LazyPerson consider waking");
    }
}
public class Person1
{
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazy = new LazyPerson();
        System.out.println("Athlete:");
        athlete.eat();
        athlete.exercise();
        System.out.println("\nLazyPerson:");
        lazy.eat();
        lazy.exercise();
    }
}
    
