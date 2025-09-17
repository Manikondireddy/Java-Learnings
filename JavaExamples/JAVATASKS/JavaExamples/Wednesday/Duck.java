package JavaExamples.Wednesday;
abstract class Animal
{
    abstract void sound();
    
}
class Dog1 extends Animal{
    @Override
    public void sound()
    {
        System.out.println("dog make sounds ");
    }
}
class Cat1 extends Animal{
    @Override
    public void sound()
    {
        System.out.println("cat makes meow sound");
    }
}

public class Duck {
    public static void main(String[] args) {
        Animal a= new Dog1();
        Animal a1= new Cat1();
        a.sound();
        a1.sound();
            
        };
    }
    

