package Cool.AccessModifiers.Inheritance;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " sounds");
    }
}
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " barks");
    }
}
 class Sound {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.speak(); 
        myDog.bark();  
    }
}
