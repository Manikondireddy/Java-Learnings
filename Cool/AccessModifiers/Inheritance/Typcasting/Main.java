package Cool.AccessModifiers.Inheritance.Typcasting;
class Overriding {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Overriding {
    void sound() {
        System.out.println("Dog barks");
    }
}

  public class Main {
    public static void main(String[] args) {
        Overriding myAnimal = new Overriding();
        myAnimal.sound();

        Overriding myDog = new Dog();
        myDog.sound(); 
    }
}
    

