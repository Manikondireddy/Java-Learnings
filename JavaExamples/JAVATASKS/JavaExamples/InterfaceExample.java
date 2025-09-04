package JavaExamples;

// public class Animal34 {
interface Animal {
    void sound();  
    void sleep();  
}
class Dog implements Animal34 {
    public void sound() {
        System.out.println("Dog says: Woof Woof");
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat says: Meow Meow");
    }

    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Animal34 dog = new Dog(); 
        dog.sound();
        dog.sleep();

        Animal34 cat = new Cat();  
        cat.sound();
        cat.sleep();
    }
}

    

