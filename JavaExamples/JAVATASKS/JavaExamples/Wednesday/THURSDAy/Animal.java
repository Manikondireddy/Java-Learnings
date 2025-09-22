package JavaExamples.Wednesday.THURSDAy;

abstract class Animal {
    abstract void sound();
    
}
class Dog extends Animal{
    @Override
    public void sound()
    {
        System.out.println("dog make sounds ");
    }

}
class Cat extends Animal{
    @Override
    public void sound()
    {
        System.out.println("cat looks good to see");
    }
     public static void main(String[] args) {
        Animal d= new Dog();
        Animal s1= new Cat();
        d.sound();
        s1.sound();
            
        };
        
    }




