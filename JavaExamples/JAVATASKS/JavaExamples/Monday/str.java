package JavaExamples.Monday;
abstract class Animal
{
   abstract  void sound();
     
}
class Dog extends Animal{
    @Override
    public void sound()
    {
        System.out.println("Dog make sounds :");
    }
}
class Cat extends Animal{
    @Override
    public void sound()
    {
        System.out.println("cat makes cute sound :");
    }
}


public class str {
    public static void main(String[] args) {
        Animal a= new Dog();
        Animal a1= new Cat();
        a.sound();
        a1.sound();
    }
    
}
