package JavaExamples.Monday;

abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Animals makes sounds ");
    }
}
class Cat extends Animal{
        @Override
        public void sound()
        {
            System.out.println("cat looks good");
        }
    }
class Pig extends Animal{
        @Override
        public void sound()
        {
            System.out.println("Monkey eat bananna ");

        }

    }
public class Dell {
    public static void main(String[] args) {
        Animal ref;
        ref= new Dog();
        ref.sound();
        ref= new Cat();
        ref.sound();
        // ref = new Pig();
        ref.sound();


    }
    
}

