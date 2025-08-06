class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("animal sound");
    }

    Animal() {
        System.out.println("Animal constructor ");
    }
}
class Ant extends Animal {
    String name = "Ant";

    Ant() {
        super(); 
        System.out.println("Ant constructor called");
    }

    void printNames() {
        System.out.println("Subclass name: " + name);
        System.out.println("Superclass name: " + super.name);
    }
       void sound() {
        super.sound(); // Calls superclass method
        System.out.println("Ant clicks");
    }
}
public class Runner {
    public static void main(String[] args) {
        Ant a = new Ant();
        a.printNames();
        a.sound();
    }
}